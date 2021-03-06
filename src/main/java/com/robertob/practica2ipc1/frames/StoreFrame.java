/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.practica2ipc1.frames;

import com.robertob.practica2ipc1.engine.*;
import com.robertob.practica2ipc1.engine.consumables.*;
import com.robertob.practica2ipc1.engine.character.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author robertob
 */
public class StoreFrame extends javax.swing.JFrame {

    
    final MainFrame mainFrame;
    final MainEngine mainEngine;
    PetSelector petSelectorFrame;
    String[] confirmationOptions = {"Si","No"};
    
    /**
     * Creates new form StoreFrame
     */
    public StoreFrame(MainEngine mainEngine, MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        this.mainEngine = mainEngine;
        this.petSelectorFrame = new PetSelector(this.mainEngine);
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

        jButton10 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pokemonTab = new javax.swing.JPanel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buyPetBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nickTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        foodTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cerealBtn = new javax.swing.JButton();
        wafflesBtn = new javax.swing.JButton();
        appleBtn = new javax.swing.JButton();
        medTab = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        antibioticsBtn = new javax.swing.JButton();
        analgesicBtn = new javax.swing.JButton();
        vitaminBtn = new javax.swing.JButton();
        storeTitle = new javax.swing.JLabel();
        playerMoneyLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/apple.png"))); // NOI18N
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tienda");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Cantarell", 2, 20)); // NOI18N

        typeComboBox.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulbasur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel2.setText("Selecciona de la lista el");

        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel6.setText("pokemon que quieres comprar");

        jLabel7.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel7.setText("Presiona este boton para");

        jLabel8.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel8.setText("confirmar la compra");

        buyPetBtn.setBackground(new java.awt.Color(0, 255, 204));
        buyPetBtn.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        buyPetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/basket.png"))); // NOI18N
        buyPetBtn.setText(" COMPRAR");
        buyPetBtn.setBorderPainted(false);
        buyPetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyPetBtn.setEnabled(false);
        buyPetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyPetBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        jLabel12.setText("Todos los pokemons cuestan 50 monedas");

        nickTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nickTextFieldKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel13.setText("Escribe el apodo que quieres");

        jLabel14.setFont(new java.awt.Font("Cantarell", 0, 19)); // NOI18N
        jLabel14.setText("ponerle al pokemon");

        javax.swing.GroupLayout pokemonTabLayout = new javax.swing.GroupLayout(pokemonTab);
        pokemonTab.setLayout(pokemonTabLayout);
        pokemonTabLayout.setHorizontalGroup(
            pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemonTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pokemonTabLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pokemonTabLayout.createSequentialGroup()
                        .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buyPetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))
                    .addGroup(pokemonTabLayout.createSequentialGroup()
                        .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nickTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pokemonTabLayout.setVerticalGroup(
            pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemonTabLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addGap(37, 37, 37)
                .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGroup(pokemonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pokemonTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyPetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pokemonTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(nickTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mascotas", pokemonTab);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel1.setText("Manzana");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel4.setText("Cereal");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel5.setText("Waffles");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel9.setText("10");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel10.setText("30");

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel11.setText("50");

        cerealBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/cereal.png"))); // NOI18N
        cerealBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        cerealBtn.setContentAreaFilled(false);
        cerealBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerealBtnActionPerformed(evt);
            }
        });

        wafflesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/waffle.png"))); // NOI18N
        wafflesBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        wafflesBtn.setContentAreaFilled(false);
        wafflesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wafflesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wafflesBtnActionPerformed(evt);
            }
        });

        appleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/apple.png"))); // NOI18N
        appleBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        appleBtn.setContentAreaFilled(false);
        appleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodTabLayout = new javax.swing.GroupLayout(foodTab);
        foodTab.setLayout(foodTabLayout);
        foodTabLayout.setHorizontalGroup(
            foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodTabLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodTabLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodTabLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(foodTabLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)))
                        .addGap(153, 153, 153)
                        .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(foodTabLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)))
                        .addGap(12, 12, 12))
                    .addGroup(foodTabLayout.createSequentialGroup()
                        .addComponent(appleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(cerealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(wafflesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        foodTabLayout.setVerticalGroup(
            foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodTabLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodTabLayout.createSequentialGroup()
                        .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodTabLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52))
                            .addGroup(foodTabLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)))
                        .addGroup(foodTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cerealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wafflesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(foodTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(appleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Restaurante", foodTab);

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel15.setText("Vitamina");

        jLabel16.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel16.setText("20");

        jLabel17.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel17.setText("Analgesico");

        jLabel18.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel18.setText("50");

        jLabel19.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel19.setText("Antibiotico");

        jLabel20.setFont(new java.awt.Font("Cantarell", 1, 23)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel20.setText("80");

        antibioticsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/antibiotics.png"))); // NOI18N
        antibioticsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        antibioticsBtn.setContentAreaFilled(false);
        antibioticsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        antibioticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antibioticsBtnActionPerformed(evt);
            }
        });

        analgesicBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/analgesic.png"))); // NOI18N
        analgesicBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        analgesicBtn.setContentAreaFilled(false);
        analgesicBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analgesicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analgesicBtnActionPerformed(evt);
            }
        });

        vitaminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/vitamin.png"))); // NOI18N
        vitaminBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        vitaminBtn.setContentAreaFilled(false);
        vitaminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vitaminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitaminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medTabLayout = new javax.swing.GroupLayout(medTab);
        medTab.setLayout(medTabLayout);
        medTabLayout.setHorizontalGroup(
            medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medTabLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medTabLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medTabLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addComponent(jLabel15))
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(134, 134, 134))
                            .addGroup(medTabLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel17)))
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medTabLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel20))
                            .addGroup(medTabLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19)))
                        .addGap(6, 6, 6))
                    .addGroup(medTabLayout.createSequentialGroup()
                        .addComponent(vitaminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(analgesicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(antibioticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        medTabLayout.setVerticalGroup(
            medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medTabLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medTabLayout.createSequentialGroup()
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(medTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(analgesicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antibioticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(medTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(vitaminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Farmacia", medTab);

        storeTitle.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        storeTitle.setText("??Qu?? deseas comprar?");

        playerMoneyLabel.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/coinIcon.png"))); // NOI18N
        jLabel3.setText("=");
        jLabel3.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Cantarell", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/practica2ipc1/images/exitIconSymWhite.png"))); // NOI18N
        jButton1.setText(" SALIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storeTitle)
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(storeTitle))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(playerMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        mainFrame.getPlayerMoneyLabel().setText(String.valueOf(mainEngine.player.getMoney()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerealBtnActionPerformed
        buyItem("Cereal", 30);
    }//GEN-LAST:event_cerealBtnActionPerformed

    private void wafflesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wafflesBtnActionPerformed
        buyItem("Waffle", 50);
    }//GEN-LAST:event_wafflesBtnActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void appleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleBtnActionPerformed
        buyItem("Manzana", 10);
    }//GEN-LAST:event_appleBtnActionPerformed

    private void antibioticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antibioticsBtnActionPerformed
        buyItem("Antibiotico", 80);
    }//GEN-LAST:event_antibioticsBtnActionPerformed

    private void analgesicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analgesicBtnActionPerformed
        buyItem("Analgesico", 50);
    }//GEN-LAST:event_analgesicBtnActionPerformed

    private void vitaminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitaminBtnActionPerformed
        buyItem("Vitamina", 20);
    }//GEN-LAST:event_vitaminBtnActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void buyPetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyPetBtnActionPerformed
        if(mainEngine.player.getCurrentIndex() == 9){
            JOptionPane.showMessageDialog(null, "Ya no puedes comprar mas mascotas! Tu lista esta llena","Mascotas llenas",JOptionPane.ERROR_MESSAGE);
        } else if (!mainEngine.player.playerCanBuyPet()){
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar mascotas!","Sin dinero",JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmation = JOptionPane.showOptionDialog(this, "??Estas seguro que quieres comprar este pokemon?", "Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,confirmationOptions,confirmationOptions[0]);
            if(confirmation == JOptionPane.YES_OPTION){
                mainEngine.buyPet(typeComboBox.getSelectedItem().toString(), nickTextField.getText());
                playerMoneyLabel.setText(String.valueOf(mainEngine.player.getMoney()));
                mainFrame.updateNickOnList();
            }
        }  

    }//GEN-LAST:event_buyPetBtnActionPerformed

    private void nickTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nickTextFieldKeyTyped
        if (!nickTextField.getText().equals("")) {
            buyPetBtn.setEnabled(true);
        } else {
            buyPetBtn.setEnabled(false);
        }
    }//GEN-LAST:event_nickTextFieldKeyTyped

    private void buyItem(String item, int itemPrice){
        if(!mainEngine.player.playerCanBuyFood(itemPrice)){
            JOptionPane.showMessageDialog(this, "No tienes suficiente dinero para comprar este item!", "Dinero insuficiente", JOptionPane.ERROR_MESSAGE);
        } else {
            petSelectorFrame.setVisible(true);
            petSelectorFrame.showItemLabel(item);
            petSelectorFrame.updateNickOnList();
        }
    }
    
    public JLabel getPlayerMoneyLabel(){
        return playerMoneyLabel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analgesicBtn;
    private javax.swing.JButton antibioticsBtn;
    private javax.swing.JButton appleBtn;
    private javax.swing.JButton buyPetBtn;
    private javax.swing.JButton cerealBtn;
    private javax.swing.JPanel foodTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel medTab;
    private javax.swing.JTextField nickTextField;
    private javax.swing.JLabel playerMoneyLabel;
    private javax.swing.JPanel pokemonTab;
    private javax.swing.JLabel storeTitle;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton vitaminBtn;
    private javax.swing.JButton wafflesBtn;
    // End of variables declaration//GEN-END:variables
}
