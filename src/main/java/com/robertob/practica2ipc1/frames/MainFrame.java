/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.practica2ipc1.frames;

/**
 *
 * @author robertob
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    StoreFrame storeFrame = new StoreFrame();
    ExitGameConfirmFrame exitConfirmFrame = new ExitGameConfirmFrame();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPetsTitle = new javax.swing.JLabel();
        petsCount = new javax.swing.JLabel();
        pet1Btn = new javax.swing.JButton();
        pet2Btn = new javax.swing.JButton();
        pet3Btn = new javax.swing.JButton();
        pet4Btn = new javax.swing.JButton();
        pet5Btn = new javax.swing.JButton();
        pet6Btn = new javax.swing.JButton();
        pet7Btn = new javax.swing.JButton();
        pet8Btn = new javax.swing.JButton();
        pet9Btn = new javax.swing.JButton();
        pet10Btn = new javax.swing.JButton();
        storeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        gameMenu = new javax.swing.JMenu();
        storeMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitGameMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        howPlayMenuItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        myPetsTitle.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        myPetsTitle.setText("MIS MASCOTAS");

        petsCount.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N

        pet1Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet1Btn.setText("jButton1");
        pet1Btn.setBorderPainted(false);
        pet1Btn.setContentAreaFilled(false);
        pet1Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet2Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet2Btn.setText("jButton1");
        pet2Btn.setBorderPainted(false);
        pet2Btn.setContentAreaFilled(false);
        pet2Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet3Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet3Btn.setText("jButton1");
        pet3Btn.setBorderPainted(false);
        pet3Btn.setContentAreaFilled(false);
        pet3Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet4Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet4Btn.setText("jButton1");
        pet4Btn.setBorderPainted(false);
        pet4Btn.setContentAreaFilled(false);
        pet4Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet5Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet5Btn.setText("jButton1");
        pet5Btn.setBorderPainted(false);
        pet5Btn.setContentAreaFilled(false);
        pet5Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet6Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet6Btn.setText("jButton1");
        pet6Btn.setBorderPainted(false);
        pet6Btn.setContentAreaFilled(false);
        pet6Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet7Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet7Btn.setText("jButton1");
        pet7Btn.setBorderPainted(false);
        pet7Btn.setContentAreaFilled(false);
        pet7Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet8Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet8Btn.setText("jButton1");
        pet8Btn.setBorderPainted(false);
        pet8Btn.setContentAreaFilled(false);
        pet8Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet9Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet9Btn.setText("jButton1");
        pet9Btn.setBorderPainted(false);
        pet9Btn.setContentAreaFilled(false);
        pet9Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pet10Btn.setFont(new java.awt.Font("Cantarell", 0, 21)); // NOI18N
        pet10Btn.setText("jButton1");
        pet10Btn.setBorderPainted(false);
        pet10Btn.setContentAreaFilled(false);
        pet10Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        storeBtn.setBackground(new java.awt.Color(102, 102, 102));
        storeBtn.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        storeBtn.setForeground(new java.awt.Color(255, 255, 255));
        storeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/storeIconSym.png"))); // NOI18N
        storeBtn.setText(" ABRIR TIENDA");
        storeBtn.setBorderPainted(false);
        storeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        storeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        jLabel1.setText("STATS DE LA MASCOTA");

        gameMenu.setText("Juego");

        storeMenuItem.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        storeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/storeIconSymBlack.png"))); // NOI18N
        storeMenuItem.setText(" Abrir tienda...");
        storeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(storeMenuItem);
        gameMenu.add(jSeparator1);

        exitGameMenuItem.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        exitGameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/exitIconSymBlack.png"))); // NOI18N
        exitGameMenuItem.setText(" Salir del juego...");
        exitGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(exitGameMenuItem);

        mainMenuBar.add(gameMenu);

        helpMenu.setText("Ayuda");

        howPlayMenuItem.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        howPlayMenuItem.setText("?  Como jugar");
        helpMenu.add(howPlayMenuItem);

        mainMenuBar.add(helpMenu);

        aboutMenu.setText("Acerca De");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/informationIconBlack.png"))); // NOI18N
        jMenuItem1.setText("  Ver acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        aboutMenu.add(jMenuItem1);

        mainMenuBar.add(aboutMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pet6Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet7Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet8Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet9Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet10Btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pet1Btn)
                                .addGap(12, 12, 12)
                                .addComponent(pet2Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet3Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet4Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pet5Btn)))
                        .addContainerGap(252, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myPetsTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(petsCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(storeBtn)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(myPetsTitle)
                        .addComponent(storeBtn))
                    .addComponent(petsCount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pet1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pet6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet7Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet8Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet9Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pet10Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeBtnActionPerformed
        storeFrame.setVisible(true);
    }//GEN-LAST:event_storeBtnActionPerformed

    private void storeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeMenuItemActionPerformed
        storeFrame.setVisible(true);
    }//GEN-LAST:event_storeMenuItemActionPerformed

    private void exitGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameMenuItemActionPerformed
        exitConfirmFrame.setVisible(true);
    }//GEN-LAST:event_exitGameMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem exitGameMenuItem;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem howPlayMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JLabel myPetsTitle;
    private javax.swing.JButton pet10Btn;
    private javax.swing.JButton pet1Btn;
    private javax.swing.JButton pet2Btn;
    private javax.swing.JButton pet3Btn;
    private javax.swing.JButton pet4Btn;
    private javax.swing.JButton pet5Btn;
    private javax.swing.JButton pet6Btn;
    private javax.swing.JButton pet7Btn;
    private javax.swing.JButton pet8Btn;
    private javax.swing.JButton pet9Btn;
    private javax.swing.JLabel petsCount;
    private javax.swing.JButton storeBtn;
    private javax.swing.JMenuItem storeMenuItem;
    // End of variables declaration//GEN-END:variables
}