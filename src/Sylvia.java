import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;

public class Sylvia extends javax.swing.JFrame {

    public Sylvia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Base1 = new javax.swing.JComboBox<>();
        Base2 = new javax.swing.JComboBox<>();
        tfInput = new javax.swing.JTextField();
        tfOutput = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnWorking = new javax.swing.JButton();
        btnSwap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYLVIA");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Base1.setBackground(new java.awt.Color(51, 51, 51));
        Base1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Base1.setForeground(new java.awt.Color(153, 255, 255));
        Base1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "8", "10", "16" }));
        Base1.setToolTipText("");
        Base1.setFocusable(false);
        jPanel1.add(Base1);
        Base1.setBounds(216, 211, 76, 25);

        Base2.setBackground(new java.awt.Color(51, 51, 51));
        Base2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Base2.setForeground(new java.awt.Color(153, 255, 255));
        Base2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "8", "10", "16" }));
        Base2.setFocusable(false);
        jPanel1.add(Base2);
        Base2.setBounds(505, 211, 76, 25);

        tfInput.setBackground(new java.awt.Color(51, 51, 51));
        tfInput.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tfInput.setForeground(new java.awt.Color(153, 255, 255));
        tfInput.setCaretColor(new java.awt.Color(153, 255, 255));
        jPanel1.add(tfInput);
        tfInput.setBounds(216, 152, 365, 25);

        tfOutput.setBackground(new java.awt.Color(51, 51, 51));
        tfOutput.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tfOutput.setForeground(new java.awt.Color(153, 255, 255));
        tfOutput.setCaretColor(new java.awt.Color(153, 255, 255));
        jPanel1.add(tfOutput);
        tfOutput.setBounds(216, 311, 365, 25);

        btnConvert.setBackground(new java.awt.Color(0, 102, 102));
        btnConvert.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(255, 255, 255));
        btnConvert.setText("Convert");
        btnConvert.setFocusable(false);
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvert);
        btnConvert.setBounds(170, 380, 90, 28);

        btnReset.setBackground(new java.awt.Color(0, 102, 102));
        btnReset.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setFocusable(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(510, 380, 76, 28);

        btnCopy.setBackground(new java.awt.Color(0, 102, 102));
        btnCopy.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCopy.setForeground(new java.awt.Color(255, 255, 255));
        btnCopy.setText("Copy");
        btnCopy.setFocusable(false);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jPanel1.add(btnCopy);
        btnCopy.setBounds(350, 380, 76, 28);

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setFocusable(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(510, 430, 76, 28);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Input");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(178, 157, 32, 15);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Output");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(172, 316, 38, 15);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("Base 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(172, 216, 38, 15);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("Base 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(461, 213, 38, 20);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        btnLogOut.setBackground(new java.awt.Color(0, 0, 0));
        btnLogOut.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(153, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.setFocusable(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
        btnHome.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(153, 255, 255));
        btnHome.setText("Home");
        btnHome.setFocusable(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnHome))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 100);

        btnWorking.setBackground(new java.awt.Color(0, 102, 102));
        btnWorking.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnWorking.setForeground(new java.awt.Color(255, 255, 255));
        btnWorking.setText("Working");
        btnWorking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkingActionPerformed(evt);
            }
        });
        jPanel1.add(btnWorking);
        btnWorking.setBounds(170, 430, 90, 28);

        btnSwap.setBackground(new java.awt.Color(0, 102, 102));
        btnSwap.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSwap.setForeground(new java.awt.Color(255, 255, 255));
        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });
        jPanel1.add(btnSwap);
        btnSwap.setBounds(350, 430, 76, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
        homeFrame.pack();
        homeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        SignIn signInFrame = new SignIn();
        signInFrame.setVisible(true);
        signInFrame.pack();
        signInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tfInput.setText("");
        tfOutput.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        StringSelection stringSelection = new StringSelection (tfOutput.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }//GEN-LAST:event_btnCopyActionPerformed

    private String decimal_other(String input, int base2) {
        String result = "";
        int point = input.indexOf(".");
        
        if (point == -1) {
            while (Integer.parseInt(input) != 0) {
                int remainder = (Integer.parseInt(input))%base2;
                if (remainder < 10) result = remainder + result;
                else result = (char)(remainder+55) + result;
                input = "" + Integer.parseInt(input)/base2;
            }
        } else {
            double inp = Double.parseDouble(input) - Integer.parseInt(input.substring(0,point));
            String integer = input.substring(0,point);
            String fraction = input.substring(point+1);
            
            while (Integer.parseInt(integer) != 0) {
                int remainder = (Integer.parseInt(integer))%base2;
                if (remainder < 10) result = remainder + result;
                else result = (char)(remainder+55) + result;
                integer = "" + Integer.parseInt(integer)/base2;
            }
            result = result + ".";
            for (int i=0; i<21; i++) {
                inp *= base2;
                result = result + (int)inp;
                inp -= (int)inp;
            }
        }
        return result;
    }
    
    private String other_decimal(String input, int base1) {
        int power = 0, len = input.length();
        double r = 0.0;
        char dig;
        String result = "";
        int point = input.indexOf(".");
        
        if (point == -1) {
            for (int i=len-1; i>-1; i--) {
                dig = input.charAt(i);
                if (Character.isDigit(dig)) {
                    r = r + (dig - '0')*(int)(Math.pow(base1, power));
                } else {
                    r = r + (dig - 55)*(int)(Math.pow(base1, power));
                }
                power++;
            }
            result = (int)r + "";
        } else {
            String integer = input.substring(0,point);
            String fraction = input.substring(point+1);
            int len1 = integer.length();
            int len2 = fraction.length();
            
            for (int i=len1-1; i>-1; i--) {
                dig = integer.charAt(i);
                if (Character.isDigit(dig)) {
                    r = r + (dig - '0')*(int)(Math.pow(base1, power));
                } else {
                    r = r + (dig - 55)*(int)(Math.pow(base1, power));
                }
                power++;
            }
            power = 1;
            for (int i=1; i<=len2; i++) {
                dig = fraction.charAt(i-1);
                System.out.println(dig);
                if (Character.isDigit(dig)) {
                    r = r + (dig - '0')/Math.pow(base1, i);
                } else {
                    r = r + (dig - 55)/Math.pow(base1, i);
                }
                power++;
            }
            result += r;
        }
        
        return result;
    }
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String input = tfInput.getText();   
        int base1 = Integer.parseInt(Base1.getItemAt(Base1.getSelectedIndex()));
        int base2 = Integer.parseInt(Base2.getItemAt(Base2.getSelectedIndex()));
        
        try {
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Input box is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            } else if (base1 == base2) {
                JOptionPane.showMessageDialog(this, "Conversion cannot occur with same bases", "Try Again", JOptionPane.ERROR_MESSAGE);
            } else {
                String result = "";
                if (base1 == 10) { //decimal to other
                    result = decimal_other(input, (int)base2);
                } else if (base2 == 10) { //other to decimal
                    result = other_decimal(input, (int)base1);
                }// else if (base1 == 2 && base2 == 8)
                // else if (base1 == 8 && base2 == 2)
                // else if (base1 == 2 && base2 == 16)
                // else if (base1 == 16 && base2 == 2)
                // else if (base1 == 8 && base2 == 16)
                // else if (base1 == 16 && base2 == 8)
                tfOutput.setText(result);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        String input = tfInput.getText();
        String output = tfOutput.getText();
        tfInput.setText(output);
        tfOutput.setText(input);
    }//GEN-LAST:event_btnSwapActionPerformed

    private void btnWorkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkingActionPerformed
        System.out.println("Working");
    }//GEN-LAST:event_btnWorkingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String input = tfInput.getText();   
        String base1 = Base1.getItemAt(Base1.getSelectedIndex());
        String base2 = Base2.getItemAt(Base2.getSelectedIndex());
        String output = tfOutput.getText();  
        Resources rec = new Resources();
        rec.workingWithMySQL(input, base1, base2, output);
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Base1;
    private javax.swing.JComboBox<String> Base2;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSwap;
    private javax.swing.JButton btnWorking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTextField tfOutput;
    // End of variables declaration//GEN-END:variables
}
