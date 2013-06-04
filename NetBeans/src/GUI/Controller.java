package GUI;

import static GUI.Main.controller;
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
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;
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

    protected void updateStructurePanel() {

        for (Term t : activeStruct.terms) {
//            if (!t.displayed) {
            Blob b = new Blob();
            int i = (Main.structurePanel.getComponentCount() * 100) % Main.structurePanel.getWidth();
            if (t instanceof Const) {
                b.setText(t.name);
                b.setBounds(i, i, t.name.length() * 10, 40);
            } else {
                b.setBounds(i, i, 30, 30);
            }
            Main.structurePanel.add(b);
            termBlobLink.add(new Pair<>(t, b));
//                t.displayed = true;
//            }
        }

        for (NullaryRel r : activeStruct.nullaryRels) {
        }

        for (UnaryRel r : activeStruct.unaryRels) {
            for (Pair p : termBlobLink) {
                if (p.a.equals(r.arg)) {
                    Blob b = (Blob) p.b;
                    b.setBackground(r.colour);
                }
            }
        }

        for (BinaryRel r : activeStruct.binaryRels) {
            Blob b1 = null, b2 = null;
            for (Pair p : termBlobLink) {
                if (p.a.equals(r.arg1)) {
                    b1 = (Blob) p.b;
                }
                if (p.a.equals(r.arg2)) {
                    b2 = (Blob) p.b;
                }
            }
            Arrow a = new Arrow(b1, b2, r.name, r.colour);
            relationArrowLink.add(new Pair<>(r, a));
            Main.structurePanel.add(a);
        }
    }

    protected void updateSignaturePanel() {
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
//                unaryList.setForeground(Structure.toColour(unaryName));
            }
        }
        for (String binaryName : activeSig.binaryNames) {
            binaryListModel.addElement(binaryName);
//            binaryList.setForeground(Structure.toColour(binaryName));
        }

    }

    protected void submitButtonAction()
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

    protected void refreshSenteceList() {
        for (int i = 0; i < sentenceListModel.size(); i++) {
            LogicTree s = activeSentences.get(i);
            String news = (String) sentenceListModel.getElementAt(i);
            boolean outcome = s.evaluate(activeStruct);
            news = news.substring(0, news.length() - 5) + " " + outcome;
            sentenceListModel.setElementAt(news, i);
        }
    }

    protected void clearSentenceList() {
        sentenceListModel.removeAllElements();
    }

    protected void addBlob() {
        Term t = new Term("t" + (activeStruct.terms.size() + 1)); 
        Blob b = new Blob();
        termBlobLink.add(new Pair<>(t, b));
        activeStruct.terms.add(t);
        b.setBounds(10, 10, 30, 30);
        Main.structurePanel.add(b);
        Main.structurePanel.repaint();
        refreshSenteceList();
    }

    void addBlob(String name) {
        Const t = new Const(name);
        Blob b = new Blob();
        termBlobLink.add(new Pair<>((Term) t, b));
        activeStruct.terms.add(t);
        b.setText(t.name);
        b.setBounds(10, 10, t.name.length() * 10, 40);
        Main.structurePanel.add(b);
        Main.structurePanel.repaint();
        constListModel.addElement(name);
        refreshSenteceList();
    }

    void removeBlob(int selectedIndex) {
        try {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nothing selected to delete");
        }
    }

    void removeBlob(Blob b) {
        for (Pair p : termBlobLink) {
            if (p.b.equals(b)) {
                Term t = (Term) p.a;
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
                activeStruct.terms.remove(t);
                Main.structurePanel.remove(b);
                Main.structurePanel.revalidate();
                Main.structurePanel.repaint();
                break;
            }
        }
    }

    void addUnaryRel(String text) {
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
                }
            }
        }
    }
}
