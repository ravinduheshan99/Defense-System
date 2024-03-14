package defence.system;

import javax.swing.JOptionPane;

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
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("MainController"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtarea1.setBackground(new java.awt.Color(0, 0, 0));
        txtarea1.setColumns(20);
        txtarea1.setForeground(new java.awt.Color(0, 255, 0));
        txtarea1.setRows(5);
        jScrollPane2.setViewportView(txtarea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 56, 342, 249));

        cbxselectdefence.setBackground(new java.awt.Color(0, 0, 0));
        cbxselectdefence.setForeground(new java.awt.Color(0, 0, 255));
        cbxselectdefence.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Helicopter", "Tank", "Submarine" }));
        cbxselectdefence.setAutoscrolls(true);
        cbxselectdefence.setName("cbxselectdefence"); // NOI18N
        getContentPane().add(cbxselectdefence, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 201, 34));

        btncollectinformation.setBackground(new java.awt.Color(0, 0, 0));
        btncollectinformation.setForeground(new java.awt.Color(0, 255, 0));
        btncollectinformation.setText("Request Informations");
        btncollectinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncollectinformationActionPerformed(evt);
            }
        });
        getContentPane().add(btncollectinformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 56, 192, 34));

        lblsoldiercount.setBackground(new java.awt.Color(255, 255, 255));
        lblsoldiercount.setForeground(new java.awt.Color(255, 255, 255));
        lblsoldiercount.setText("Soldier Count");
        getContentPane().add(lblsoldiercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 90, 25));

        lblfuelamount.setForeground(new java.awt.Color(255, 255, 255));
        lblfuelamount.setText("Fuel Amount");
        getContentPane().add(lblfuelamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 90, 25));

        lblammoamount.setForeground(new java.awt.Color(255, 255, 255));
        lblammoamount.setText("Ammo Amount");
        getContentPane().add(lblammoamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 90, 25));

        lblposition.setForeground(new java.awt.Color(255, 255, 255));
        lblposition.setText("Position");
        getContentPane().add(lblposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, 75, 25));

        checkboxsendprivate.setBackground(new java.awt.Color(0, 0, 0));
        checkboxsendprivate.setForeground(new java.awt.Color(255, 0, 0));
        checkboxsendprivate.setText("Send Private");
        checkboxsendprivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxsendprivateActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxsendprivate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 120, -1));

        btnsend.setBackground(new java.awt.Color(0, 0, 0));
        btnsend.setForeground(new java.awt.Color(0, 255, 0));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        getContentPane().add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 340, 70));

        slider1.setBackground(new java.awt.Color(0, 0, 0));
        slider1.setForeground(new java.awt.Color(255, 255, 0));
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
        getContentPane().add(slider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 316, 418, -1));

        txtarea2.setBackground(new java.awt.Color(0, 0, 0));
        txtarea2.setColumns(20);
        txtarea2.setForeground(new java.awt.Color(0, 255, 0));
        txtarea2.setRows(5);
        jScrollPane3.setViewportView(txtarea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 371, 418, 100));
        getContentPane().add(mspinnersc, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 103, 108, -1));

        mtxtfuel.setBackground(new java.awt.Color(0, 0, 0));
        mtxtfuel.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(mtxtfuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 146, 108, -1));
        getContentPane().add(mspinnerammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 192, 108, -1));

        checkbox1.setBackground(new java.awt.Color(0, 0, 0));
        checkbox1.setForeground(new java.awt.Color(0, 255, 0));
        checkbox1.setText("Area Clear");
        checkbox1.setName(""); // NOI18N
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });
        getContentPane().add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 271, 86, 34));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Main Controller");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 316, 343, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Missile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 195, -1, -1));
        getContentPane().add(mspinnermissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 192, 78, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RS Ammo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 281, -1, -1));
        getContentPane().add(mspinnerrsammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 278, 80, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tomahawk Misil");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, 130, -1));
        getContentPane().add(mspinnertm, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 233, 107, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trident-2-Missile");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 236, -1, -1));
        getContentPane().add(mspinnert2m, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 233, 80, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Energy");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 106, -1, -1));

        txtenergy.setBackground(new java.awt.Color(0, 0, 0));
        txtenergy.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(txtenergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 101, 78, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Oxygen Level");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 149, -1, -1));

        txtoxygen.setBackground(new java.awt.Color(0, 0, 0));
        txtoxygen.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(txtoxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 146, 78, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Self Learning Courses\\iCM-106-iCET\\Modules\\05-OOP\\Assignments\\Courseworks\\Week 05\\1.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

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
        if(checkboxsendprivate.isSelected()){
            JOptionPane.showMessageDialog(null,"Successfully Request the Updates from "+cbxselectdefence.getSelectedItem().toString());
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Private Message Option Before Requesting!");
        }
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
    private javax.swing.JLabel jLabel7;
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
