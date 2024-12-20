
public class AdminPanel extends javax.swing.JFrame {

    public AdminPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnViewData = new javax.swing.JButton();
        btnAnalyzeData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN PANEL");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        btnLogOut.setBackground(new java.awt.Color(0, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setFocusable(false);
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(665, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnLogOut)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 100);

        btnViewUser.setBackground(new java.awt.Color(0, 51, 102));
        btnViewUser.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnViewUser.setText("View Users");
        btnViewUser.setFocusable(false);
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewUser);
        btnViewUser.setBounds(100, 160, 130, 28);

        btnViewData.setBackground(new java.awt.Color(0, 51, 102));
        btnViewData.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnViewData.setText("View Data");
        btnViewData.setFocusable(false);
        btnViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewData);
        btnViewData.setBounds(100, 230, 130, 28);

        btnAnalyzeData.setBackground(new java.awt.Color(0, 51, 102));
        btnAnalyzeData.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAnalyzeData.setText("Analyze Data");
        btnAnalyzeData.setFocusable(false);
        jPanel1.add(btnAnalyzeData);
        btnAnalyzeData.setBounds(100, 300, 130, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        ViewUsers viewUsersFrame = new ViewUsers();
        viewUsersFrame.setVisible(true);
        viewUsersFrame.pack();
        viewUsersFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDataActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzeData;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnViewData;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
