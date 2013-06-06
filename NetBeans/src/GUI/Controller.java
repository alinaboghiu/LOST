package GUI;

import Parser.folLexer;
import Parser.folParser;
import Tree.BinaryRel;
import Tree.Const;
import Tree.DuplicateDefinitionException;
import Tree.LogicTree;
import Tree.NullaryRel;
import Tree.Signature;
import Tree.Structure;
import Tree.Term;
import Tree.UnaryRel;
import Tree.UnboundException;
import Tree.UndefinedRelationException;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
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
public class Controller {
    
    static DefaultListModel sentenceListModel = new DefaultListModel();
    static DefaultListModel constListModel = new DefaultListModel();
    static DefaultListModel nullaryListModel = new DefaultListModel();
    static DefaultListModel nullaryRelsDisplayModel = new DefaultListModel();
    static DefaultListModel unaryListModel = new DefaultListModel();
    static DefaultListModel binaryListModel = new DefaultListModel();
    static Structure activeStruct = new Structure();
    static Signature activeSig = new Signature(activeStruct);
    static ArrayList<LogicTree> activeSentences = new ArrayList<>();
    ArrayList<Pair<BinaryRel, Arrow>> relationArrowLink = new ArrayList<>();
    ArrayList<Pair<Term, Blob>> termBlobLink = new ArrayList<>();
    Term argReadyForNewBinRel = null;
    String nameReadyForNewBinRel = null;

    void updateStructurePanel() {
        for (Term t : activeStruct.terms) {
            Blob b = new Blob();
            termBlobLink.add(new Pair<>(t, b));
            int i = (Main.structurePanel.getComponentCount() * 100) % Main.structurePanel.getWidth();
            if (t instanceof Const) {
                b.setText(t.name);
                b.setBounds(i, i, Math.max(t.name.length() * 10, 30), 40);
                
            } else {
                b.setBounds(i, i, 30, 30);
            }
            Main.structurePanel.add(b);
        }
        
        for (NullaryRel r : activeStruct.nullaryRels) {
        }
        
        for (final UnaryRel r : activeStruct.unaryRels) {
            Blob b = findBlob(r.arg);
            b.setBorder(addThisColourToBorder(r.colour, b));
            for (Term t : activeStruct.terms){
                addUnaryRelOptiontoBlob(findBlob(t), r.name);
            }
        }
        
        for (BinaryRel r : activeStruct.binaryRels) {
            Blob b1 = findBlob(r.arg1);
            Blob b2 = findBlob(r.arg2);
            Arrow a = new Arrow(b1, b2, r.name, r.colour);
            relationArrowLink.add(new Pair<>(r, a));
            Main.structurePanel.add(a);
        }
    }
    
    void updateSignaturePanel() {
        for (String constName : activeSig.constNames) {
            if (!constListModel.contains(constName)) {
                constListModel.addElement(constName);
            }
        }
        for (String nullaryName : activeSig.nullaryNames) {
            if (!nullaryListModel.contains(nullaryName)) {
                nullaryListModel.addElement(nullaryName);
            }
        }
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
        b.setBounds(b.getBounds().x, b.getBounds().y, b.getBounds().width - 7, b.getBounds().height - 7);
        return finalBorder;
    }
    
    private CompoundBorder addThisColourToBorder(Color c, Blob b) {
        Border newBorder = new LineBorder(c, 5);
        b.relColours.add(c);
        b.setBounds(b.getBounds().x, b.getBounds().y, b.getBounds().width + 7, b.getBounds().height + 7);
        return new CompoundBorder(b.getBorder(), newBorder);
    }
    
    void submitButtonAction()
            throws DuplicateDefinitionException,
            UnboundException,
            UndefinedRelationException {
        // parse input
        ANTLRInputStream input = new ANTLRInputStream(Main.newSentenceField.getText());
        Lexer lexer = new folLexer(input);
        TokenStream tk = new CommonTokenStream(lexer);
        folParser p = new folParser(tk);
        ParseTree parseTree = p.condition().getChild(0);

        // create sentence, evaluate and add to activeSentences list
        LogicTree sentence = new LogicTree(parseTree, activeStruct, activeSig, new ArrayList());
        boolean outcome = sentence.evaluate(activeStruct);
        activeSentences.add(sentence);

        // add to list and scroll down
        sentenceListModel.addElement(Main.newSentenceField.getText() + " - " + outcome);
        int lastIndex = Main.jList1.getModel().getSize() - 1;
        if (lastIndex >= 0) {
            Main.jList1.ensureIndexIsVisible(lastIndex);
        }
        Main.newSentenceField.setText("");
    }
    
    void refreshSenteceList() {
        for (int i = 0; i < sentenceListModel.size(); i++) {
            LogicTree s = activeSentences.get(i);
            String news = (String) sentenceListModel.getElementAt(i);
            boolean outcome = s.evaluate(activeStruct);
            news = news.substring(0, news.length() - 5) + " " + outcome;
            sentenceListModel.setElementAt(news, i);
        }
        Main.structurePanel.revalidate();
        Main.structurePanel.repaint();
    }
    
    void clearSentenceList() {
        sentenceListModel.removeAllElements();
    }
    
    protected void addBlob() {
        Term t = new Term("t" + (activeStruct.terms.size() + 1));
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
        Const t = new Const(name);
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
        for (Component c : Main.structurePanel.getComponents()) {
            if (c.getClass().getSimpleName().equals("Blob")) {
                Blob b = (Blob) c;
                if (b.getText().equals(blobName)) {
                    removeBlob(b);
                }
            }
        }
    }
    
    void removeBlob(Blob b) {
        constListModel.removeElement(b.getText());
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
        for (String e : elementsToDelete){
            sentenceListModel.removeElement(e);
        }
        activeStruct.terms.remove(t);
        Main.structurePanel.remove(b);
        b = null;
        refreshSenteceList();
    }
    
    
    void renameBlob(int selectedIndex, String newName) {
        String oldName = constListModel.getElementAt(selectedIndex).toString();
        constListModel.removeElementAt(selectedIndex);
        constListModel.add(selectedIndex, newName);
        for (Component c : Main.structurePanel.getComponents()) {
            if (c.getClass().getSimpleName().equals("Blob")) {
                Blob b = (Blob) c;
                if (b.getText().equals(oldName)) {
                    b.setBounds(b.getBounds().x, b.getBounds().y, newName.length() * 10, b.getBounds().height);
                    b.setText(newName);
                    Term t = findTerm(b);
                    t.name = newName;
                }
            }
        }
    }
    
    void addUnRel(String text) {
        unaryListModel.addElement(text);
        activeSig.unaryNames.add(text);
        for (Term t : activeStruct.terms) {
            Blob b = findBlob(t);
            addUnaryRelOptiontoBlob(b, text);
        }
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
    }
    
    void addBinRel(BinaryRel newBinRel) {
        Blob b1 = findBlob(newBinRel.arg1);
        Blob b2 = findBlob(newBinRel.arg2);
        Arrow a = new Arrow(b1, b2, newBinRel.name, newBinRel.colour);
        relationArrowLink.add(new Pair<>(newBinRel, a));
        Main.structurePanel.add(a);
        activeStruct.binaryRels.add(newBinRel);
    }
    
    void buildNewBinRel(Blob b) {
        if (argReadyForNewBinRel != null) {
            Term arg2 = findTerm(b);
            BinaryRel newBinRel = new BinaryRel(nameReadyForNewBinRel, argReadyForNewBinRel, arg2);
            addBinRel(newBinRel);
            Main.chooseParamButton.setForeground(new Color(76, 76, 76));
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
}
