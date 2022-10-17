
package com.supermarket.billing;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import com.supermarket.billing.classes.*;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
/**
 *
 * @author 20383
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String sellerUserName,sellerPhone,sellerGender;
    private  Connection con;
    private final String adminUserName;
    private final String adminPassword;
    public Login() {
        initComponents();
        adminUserName = "admin";
        adminPassword = "admin";
//       adminRadioButton.setSelected(true);
       usernameField.requestFocusInWindow();
       con = database.db();
       sellerUserName = "";
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        adminRadioButton = new javax.swing.JRadioButton();
        shopkeeperRadioButton = new javax.swing.JRadioButton();
        signinButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Billing System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 11, 103));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 106, 8));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUPERMARKET BILLING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(867, 476));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarket/billing/views/view1.gif"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 204), 1, true));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(120, 120, 120));
        jLabel4.setText("Username");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 14, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN IN");

        jLabel5.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(120, 120, 120));
        jLabel5.setText("Password");

        usernameField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        adminRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(adminRadioButton);
        adminRadioButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        adminRadioButton.setForeground(new java.awt.Color(120, 120, 120));
        adminRadioButton.setText("Admin");
        adminRadioButton.setAlignmentX(0.5F);
        adminRadioButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        adminRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminRadioButtonMouseEntered(evt);
            }
        });

        shopkeeperRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(shopkeeperRadioButton);
        shopkeeperRadioButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        shopkeeperRadioButton.setForeground(new java.awt.Color(120, 120, 120));
        shopkeeperRadioButton.setText("Seller");
        shopkeeperRadioButton.setAlignmentX(0.5F);
        shopkeeperRadioButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        shopkeeperRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shopkeeperRadioButtonMouseEntered(evt);
            }
        });

        signinButton.setBackground(new java.awt.Color(255, 39, 235));
        signinButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        signinButton.setText("Sign In");
        signinButton.setFocusPainted(false);
        signinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButtonMouseExited(evt);
            }
        });
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        passField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(120, 120, 120));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(adminRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(shopkeeperRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameField)
                                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(signinButton)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopkeeperRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(signinButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminRadioButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminRadioButtonMouseEntered
        // TODO add your handling code here:
        adminRadioButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_adminRadioButtonMouseEntered

    private void shopkeeperRadioButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopkeeperRadioButtonMouseEntered
        // TODO add your handling code here:
        shopkeeperRadioButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_shopkeeperRadioButtonMouseEntered

    private void signinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseEntered
        // TODO add your handling code here:
        signinButton.setBackground(new java.awt.Color(255,106,8));
        signinButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_signinButtonMouseEntered

    private void signinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseExited
        // TODO add your handling code here:
        signinButton.setBackground(new java.awt.Color(255,39,235));
    }//GEN-LAST:event_signinButtonMouseExited

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        // TODO add your handling code here:
       String username ,password,user = "";
       
       if(!adminRadioButton.isSelected() && !shopkeeperRadioButton.isSelected())
           JOptionPane.showMessageDialog(null,"Please Select User !","Warnning",JOptionPane.WARNING_MESSAGE);
       else if(usernameField.getText().equals(""))
           JOptionPane.showMessageDialog(null,"Please enter Username !","Warnning",JOptionPane.WARNING_MESSAGE);
       else if((new String(passField.getPassword())).equals(""))
           JOptionPane.showMessageDialog(null,"Please enter Password !","Warnning",JOptionPane.WARNING_MESSAGE);
           
       if(adminRadioButton.isSelected())
           user = "admin";
       else if(shopkeeperRadioButton.isSelected())
           user = "shopkeeper";
       
       username = usernameField.getText();
           password = new String(passField.getPassword());
           
       if(user.equals("admin")){
           
           
           if(username.equals(adminUserName) && password.equals(adminPassword)){
             
              this.setVisible(false);
              this.dispose();
               new AdminPannel().setVisible(true);
              new toast("Sign in sucessfully as Admin",680,640);   
           }
           else
            JOptionPane.showMessageDialog(null,"Username or Password is wrong !","Wrong Credentials",JOptionPane.ERROR_MESSAGE);
       }
       else if(user.equals("shopkeeper")){
           try{
               String querry ="select * from sellertable where Username = '" + username + "' and Password ='" + password + "'; ";
               Statement stm = con.createStatement();
               ResultSet rs= stm.executeQuery(querry);
               if(rs.next()){
                  sellerUserName = username;
                  sellerPhone = rs.getString("Phone");
                  sellerGender = rs.getString("Gender");
                   this.setVisible(false);
                   this.dispose();
                   new SellerPannel().setVisible(true);
                   new toast("Sign in sucessfully as Seller",680,640);   
               }
               else
                  JOptionPane.showMessageDialog(null,"Username or Password is wrong !","Wrong Credentials",JOptionPane.ERROR_MESSAGE); 
           }
           catch(HeadlessException | SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
           }
       }
        
    }//GEN-LAST:event_signinButtonActionPerformed

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyCode();
        if (c == KeyEvent.VK_ENTER) {
            String username, password, user = "";

            if (!adminRadioButton.isSelected() && !shopkeeperRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please Select User !", "Warnning", JOptionPane.WARNING_MESSAGE);
            } else if (usernameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Username !", "Warnning", JOptionPane.WARNING_MESSAGE);
            } else if ((new String(passField.getPassword())).equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Password !", "Warnning", JOptionPane.WARNING_MESSAGE);
            }

            if (adminRadioButton.isSelected()) {
                user = "admin";
            } else if (shopkeeperRadioButton.isSelected()) {
                user = "shopkeeper";
            }

            username = usernameField.getText();
            password = new String(passField.getPassword());

            if (user.equals("admin")) {

                if (username.equals(adminUserName) && password.equals(adminPassword)) {

                    this.setVisible(false);
                    this.dispose();
                    new AdminPannel().setVisible(true);
                    new toast("Sign in sucessfully as Admin", 680, 640);
                } else {
                    JOptionPane.showMessageDialog(null, "Username or Password is wrong !", "Wrong Credentials", JOptionPane.ERROR_MESSAGE);
                }
            } else if (user.equals("shopkeeper")) {
                try {
                    String querry = "select * from sellertable where Username = '" + username + "' and Password ='" + password + "'; ";
                    Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery(querry);
                    if (rs.next()) {
                        sellerUserName = username;
                        sellerPhone = rs.getString("Phone");
                        sellerGender = rs.getString("Gender");
                        this.setVisible(false);
                        this.dispose();
                        new SellerPannel().setVisible(true);
                        new toast("Sign in sucessfully as Seller", 680, 640);
                    } else {
                        JOptionPane.showMessageDialog(null, "Username or Password is wrong !", "Wrong Credentials", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_passFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passField;
    private javax.swing.JRadioButton shopkeeperRadioButton;
    private javax.swing.JButton signinButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
