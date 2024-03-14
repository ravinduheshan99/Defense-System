package defence.system;

import javax.swing.JOptionPane;

public class Tank extends javax.swing.JFrame implements Observer {

    private int sc;
    private String fuel;
    private int ammo;
    private int missile;
    private int rsammo;
    private String energy;

    Helicopter hc;
    Submarine sm;

    public Tank() {
        initComponents();
    }

    public Tank(int sc, String fuel, int ammo, int missile, int rsammo, String energy) {
        initComponents();
        this.sc = sc;
        this.fuel = fuel;
        this.ammo = ammo;
        this.missile = missile;
        this.rsammo = rsammo;
        this.energy = energy;
    }

    public void chat(String text, String name) {
        if (lblname.getText() == name) {
            txtarea1.append("Me : " + text + "\n");
        } else {
            txtarea1.append(name + " : " + text + "\n");
        }
    }

    public void clearArea(Boolean checked) {
        if (checked) {
            lblareaclearance.setText("Area Cleared");
        } else {
            lblareaclearance.setText("Area Not Cleared");
        }
    }

    public void warPosition(double level) {
        if (checkboxposition.isSelected()) {
            if (level == 0) {
                btnshoot.setEnabled(false);
                btnmo.setEnabled(false);
                btnro.setEnabled(false);
                btnrs.setEnabled(false);
            } else if (0 <= level && level < 25) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(false);
                btnro.setEnabled(false);
                btnrs.setEnabled(false);
            } else if (25 <= level && level < 50) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnro.setEnabled(false);
                btnrs.setEnabled(false);
            } else if (50 <= level && level < 75) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnro.setEnabled(true);
                btnrs.setEnabled(false);
            } else {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnro.setEnabled(true);
                btnrs.setEnabled(true);
            }
        }
    }

    public void sentInfo(String diffence, Helicopter hc, Tank tk, Submarine sm) {

    }

    public void requestInfo(String diffence, Boolean pm) {
        if (diffence.equals("Tank") && pm == true) {
            txtarea1.append("From Main Controller To Tank :\nPlease Send Your Current Updates ASAP\n\n");
        } else {

        }
    }

    public Tank currentInfo() {
        Tank instance = new Tank((int) spinnersc.getValue(), txtfuel.getText(), (int) spinnerammo.getValue(), (int) spinnermissile.getValue(), (int) spinnerrsammo.getValue(), Double.toString(sliderenergy.getValue()));
        return instance;
    }

    public int getSc() {
        return sc;
    }

    public String getFuel() {
        return fuel;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getMissile() {
        return missile;
    }

    public int getRsammo() {
        return rsammo;
    }

    public String getEnergy() {
        return energy;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblareaclearance = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnmo = new javax.swing.JButton();
        btnro = new javax.swing.JButton();
        sliderenergy = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea1 = new javax.swing.JTextArea();
        txt1 = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkboxposition = new javax.swing.JCheckBox();
        spinnersc = new javax.swing.JSpinner();
        spinnerammo = new javax.swing.JSpinner();
        btnrs = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnermissile = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinnerrsammo = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtfuel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnsendupdates = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setForeground(new java.awt.Color(0, 255, 0));
        lblareaclearance.setText("Area Not Cleared");
        getContentPane().add(lblareaclearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 35, -1, 31));

        btnshoot.setBackground(new java.awt.Color(0, 0, 0));
        btnshoot.setForeground(new java.awt.Color(255, 0, 0));
        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);
        getContentPane().add(btnshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 113, 40));

        btnmo.setBackground(new java.awt.Color(0, 0, 0));
        btnmo.setForeground(new java.awt.Color(0, 0, 255));
        btnmo.setText("Missile Operation");
        btnmo.setEnabled(false);
        getContentPane().add(btnmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 130, 40));

        btnro.setBackground(new java.awt.Color(0, 0, 0));
        btnro.setForeground(new java.awt.Color(0, 255, 255));
        btnro.setText("Redar Operation");
        btnro.setEnabled(false);
        getContentPane().add(btnro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 50));

        sliderenergy.setBackground(new java.awt.Color(0, 0, 0));
        sliderenergy.setForeground(new java.awt.Color(255, 255, 0));
        sliderenergy.setMajorTickSpacing(10);
        sliderenergy.setMinorTickSpacing(2);
        sliderenergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderenergy.setPaintLabels(true);
        sliderenergy.setPaintTicks(true);
        sliderenergy.setValue(100);
        getContentPane().add(sliderenergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 68, -1, 404));

        txtarea1.setBackground(new java.awt.Color(0, 0, 0));
        txtarea1.setColumns(20);
        txtarea1.setForeground(new java.awt.Color(0, 255, 0));
        txtarea1.setRows(5);
        jScrollPane1.setViewportView(txtarea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 213, 499, 229));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 449, 398, 23));

        btnsend.setBackground(new java.awt.Color(0, 0, 0));
        btnsend.setForeground(new java.awt.Color(0, 255, 0));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        getContentPane().add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 449, 95, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 73, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, 20));

        checkboxposition.setBackground(new java.awt.Color(0, 0, 0));
        checkboxposition.setForeground(new java.awt.Color(0, 255, 0));
        checkboxposition.setText("Position");
        checkboxposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpositionActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(spinnersc, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 70, 90, -1));
        getContentPane().add(spinnerammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        btnrs.setBackground(new java.awt.Color(0, 0, 0));
        btnrs.setForeground(new java.awt.Color(255, 102, 0));
        btnrs.setText("Rotate Shooting");
        btnrs.setEnabled(false);
        btnrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrsActionPerformed(evt);
            }
        });
        getContentPane().add(btnrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 50));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Tank");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Missile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, 20));
        getContentPane().add(spinnermissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 50, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RS Ammo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, 20));
        getContentPane().add(spinnerrsammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 50, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fuel Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 104, 80, -1));

        txtfuel.setBackground(new java.awt.Color(0, 0, 0));
        txtfuel.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(txtfuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 101, 90, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Energy");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 48, -1, -1));

        btnsendupdates.setBackground(new java.awt.Color(0, 0, 0));
        btnsendupdates.setForeground(new java.awt.Color(255, 255, 0));
        btnsendupdates.setText("Send Updates");
        btnsendupdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendupdatesActionPerformed(evt);
            }
        });
        getContentPane().add(btnsendupdates, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 139, 189, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Self Learning Courses\\iCM-106-iCET\\Modules\\05-OOP\\Assignments\\Courseworks\\Week 05\\1.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        Observable.getInstance().getMessage(txt1.getText(), lblname.getText());
        txt1.setText(null);
    }//GEN-LAST:event_btnsendActionPerformed

    private void checkboxpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxpositionActionPerformed
        if (!(checkboxposition.isSelected())) {
            btnshoot.setEnabled(false);
            btnmo.setEnabled(false);
            btnro.setEnabled(false);
            btnrs.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxpositionActionPerformed

    private void btnsendupdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendupdatesActionPerformed
        Observable.getInstance().getInfo("Tank", hc, currentInfo(), sm);
        JOptionPane.showMessageDialog(null,"Updates Sent Successfully!");
    }//GEN-LAST:event_btnsendupdatesActionPerformed

    private void btnrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmo;
    private javax.swing.JButton btnro;
    private javax.swing.JButton btnrs;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnsendupdates;
    private javax.swing.JButton btnshoot;
    private javax.swing.JCheckBox checkboxposition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblareaclearance;
    private javax.swing.JLabel lblname;
    private javax.swing.JSlider sliderenergy;
    private javax.swing.JSpinner spinnerammo;
    private javax.swing.JSpinner spinnermissile;
    private javax.swing.JSpinner spinnerrsammo;
    private javax.swing.JSpinner spinnersc;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txtarea1;
    private javax.swing.JTextField txtfuel;
    // End of variables declaration//GEN-END:variables
}
