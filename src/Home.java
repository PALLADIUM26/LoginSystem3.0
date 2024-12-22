public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSylvia = new javax.swing.JButton();
        btnEM = new javax.swing.JButton();
        btnTrans = new javax.swing.JButton();
        btnTTT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("hello there");

        btnSylvia.setBackground(new java.awt.Color(0, 0, 0));
        btnSylvia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSylvia.setForeground(new java.awt.Color(153, 255, 255));
        btnSylvia.setText("Sylvia");
        btnSylvia.setFocusable(false);
        btnSylvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSylviaActionPerformed(evt);
            }
        });

        btnEM.setBackground(new java.awt.Color(0, 0, 0));
        btnEM.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEM.setForeground(new java.awt.Color(153, 255, 255));
        btnEM.setText("e-motion");
        btnEM.setFocusable(false);
        btnEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMActionPerformed(evt);
            }
        });

        btnTrans.setBackground(new java.awt.Color(0, 0, 0));
        btnTrans.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnTrans.setForeground(new java.awt.Color(153, 255, 255));
        btnTrans.setText("translaTHOR");
        btnTrans.setFocusable(false);
        btnTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransActionPerformed(evt);
            }
        });

        btnTTT.setBackground(new java.awt.Color(0, 0, 0));
        btnTTT.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnTTT.setForeground(new java.awt.Color(153, 255, 255));
        btnTTT.setText("TicTacToe");
        btnTTT.setFocusable(false);
        btnTTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTTActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        btnLogOut.setBackground(new java.awt.Color(0, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.setFocusable(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(0, 102, 102));
        btnAbout.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("About");
        btnAbout.setFocusable(false);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(btnAbout)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnAbout)
                    .addComponent(btnSearch))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTrans, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSylvia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnSylvia)
                .addGap(36, 36, 36)
                .addComponent(btnEM)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(btnTrans)
                .addGap(40, 40, 40)
                .addComponent(btnTTT)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        SignIn signInFrame = new SignIn();
        signInFrame.setVisible(true);
        signInFrame.pack();
        signInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        About aboutFrame = new About();
        aboutFrame.setVisible(true);
        aboutFrame.pack();
        aboutFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnSylviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSylviaActionPerformed
        Sylvia sylviaFrame = new Sylvia();
        sylviaFrame.setVisible(true);
        sylviaFrame.pack();
        sylviaFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSylviaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMActionPerformed
        eMotion eMotionFrame = new eMotion();
        eMotionFrame.setVisible(true);
        eMotionFrame.pack();
        eMotionFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEMActionPerformed

    private void btnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransActionPerformed
        translaTHOR translaTHORFrame = new translaTHOR();
        translaTHORFrame.setVisible(true);
        translaTHORFrame.pack();
        translaTHORFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTransActionPerformed

    private void btnTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTTTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnEM;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSylvia;
    private javax.swing.JButton btnTTT;
    private javax.swing.JButton btnTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
