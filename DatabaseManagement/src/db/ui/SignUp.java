/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.ui;

import db.dao.UserDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Pranavan
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    private int status;

    public SignUp() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/db/Image/Bus.png")));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        privilegeCode = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");

        jLabel1.setText("User name");

        jLabel2.setText("Password");

        jLabel3.setText("Privilege Code");

        signup.setText("SignUp");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(privilegeCode, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(name)
                    .addComponent(password)
                    .addComponent(signup))
                .addGap(2, 2, 2)
                .addComponent(exit)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(privilegeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup)
                    .addComponent(clear)
                    .addComponent(exit))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        password.setText("");
        privilegeCode.setText("");
        name.requestFocus();
    }//GEN-LAST:event_clearActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        if (!name.getText().trim().equals("")) {
            if (!UserDAO.isExist(name.getText().trim())) {
                if (!password.getText().trim().equals("")) {
                    Integer num = 0;
                    try {
                        num = Integer.parseInt(privilegeCode.getText().trim());
                        if (num == 1111) {
                            UserDAO.addUser(name.getText().trim(), password.getText().trim(), num);
                            status = 1;
                            MainWindow.create().changeValue(name.getText().trim(), status);
                            this.dispose();
                                    
                        } else if (num == 2222) {
                            UserDAO.addUser(name.getText().trim(), password.getText().trim(), num);
                            status = 2;
                            MainWindow.create().changeValue(name.getText().trim(), status);
                            this.dispose();

                        } else if (num == 3333) {
                            UserDAO.addUser(name.getText().trim(), password.getText().trim(), num);
                            status = 3;
                            MainWindow.create().changeValue(name.getText().trim(), status);
                            this.dispose();
                        } else if (num == 4444) {
                            UserDAO.addUser(name.getText().trim(), password.getText().trim(), num);
                            status = 3;
                            MainWindow.create().changeValue(name.getText().trim(), status);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Privilege Code Error", "Error", JOptionPane.ERROR_MESSAGE);
                            privilegeCode.setText("");
                            privilegeCode.requestFocus();
                        }
                    } catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null, "Privilege Code Error", "Error", JOptionPane.ERROR_MESSAGE);
                        privilegeCode.setText("");
                        privilegeCode.requestFocus();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Pleaser Enter the Password", "Error", JOptionPane.ERROR_MESSAGE);
                    password.requestFocus();

                }

            } else {
                JOptionPane.showMessageDialog(null, "User Name Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
                name.setText("");
                name.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pleaser Enter the User name", "Error", JOptionPane.ERROR_MESSAGE);
            name.requestFocus();
        }
    }//GEN-LAST:event_signupActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField privilegeCode;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
