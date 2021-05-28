/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import QLbanVeMayBay.loginForm;
import Service.userService;
import getItem.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import ketnoiSQL.ketnoiSQL;

/**
 *
 * @author ASUS
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    userService userService;
    User user;

    public NewJFrame(String email) {
        initComponents();
        setLocationRelativeTo(null);
        userService = new userService();
        user = userService.getUser(email);
    }

    private NewJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        searchButton = new javax.swing.JButton();
        accButton = new javax.swing.JButton();
        ticketButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainMenu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/travelling.png"))); // NOI18N
        jLabel1.setText("Menu Chính");

        searchButton.setBackground(new java.awt.Color(201, 255, 255));
        searchButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/loupe.png"))); // NOI18N
        searchButton.setText("Tìm kiếm chuyến bay");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        accButton.setBackground(new java.awt.Color(201, 255, 255));
        accButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        accButton.setForeground(new java.awt.Color(0, 0, 255));
        accButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/user.png"))); // NOI18N
        accButton.setText("Thông tin tài khoản");
        accButton.setPreferredSize(new java.awt.Dimension(132, 23));
        accButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accButtonActionPerformed(evt);
            }
        });

        ticketButton.setBackground(new java.awt.Color(201, 255, 255));
        ticketButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ticketButton.setForeground(new java.awt.Color(0, 0, 255));
        ticketButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/ticket.png"))); // NOI18N
        ticketButton.setText("Xem Vé");
        ticketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(204, 204, 204));
        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 51, 51));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/shutdown.png"))); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(204, 204, 204));
        logoutButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 51, 51));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/sign-out.png"))); // NOI18N
        logoutButton.setText("Đăng  xuất");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(ticketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(logoutButton)))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ticketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(logoutButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        loginForm lg = new loginForm();
        lg.setVisible(true);
        dispose();

    }//GEN-LAST:event_logoutButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        new SearchForm(user.getEmail()).setVisible(true);
        dispose();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void accButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accButtonActionPerformed
        // TODO add your handling code here:
        ttAccount acc = new ttAccount(user.getEmail());
        acc.setVisible(true);
        dispose();

    }//GEN-LAST:event_accButtonActionPerformed

    private void ticketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketButtonActionPerformed
        // TODO add your handling code here:
        new dsVe(user.getEmail()).setVisible(true);
        dispose();

    }//GEN-LAST:event_ticketButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton ticketButton;
    // End of variables declaration//GEN-END:variables
}