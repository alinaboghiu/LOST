/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lost.GUI;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import lost.LogicTree.*;
import lost.Parser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.ast.QuantifierAST;

/**
 *
 * @author alina
 */
public class Display extends JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formulaField = new javax.swing.JTextField();
        formulaSubmit = new javax.swing.JButton();
        and = new javax.swing.JButton();
        or = new javax.swing.JButton();
        implies = new javax.swing.JButton();
        exists = new javax.swing.JButton();
        forall = new javax.swing.JButton();
        not = new javax.swing.JButton();
        truth = new javax.swing.JButton();
        falsity = new javax.swing.JButton();
        equivalence = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        rparen = new javax.swing.JButton();
        lparan = new javax.swing.JButton();
        avatar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        signature = new javax.swing.JTabbedPane();
        constantsPanel = new javax.swing.JPanel();
        unRelPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unRelRemove = new javax.swing.JButton();
        unRelAdd = new javax.swing.JButton();
        nulRelPanel = new javax.swing.JPanel();
        binRelPanel = new javax.swing.JPanel();
        newObject = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 193, 163));
        jPanel1.setOpaque(false);

        formulaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formulaFieldKeyReleased(evt);
            }
        });

        formulaSubmit.setText("Submit");
        formulaSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formulaSubmitMouseClicked(evt);
            }
        });

        and.setText("∧");
        and.setActionCommand("");
        and.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                andMouseClicked(evt);
            }
        });

        or.setText("∨");
        or.setActionCommand("");
        or.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orMouseClicked(evt);
            }
        });

        implies.setText("→");
        implies.setActionCommand("");
        implies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                impliesMouseClicked(evt);
            }
        });

        exists.setText("∃");
        exists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existsMouseClicked(evt);
            }
        });

        forall.setText("∀");
        forall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forallMouseClicked(evt);
            }
        });

        not.setText("¬");
        not.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notMouseClicked(evt);
            }
        });

        truth.setText("⊤");
        truth.setActionCommand("");
        truth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                truthMouseClicked(evt);
            }
        });

        falsity.setText("⊥");
        falsity.setActionCommand("");
        falsity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                falsityMouseClicked(evt);
            }
        });

        equivalence.setText("↔");
        equivalence.setActionCommand("");
        equivalence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equivalenceMouseClicked(evt);
            }
        });

        equals.setText("=");
        equals.setActionCommand("");
        equals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalsMouseClicked(evt);
            }
        });

        rparen.setText(")");
        rparen.setActionCommand("");
        rparen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rparenMouseClicked(evt);
            }
        });

        lparan.setText("(");
        lparan.setActionCommand("");
        lparan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lparanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exists, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equivalence, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lparan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formulaSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(implies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(falsity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(forall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(truth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rparen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(formulaField)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formulaField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exists, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equivalence, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lparan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rparen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(truth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forall, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(implies, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(falsity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(formulaSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        avatar.setIcon(new javax.swing.ImageIcon("/home/alina/LOST/avatars/sheep.png")); // NOI18N
        avatar.setText("jLabel1");

        jList1.setBackground(new java.awt.Color(242, 241, 240));
        jList1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Your score", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(215, 215, 215));
        jScrollPane1.setViewportView(jList1);

        signature.setBackground(new java.awt.Color(242, 241, 240));
        signature.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout constantsPanelLayout = new javax.swing.GroupLayout(constantsPanel);
        constantsPanel.setLayout(constantsPanelLayout);
        constantsPanelLayout.setHorizontalGroup(
            constantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        constantsPanelLayout.setVerticalGroup(
            constantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        signature.addTab("Constants", constantsPanel);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("man");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setForeground(java.awt.Color.pink);
        jLabel3.setText("woman");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.orange);
        jLabel4.setText("animal");

        unRelRemove.setText("Remove");

        unRelAdd.setText("Add");

        javax.swing.GroupLayout unRelPanelLayout = new javax.swing.GroupLayout(unRelPanel);
        unRelPanel.setLayout(unRelPanelLayout);
        unRelPanelLayout.setHorizontalGroup(
            unRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unRelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unRelPanelLayout.createSequentialGroup()
                        .addComponent(unRelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unRelRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        unRelPanelLayout.setVerticalGroup(
            unRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unRelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(unRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unRelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unRelRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        signature.addTab("Unary Relations", unRelPanel);

        javax.swing.GroupLayout nulRelPanelLayout = new javax.swing.GroupLayout(nulRelPanel);
        nulRelPanel.setLayout(nulRelPanelLayout);
        nulRelPanelLayout.setHorizontalGroup(
            nulRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        nulRelPanelLayout.setVerticalGroup(
            nulRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        signature.addTab("Nullary Relations", nulRelPanel);

        javax.swing.GroupLayout binRelPanelLayout = new javax.swing.GroupLayout(binRelPanel);
        binRelPanel.setLayout(binRelPanelLayout);
        binRelPanelLayout.setHorizontalGroup(
            binRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        binRelPanelLayout.setVerticalGroup(
            binRelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        signature.addTab("Binary Relations", binRelPanel);

        newObject.setText("Add New Object");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(signature)
                    .addComponent(jScrollPane1)
                    .addComponent(newObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signature, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newObject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        signature.getAccessibleContext().setAccessibleName("Constants");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void falsityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_falsityMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "⊥" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_falsityMouseClicked

    private void truthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_truthMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "⊤" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_truthMouseClicked

    private void equivalenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equivalenceMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "↔" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_equivalenceMouseClicked

    private void notMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "¬" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_notMouseClicked

    private void forallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forallMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "∀" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_forallMouseClicked

    private void existsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existsMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "∃" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_existsMouseClicked

    private void impliesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impliesMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "→" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_impliesMouseClicked

    private void orMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "∨" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_orMouseClicked

    private void andMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_andMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "∧" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_andMouseClicked

    private void formulaSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formulaSubmitMouseClicked
        try {
            processSentence();
        } catch (UnboundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formulaSubmitMouseClicked

    private void equalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "=" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_equalsMouseClicked

    private void rparenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rparenMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + ")" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_rparenMouseClicked

    private void lparanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lparanMouseClicked
        int pos = formulaField.getCaretPosition();
        String[] splitText = splitText(formulaField.getText(), pos);
        formulaField.setText(splitText[0] + "(" + splitText[1]);
        formulaField.setCaretPosition(pos);
    }//GEN-LAST:event_lparanMouseClicked

    private void formulaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formulaFieldKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                try {
                    processSentence();
                } catch (UnboundException ex) {
                    Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_formulaFieldKeyReleased
 
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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Display frame = new Display();
                      
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton and;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel binRelPanel;
    private javax.swing.JPanel constantsPanel;
    private javax.swing.JButton equals;
    private javax.swing.JButton equivalence;
    private javax.swing.JButton exists;
    private javax.swing.JButton falsity;
    private javax.swing.JButton forall;
    private javax.swing.JTextField formulaField;
    private javax.swing.JButton formulaSubmit;
    private javax.swing.JButton implies;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lparan;
    private javax.swing.JButton newObject;
    private javax.swing.JButton not;
    private javax.swing.JPanel nulRelPanel;
    private javax.swing.JButton or;
    private javax.swing.JButton rparen;
    private javax.swing.JTabbedPane signature;
    private javax.swing.JButton truth;
    private javax.swing.JButton unRelAdd;
    private javax.swing.JPanel unRelPanel;
    private javax.swing.JButton unRelRemove;
    // End of variables declaration//GEN-END:variables

    private void processSentence() throws UnboundException {
//        ANTLRInputStream input = new ANTLRInputStream(formulaField.getText());
//        FOLLexer lexer = new FOLLexer(input);
//        TokenStream tk = new CommonTokenStream(lexer);
//        FOLParser parser = new FOLParser(tk);
//
//        System.out.println(parser.condition().toStringTree());

        
//        //objects
//        Variable x = new Variable("x");
//        Variable y = new Variable("y");
//        Constant root = new Constant("root");
//        System.out.println("created objects");
//        
//        //relations
//        BinOp     op = BinOp.IMPLIES;
//        UnaryRel  P = new UnaryRel("P", y);
//        BinaryRel R = new BinaryRel("R", x, y);
//        BinaryRel R1 = new BinaryRel("R", root, x);
//        System.out.println("created relations");
//        
//        //leaf nodes
//        LogicTreeBinaryRelNode binRelR = new LogicTreeBinaryRelNode(R);
//        LogicTreeBinaryRelNode binRelR1 = new LogicTreeBinaryRelNode(R1);
//        LogicTreeUnaryRelNode  unRelP = new LogicTreeUnaryRelNode(P);
//        System.out.println("created leaf nodes");
//        
//        //nodes
//        LogicTreeBinOpNode  imp1 = new LogicTreeBinOpNode(op, binRelR, unRelP);
//        System.out.println("created imp1 node");
//        LogicTreeForAllNode ally = new LogicTreeForAllNode(y, imp1);
//        LogicTreeBinOpNode  imp2 = new LogicTreeBinOpNode(op, binRelR1, ally);
//        System.out.println("created nodes");
//        
//        //head
//        LogicTreeForAllNode head = new LogicTreeForAllNode(x, imp2);
//        System.out.println("created head");
//        
//        //tree
//        LogicTree test = new LogicTree(imp2);
//        System.out.println("created tree");
//        
//        //Structure to make it true
//        Structure makeTrue  = new Structure("make true");        
//        Constant  strRoot = new Constant("root");
//        UnaryRel  strP = new UnaryRel("P", strRoot);
//        BinaryRel strR = new BinaryRel("R", strRoot, strRoot);
//        makeTrue.objects.add(strRoot);
//        makeTrue.unaryRelations.add(strP);
//        makeTrue.binaryRelations.add(strR);
//        System.out.println("created true structure");
//        System.out.println(makeTrue.objects.size());
//        
//        //Structure to make it False
//        Structure makeFalse = new Structure("make false");
//        
//        //test.displayTree();
//        
//        boolean outcome = test.evaluate(makeTrue);
//        System.out.println(outcome);
//        
        
        Variable x = new Variable("x");
        UnaryRel happy = new UnaryRel("happy");
        LogicTreeUnaryRelNode leaf = new LogicTreeUnaryRelNode(happy, x);
        LogicTreeForAllNode head = new LogicTreeForAllNode(x, leaf);
        LogicTreeNotNode notNode = new LogicTreeNotNode(head);
        LogicTree tree = new LogicTree(notNode);
        
        Structure makeTrue = new Structure("makeTrue");
        StructObject o1 = new StructObject();
        StructObject o2 = new StructObject();
        StructObject o3 = new StructObject();
        o1.unaryRel.add(happy);
        o2.unaryRel.add(happy);
        
        makeTrue.objects.add(o1);
        makeTrue.objects.add(o2);
        makeTrue.objects.add(o3);
        
        boolean outcome = tree.evaluate(makeTrue);
        
        System.out.println(outcome);
    }

    private String[] splitText(String text, int caretPos) {
        String text1 = text.substring(0,caretPos);
        String text2 = text.substring(caretPos,text.length());
        String[] splitText = {text1, text2};
        return splitText;
    }
}
