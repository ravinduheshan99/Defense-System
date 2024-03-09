package defence.system;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");

        lblareaclearance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblareaclearance.setText("Area Not Cleared");

        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);

        btnso.setText("Sonar Operation");
        btnso.setEnabled(false);

        btntm.setText("Tomahawk Missile");
        btntm.setEnabled(false);

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

        btnt2m.setText("Trident-2 Missile");
        btnt2m.setEnabled(false);

        slideroxygen.setMajorTickSpacing(10);
        slideroxygen.setMinorTickSpacing(2);
        slideroxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        slideroxygen.setPaintLabels(true);
        slideroxygen.setPaintTicks(true);
        slideroxygen.setValue(100);

        lblname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblname.setText("Submarine");

        jLabel4.setText("Tomahawk Missile");

        jLabel5.setText("Trident-2-Missile");

        jLabel6.setText("Energy");

        jLabel7.setText("Oxygen Level");

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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnshoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntm))
                            .addComponent(lblname)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkboxposition)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblareaclearance)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnt2m)
                                        .addComponent(btnso, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinnertm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spinnert2m, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnsendupdates, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(spinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderenergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(slideroxygen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(lblareaclearance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnersc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnsendupdates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btntm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnt2m, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkboxposition)
                            .addComponent(jLabel3)
                            .addComponent(spinnerammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(spinnertm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(spinnert2m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend)))
                    .addComponent(slideroxygen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliderenergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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
            btnso.setEnabled(false);
            btntm.setEnabled(false);
            btnt2m.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxpositionActionPerformed

    private void btnsendupdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendupdatesActionPerformed
        Observable.getInstance().getInfo("Submarine", hc, tk, currentInfo());
    }//GEN-LAST:event_btnsendupdatesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnsendupdates;
    private javax.swing.JButton btnshoot;
    private javax.swing.JButton btnso;
    private javax.swing.JButton btnt2m;
    private javax.swing.JButton btntm;
    private javax.swing.JCheckBox checkboxposition;
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
