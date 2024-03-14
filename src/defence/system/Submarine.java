package defence.system;

import javax.swing.JOptionPane;

public class Submarine extends javax.swing.JFrame implements Observer {

    private int sc;
    private int ammo;
    private int tm;
    private int t2m;
    private String energy;
    private String oxygen;

    Helicopter hc;
    Tank tk;

    public Submarine() {
        initComponents();
    }

    public Submarine(int sc, int ammo, int tm, int t2m, String energy, String oxygen) {
        initComponents();
        this.sc = sc;
        this.ammo = ammo;
        this.tm = tm;
        this.t2m = t2m;
        this.energy = energy;
        this.oxygen = oxygen;
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
                btnso.setEnabled(false);
                btntm.setEnabled(false);
                btnt2m.setEnabled(false);
            } else if (0 < level && level < 25) {
                btnshoot.setEnabled(true);
                btnso.setEnabled(false);
                btntm.setEnabled(false);
                btnt2m.setEnabled(false);
            } else if (25 <= level && level < 50) {
                btnshoot.setEnabled(true);
                btnso.setEnabled(true);
                btntm.setEnabled(false);
                btnt2m.setEnabled(false);
            } else if (50 <= level && level < 75) {
                btnshoot.setEnabled(true);
                btnso.setEnabled(true);
                btntm.setEnabled(true);
                btnt2m.setEnabled(false);
            } else {
                btnshoot.setEnabled(true);
                btnso.setEnabled(true);
                btntm.setEnabled(true);
                btnt2m.setEnabled(true);
            }
        }
    }

    public void sentInfo(String diffence, Helicopter hc, Tank tk, Submarine sm) {

    }

    public void requestInfo(String diffence, Boolean pm) {
        if (diffence.equals("Submarine") && pm == true) {
            txtarea1.append("From Main Controller To Submarine :\nPlease Send Your Current Updates ASAP\n\n");
        } else {

        }
    }

    public Submarine currentInfo() {
        Submarine instance = new Submarine((int) spinnersc.getValue(), (int) spinnerammo.getValue(), (int) spinnertm.getValue(), (int) spinnert2m.getValue(), Double.toString(sliderenergy.getValue()), Double.toString(slideroxygen.getValue()));
        return instance;
    }

    public int getSc() {
        return sc;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getTm() {
        return tm;
    }

    public int getT2m() {
        return t2m;
    }

    public String getEnergy() {
        return energy;
    }

    public String getOxygen() {
        return oxygen;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblareaclearance = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnso = new javax.swing.JButton();
        btntm = new javax.swing.JButton();
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
        btnt2m = new javax.swing.JButton();
        slideroxygen = new javax.swing.JSlider();
        lblname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnertm = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spinnert2m = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsendupdates = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setForeground(new java.awt.Color(0, 255, 0));
        lblareaclearance.setText("Area Not Cleared");
        getContentPane().add(lblareaclearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 37, -1, 31));

        btnshoot.setBackground(new java.awt.Color(0, 0, 0));
        btnshoot.setForeground(new java.awt.Color(255, 0, 0));
        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);
        getContentPane().add(btnshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 79, 117, 40));

        btnso.setBackground(new java.awt.Color(0, 0, 0));
        btnso.setForeground(new java.awt.Color(0, 0, 255));
        btnso.setText("Sonar Operation");
        btnso.setEnabled(false);
        getContentPane().add(btnso, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 79, -1, 40));

        btntm.setBackground(new java.awt.Color(0, 0, 0));
        btntm.setForeground(new java.awt.Color(0, 255, 255));
        btntm.setText("Tomahawk Missile");
        btntm.setEnabled(false);
        getContentPane().add(btntm, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 130, -1, 40));

        sliderenergy.setBackground(new java.awt.Color(0, 0, 0));
        sliderenergy.setForeground(new java.awt.Color(255, 255, 0));
        sliderenergy.setMajorTickSpacing(10);
        sliderenergy.setMinorTickSpacing(2);
        sliderenergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderenergy.setPaintLabels(true);
        sliderenergy.setPaintTicks(true);
        sliderenergy.setValue(100);
        getContentPane().add(sliderenergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 79, -1, 393));

        txtarea1.setBackground(new java.awt.Color(0, 0, 0));
        txtarea1.setColumns(20);
        txtarea1.setForeground(new java.awt.Color(0, 255, 0));
        txtarea1.setRows(5);
        jScrollPane1.setViewportView(txtarea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 214, 506, 229));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 449, 416, 23));

        btnsend.setBackground(new java.awt.Color(0, 0, 0));
        btnsend.setForeground(new java.awt.Color(0, 255, 0));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        getContentPane().add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 449, 84, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 92, 90, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 50, 20));

        checkboxposition.setBackground(new java.awt.Color(0, 0, 0));
        checkboxposition.setForeground(new java.awt.Color(0, 255, 0));
        checkboxposition.setText("Position");
        checkboxposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpositionActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 180, -1, -1));
        getContentPane().add(spinnersc, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 89, 100, -1));
        getContentPane().add(spinnerammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, -1));

        btnt2m.setBackground(new java.awt.Color(0, 0, 0));
        btnt2m.setForeground(new java.awt.Color(255, 102, 0));
        btnt2m.setText("Trident-2 Missile");
        btnt2m.setEnabled(false);
        getContentPane().add(btnt2m, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 130, -1, 40));

        slideroxygen.setBackground(new java.awt.Color(0, 0, 0));
        slideroxygen.setForeground(new java.awt.Color(255, 255, 0));
        slideroxygen.setMajorTickSpacing(10);
        slideroxygen.setMinorTickSpacing(2);
        slideroxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        slideroxygen.setPaintLabels(true);
        slideroxygen.setPaintTicks(true);
        slideroxygen.setValue(100);
        getContentPane().add(slideroxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 79, -1, 393));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Submarine");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 38, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tomahawk");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 20));
        getContentPane().add(spinnertm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 50, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Trident-2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 60, 20));
        getContentPane().add(spinnert2m, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 181, 50, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Energy");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 54, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oxygen Level");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 54, -1, -1));

        btnsendupdates.setBackground(new java.awt.Color(0, 0, 0));
        btnsendupdates.setForeground(new java.awt.Color(255, 255, 0));
        btnsendupdates.setText("Send Updates");
        btnsendupdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendupdatesActionPerformed(evt);
            }
        });
        getContentPane().add(btnsendupdates, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 130, 193, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Self Learning Courses\\iCM-106-iCET\\Modules\\05-OOP\\Assignments\\Courseworks\\Week 05\\1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        Observable.getInstance().getMessage(txt1.getText(), lblname.getText());
        txt1.setText(null);
    }//GEN-LAST:event_btnsendActionPerformed

    private void checkboxpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxpositionActionPerformed
        if (!(checkboxposition.isSelected())) {
            btnshoot.setEnabled(false);
            btnso.setEnabled(false);
            btntm.setEnabled(false);
            btnt2m.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxpositionActionPerformed

    private void btnsendupdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendupdatesActionPerformed
        Observable.getInstance().getInfo("Submarine", hc, tk, currentInfo());
        JOptionPane.showMessageDialog(null,"Updates Sent Successfully!");
    }//GEN-LAST:event_btnsendupdatesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnsendupdates;
    private javax.swing.JButton btnshoot;
    private javax.swing.JButton btnso;
    private javax.swing.JButton btnt2m;
    private javax.swing.JButton btntm;
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
    private javax.swing.JSlider slideroxygen;
    private javax.swing.JSpinner spinnerammo;
    private javax.swing.JSpinner spinnersc;
    private javax.swing.JSpinner spinnert2m;
    private javax.swing.JSpinner spinnertm;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txtarea1;
    // End of variables declaration//GEN-END:variables
}
