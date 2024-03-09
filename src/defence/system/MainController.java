package defence.system;

public class MainController extends javax.swing.JFrame implements Observer {

    public MainController() {
        initComponents();
    }

    public void chat(String text, String name) {
        if (lblname.getText() == name) {
            txtarea1.append("Me : " + text + "\n");
        } else {
            txtarea1.append(name + " : " + text + "\n");
        }
    }

    public void clearArea(Boolean checked) {

    }

    public void warPosition(double level) {

    }

    public void sentInfo(String diffence, Helicopter hc, Tank tk, Submarine sm) {
        if (diffence.equals("Helicopter")) {
            System.out.println("\n");
            cbxselectdefence.setSelectedItem("Helicopter");
            mspinnersc.setValue(hc.getSc());
            mtxtfuel.setText(hc.getFuel());
            mspinnerammo.setValue(hc.getAmmo());
            mspinnermissile.setValue(hc.getMissile());
            txtenergy.setText(hc.getEnergy());
            txtoxygen.setText(null);
            mspinnerrsammo.setValue(0);
            mspinnertm.setValue(0);
            mspinnert2m.setValue(0);
            txtarea2.append("Current Updates From Helicopter ---> \n\nSoldier Count : " + hc.getSc() + "\nFuel Level : " + hc.getFuel() + " Liters\nAmmo Count : " + hc.getAmmo() + "\nMissile Count : " + hc.getMissile() + "\nEnergy Level : " + hc.getEnergy() + "%\n\n");

        } else if (diffence.equals("Tank")) {
            System.out.println("\n");
            cbxselectdefence.setSelectedItem("Tank");
            mspinnersc.setValue(tk.getSc());
            mtxtfuel.setText(tk.getFuel());
            mspinnerammo.setValue(tk.getAmmo());
            mspinnermissile.setValue(tk.getMissile());
            txtenergy.setText(tk.getEnergy());
            txtoxygen.setText(null);
            mspinnerrsammo.setValue(tk.getRsammo());
            mspinnertm.setValue(0);
            mspinnert2m.setValue(0);
            txtarea2.append("Current Updates From Tank ---> \n\nSoldier Count : " + tk.getSc() + "\nFuel Level : " + tk.getFuel() + " Liters\nAmmo Count : " + tk.getAmmo() + "\nMissile Count : " + tk.getMissile() + "\nRS Ammo Count : " + tk.getRsammo() + "\nEnergy Level : " + tk.getEnergy() + "%\n\n");

        } else {
            System.out.println("\n");
            cbxselectdefence.setSelectedItem("Submarine");
            mspinnersc.setValue(sm.getSc());
            mtxtfuel.setText(null);
            mspinnerammo.setValue(sm.getAmmo());
            mspinnermissile.setValue(0);
            txtenergy.setText(sm.getEnergy());
            txtoxygen.setText(sm.getOxygen());
            mspinnerrsammo.setValue(0);
            mspinnertm.setValue(sm.getTm());
            mspinnert2m.setValue(sm.getT2m());
            txtarea2.append("Current Updates From Submarine ---> \n\nSoldier Count : " + sm.getSc() + " Liters\nAmmo Count : " + sm.getAmmo() + "\nTomahawk Missile Count : " + sm.getTm() + "\nTrident-2-Missile Count : " + sm.getT2m() + "\nEnergy Level : " + sm.getEnergy() + "%\nOxygen Level : " + sm.getOxygen() + "%\n\n");

        }
    }

    public void requestInfo(String diffence, Boolean pm) {
        if (diffence.equals("Helicopter") && pm == true) {
            txtarea1.append("From Main Controller To Helicopter :\nPlease Send Your Current Updates ASAP\n\n");
        } else if (diffence.equals("Tank") && pm == true) {
            txtarea1.append("From Main Controller To Tank :\nPlease Send Your Current Updates ASAP\n\n");
        } else if (diffence.equals("Submarine") && pm == true) {
            txtarea1.append("From Main Controller To Submarine :\nPlease Send Your Current Updates ASAP\n\n");
        } else {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea1 = new javax.swing.JTextArea();
        cbxselectdefence = new javax.swing.JComboBox();
        btncollectinformation = new javax.swing.JButton();
        lblsoldiercount = new javax.swing.JLabel();
        lblfuelamount = new javax.swing.JLabel();
        lblammoamount = new javax.swing.JLabel();
        lblposition = new javax.swing.JLabel();
        checkboxsendprivate = new javax.swing.JCheckBox();
        btnsend = new javax.swing.JButton();
        slider1 = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarea2 = new javax.swing.JTextArea();
        mspinnersc = new javax.swing.JSpinner();
        mtxtfuel = new javax.swing.JTextField();
        mspinnerammo = new javax.swing.JSpinner();
        checkbox1 = new javax.swing.JCheckBox();
        lblname = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mspinnermissile = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        mspinnerrsammo = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        mspinnertm = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        mspinnert2m = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtenergy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtoxygen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MainController"); // NOI18N

        txtarea1.setColumns(20);
        txtarea1.setRows(5);
        jScrollPane2.setViewportView(txtarea1);

        cbxselectdefence.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Helicopter", "Tank", "Submarine" }));
        cbxselectdefence.setName("cbxselectdefence"); // NOI18N

        btncollectinformation.setText("Request Informations");
        btncollectinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncollectinformationActionPerformed(evt);
            }
        });

        lblsoldiercount.setText("Soldier Count");

        lblfuelamount.setText("Fuel Amount");

        lblammoamount.setText("Ammo Amount");

        lblposition.setText("Position");

        checkboxsendprivate.setText("Send Private");
        checkboxsendprivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxsendprivateActionPerformed(evt);
            }
        });

        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        slider1.setMajorTickSpacing(10);
        slider1.setMinorTickSpacing(2);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setValue(0);
        slider1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });

        txtarea2.setColumns(20);
        txtarea2.setRows(5);
        jScrollPane3.setViewportView(txtarea2);

        checkbox1.setText("Area Clear");
        checkbox1.setName(""); // NOI18N
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setText("Main Controller");

        jLabel1.setText("Missile");

        jLabel2.setText("RS Ammo");

        jLabel3.setText("Tomahawk Missile");

        jLabel4.setText("Trident-2-Missile");

        jLabel5.setText("Energy");

        jLabel6.setText("Oxygen Level");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(checkboxsendprivate)
                                    .addGap(0, 256, Short.MAX_VALUE))
                                .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(lblname))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblposition, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblammoamount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mspinnerammo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblsoldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mspinnersc))
                                    .addComponent(cbxselectdefence, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mspinnertm, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblfuelamount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mtxtfuel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btncollectinformation, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtoxygen)
                                                    .addComponent(txtenergy)
                                                    .addComponent(mspinnermissile, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                            .addComponent(mspinnert2m)
                                            .addComponent(mspinnerrsammo))))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btncollectinformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxselectdefence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblsoldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mspinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblfuelamount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mtxtfuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(txtoxygen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblammoamount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mspinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(mspinnermissile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(mspinnertm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(mspinnert2m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblposition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mspinnerrsammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtenergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkboxsendprivate))
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxsendprivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxsendprivateActionPerformed
        
    }//GEN-LAST:event_checkboxsendprivateActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        Observable.getInstance().getMessage(txt1.getText(), lblname.getText());
        txt1.setText(null);
    }//GEN-LAST:event_btnsendActionPerformed

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox1ActionPerformed
        if (checkbox1.isSelected()) {
            Observable.getInstance().areaStatus(true);
        } else {
            Observable.getInstance().areaStatus(false);
        }
    }//GEN-LAST:event_checkbox1ActionPerformed

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged
        Observable.getInstance().sliderState(slider1.getValue());
    }//GEN-LAST:event_slider1StateChanged

    private void btncollectinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncollectinformationActionPerformed
        Observable.getInstance().reqInfo(cbxselectdefence.getSelectedItem().toString(), checkboxsendprivate.isSelected());
    }//GEN-LAST:event_btncollectinformationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncollectinformation;
    private javax.swing.JButton btnsend;
    private javax.swing.JComboBox cbxselectdefence;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JCheckBox checkboxsendprivate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblammoamount;
    private javax.swing.JLabel lblfuelamount;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblposition;
    private javax.swing.JLabel lblsoldiercount;
    private javax.swing.JSpinner mspinnerammo;
    private javax.swing.JSpinner mspinnermissile;
    private javax.swing.JSpinner mspinnerrsammo;
    private javax.swing.JSpinner mspinnersc;
    private javax.swing.JSpinner mspinnert2m;
    private javax.swing.JSpinner mspinnertm;
    private javax.swing.JTextField mtxtfuel;
    private javax.swing.JSlider slider1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txtarea1;
    private javax.swing.JTextArea txtarea2;
    private javax.swing.JTextField txtenergy;
    private javax.swing.JTextField txtoxygen;
    // End of variables declaration//GEN-END:variables
}
