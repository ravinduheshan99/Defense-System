package defence.system;

import javax.swing.JOptionPane;

public class Helicopter extends javax.swing.JFrame implements Observer {

    private int sc;
    private String fuel;
    private int ammo;
    private int missile;
    private String energy;

    Tank tk;
    Submarine sm;

    public Helicopter() {
        initComponents();
    }

    public Helicopter(int sc, String fuel, int ammo, int missile, String energy) {
        initComponents();
        this.sc = sc;
        this.fuel = fuel;
        this.ammo = ammo;
        this.missile = missile;
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
                btnlo.setEnabled(false);
            } else if (0 <= level && level < 25) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(false);
                btnlo.setEnabled(false);
            } else if (25 <= level && level < 50) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnlo.setEnabled(false);
            } else if (50 <= level && level < 75) {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnlo.setEnabled(false);
            } else {
                btnshoot.setEnabled(true);
                btnmo.setEnabled(true);
                btnlo.setEnabled(true);
            }
        }
    }

    public void sentInfo(String diffence, Helicopter hc, Tank tk, Submarine sm) {

    }

    public void requestInfo(String diffence, Boolean pm) {
        if (diffence.equals("Helicopter") && pm == true) {
            txtarea1.append("From Main Controller To Helicopter :\nPlease Send Your Current Updates ASAP\n\n");
        } else {

        }
    }

    public Helicopter currentInfo() {
        Helicopter instance = new Helicopter((int) spinnersc.getValue(), txtfuel.getText(), (int) spinnerammo.getValue(), (int) spinnermissile.getValue(), Double.toString(sliderenergy.getValue()));
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

    public String getEnergy() {
        return energy;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblareaclearance = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnmo = new javax.swing.JButton();
        btnlo = new javax.swing.JButton();
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
        lblname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnermissile = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtfuel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsendupdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setForeground(new java.awt.Color(0, 255, 0));
        lblareaclearance.setText("Area Not Cleared");
        getContentPane().add(lblareaclearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 34, -1, 31));

        btnshoot.setBackground(new java.awt.Color(0, 0, 0));
        btnshoot.setForeground(new java.awt.Color(255, 0, 0));
        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);
        getContentPane().add(btnshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 67, 113, 40));

        btnmo.setBackground(new java.awt.Color(0, 0, 0));
        btnmo.setForeground(new java.awt.Color(0, 0, 255));
        btnmo.setText("Missile Operation");
        btnmo.setEnabled(false);
        getContentPane().add(btnmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 67, -1, 40));

        btnlo.setBackground(new java.awt.Color(0, 0, 0));
        btnlo.setForeground(new java.awt.Color(255, 102, 0));
        btnlo.setText("Laser Operation");
        btnlo.setEnabled(false);
        getContentPane().add(btnlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, 113, 40));

        sliderenergy.setBackground(new java.awt.Color(0, 0, 0));
        sliderenergy.setForeground(new java.awt.Color(255, 255, 0));
        sliderenergy.setMajorTickSpacing(10);
        sliderenergy.setMinorTickSpacing(2);
        sliderenergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderenergy.setPaintLabels(true);
        sliderenergy.setPaintTicks(true);
        sliderenergy.setValue(100);
        getContentPane().add(sliderenergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 67, -1, 404));

        txtarea1.setBackground(new java.awt.Color(0, 0, 0));
        txtarea1.setColumns(20);
        txtarea1.setForeground(new java.awt.Color(0, 255, 0));
        txtarea1.setRows(5);
        jScrollPane1.setViewportView(txtarea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 467, 227));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 448, 379, 23));

        btnsend.setBackground(new java.awt.Color(0, 0, 0));
        btnsend.setForeground(new java.awt.Color(0, 255, 0));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        getContentPane().add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 448, 82, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 182, 80, -1));

        checkboxposition.setBackground(new java.awt.Color(0, 0, 0));
        checkboxposition.setForeground(new java.awt.Color(0, 255, 0));
        checkboxposition.setText("Position");
        checkboxposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpositionActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, -1, -1));
        getContentPane().add(spinnersc, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 77, 96, -1));
        getContentPane().add(spinnerammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, -1));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Helicopter");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Missile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));
        getContentPane().add(spinnermissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 179, 50, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fuel Amount");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 138, -1, -1));

        txtfuel.setBackground(new java.awt.Color(0, 0, 0));
        txtfuel.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(txtfuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 135, 96, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Energy");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 47, -1, -1));

        btnsendupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnsendupdate.setForeground(new java.awt.Color(255, 255, 0));
        btnsendupdate.setText("Send Updates");
        btnsendupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnsendupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 125, 130, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Self Learning Courses\\iCM-106-iCET\\Modules\\05-OOP\\Assignments\\Courseworks\\Week 05\\1.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 490));

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
            btnlo.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxpositionActionPerformed

    private void btnsendupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendupdateActionPerformed
        Observable.getInstance().getInfo("Helicopter", currentInfo(), tk, sm);
            JOptionPane.showMessageDialog(null,"Updates Sent Successfully!");
    }//GEN-LAST:event_btnsendupdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlo;
    private javax.swing.JButton btnmo;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnsendupdate;
    private javax.swing.JButton btnshoot;
    private javax.swing.JCheckBox checkboxposition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblareaclearance;
    private javax.swing.JLabel lblname;
    private javax.swing.JSlider sliderenergy;
    private javax.swing.JSpinner spinnerammo;
    private javax.swing.JSpinner spinnermissile;
    private javax.swing.JSpinner spinnersc;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txtarea1;
    private javax.swing.JTextField txtfuel;
    // End of variables declaration//GEN-END:variables
}
