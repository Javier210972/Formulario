/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Calculadora;


public class FrmEjemplo extends javax.swing.JFrame {
  
    Calculadora calcu = new Calculadora();
   
    public FrmEjemplo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblSuma = new javax.swing.JButton();
        jTxtValor2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlblResta = new javax.swing.JButton();
        jbtnDivi = new javax.swing.JButton();
        jlblMulti = new javax.swing.JButton();
        jTxtValor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblSuma.setText("+");
        jlblSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblSumaActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor1: ");

        jlblResta.setText("-");
        jlblResta.setName("jbtnResta"); // NOI18N
        jlblResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblRestaActionPerformed(evt);
            }
        });

        jbtnDivi.setText("/");
        jbtnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDiviActionPerformed(evt);
            }
        });

        jlblMulti.setText("*");
        jlblMulti.setName("jbtnMulti"); // NOI18N
        jlblMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblMultiActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor2:");

        jlblResultado.setText("  0");
        jlblResultado.setName("jlblResultado"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblSuma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblResta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblMulti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDivi)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMulti)
                    .addComponent(jlblSuma)
                    .addComponent(jlblResta)
                    .addComponent(jbtnDivi))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTxtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jlblSuma.getAccessibleContext().setAccessibleName("jbtnSuma");
        jTxtValor2.getAccessibleContext().setAccessibleName("jTxtValor1");
        jLabel1.getAccessibleContext().setAccessibleName("jlblValor1");
        jlblResta.getAccessibleContext().setAccessibleName("jbtnResta");
        jbtnDivi.getAccessibleContext().setAccessibleName("jbtnDivi}");
        jlblMulti.getAccessibleContext().setAccessibleName("jbtnMulti");
        jTxtValor1.getAccessibleContext().setAccessibleName("jTxtValor2");
        jLabel2.getAccessibleContext().setAccessibleName("jlblValor2");
        jlblResultado.getAccessibleContext().setAccessibleName("jlblResultado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblSumaActionPerformed
   
    
  calcu.setValor1(Integer.parseInt(jTxtValor1.getText()));
   calcu.setValor2(Integer.parseInt(jTxtValor2.getText()));
   
   jlblResultado.setText(""+calcu.getSuma());
  
  
    }//GEN-LAST:event_jlblSumaActionPerformed

    private void jlblRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblRestaActionPerformed
        calcu.setValor1(Integer.parseInt(jTxtValor1.getText()));
        calcu.setValor2(Integer.parseInt(jTxtValor2.getText()));
        jlblResultado.setText(""+calcu.getResta());
        
    }//GEN-LAST:event_jlblRestaActionPerformed

    private void jlblMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblMultiActionPerformed
       calcu.setValor1(Integer.parseInt(jTxtValor1.getText()));
        calcu.setValor2(Integer.parseInt(jTxtValor2.getText()));
        jlblResultado.setText(""+calcu.getMulti());
    }//GEN-LAST:event_jlblMultiActionPerformed

    private void jbtnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDiviActionPerformed
         calcu.setValor1(Integer.parseInt(jTxtValor1.getText()));
        calcu.setValor2(Integer.parseInt(jTxtValor2.getText()));
        jlblResultado.setText(""+calcu.getDivision());
    }//GEN-LAST:event_jbtnDiviActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtValor1;
    private javax.swing.JTextField jTxtValor2;
    private javax.swing.JButton jbtnDivi;
    private javax.swing.JButton jlblMulti;
    private javax.swing.JButton jlblResta;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JButton jlblSuma;
    // End of variables declaration//GEN-END:variables
}
