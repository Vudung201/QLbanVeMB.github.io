/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import Service.userService;
import getItem.User;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import ketnoiSQL.ketnoiSQL;

/**
 *
 * @author ASUS
 */
public class ttAccount extends javax.swing.JFrame {

    /**
     * Creates new form ttAccount
     */
    User user;
    userService userService;

    public ttAccount(String email) {
        initComponents();
        setLocationRelativeTo(null);
        userService = new userService();
        user = userService.getUser(email);
        emailText.setText(user.getEmail());
        passText.setText(user.getMk());
        nameText.setText(user.getHoten());
        sdtText.setText(user.getSdt());
        soCMText.setText(user.getSoCM());
        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
        String st = user.getNgaysinh();
        try {
            dateText.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(st));
        } catch (ParseException ex) {
            Logger.getLogger(listAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        String gt = user.getGioitinh();
        if (gt.equals("Nam")) {
            namRadioButton.isSelected();
        } else {
            nuRadioButton.isSelected();
        }
        qtText.setText(user.getQuoctich());
        diachiTextArea.setText(user.getDiachi());
    }

    private ttAccount() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        qtText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dateText = new com.toedter.calendar.JDateChooser();
        nameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        soCMText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        namRadioButton = new javax.swing.JRadioButton();
        sdtText = new javax.swing.JTextField();
        nuRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diachiTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin tài khoản");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Quốc tịch");
        jLabel11.setToolTipText("");

        qtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtTextActionPerformed(evt);
            }
        });
        qtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtTextKeyPressed(evt);
            }
        });

        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");
        jLabel3.setToolTipText("");

        signInButton.setText("Cập nhật");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        dateText.setDateFormatString("dd-MM-yyyy");

        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Ngày sinh");
        jLabel8.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Số CMND");

        soCMText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                soCMTextKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        buttonGroup1.add(namRadioButton);
        namRadioButton.setSelected(true);
        namRadioButton.setText("Nam");

        sdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sdtTextKeyPressed(evt);
            }
        });

        buttonGroup1.add(nuRadioButton);
        nuRadioButton.setText("Nữ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Giới tính");
        jLabel10.setToolTipText("");

        diachiTextArea.setColumns(20);
        diachiTextArea.setRows(5);
        jScrollPane1.setViewportView(diachiTextArea);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Thông tin tài khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(namRadioButton)
                                .addGap(53, 53, 53)
                                .addComponent(nuRadioButton))
                            .addComponent(qtText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(signInButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(sdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(soCMText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namRadioButton)
                        .addComponent(nuRadioButton)
                        .addComponent(jLabel10))
                    .addComponent(sdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(soCMText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(signInButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new NewJFrame(user.getEmail()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        user.setEmail(emailText.getText());
        user.setMk(passText.getText());
        user.setHoten(nameText.getText());

        user.setSoCM(soCMText.getText());
        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
        user.setNgaysinh(dfm.format(dateText.getDate()));
        user.setSdt(sdtText.getText());
        if (namRadioButton.isSelected()) {
            user.setGioitinh("Nam");
        } else {
            user.setGioitinh("Nữ");
        }
        user.setQuyentk("User");
        user.setQuoctich(qtText.getText());
        user.setDiachi(diachiTextArea.getText());

        if (emailText.getText().equals("") || passText.getText().equals("") || nameText.getText().equals("") || soCMText.getText().equals("") || qtText.getText().equals("") || diachiTextArea.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (sdtText.getText().length() != 10 || soCMText.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Số điện thoại và CMND phải điền đúng 10 chữ số !", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailText.getText()))) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng dạng email", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }  else {

            String kt = "";
            String sEmail = emailText.getText();
            String sSdt = sdtText.getText();
            String sSoCM = soCMText.getText();
            Connection connectUser = ketnoiSQL.getConnection();
            try {
                Statement st = connectUser.createStatement();
                ResultSet rs = st.executeQuery("select * from Account");
                while (rs.next()) {
                    if (rs.getString(2).equals(user.getEmail()) && rs.getString(2).equals(sEmail) == false) {
                        kt = "Email đã tồn tại";
                        break;
                    }
                    if (rs.getString(5).equals(user.getSdt()) && rs.getString(5).equals(sSdt) == false) {
                        kt = "Số điện thoại đã tồn tại";
                        break;
                    }
                    if (rs.getString(6).equals(user.getSoCM()) && rs.getString(6).equals(sSoCM) == false) {
                        kt = "Số CMND đã tồn tại";
                        break;
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            userService.ktTrungDL(user, kt);
            if (kt.equals("")) {
                userService.updateUser(user);
                JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, kt, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            nameText.setEditable(true);
        } else {
            nameText.setEditable(false);
        }
    }//GEN-LAST:event_nameTextKeyPressed

    private void sdtTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdtTextKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            sdtText.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            sdtText.setEditable(true);
        } else {
            sdtText.setEditable(false);
        }

    }//GEN-LAST:event_sdtTextKeyPressed

    private void soCMTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soCMTextKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            soCMText.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            soCMText.setEditable(true);
        } else {
            soCMText.setEditable(false);
        }
    }//GEN-LAST:event_soCMTextKeyPressed

    private void qtTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            qtText.setEditable(true);
        } else {
            qtText.setEditable(false);
        }
    }//GEN-LAST:event_qtTextKeyPressed

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
            java.util.logging.Logger.getLogger(ttAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ttAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ttAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ttAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ttAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JTextArea diachiTextArea;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namRadioButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton nuRadioButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField qtText;
    private javax.swing.JTextField sdtText;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField soCMText;
    // End of variables declaration//GEN-END:variables
}