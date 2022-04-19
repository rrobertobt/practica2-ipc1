/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.practica2ipc1.frames;

import com.robertob.practica2ipc1.engine.*;
import com.robertob.practica2ipc1.engine.character.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author robertob
 */
public class MainFrame extends javax.swing.JFrame {

    String[] confirmationOptions = {"Si","No"};
    public final MainEngine mainEngine = new MainEngine();
    StoreFrame storeFrame = new StoreFrame(mainEngine, this);
    ExitGameConfirmFrame exitConfirmFrame = new ExitGameConfirmFrame();
    AboutFrame aboutFrame = new AboutFrame();
    DefaultListModel petsListModel = new DefaultListModel();
    Pet selectedPet;
    
    public MainFrame() {
        initComponents();
        playerMoneyLabel.setText(String.valueOf(mainEngine.player.getMoney()));
    }
    
    

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
        storeBtn = new javax.swing.JButton();
        petStatsTitle = new javax.swing.JLabel();
        typeTitle = new javax.swing.JLabel();
        nickTitle = new javax.swing.JLabel();
        levelTitle = new javax.swing.JLabel();
        foodRequestsTitle = new javax.swing.JLabel();
        dirtinessTitle = new javax.swing.JLabel();
        walkRequestsTitle = new javax.swing.JLabel();
        petImage = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        nickLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        foodRequestsLabel = new javax.swing.JLabel();
        dirtinessLabel = new javax.swing.JLabel();
        walkRequestsLabel = new javax.swing.JLabel();
        cleanBtn = new javax.swing.JButton();
        walkBtn = new javax.swing.JButton();
        reviveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxFoodRequestsLabel = new javax.swing.JLabel();
        sicknessTitle = new javax.swing.JLabel();
        sicknessLabel = new javax.swing.JLabel();
        petStatusLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petList = new javax.swing.JList<>();
        playerMoneyLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        performingActionLabel = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        gameMenu = new javax.swing.JMenu();
        storeMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitGameMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        howPlayMenuItem = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        openAboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        myPetsTitle.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        myPetsTitle.setText("MIS MASCOTAS");

        petsCount.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N

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

        petStatsTitle.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        petStatsTitle.setText("ESTADISTICAS DE LA MASCOTA");

        typeTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        typeTitle.setText("Tipo:");

        nickTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        nickTitle.setText("Apodo:");

        levelTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        levelTitle.setText("Nivel:");

        foodRequestsTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        foodRequestsTitle.setText("Veces que ha pedido comer:");

        dirtinessTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        dirtinessTitle.setText("Excreciones:");

        walkRequestsTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        walkRequestsTitle.setText("Veces que ha pedido paseo:");

        petImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        petImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        typeLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        typeLabel.setText("---");
        typeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        nickLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        nickLabel.setText("---");
        nickLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        levelLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        levelLabel.setText("---");
        levelLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        foodRequestsLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        foodRequestsLabel.setText("---");
        foodRequestsLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        dirtinessLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        dirtinessLabel.setText("---");
        dirtinessLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        walkRequestsLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        walkRequestsLabel.setText("---");
        walkRequestsLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        cleanBtn.setBackground(new java.awt.Color(0, 102, 102));
        cleanBtn.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        cleanBtn.setForeground(new java.awt.Color(255, 255, 255));
        cleanBtn.setText("LIMPIAR");
        cleanBtn.setBorderPainted(false);
        cleanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanBtn.setEnabled(false);
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });

        walkBtn.setBackground(new java.awt.Color(0, 102, 102));
        walkBtn.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        walkBtn.setForeground(new java.awt.Color(255, 255, 255));
        walkBtn.setText("PASEAR");
        walkBtn.setBorderPainted(false);
        walkBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walkBtn.setEnabled(false);

        reviveBtn.setBackground(new java.awt.Color(0, 102, 102));
        reviveBtn.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        reviveBtn.setForeground(new java.awt.Color(255, 255, 255));
        reviveBtn.setText("REVIVIR");
        reviveBtn.setBorderPainted(false);
        reviveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reviveBtn.setEnabled(false);
        reviveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviveBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel1.setText("Presiona una de las mascotas para");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel2.setText("ver (o actualizar) su estado");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        jLabel3.setText("/");

        maxFoodRequestsLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        maxFoodRequestsLabel.setText("---");
        maxFoodRequestsLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        sicknessTitle.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        sicknessTitle.setText("Enfermedades:");

        sicknessLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        sicknessLabel.setText("---");
        sicknessLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        petStatusLabel.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N

        petList.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        petList.setModel(petsListModel);
        petList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(petList);

        playerMoneyLabel.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel4.setText("=");
        jLabel4.setToolTipText("");

        performingActionLabel.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N

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

        reportsMenu.setText("Reportes");
        mainMenuBar.add(reportsMenu);

        aboutMenu.setText("Acerca De");

        openAboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/informationIconBlack.png"))); // NOI18N
        openAboutMenuItem.setText("  Ver acerca de");
        openAboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAboutMenuItemActionPerformed(evt);
            }
        });
        aboutMenu.add(openAboutMenuItem);

        mainMenuBar.add(aboutMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nickTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nickLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(levelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(foodRequestsTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(foodRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxFoodRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dirtinessTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dirtinessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(sicknessTitle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sicknessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(walkRequestsTitle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(walkRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(petImage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cleanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(walkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reviveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(performingActionLabel))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(petStatusLabel)
                                .addGap(266, 266, 266))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(petStatsTitle)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(myPetsTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(petsCount))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(storeBtn))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(petsCount)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(myPetsTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(petStatsTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nickTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(levelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(levelTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodRequestsTitle)
                            .addComponent(foodRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(maxFoodRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dirtinessLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dirtinessTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(walkRequestsTitle)
                            .addComponent(walkRequestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cleanBtn)
                                .addGap(18, 18, 18)
                                .addComponent(walkBtn)
                                .addGap(18, 18, 18)
                                .addComponent(reviveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(performingActionLabel))
                            .addComponent(petImage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(petStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sicknessTitle)
                        .addComponent(sicknessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void updateNickOnList(){
        
        this.petsListModel.removeAllElements();
        for (int i = 0; i < 10; i++) {
            if(mainEngine.player.getPlayerPets(i) != null){
                petsListModel.addElement(mainEngine.player.getPlayerPets(i).getNick());
            };
        }
        this.petList.setModel(petsListModel);        
       
    }
    
    private void storeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeBtnActionPerformed
        storeFrame.setVisible(true);
        storeFrame.getPlayerMoneyLabel().setText(String.valueOf(mainEngine.player.getMoney()));
    }//GEN-LAST:event_storeBtnActionPerformed

    private void storeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeMenuItemActionPerformed
        storeFrame.setVisible(true);
    }//GEN-LAST:event_storeMenuItemActionPerformed

    private void exitGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameMenuItemActionPerformed
        exitConfirmFrame.setVisible(true);
    }//GEN-LAST:event_exitGameMenuItemActionPerformed

    private void openAboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAboutMenuItemActionPerformed
        aboutFrame.setVisible(true);
    }//GEN-LAST:event_openAboutMenuItemActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        performingActionLabel.setText("Limpiando mascota...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        performingActionLabel.setText("");
        mainEngine.player.getPlayerPets(petList.getSelectedIndex()).setDirtiness(0);
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void petListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petListMouseClicked
        try {
            selectedPet = mainEngine.player.getPlayerPets(petList.getSelectedIndex());
            setStatsText(selectedPet);
            enableBtns(selectedPet);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("No se selecciono mascota");
        }
        
        
    }//GEN-LAST:event_petListMouseClicked

    private void reviveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviveBtnActionPerformed
        if(mainEngine.player.playerCanRevive()){
            int confirmationRevive = JOptionPane.showOptionDialog(this, "¿Estas seguro que quieres revivr esta mascota por "+ selectedPet.getRevivePrice() +" monedas?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,confirmationOptions,confirmationOptions[0]);
            if (confirmationRevive == JOptionPane.YES_OPTION){
                selectedPet.setPetAlive(true);
                selectedPet.setFoodRequests(0);
                mainEngine.player.lowerMoney(selectedPet.getRevivePrice());
                selectedPet.tPet.resume();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para revivir a esta mascota!","Sin dinero",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_reviveBtnActionPerformed

    private void setStatsText(Pet pet){
        typeLabel.setText(pet.getType());
        nickLabel.setText(pet.getNick());
        levelLabel.setText(String.valueOf(pet.getLevel()));
        foodRequestsLabel.setText(String.valueOf(pet.getFoodRequests()));
        maxFoodRequestsLabel.setText(String.valueOf(pet.getMaxFoodRequests()));
        dirtinessLabel.setText(String.valueOf(pet.getDirtiness()));
        walkRequestsLabel.setText(String.valueOf(pet.getWalkRequests()));
        sicknessLabel.setText(String.valueOf(pet.getSickness()));
        if (pet.isPetAlive()){
            petStatusLabel.setText("Mascota viva");
        } else if(!pet.isPetAlive()){
            petStatusLabel.setText("Mascota muerta");
        }
   
    }
    
    private void enableBtns(Pet selectedPet){
        if(selectedPet.isPetAlive()){
            if(selectedPet.getDirtiness() == 0){
                cleanBtn.setEnabled(false);
            }
            walkBtn.setEnabled(true);
            reviveBtn.setEnabled(false);
        } else if (!selectedPet.isPetAlive()){
            cleanBtn.setEnabled(false);
            walkBtn.setEnabled(false);
            reviveBtn.setEnabled(true);
        }
    
    }
    
    public JLabel getPlayerMoneyLabel(){
        return playerMoneyLabel;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel dirtinessLabel;
    private javax.swing.JLabel dirtinessTitle;
    private javax.swing.JMenuItem exitGameMenuItem;
    private javax.swing.JLabel foodRequestsLabel;
    private javax.swing.JLabel foodRequestsTitle;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem howPlayMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel levelTitle;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JLabel maxFoodRequestsLabel;
    private javax.swing.JLabel myPetsTitle;
    private javax.swing.JLabel nickLabel;
    private javax.swing.JLabel nickTitle;
    private javax.swing.JMenuItem openAboutMenuItem;
    private javax.swing.JLabel performingActionLabel;
    private javax.swing.JLabel petImage;
    private javax.swing.JList<String> petList;
    private javax.swing.JLabel petStatsTitle;
    private javax.swing.JLabel petStatusLabel;
    private javax.swing.JLabel petsCount;
    private javax.swing.JLabel playerMoneyLabel;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JButton reviveBtn;
    private javax.swing.JLabel sicknessLabel;
    private javax.swing.JLabel sicknessTitle;
    private javax.swing.JButton storeBtn;
    private javax.swing.JMenuItem storeMenuItem;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeTitle;
    private javax.swing.JButton walkBtn;
    private javax.swing.JLabel walkRequestsLabel;
    private javax.swing.JLabel walkRequestsTitle;
    // End of variables declaration//GEN-END:variables
}
