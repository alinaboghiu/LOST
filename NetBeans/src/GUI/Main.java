package GUI;

import Tree.DuplicateDefinitionException;
import Tree.Structure;
import Tree.UnboundException;
import Tree.UndefinedRelationException;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;

/**
 *
 * @author alina
 */
public class Main extends javax.swing.JFrame {

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
        delConstButton = new javax.swing.JButton();
        addConstButton = new javax.swing.JButton();
        renameConstButton = new javax.swing.JButton();
        newConstantField = new javax.swing.JTextField();
        renameConstantField = new javax.swing.JTextField();
        Nullary = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nullaryList = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        binaryList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        unaryList = new javax.swing.JList();
        addUnaryRelButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        newUnaryRelField = new javax.swing.JTextField();
        structurePanel = new javax.swing.JPanel();
        SentencePanel = new javax.swing.JPanel();
        newSentenceField = new javax.swing.JTextField();
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
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        sentenceQuiz = new javax.swing.JLabel();
        structureQuiz = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
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
        showSentenceQuiz = new javax.swing.JCheckBoxMenuItem();
        showStructureQuiz = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        newStructure = new javax.swing.JMenuItem();
        saveStructure = new javax.swing.JMenuItem();
        saveStructureAs = new javax.swing.JMenuItem();
        openStructure = new javax.swing.JMenuItem();
        generateStructure = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 400));

        SignaturePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignaturePanel.setFocusable(false);
        SignaturePanel.setPreferredSize(new java.awt.Dimension(280, 500));
        SignaturePanel.setRequestFocusEnabled(false);

        Constants.setBorder(null);
        Constants.setFocusable(false);
        Constants.setOpaque(false);
        Constants.setPreferredSize(new java.awt.Dimension(250, 300));
        Constants.setRequestFocusEnabled(false);
        Constants.setVerifyInputWhenFocusTarget(false);

        jScrollPane2.setBorder(null);

        constantList.setModel(controller.constListModel);
        constantList.setOpaque(false);
        jScrollPane2.setViewportView(constantList);

        delConstButton.setText("Delete");
        delConstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delConstButtonActionPerformed(evt);
            }
        });

        addConstButton.setText("Add");
        addConstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConstButtonActionPerformed(evt);
            }
        });

        renameConstButton.setText("Rename");
        renameConstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameConstButtonActionPerformed(evt);
            }
        });

        newConstantField.setToolTipText("choose a name");
        newConstantField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConstantFieldActionPerformed(evt);
            }
        });
        newConstantField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newConstantFieldKeyReleased(evt);
            }
        });

        renameConstantField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                renameConstantFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout ConstantsLayout = new javax.swing.GroupLayout(Constants);
        Constants.setLayout(ConstantsLayout);
        ConstantsLayout.setHorizontalGroup(
            ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConstantsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(renameConstantField)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConstantsLayout.createSequentialGroup()
                        .addComponent(renameConstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addConstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delConstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(newConstantField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(25, 25, 25))
        );
        ConstantsLayout.setVerticalGroup(
            ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstantsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renameConstantField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newConstantField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConstantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delConstButton)
                    .addComponent(addConstButton)
                    .addComponent(renameConstButton))
                .addGap(20, 20, 20))
        );

        newConstantField.setVisible(false);
        renameConstantField.setVisible(false);

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        NullaryLayout.setVerticalGroup(
            NullaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NullaryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        SignaturePanel.addTab("Binary Relations", jPanel4);

        jPanel2.setBorder(null);

        jScrollPane5.setBorder(null);

        unaryList.setModel(controller.unaryListModel);
        unaryList.setOpaque(false);
        jScrollPane5.setViewportView(unaryList);

        addUnaryRelButton.setText("Add");
        addUnaryRelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUnaryRelButtonActionPerformed(evt);
            }
        });

        jButton11.setText("Remove");

        newUnaryRelField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newUnaryRelFieldKeyReleased(evt);
            }
        });
        newUnaryRelField.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addUnaryRelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newUnaryRelField)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUnaryRelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUnaryRelButton)
                    .addComponent(jButton11))
                .addContainerGap())
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        structurePanelLayout.setVerticalGroup(
            structurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        newSentenceField.setSelectionColor(new java.awt.Color(120, 98, 89));
        newSentenceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newSentenceFieldKeyReleased(evt);
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

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
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
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(submitButton))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jButton2.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setBorder(null);

        //jList1 = new javax.swing.JList(sentenceListModel);
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("active sentences"));
        jList1.setModel(controller.sentenceListModel);
        jList1.setOpaque(false);
        jList1.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(jList1);

        sentenceQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sentenceQuiz.setText("jLabel1");
        sentenceQuiz.setVisible(false);

        structureQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        structureQuiz.setText("jLabel2");
        structureQuiz.setVisible(false);

        javax.swing.GroupLayout SentencePanelLayout = new javax.swing.GroupLayout(SentencePanel);
        SentencePanel.setLayout(SentencePanelLayout);
        SentencePanelLayout.setHorizontalGroup(
            SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SentencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sentenceQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SentencePanelLayout.createSequentialGroup()
                        .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newSentenceField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(structureQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SentencePanelLayout.setVerticalGroup(
            SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SentencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(structureQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sentenceQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SentencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SentencePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newSentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setText("Add new object");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton))
        );

        jProgressBar1.setBackground(new java.awt.Color(242, 240, 240));

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

        showSentenceQuiz.setText("Sentence Quiz");
        showSentenceQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSentenceQuizActionPerformed(evt);
            }
        });
        jMenu5.add(showSentenceQuiz);

        showStructureQuiz.setText("Structure Quiz");
        showStructureQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStructureQuizActionPerformed(evt);
            }
        });
        jMenu5.add(showStructureQuiz);

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
                    .addComponent(SentencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(structurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignaturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignaturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(structurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
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

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            controller.submitButtonAction();
        } catch (UndefinedRelationException ex) {
            newSentenceField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (UnboundException ex) {
            newSentenceField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DuplicateDefinitionException ex) {
            newSentenceField.setText("");
            controller.updateSignaturePanel();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass());
            JOptionPane.showMessageDialog(this, "Invalid input! Please revise your sentence.");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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

    private void newSentenceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newSentenceFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                controller.submitButtonAction();
            } catch (UndefinedRelationException ex) {
                newSentenceField.setText("");
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (UnboundException ex) {
                newSentenceField.setText("");
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (DuplicateDefinitionException ex) {
                newSentenceField.setText("");
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (Exception e) {
                System.out.println(e.getClass());
                JOptionPane.showMessageDialog(this, "Invalid input! Please revise your sentence.");
            }
        }
    }//GEN-LAST:event_newSentenceFieldKeyReleased

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
        controller.addBlob();
    }//GEN-LAST:event_addButtonActionPerformed

    private void delConstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delConstButtonActionPerformed
        try {
            controller.removeBlob(constantList.getSelectedIndex());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nothing selected to delete");
        }
    }//GEN-LAST:event_delConstButtonActionPerformed

    private void addConstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConstButtonActionPerformed
        newConstantField.setVisible(true);
        newConstantField.requestFocusInWindow();
        SignaturePanel.repaint();
    }//GEN-LAST:event_addConstButtonActionPerformed

    private void showSentenceQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSentenceQuizActionPerformed
        sentenceQuiz.setVisible(showSentenceQuiz.getState());
    }//GEN-LAST:event_showSentenceQuizActionPerformed

    private void showStructureQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStructureQuizActionPerformed
        structureQuiz.setVisible(showStructureQuiz.getState());
    }//GEN-LAST:event_showStructureQuizActionPerformed

    private void addUnaryRelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUnaryRelButtonActionPerformed
        newUnaryRelField.setVisible(true);
        newUnaryRelField.requestFocusInWindow();
        SignaturePanel.repaint();
    }//GEN-LAST:event_addUnaryRelButtonActionPerformed

    private void newUnaryRelFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newUnaryRelFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.addUnaryRel(newUnaryRelField.getText());
            newUnaryRelField.setText("");
            newUnaryRelField.setVisible(false);
        }
    }//GEN-LAST:event_newUnaryRelFieldKeyReleased

    private void renameConstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameConstButtonActionPerformed
        try {
            if (constantList.getSelectedIndex() > -1) {
                renameConstantField.setVisible(true);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_renameConstButtonActionPerformed

    private void newConstantFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConstantFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newConstantFieldActionPerformed

    private void newConstantFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newConstantFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.addBlob(newConstantField.getText());
            newConstantField.setText("");
            newConstantField.setVisible(false);
        }
    }//GEN-LAST:event_newConstantFieldKeyReleased

    private void renameConstantFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renameConstantFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.renameBlob(constantList.getAnchorSelectionIndex(), renameConstantField.getText());
            renameConstantField.setText("");
            renameConstantField.setVisible(false);
        }
    }//GEN-LAST:event_renameConstantFieldKeyReleased

    private void insertButtonText(String name) {
        try {
            int pos = newSentenceField.getCaretPosition();
            String text1 = newSentenceField.getText(0, pos);
            String text2 = newSentenceField.getText(pos, newSentenceField.getText().length() - pos);
            newSentenceField.setText(text1 + name + text2);
            newSentenceField.requestFocusInWindow();
            newSentenceField.setCaretPosition(pos + 1);
        } catch (BadLocationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            structurePanel.removeAll();
            controller.updateStructurePanel();
            structurePanel.revalidate();
            structurePanel.repaint();

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
    private javax.swing.JButton addConstButton;
    private javax.swing.JButton addUnaryRelButton;
    private javax.swing.JList binaryList;
    private javax.swing.JList constantList;
    private javax.swing.JButton delConstButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem generateStructure;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    protected static javax.swing.JList jList1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField newConstantField;
    protected static javax.swing.JTextField newSentenceField;
    private javax.swing.JMenuItem newStructure;
    private javax.swing.JTextField newUnaryRelField;
    private javax.swing.JList nullaryList;
    private javax.swing.JMenuItem openStructure;
    private javax.swing.JButton renameConstButton;
    protected javax.swing.JTextField renameConstantField;
    private javax.swing.JMenuItem saveStructure;
    private javax.swing.JMenuItem saveStructureAs;
    private javax.swing.JLabel sentenceQuiz;
    private javax.swing.JCheckBoxMenuItem showEvaluator;
    private javax.swing.JCheckBoxMenuItem showSentenceQuiz;
    private javax.swing.JCheckBoxMenuItem showStructureQuiz;
    public static javax.swing.JPanel structurePanel;
    private javax.swing.JLabel structureQuiz;
    private javax.swing.JButton submitButton;
    private javax.swing.JList unaryList;
    // End of variables declaration//GEN-END:variables
}
