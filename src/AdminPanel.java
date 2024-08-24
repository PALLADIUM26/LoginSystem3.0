
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
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnViewData = new javax.swing.JButton();
        btnAnalyzeData = new javax.swing.JButton();
        btnDeleteData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN PANEL");

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        btnLogOut.setText("Log Out");
        btnLogOut.setFocusable(false);
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
                .addContainerGap(671, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 100);

        btnViewUser.setText("View Users");
        btnViewUser.setFocusable(false);
        jPanel1.add(btnViewUser);
        btnViewUser.setBounds(100, 160, 91, 27);

        btnUpdateUser.setText("Update Users");
        btnUpdateUser.setFocusable(false);
        jPanel1.add(btnUpdateUser);
        btnUpdateUser.setBounds(100, 230, 104, 27);

        btnDeleteUser.setText("Delete Users");
        btnDeleteUser.setFocusable(false);
        jPanel1.add(btnDeleteUser);
        btnDeleteUser.setBounds(100, 300, 100, 27);

        btnViewData.setText("View Data");
        btnViewData.setFocusable(false);
        jPanel1.add(btnViewData);
        btnViewData.setBounds(430, 160, 88, 27);

        btnAnalyzeData.setText("Analyze Data");
        btnAnalyzeData.setFocusable(false);
        jPanel1.add(btnAnalyzeData);
        btnAnalyzeData.setBounds(430, 230, 104, 27);

        btnDeleteData.setText("Delete Data");
        btnDeleteData.setFocusable(false);
        jPanel1.add(btnDeleteData);
        btnDeleteData.setBounds(430, 310, 98, 27);

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzeData;
    private javax.swing.JButton btnDeleteData;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewData;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
