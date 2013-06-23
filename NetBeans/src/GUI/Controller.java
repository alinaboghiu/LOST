package GUI;

import Parser.folLexer;
import Parser.folParser;
import Tree.BinaryRel;
import Tree.Constant;
import Tree.DuplicateDefinitionException;
import Tree.LogicTree;
import Tree.NullaryRel;
import Tree.Signature;
import Tree.Structure;
import Tree.Term;
import Tree.UnaryRel;
import Tree.UnboundException;
import Tree.UndefinedRelationException;
import Tree.Variable;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author alina
 */
public class Controller implements Serializable{

    DefaultListModel sentenceListModel = new DefaultListModel();
    DefaultListModel constListModel = new DefaultListModel();
    DefaultListModel nullaryListModel = new DefaultListModel();
    DefaultListModel nullaryRelsDisplayModel = new DefaultListModel();
    DefaultListModel unaryListModel = new DefaultListModel();
    DefaultListModel binaryListModel = new DefaultListModel();
    Structure activeStruct = new Structure();
    Signature activeSig = new Signature(activeStruct);
    ArrayList<LogicTree> activeSentences = new ArrayList<>();
    ArrayList<Pair<BinaryRel, Arrow>> relationArrowLink = new ArrayList<>();
    ArrayList<Pair<Term, Blob>> termBlobLink = new ArrayList<>();
    Term argReadyForNewBinRel = null;
    String nameReadyForNewBinRel = null;
    boolean allowRemove = false;
    ArrayList<String> line1 = new ArrayList<>();
    ArrayList<String> line2 = new ArrayList<>();

    public Controller() {
    }

    void setupQuiz() {
        try {
            String quizFile = System.getProperty("user.dir") + "/src/Help Files/quiz.txt";
            InputStream fis = new FileInputStream(quizFile);
            String l1, l2;
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
            while ((l1 = br.readLine()) != null
                    && (l2 = br.readLine()) != null) {
                line1.add(l1);
                line2.add(l2);
            }
            br.close();
            br = null;
            fis = null;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        Main.quizField1.setText(line1.get(0));
        Main.quizField2.setText(line2.get(0));
        line1.remove(0);
        line2.remove(0);

    }

    void updateStructurePanel() {
        for (Term t : activeStruct.terms) {
            Blob b = new Blob();
            termBlobLink.add(new Pair<>(t, b));
            int i = (Main.structurePanel.getComponentCount() * 100) % Main.structurePanel.getWidth();
            if (t instanceof Constant) {
                b.setText(t.name);
                b.setBounds(i, i, Math.max(t.name.length() * 10, 30), 40);

            } else {
                b.setBounds(i, i, 30, 30);
            }
            Main.structurePanel.add(b);
        }

        for (NullaryRel r : activeStruct.nullaryRels) {
            addNullaryRel(r);
            activeSig.nullaryNames.add(r.name);
            nullaryListModel.addElement(r.name);
        }

        for (final UnaryRel r : activeStruct.unaryRels) {
            Blob b = findBlob(r.arg);
            b.setBorder(addThisColourToBorder(r.colour, b));
            for (Term t : activeStruct.terms) {
                addUnaryRelOptiontoBlob(findBlob(t), r.name);
            }
        }

        for (BinaryRel r : activeStruct.binaryRels) {
            addBinRel(r);
        }
    }

    void updateSignaturePanel() {
        constListModel.removeAllElements();
        nullaryListModel.removeAllElements();
        unaryListModel.removeAllElements();
        binaryListModel.removeAllElements();

        for (String constName : activeSig.constNames) {
            if (!constListModel.contains(constName)) {
                constListModel.addElement(constName);
            }
        }
//        for (String nullaryName : activeSig.nullaryNames) {
//            if (!nullaryListModel.contains(nullaryName)) {
//                nullaryListModel.addElement(nullaryName);
//            }
//        }
        for (String unaryName : activeSig.unaryNames) {
            if (!unaryListModel.contains(unaryName)) {
                unaryListModel.addElement(unaryName);
            }
        }
        for (String binaryName : activeSig.binaryNames) {
            binaryListModel.addElement(binaryName);
        }

    }

    void addUnaryRelOptiontoBlob(final Blob b, String relName) {
        final JCheckBoxMenuItem item = new JCheckBoxMenuItem(relName);
        final Color c = new Color(relName.hashCode());
        item.setSelected(b.relColours.contains(c));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnaryRel newRel = new UnaryRel(item.getText(), findTerm(b));
                if (!item.isSelected()) {
                    for (UnaryRel r : activeStruct.unaryRels) {
                        if (newRel.equals(r)) {
                            activeStruct.unaryRels.remove(r);
                            b.setBorder(removeThisColourFromBorder(c, b));
                            break;
                        }
                    }
                } else {
                    activeStruct.unaryRels.add(newRel);
                    b.setBorder(addThisColourToBorder(c, b));
                }
                refreshSenteceList();
                Main.modified = true;
            }
        });
        b.menu.add(item);
    }

    private CompoundBorder removeThisColourFromBorder(Color c, Blob b) {
        CompoundBorder finalBorder = null;
        b.relColours.remove(c);
        b.setBorder(finalBorder);
        for (Color activeColour : b.relColours) {
            b.setBorder(finalBorder);
            Border newBorder = new LineBorder(activeColour, 5);
            finalBorder = new CompoundBorder(b.getBorder(), newBorder);
        }
        b.setBounds(b.getBounds().x, b.getBounds().y, b.getBounds().width - 9, b.getBounds().height - 7);
        return finalBorder;
    }

    private CompoundBorder addThisColourToBorder(Color c, Blob b) {
        Border newBorder = new LineBorder(c, 5);
        b.relColours.add(c);
        b.setBounds(b.getBounds().x, b.getBounds().y, b.getBounds().width + 9, b.getBounds().height + 7);
        return new CompoundBorder(b.getBorder(), newBorder);
    }

    void submitButtonAction()
            throws DuplicateDefinitionException,
            UnboundException,
            UndefinedRelationException {
        createSentence(Main.newSentenceField.getText());
    }

    void createSentence(String rawInput)
            throws DuplicateDefinitionException,
            UnboundException,
            UndefinedRelationException {
        // parse input
        ANTLRInputStream input = new ANTLRInputStream(rawInput);
        Lexer lexer = new folLexer(input);
        TokenStream tk = new CommonTokenStream(lexer);
        folParser p = new folParser(tk);
        ParseTree parseTree = p.condition().getChild(0);
        LogicTree sentence = new LogicTree(parseTree, activeStruct, activeSig, new ArrayList<Variable>());
        boolean outcome = sentence.evaluate(activeStruct);
//        LogicTree.sentenceScope = new ArrayList<>();

        // add to list and scroll down
        activeSentences.add(sentence);
        sentenceListModel.addElement(Main.newSentenceField.getText() + " - " + outcome);
        int lastIndex = Main.sentenceList.getModel().getSize() - 1;
        if (lastIndex >= 0) {
            Main.sentenceList.ensureIndexIsVisible(lastIndex);
        }
        Main.newSentenceField.setText("");
    }

    void refreshSenteceList() {
        for (int i = 0; i < sentenceListModel.size(); i++) {
            LogicTree s = activeSentences.get(i);
            String news = sentenceListModel.getElementAt(i).toString();
//            LogicTree.sentenceScope = new ArrayList<>();
            boolean outcome = s.evaluate(activeStruct);
            if (news.contains("true")) {
                news = news.substring(0, news.length() - 4) + outcome;
            } else {
                news = news.substring(0, news.length() - 5) + outcome;
            }
            sentenceListModel.setElementAt(news, i);
        }
        Main.structurePanel.revalidate();
        Main.structurePanel.repaint();
    }

    void clearSentenceList() {
        sentenceListModel.removeAllElements();
    }

    protected void addBlob() {
        Term t = new Term();
        t.name = Integer.toString(t.hashCode());
        Blob b = new Blob();
        termBlobLink.add(new Pair<>(t, b));
        activeStruct.terms.add(t);
        b.setBounds(10, 10, 30, 30);
        b.setBackground(Color.LIGHT_GRAY);
        Main.structurePanel.add(b);
        for (String relName : activeSig.unaryNames) {
            addUnaryRelOptiontoBlob(b, relName);
        }
        refreshSenteceList();
    }

    void addBlob(String name) {
        Constant t = new Constant(name);
        Blob b = new Blob();
        termBlobLink.add(new Pair<>((Term) t, b));
        activeStruct.terms.add(t);
        b.setText(t.name);
        b.setBounds(10, 10, t.name.length() * 10, 40);
        b.setBackground(Color.LIGHT_GRAY);
        Main.structurePanel.add(b);
        constListModel.addElement(name);
        refreshSenteceList();
        for (String relName : activeSig.unaryNames) {
            addUnaryRelOptiontoBlob(b, relName);
        }
        refreshSenteceList();
    }

    void removeBlob(int selectedIndex) {
        String blobName = constListModel.getElementAt(selectedIndex).toString();
        constListModel.removeElementAt(selectedIndex);
        activeSig.constNames.remove(blobName);
        for (Component c : Main.structurePanel.getComponents()) {
            if (c.getClass().getSimpleName().equals("Blob")) {
                Blob b = (Blob) c;
                if (b.getText().equals(blobName)) {
                    b.setText("");
                    Term t = findTerm(b);
                    t.name = Integer.toString(t.hashCode());
                }
            }
        }
    }

    void removeBlob(Blob b) {
        if (activeStruct.terms.size() > 1 || allowRemove) {
            constListModel.removeElement(b.getText());
            activeSig.constNames.remove(b.getText());
            Term t = findTerm(b);
            //find and remove any linked binary relations
            for (Pair ra : relationArrowLink) {
                BinaryRel r = (BinaryRel) ra.a;
                if (r.arg1.equals(t) || r.arg2.equals(t)) {
                    activeStruct.binaryRels.remove(r);
                    Main.structurePanel.remove((Arrow) ra.b);
                }
            }
            //find and remove any linked unary relations 
            for (UnaryRel u : activeStruct.unaryRels) {
                if (u.arg.equals(t)) {
                    activeStruct.unaryRels.remove(u);
                    break;
                }
            }
            //remove the blob itself and the linked term
            ArrayList<String> elementsToDelete = new ArrayList<>();
            for (int index = 0; index < sentenceListModel.getSize(); index++) {
                String s = sentenceListModel.getElementAt(index).toString();
                if (s.contains(t.name)) {
                    elementsToDelete.add(s);
                }
            }
            for (String e : elementsToDelete) {
                sentenceListModel.removeElement(e);
            }
            t.name = String.valueOf(t.hashCode());
            activeStruct.terms.remove(t);
            b.setText("");
            Main.structurePanel.remove(b);
            refreshSenteceList();
        } else {
            JOptionPane.showMessageDialog(Main.structurePanel, "Sorry, this is the only object in the structure! Structures must be non empty.");
        }
    }

    void renameBlob(int selectedIndex, String newName) {
        String oldName = constListModel.getElementAt(selectedIndex).toString();
        constListModel.removeElementAt(selectedIndex);
        constListModel.add(selectedIndex, newName);
        for (Component c : Main.structurePanel.getComponents()) {
            if (c.getClass().getSimpleName().equals("Blob")) {
                Blob b = (Blob) c;
                if (b.getText().equals(oldName)) {
                    b.setText(newName);
                    b.setBounds(b.getBounds().x, b.getBounds().y, (newName.length() - oldName.length()) * 8 + b.getWidth(), b.getBounds().height);
                    Term t = findTerm(b);
                    t.name = newName;
                }
            }
        }
        int i = 0;
        while (i < sentenceListModel.size()) {
            if (sentenceListModel.getElementAt(i).toString().contains(oldName)) {
                sentenceListModel.removeElementAt(i);
                activeSentences.remove(i);
                i--;
            }
            i++;
        }
    }

    void addUnRel(String text) {
        unaryListModel.addElement(text);
        activeSig.unaryNames.add(text);
        for (Term t : activeStruct.terms) {
            Blob b = findBlob(t);
            addUnaryRelOptiontoBlob(b, text);
        }
//        Main.unaryList.setCellRenderer(new ColourList());
//        Main.unaryList.repaint();
    }

    void removeUnaryRel(int selectedIndex) {
        //remove relation and decolour blobs
        String unaryName = unaryListModel.getElementAt(selectedIndex).toString();
        activeSig.unaryNames.remove(unaryName);
        ArrayList<UnaryRel> relToRemove = new ArrayList<>();
        for (UnaryRel r : activeStruct.unaryRels) {
            if (r.name.equals(unaryName)) {
                Blob b = findBlob(r.arg);
                b.setBorder(removeThisColourFromBorder(r.colour, b));
                relToRemove.add(r);
            }
        }
        activeStruct.unaryRels.removeAll(relToRemove);

        //remove relation from blob menu
        for (Term t : activeStruct.terms) {
            Blob b = findBlob(t);
            for (Component c : b.menu.getComponents()) {
                if (c.getClass().getSimpleName().equals("JCheckBoxMenuItem")) {
                    JCheckBoxMenuItem item = (JCheckBoxMenuItem) c;
                    if (item.getText().equals(unaryName)) {
                        b.menu.remove(item);
                        break;
                    }
                }
            }
        }
        unaryListModel.remove(selectedIndex);
        refreshSenteceList();
    }

    void addBinRel(String text) {
        binaryListModel.addElement(text);
        activeSig.binaryNames.add(text);
    }

    void addBinRel(BinaryRel r) {
        Blob b1 = findBlob(r.arg1);
        Blob b2 = findBlob(r.arg2);
        Arrow a = findArrow(b1, b2);
        if (a != null) {
            a.addRelation(r.name);
        } else {
            a = new Arrow(b1, b2, r.name);
        }
        relationArrowLink.add(new Pair<>(r, a));
        Main.structurePanel.add(a);
        if (!activeStruct.binaryRels.contains(r)) {
            activeStruct.binaryRels.add(r);
        }
        refreshSenteceList();
    }

    void buildNewBinRel(Blob b) {
        if (argReadyForNewBinRel != null) {
            Term arg2 = findTerm(b);
            BinaryRel newBinRel = new BinaryRel(nameReadyForNewBinRel, argReadyForNewBinRel, arg2);
            addBinRel(newBinRel);
            Main.chooseParamButton.setForeground(Color.BLACK);
            argReadyForNewBinRel = null;
            nameReadyForNewBinRel = null;
        } else {
            argReadyForNewBinRel = findTerm(b);
        }
    }

    void setNameReadyForNewBinRel(int selectedIndex) {
        this.nameReadyForNewBinRel = binaryListModel.getElementAt(selectedIndex).toString();
    }

    BinaryRel findRelation(Arrow a) {
        for (Pair p : relationArrowLink) {
            if (p.b.equals(a)) {
                return (BinaryRel) p.a;
            }
        }
        return null;
    }

    Term findTerm(Blob b) {
        for (Pair p : termBlobLink) {
            if (p.b.equals(b)) {
                return (Term) p.a;
            }
        }
        return null;
    }

    Blob findBlob(Term t) {
        for (Pair p : termBlobLink) {
            if (p.a.equals(t)) {
                return (Blob) p.b;
            }
        }
        return null;
    }

    Arrow findArrow(Blob from, Blob to) {
        for (Component c : Main.structurePanel.getComponents()) {
            if (c instanceof Arrow) {
                Arrow a = (Arrow) c;
                if (a.from.equals(from) && a.to.equals(to)) {
                    return a;
                }
            }
        }
        return null;
    }

    void removeBinaryRel(int selectedIndex) {
        String relName = binaryListModel.getElementAt(selectedIndex).toString();
        binaryListModel.removeElementAt(selectedIndex);
        ArrayList<BinaryRel> relsToRemove = new ArrayList<>();
        for (BinaryRel r : activeStruct.binaryRels) {
            if (r.name.equals(relName)) {
                relsToRemove.add(r);
                removeBinaryRel(r);
            }
        }
        activeStruct.binaryRels.removeAll(relsToRemove);
    }

    private void removeBinaryRel(BinaryRel r) {
        Arrow a = findArrow(findBlob(r.arg1), findBlob(r.arg2));
        if (a.menuModel.getSize() > 1) {
            a.menuModel.removeElement(r.name);
        } else {
            Main.structurePanel.remove(a);
            Main.structurePanel.repaint();
            Main.structurePanel.revalidate();
        }
    }

    void addNullaryRel(String text) {
        nullaryListModel.addElement(text);
        final NullaryRel r = new NullaryRel(text);
        activeStruct.nullaryRels.add(r);
        activeSig.nullaryNames.add(text);
        addNullaryRel(r);
    }

    private void addNullaryRel(final NullaryRel r) {
        final Blob newNullaryBlob = new Blob();
        newNullaryBlob.setHorizontalAlignment(SwingConstants.LEFT);
        newNullaryBlob.setBounds(10, (Main.structurePanel.getHeight() - 10) - 20 * activeSig.nullaryNames.size(), r.name.length() * 10, 30);
        newNullaryBlob.setBackground(Main.structurePanel.getBackground());
        newNullaryBlob.setText(r.name);
        newNullaryBlob.setToolTipText(String.valueOf(r.value));
        newNullaryBlob.setForeground(Color.gray);
        newNullaryBlob.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (r.value) {
                    r.value = false;
                    newNullaryBlob.setForeground(Color.gray);
                    newNullaryBlob.setToolTipText(String.valueOf(r.value));
                } else {
                    r.value = true;
                    newNullaryBlob.setForeground(Color.black);
                    newNullaryBlob.setToolTipText(String.valueOf(r.value));
                }
                refreshSenteceList();
            }
        });
        newNullaryBlob.menu.removeAll();
        Main.structurePanel.add(newNullaryBlob);
        refreshSenteceList();
    }

    void removeNullaryRel(int selectedIndex) {
        String name = nullaryListModel.getElementAt(selectedIndex).toString();
        nullaryListModel.removeElement(name);
        activeSig.nullaryNames.remove(name);
        for (NullaryRel r : activeStruct.nullaryRels) {
            if (r.name.equals(name)) {
                activeStruct.nullaryRels.remove(r);
                break;
            }
        }

        for (Component c : Main.structurePanel.getComponents()) {
            if (c.getClass().getSimpleName().equals("Blob")) {
                Blob b = (Blob) c;
                if (b.getText().equals(name)) {
                    Main.structurePanel.remove(b);
                    break;
                }
            }
        }
        int i = 0;
        while (i < sentenceListModel.size()) {
            if (sentenceListModel.getElementAt(i).toString().contains(name)) {
                sentenceListModel.removeElementAt(i);
                activeSentences.remove(i);
                i--;
            }
            i++;
        }
        refreshSenteceList();
    }

    void loadSentences(String fileName) {
        try {
            InputStream fis = new FileInputStream(fileName);
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
            while ((line = br.readLine()) != null) {
                try {
                    Main.newSentenceField.setText(line);
                    createSentence(line);
                } catch (DuplicateDefinitionException ex) {
                    continue;
                } catch (UnboundException ex) {
                    continue;
                } catch (UndefinedRelationException ex) {
                    continue;
                }
            }
            br.close();
            br = null;
            fis = null;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

    }

    void newStructure() {
    }

    void nextQuizQuestion() {
        if (!line1.isEmpty()) {
            Main.quizField1.setText(line1.get(0));
            Main.quizField2.setText(line2.get(0));
            line1.remove(0);
            line2.remove(0);
            Main.jProgressBar1.setValue(Main.jProgressBar1.getValue() + 10);
        } else {
            Main.jProgressBar1.setValue(100);
            JOptionPane.showMessageDialog(Main.structurePanel, "Well done, You have reached the end of the quiz!");
        }
    }
}
