/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Tree.BinaryRel;
import Tree.Const;
import Tree.LogicTree;
import Tree.NullaryRel;
import Tree.Signature;
import Tree.Structure;
import Tree.Term;
import Tree.UnaryRel;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

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

    public Controller() {
//        updateSignaturePanel();
//        updateStructurePanel();
    }
    
    protected void updateStructurePanel() {
        
//        ArrayList<Component> blobsNarrows = new ArrayList<>();
        for (Term t : activeStruct.terms) {
            if (!t.displayed) {
                int i = (Main.structurePanel.getComponentCount()*100)%Main.structurePanel.getWidth();
                if (t instanceof Const) {
                    t.blob.setText(t.name);
                    t.blob.setBounds(i, i, t.name.length() * 10, 40);
                } else {
                    t.blob.setBounds(i, i, 30, 30);
                }
                Main.structurePanel.add(t.blob);
//                blobsNarrows.add(t.blob);
                t.displayed = true;
            }
        }

        for (NullaryRel r : activeStruct.nullaryRels) {
        }

        for (UnaryRel r : activeStruct.unaryRels) {
            r.arg.blob.setBackground(r.colour);
        }

        for (BinaryRel r : activeStruct.binaryRels) {
            Arrow a = new Arrow(r.arg1.blob, r.arg2.blob, r.name, r.colour);
            r.arg1.arrows.add(a);
            r.arg2.arrows.add(a);
            Main.structurePanel.add(a);
//            blobsNarrows.add(a);
        }
//        return blobsNarrows;
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
}
