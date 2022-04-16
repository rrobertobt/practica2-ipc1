/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.practica2ipc1.frames;

import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author robertob
 */
public class AboutFrame extends javax.swing.JFrame {

    /**
     * Creates new form AboutFrame
     */
    public AboutFrame() {
        initComponents();
        
        projectLink.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/rrobertobt/practica2-ipc1"));
                } catch (Exception ex) {
                    System.out.println("Hubo un error al intentar abrir el link en el explorador...");
                    System.out.println("El error fue: "+ex);
                    JOptionPane.showMessageDialog(null, "Hubo un error al intentar abrir el link en el explorador...","Error al abrir URL",JOptionPane.ERROR_MESSAGE);
                }
        }
        }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        projectLink = new javax.swing.JLabel();
        backToGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Acerca de");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel1.setText("Juego como Practica de IPC 1");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel2.setText("para el curso de Introducción a la Computación Y Programación 1.");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel3.setText("Este es un juego realizado como una practica de programación");

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel4.setText("Está realizado con el lenguaje de programación Java, con apoyo de");

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel5.setText("la libreria de herramientas de widgets graficos, Swing.");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel6.setText("Realizado por:");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel7.setText("Codigo fuente en Github:");

        jLabel8.setText("José Bautista");

        projectLink.setFont(new java.awt.Font("Cantarell", 2, 18)); // NOI18N
        projectLink.setForeground(new java.awt.Color(153, 102, 255));
        projectLink.setText("https://github.com/rrobertobt/practica2-ipc1");
        projectLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        backToGameBtn.setBackground(new java.awt.Color(0, 255, 204));
        backToGameBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        backToGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/backIconBlack.png"))); // NOI18N
        backToGameBtn.setText(" CERRAR");
        backToGameBtn.setToolTipText("");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(10, 10, 10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)))
                            .addGap(45, 45, 45)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(projectLink)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(backToGameBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(projectLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(backToGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToGameBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backToGameBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToGameBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel projectLink;
    // End of variables declaration//GEN-END:variables



}
