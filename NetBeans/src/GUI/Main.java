/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Parser.folLexer;
import Parser.folParser;
import Tree.DuplicateDefinitionException;
import Tree.LogicTree;
import Tree.Structure;
import Tree.Term;
import Tree.UnboundException;
import Tree.UndefinedRelationException;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author alina
 */
public class Main extends javax.swing.JFrame {

//    static DefaultListModel sentenceListModel = new DefaultListModel();
//    static DefaultListModel constListModel = new DefaultListModel();
//    static DefaultListModel nullaryListModel = new DefaultListModel();
//    static DefaultListModel nullaryRelsDisplayModel = new DefaultListModel();
//    static DefaultListModel unaryListModel = new DefaultListModel();
//    static DefaultListModel binaryListModel = new DefaultListModel();
//    static Structure activeStruct = new Structure();
//    static Signature activeSig = new Signature(activeStruct);
//    static ArrayList<LogicTree> activeSentences = new ArrayList<>();
    static Controller controller = new Controller();

    public Main() {
        initComponents();
        controller.updateSignaturePanel();
        controller.updateStructurePanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        SignaturePanel = new javax.swing.JTabbedPane();
        Constants = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        constantList = new javax.swing.JList();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        Nullary = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nullaryList = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        binaryList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        unaryList = new javax.swing.JList();
        structurePanel = new javax.swing.JPanel();
        SentencePanel = new javax.swing.JPanel();
        jTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        showEvaluator = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        newStructure = new javax.swing.JMenuItem();
        saveStructure = new javax.swing.JMenuItem();
        saveStructureAs = new javax.swing.JMenuItem();
        openStructure = new javax.swing.JMenuItem();
        generateStructure = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(672, 400));

        SignaturePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignaturePanel.setFocusable(false);
        SignaturePanel.setPreferredSize(new java.awt.Dimension(150, 150));
        SignaturePanel.setRequestFocusEnabled(false);

        Constants.setBorder(null);
        Constants.setFocusable(false);
        Constants.setOpaque(false);
        Constants.setRequestFocusEnabled(false);
        Constants.setVerifyInputWhenFocusTarget(false);

        jScrollPane2.setBorder(null);

        constantList.setModel(controller.constListModel);
        constantList.setOpaque(false);
        jScrollPane2.setViewportView(constantList);

        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("jButton15");

        javax.swing.GroupLayout ConstantsLayout = new javax.swing.GroupLayout(Constants);
        Constants.setLayout(ConstantsLayout);
        ConstantsLayout.setHorizontalGroup(
            ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstantsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConstantsLayout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ConstantsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        ConstantsLayout.setVerticalGroup(
            ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstantsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addContainerGap())
        );

        SignaturePanel.addTab("Constants", Constants);

        Nullary.setBorder(null);

        jScrollPane3.setBorder(null);

        //nullaryList = new javax.swing.JList(nullaryListModel);
        nullaryList.setModel(controller.nullaryListModel);
        nullaryList.setOpaque(false);
        jScrollPane3.setViewportView(nullaryList);

        javax.swing.GroupLayout NullaryLayout = new javax.swing.GroupLayout(Nullary);
        Nullary.setLayout(NullaryLayout);
        NullaryLayout.setHorizontalGroup(
            NullaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NullaryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        NullaryLayout.setVerticalGroup(
            NullaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NullaryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        SignaturePanel.addTab("Nullary Relations", Nullary);

        jPanel4.setBorder(null);
        jPanel4.setPreferredSize(new java.awt.Dimension(239, 400));

        jScrollPane4.setBorder(null);

        //binaryList = new javax.swing.JList(binaryListModel);
        binaryList.setModel(controller.binaryListModel);
        binaryList.setOpaque(false);
        jScrollPane4.setViewportView(binaryList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        SignaturePanel.addTab("Binary Relations", jPanel4);

        jPanel2.setBorder(null);

        jScrollPane5.setBorder(null);

        unaryList.setModel(controller.unaryListModel);
        unaryList.setOpaque(false);
        jScrollPane5.setViewportView(unaryList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        SignaturePanel.addTab("Unary Relations", jPanel2);

        structurePanel.setBackground(new java.awt.Color(191, 66, 50));
        structurePanel.setAutoscrolls(true);
        structurePanel.setMinimumSize(new java.awt.Dimension(100, 100));
        structurePanel.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout structurePanelLayout = new javax.swing.GroupLayout(structurePanel);
        structurePanel.setLayout(structurePanelLayout);
        structurePanelLayout.setHorizontalGroup(
            structurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        structurePanelLayout.setVerticalGroup(
            structurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jTextField.setSelectionColor(new java.awt.Color(120, 98, 89));
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKeyReleased(evt);
            }
        });

        jButton2.setText("¬");
        jButton2.setAlignmentY(0.0F);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("∨");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("→");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("∃");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("∀");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("∧");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("↔");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("⊤");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("⊥");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jButton4)))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jButton2.getAccessibleContext().setAccessibleName("");

        jButton13.setText("Clear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton13, refreshButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(0, 0, 0)
                .addComponent(refreshButton)
                .addGap(0, 0, 0)
                .addComponent(jButton13))
        );

        jScrollPane1.setBorder(null);

        //jList1 = new javax.swing.JList(sentenceListModel);
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("active sentences"));
        jList1.setModel(controller.sentenceListModel);
        jList1.setOpaque(false);
        jList1.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout SentencePanelLayout = new javax.swing.GroupLayout(SentencePanel);
        SentencePanel.setLayout(SentencePanelLayout);
        SentencePanelLayout.setHorizontalGroup(
            SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SentencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField)
                    .addGroup(SentencePanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SentencePanelLayout.setVerticalGroup(
            SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SentencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SentencePanelLayout.createSequentialGroup()
                        .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField)))
                .addContainerGap())
        );

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton))
        );

        jMenu4.setText("Workbench");

        jMenu6.setText("Session");
        jMenu6.setToolTipText("Roll back to the last saved state");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("switch");
        jMenuItem7.setToolTipText("Load a different session");
        jMenu6.add(jMenuItem7);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("save");
        jMenuItem6.setToolTipText("Save current session");
        jMenu6.add(jMenuItem6);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("save as");
        jMenu6.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("reset");
        jMenuItem9.setToolTipText("Roll back to the last saved state");
        jMenu6.add(jMenuItem9);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("new");
        jMenuItem8.setToolTipText("Create a new session");
        jMenu6.add(jMenuItem8);

        jMenu4.add(jMenu6);

        jMenuItem3.setText("Preferences");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem1.setText("Account");
        jMenu4.add(jMenuItem1);

        jMenu5.setText("Show");

        showEvaluator.setSelected(true);
        showEvaluator.setText("Sentence Evaluator");
        showEvaluator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEvaluatorActionPerformed(evt);
            }
        });
        jMenu5.add(showEvaluator);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Sentence Quiz");
        jMenu5.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Structure Quiz");
        jMenu5.add(jCheckBoxMenuItem3);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Structure");

        newStructure.setText("new");
        newStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStructureActionPerformed(evt);
            }
        });
        jMenu1.add(newStructure);

        saveStructure.setText("save");
        saveStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStructureActionPerformed(evt);
            }
        });
        jMenu1.add(saveStructure);

        saveStructureAs.setText("save as");
        saveStructureAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStructureAsActionPerformed(evt);
            }
        });
        jMenu1.add(saveStructureAs);

        openStructure.setText("open");
        openStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openStructureActionPerformed(evt);
            }
        });
        jMenu1.add(openStructure);

        generateStructure.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        generateStructure.setText("generate random strucutre");
        generateStructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateStructureActionPerformed(evt);
            }
        });
        jMenu1.add(generateStructure);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Signature");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sentence");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(structurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(SentencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignaturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignaturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(structurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SentencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insertButtonText(jButton2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        insertButtonText(jButton7.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submitButtonAction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        insertButtonText(jButton3.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        insertButtonText(jButton5.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        insertButtonText(jButton4.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        insertButtonText(jButton9.getText());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        insertButtonText(jButton6.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        insertButtonText(jButton8.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        insertButtonText(jButton10.getText());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submitButtonAction();
        }
    }//GEN-LAST:event_jTextFieldKeyReleased

    private void generateStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateStructureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateStructureActionPerformed

    private void openStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStructureActionPerformed
        if (resolveOld("structure")) {
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                readInFile(fileChooser.getSelectedFile().getAbsolutePath());
            }
            saveStructure.setEnabled(true);
        }
    }//GEN-LAST:event_openStructureActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void saveStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStructureActionPerformed
        if (!controller.activeStruct.name.equals("Untitled")) {
            saveStructure(controller.activeStruct.name);
        } else {
            saveStructureAs();
        }
    }//GEN-LAST:event_saveStructureActionPerformed

    private void newStructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStructureActionPerformed
        if (resolveOld("structure")) {
            controller.activeStruct = new Structure();
            structurePanel.removeAll();
            structurePanel.repaint();
        }
    }//GEN-LAST:event_newStructureActionPerformed

    private void saveStructureAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStructureAsActionPerformed
        saveStructureAs();
    }//GEN-LAST:event_saveStructureAsActionPerformed

    private void showEvaluatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEvaluatorActionPerformed
        SentencePanel.setVisible(showEvaluator.getState());
    }//GEN-LAST:event_showEvaluatorActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Term t = new Term("t" + (controller.activeStruct.terms.size() + 1));
        controller.activeStruct.terms.add(t);
        t.blob.setBounds(10, 10, 30, 30);
        structurePanel.add(t.blob);
        structurePanel.repaint();
//        updateSignaturePanel();
        refreshButtonActionPerformed(evt);
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        for (int i = 0; i < controller.sentenceListModel.size(); i++) {
            LogicTree s = controller.activeSentences.get(i);
            String news = (String) controller.sentenceListModel.getElementAt(i);
            boolean outcome = s.evaluate(controller.activeStruct);
            news = news.substring(0, news.length() - 5) + " " + outcome;
            controller.sentenceListModel.setElementAt(news, i);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        controller.sentenceListModel.removeAllElements();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int selectedIndex = constantList.getSelectedIndex();
        String blobName = controller.constListModel.getElementAt(selectedIndex).toString();
        controller.constListModel.removeElementAt(selectedIndex);
        controller.activeStruct.terms.get(0).blob.invalidate();
        controller.activeStruct.terms.get(0).blob.setVisible(false);
        controller.activeStruct.terms.remove(0);
        for (Component c : structurePanel.getComponents()){
            if (c.getClass().getSimpleName().equals("Blob")){
                Blob b = (Blob) c;
                if (b.getText().equals(blobName)){
//                    b.setVisible(false);
//                    System.out.println(b.getClass().);
                }
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Constants;
    private javax.swing.JPanel Nullary;
    private javax.swing.JPanel SentencePanel;
    private javax.swing.JTabbedPane SignaturePanel;
    private javax.swing.JButton addButton;
    private javax.swing.JList binaryList;
    private javax.swing.JList constantList;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem generateStructure;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField;
    private javax.swing.JMenuItem newStructure;
    private javax.swing.JList nullaryList;
    private javax.swing.JMenuItem openStructure;
    private javax.swing.JButton refreshButton;
    private javax.swing.JMenuItem saveStructure;
    private javax.swing.JMenuItem saveStructureAs;
    private javax.swing.JCheckBoxMenuItem showEvaluator;
    protected static javax.swing.JPanel structurePanel;
    private javax.swing.JList unaryList;
    // End of variables declaration//GEN-END:variables

    private void insertButtonText(String name) {
        try {
            int pos = jTextField.getCaretPosition();
            String text1 = jTextField.getText(0, pos);
            String text2 = jTextField.getText(pos, jTextField.getText().length() - pos);
            jTextField.setText(text1 + name + text2);
            jTextField.requestFocusInWindow();
            jTextField.setCaretPosition(pos + 1);
        } catch (BadLocationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void submitButtonAction() {
        try {
            // parse input
            ANTLRInputStream input = new ANTLRInputStream(jTextField.getText());
            Lexer lexer = new folLexer(input);
            TokenStream tk = new CommonTokenStream(lexer);
            folParser p = new folParser(tk);
            ParseTree parseTree = p.condition().getChild(0);

            // create sentence, evaluate and add to activeSentences list
            LogicTree sentence = new LogicTree(parseTree, controller.activeStruct, controller.activeSig, new ArrayList());
            boolean outcome = sentence.evaluate(controller.activeStruct);
            controller.activeSentences.add(sentence);

            // add to list and scroll down
            controller.sentenceListModel.addElement(jTextField.getText() + " - " + outcome);
            int lastIndex = jList1.getModel().getSize() - 1;
            if (lastIndex >= 0) {
                jList1.ensureIndexIsVisible(lastIndex);
            }
            jTextField.setText("");

        } catch (UndefinedRelationException ex) {
            jTextField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (UnboundException ex) {
            jTextField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DuplicateDefinitionException ex) {
            jTextField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass());
            JOptionPane.showMessageDialog(this, "Invalid input! Please revise your sentence.");
        }

    }

//    private void updateStructurePanel() {
//        for (Term t : activeStruct.terms) {
//            if (!t.displayed) {
//                int i = (structurePanel.getComponentCount()*100)%structurePanel.getWidth();
//                if (t instanceof Const) {
//                    t.blob.setText(t.name);
//                    t.blob.setBounds(i, i, t.name.length() * 10, 40);
//                } else {
//                    t.blob.setBounds(i, i, 30, 30);
//                }
//                structurePanel.add(t.blob);
//                t.displayed = true;
//            }
//        }
//
//        for (NullaryRel r : activeStruct.nullaryRels) {
//        }
//
//        for (UnaryRel r : activeStruct.unaryRels) {
//            r.arg.blob.setBackground(r.colour);
//        }
//
//        for (BinaryRel r : activeStruct.binaryRels) {
//            Arrow a = new Arrow(r.arg1.blob, r.arg2.blob, r.name, r.colour);
//            r.arg1.arrows.add(a);
//            r.arg2.arrows.add(a);
//            structurePanel.add(a);
//        }
//    }
//
//    private void updateSignaturePanel() {
//        for (String constName : activeSig.constNames) {
//            if (!constListModel.contains(constName)) {
//                constListModel.addElement(constName);
//            }
//        }
//        for (String nullaryName : activeSig.nullaryNames) {
//            if (!nullaryListModel.contains(nullaryName)) {
//                nullaryListModel.addElement(nullaryName);
//            }
//        }
//        for (String unaryName : activeSig.unaryNames) {
//            if (!unaryListModel.contains(unaryName)) {
//                unaryListModel.addElement(unaryName);
//                unaryList.setForeground(Structure.toColour(unaryName));
//            }
//        }
//        for (String binaryName : activeSig.binaryNames) {
//            binaryListModel.addElement(binaryName);
//            binaryList.setForeground(Structure.toColour(binaryName));
//        }
//    }

    private boolean resolveOld(String object) {
        //TODO finish this
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to save the current " + object + "?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            saveStructureAs();
            return true;
        } else if (dialogResult == JOptionPane.CANCEL_OPTION) {
            return false;
        }
        return true;
    }

    private void readInFile(String fileName) {
        try {
            FileInputStream in = new FileInputStream(fileName);
            ObjectInputStream restore = new ObjectInputStream(in);
            Object x = restore.readObject();
            controller.activeStruct = (Structure) x;
            controller.updateStructurePanel();

        } catch (IOException e) {
            System.out.println(e.getClass());
            JOptionPane.showMessageDialog(this, "Editor can't find the file called " + fileName);
        } catch (ClassNotFoundException e) {
        }
    }

    private void saveStructure(String fileName) {
        try {
            FileOutputStream saveFile = new FileOutputStream(fileName);
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(controller.activeStruct);
            save.close();
        } catch (IOException e) {
        }
    }

    private void saveStructureAs() {
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            saveStructure(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }
} 
