package defence.system;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setText("Area Not Cleared");

        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);

        btnmo.setText("Missile Operation");
        btnmo.setEnabled(false);

        btnlo.setText("Laser Operation");
        btnlo.setEnabled(false);

        sliderenergy.setMajorTickSpacing(10);
        sliderenergy.setMinorTickSpacing(2);
        sliderenergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderenergy.setPaintLabels(true);
        sliderenergy.setPaintTicks(true);
        sliderenergy.setValue(100);

        txtarea1.setColumns(20);
        txtarea1.setRows(5);
        jScrollPane1.setViewportView(txtarea1);

        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        jLabel2.setText("Soldier Count");

        jLabel3.setText("Ammo Count");

        checkboxposition.setText("Position");
        checkboxposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpositionActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setText("Helicopter");

        jLabel1.setText("Missile");

        jLabel4.setText("Fuel Amount");

        jLabel5.setText("Energy");

        btnsendupdate.setText("Send Updates");
        btnsendupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spinnermissile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnmo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2))
                                            .addGap(25, 25, 25))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblareaclearance)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(checkboxposition)
                                            .addGap(108, 108, 108)
                                            .addComponent(jLabel3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnlo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnsendupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(spinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblname)
                        .addGap(417, 417, 417)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderenergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderenergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(lblareaclearance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(spinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnlo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtfuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsendupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkboxposition)
                            .addComponent(jLabel3)
                            .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(spinnermissile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend))))
                .addGap(24, 24, 24))
        );

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
