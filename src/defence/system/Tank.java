package defence.system;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setText("Area Not Cleared");

        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);

        btnmo.setText("Missile Operation");
        btnmo.setEnabled(false);

        btnro.setText("Redar Operation");
        btnro.setEnabled(false);

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

        btnrs.setText("Rotate Shooting");
        btnrs.setEnabled(false);

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setText("Tank");

        jLabel1.setText("Missile");

        jLabel4.setText("RS Ammo");

        jLabel5.setText("Fuel Amount");

        jLabel6.setText("Energy");

        btnsendupdates.setText("Send Updates");
        btnsendupdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendupdatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxposition)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnermissile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerrsammo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblname))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblareaclearance)
                                        .addComponent(btnmo)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnersc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsendupdates, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderenergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblareaclearance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(spinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnsendupdates, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnrs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkboxposition)
                            .addComponent(jLabel3)
                            .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(spinnermissile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(spinnerrsammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderenergy, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            btnro.setEnabled(false);
            btnrs.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxpositionActionPerformed

    private void btnsendupdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendupdatesActionPerformed
        Observable.getInstance().getInfo("Tank", hc, currentInfo(), sm);
    }//GEN-LAST:event_btnsendupdatesActionPerformed

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
