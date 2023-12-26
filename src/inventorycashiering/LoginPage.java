package inventorycashiering;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

public class LoginPage extends javax.swing.JFrame {

   public static String userid;
  
    public LoginPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordFied = new javax.swing.JPasswordField();
        logInBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jCheckBoxshowpass = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("User Verification");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        emailField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        jPanel2.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 270, 40));

        passwordFied.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        passwordFied.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        passwordFied.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFiedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFiedFocusLost(evt);
            }
        });
        jPanel2.add(passwordFied, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 270, 40));

        logInBtn.setBackground(new java.awt.Color(153, 153, 153));
        logInBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInBtnMouseClicked(evt);
            }
        });
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        jPanel2.add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 130, -1));

        registerBtn.setBackground(new java.awt.Color(153, 153, 153));
        registerBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 130, -1));

        jCheckBoxshowpass.setBackground(new java.awt.Color(51, 0, 0));
        jCheckBoxshowpass.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jCheckBoxshowpass.setForeground(new java.awt.Color(255, 204, 204));
        jCheckBoxshowpass.setText("Show Password");
        jCheckBoxshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxshowpassActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxshowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 130, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        resetBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 110, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selamat Datang !");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 410, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 590));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setText("Selamat Datang di Kasir Go-UMKM");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 520, 50));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 590));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 570, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        if (emailField.getText().trim().toLowerCase().equals("username")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // if the text field is equal to username or empty
        // we will set the "username" text in the field
        // on focus lost event

        if (emailField.getText().trim().equals("")
                || emailField.getText().trim().toLowerCase().equals("username")) {
            emailField.setText("username");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void passwordFiedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFiedFocusGained
        // clear the password field on focus if the text is "password"

        // get the password text
        String pass = String.valueOf(passwordFied.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {
            passwordFied.setText("");
        }
    }//GEN-LAST:event_passwordFiedFocusGained

    private void passwordFiedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFiedFocusLost
        // if the password field is equal to password or empty
        // we will set the "password" text in the field
        // on focus lost event

        // get the password text
        String pass = String.valueOf(passwordFied.getPassword());

        if (pass.trim().equals("")
                || pass.trim().toLowerCase().equals("password")) {
            passwordFied.setText("password");
        }
    }//GEN-LAST:event_passwordFiedFocusLost


    private void logInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInBtnMouseClicked

        String email = emailField.getText();
        String pass = String.valueOf(passwordFied.getPassword());

        if ("".equals(this.emailField.getText()) || "".equals(this.passwordFied.getText())) {
            JOptionPane.showMessageDialog(this, "Fill up the missing field!", "Alert", JOptionPane.ERROR_MESSAGE);

        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver");

                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {

                    Statement stmt = con.createStatement();
                    String query1 = "SELECT * FROM `users` WHERE email = '" + email + "' AND password = '" + pass + "'";
                    ResultSet rs = stmt.executeQuery(query1);

                    if (rs.next()) {
                        String role = rs.getString("Role");
                        String status = rs.getString("Status");
                        if ("Admin".equals(role) && "Active".equals(status)) {
                            AdminManagement mm = new AdminManagement();
                            mm.setVisible(true);
                            mm.adminIdField.setEditable(false);
                            mm.adminIdField.setText(rs.getString("UserID"));
                            mm.adminNameField.setEditable(false);
                            mm.adminNameField.setText("    Welcome on board " + rs.getString("firstname"));
                            this.dispose();
                        } else if ("Staff".equals(role) && "Active".equals(status)) {
                            InventoryManagement im = new InventoryManagement();
                            im.setVisible(true);
                            im.staffIdField.setEditable(false);
                            im.staffIdField.setText(rs.getString("UserID"));
                            im.staffField.setEditable(false);
                            im.staffField.setText("    Welcome on board " + rs.getString("firstname"));
                            this.dispose();

                        } else if ("Cashier".equals(role) && "Active".equals(status)) {
                            CashierManagement cm = new CashierManagement();
                            cm.setVisible(true);
                            cm.cashierIdField.setEditable(false);
                            cm.cashierIdField.setText(rs.getString("UserID"));
                            cm.cashierNameField.setEditable(false);
                            cm.cashierNameField.setText("    Welcome on board " + rs.getString("firstname"));
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "This " + role + " account is not yet approved!", "Alert", JOptionPane.WARNING_MESSAGE);
                            emailField.setText("");
                            passwordFied.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "This account doesn't exist!", "Alert", JOptionPane.ERROR_MESSAGE);
                        passwordFied.setText("");
                    }

                }

            } catch (ClassNotFoundException | SQLException e) {

                System.out.println(e.getMessage());
            }

        }

//        String email = emailField.getText();
//        String pass = String.valueOf(passwordFied.getPassword());
//
//        if ("".equals(this.emailField.getText()) && "".equals(this.passwordFied.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Username and Password", "Alert", JOptionPane.ERROR_MESSAGE);
//
//        } else {
//            try {
//
//                Class.forName("com.mysql.jdbc.Driver");
//
//                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
//
//                    Statement stmt = con.createStatement();
//
//                    String query1 = "SELECT * FROM `users` WHERE email = '" + email + "' AND password = '" + pass + "'";
//                    ResultSet rs = stmt.executeQuery(query1);
//
//                    if (rs.next()) {
//                        dispose();//close login page
//
//                        new AdminManagement().setVisible(true);
//                        this.setVisible(false);
//                    } else {
//
//                        JOptionPane.showMessageDialog(this, "This admin account doesn't exist!", "Alert", JOptionPane.ERROR_MESSAGE);
//                        emailField.setText("");
//                        passwordFied.setText("");
//                       
//                    }
//                }
//
//            } catch (ClassNotFoundException | SQLException e) {
//
//                System.out.println(e.getMessage());
//            }
//
//        }

    }//GEN-LAST:event_logInBtnMouseClicked

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed

    }//GEN-LAST:event_logInBtnActionPerformed

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        new RegisterPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerBtnMouseClicked

    private void jCheckBoxshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxshowpassActionPerformed
        if (evt.getSource() == jCheckBoxshowpass) {
            if (jCheckBoxshowpass.isSelected()) {
                passwordFied.setEchoChar((char) 0);
            } else {
                passwordFied.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_jCheckBoxshowpassActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        if (evt.getSource() == resetBtn) {
            emailField.setText("");
            passwordFied.setText("");

        }
    }//GEN-LAST:event_resetBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JCheckBox jCheckBoxshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField passwordFied;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}