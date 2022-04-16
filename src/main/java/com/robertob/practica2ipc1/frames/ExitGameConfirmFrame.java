/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.practica2ipc1.frames;

/**
 *
 * @author robertob
 */
public class ExitGameConfirmFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExitGameConfirmFrame
     */
    public ExitGameConfirmFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitTitle = new javax.swing.JLabel();
        exitDes1 = new javax.swing.JLabel();
        exitDes2 = new javax.swing.JLabel();
        exitGameBtn = new javax.swing.JButton();
        backToGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cerrar juego?");
        setResizable(false);

        exitTitle.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        exitTitle.setText("¿Salir?");

        exitDes1.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        exitDes1.setText("¿Estas seguro de que quieres salir del juego?");

        exitDes2.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        exitDes2.setText("Se borrará todo el progreso");

        exitGameBtn.setBackground(new java.awt.Color(255, 204, 204));
        exitGameBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        exitGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/exitIconSymBlack.png"))); // NOI18N
        exitGameBtn.setText(" SALIR");
        exitGameBtn.setBorderPainted(false);
        exitGameBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameBtnActionPerformed(evt);
            }
        });

        backToGameBtn.setBackground(new java.awt.Color(0, 255, 204));
        backToGameBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        backToGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/backIconBlack.png"))); // NOI18N
        backToGameBtn.setText(" REGRESAR");
        backToGameBtn.setBorderPainted(false);
        backToGameBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToGameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(exitDes2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(exitTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exitGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backToGameBtn))
                            .addComponent(exitDes1))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(exitTitle)
                .addGap(26, 26, 26)
                .addComponent(exitDes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitDes2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitGameBtnActionPerformed

    private void backToGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToGameBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backToGameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ExitGameConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitGameConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitGameConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitGameConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitGameConfirmFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToGameBtn;
    private javax.swing.JLabel exitDes1;
    private javax.swing.JLabel exitDes2;
    private javax.swing.JButton exitGameBtn;
    private javax.swing.JLabel exitTitle;
    // End of variables declaration//GEN-END:variables
}
