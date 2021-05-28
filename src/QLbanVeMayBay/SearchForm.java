/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import Service.userService;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import getItem.User;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SearchForm extends javax.swing.JFrame {

    /**
     * Creates new form SearchForm
     */
    User user;
    userService userService;

    public SearchForm(String email) {

        initComponents();
         setLocationRelativeTo(null);
        userService = new userService();
        user = userService.getUser(email);
        oneRadioButton.setSelected(true);
        date2jLabel.setVisible(false);
        dateVe.setVisible(false);
        
    }

     private SearchForm() {
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
        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        submitButton2 = new javax.swing.JButton();
        oneRadioButton = new javax.swing.JRadioButton();
        twoRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diComboBox = new javax.swing.JComboBox<>();
        denComboBox = new javax.swing.JComboBox<>();
        dateDi = new com.toedter.calendar.JDateChooser();
        dateVe = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        date2jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numeric1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        numeric2 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        hangveComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tìm kiếm chuyến bay");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tìm kiếm chuyến bay");

        backjButton1.setText("Quay lại");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        submitButton2.setText("Xác nhận");
        submitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(oneRadioButton);
        oneRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oneRadioButton.setText("Vé một chiều");
        oneRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(twoRadioButton);
        twoRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        twoRadioButton.setText("Vé khứ hồi");
        twoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Điểm khởi hành :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Điểm đến :");

        diComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Đà Nẵng", "Hồ Chí Minh" }));

        denComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Đà Nẵng", "Hồ Chí Mịnh", " " }));

        dateDi.setDateFormatString("dd-MM-yyyy");

        dateVe.setDateFormatString("dd-MM-yyyy");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Ngày đi :");

        date2jLabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        date2jLabel.setText("Ngày về :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("Số người lớn :");

        numeric1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Số trẻ em :");

        numeric2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel8.setText("Hạng vé :");

        hangveComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hạng Phổ Thông", "Hạng Phổ Thông Đặc Biệt", "Hạng Thương Gia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oneRadioButton)
                            .addComponent(dateDi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numeric1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateVe, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twoRadioButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numeric2)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(submitButton2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(diComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(denComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton1)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1))
                            .addComponent(hangveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneRadioButton)
                    .addComponent(twoRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(date2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hangveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton1)
                    .addComponent(submitButton2))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneRadioButtonActionPerformed
        // TODO add your handling code here:
        date2jLabel.setVisible(false);
        dateVe.setEnabled(false);

    }//GEN-LAST:event_oneRadioButtonActionPerformed

    private void twoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoRadioButtonActionPerformed
        // TODO add your handling code here:
        date2jLabel.setVisible(true);
        dateVe.setEnabled(true);
        dateVe.setVisible(true);
    }//GEN-LAST:event_twoRadioButtonActionPerformed

    private void submitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton2ActionPerformed
        // TODO add your handling code here:
        int x1 = Integer.parseInt(numeric1.getValue().toString());
        int x2 = Integer.parseInt(numeric2.getValue().toString());
        if (diComboBox.getSelectedItem().toString().equals(denComboBox.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Nơi đi phải khác nơi đến", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (dateDi.getDate().compareTo(dateVe.getDate()) > 0 && twoRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ngày đi không được lớn hơn ngày  về", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (x1 + x2 > 10) {
            JOptionPane.showMessageDialog(this, "Số hành khách không được quá 10 người", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            
            String noidi = diComboBox.getSelectedItem().toString();
            String noiden = denComboBox.getSelectedItem().toString();
            SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
            String ngaydi = dfm.format(dateDi.getDate());
            String ngayve = null;
            if (twoRadioButton.isSelected()){
                ngayve = dfm.format(dateVe.getDate());
            }
           
            String hangghe = "";
            if (hangveComboBox.getSelectedIndex() == 0) {
                hangghe = "Pho Thong";
            } else if (hangveComboBox.getSelectedIndex() == 1) {
                hangghe = "Pho Thong DB";
            } else {
                hangghe = "Thuong Gia";
            }

            if (diComboBox.getSelectedIndex() == 0) {
                noidi = "Ha Noi";
            } else if (diComboBox.getSelectedIndex() == 1) {
                noidi = "Da Nang";
            } else {
                noidi = "Ho Chi Minh";
            }

            if (denComboBox.getSelectedIndex() == 0) {
                noiden = "Ha Noi";
            } else if (denComboBox.getSelectedIndex() == 1) {
                noiden = "Da Nang";
            } else {
                noiden = "Ho Chi Minh";
            }

            listSearchForm list = new listSearchForm(user.getEmail(), noidi, noiden, ngaydi, ngayve, hangghe);
     

            if (oneRadioButton.isSelected()) {

                list.setVisible(true);
                
                dispose();
            } else {
                list.setVisible(true);
                list.ds2Table.setVisible(true);
                dispose();
            }
        }


    }//GEN-LAST:event_submitButton2ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        new NewJFrame(user.getEmail()).setVisible(true);

        dispose();
    }//GEN-LAST:event_backjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date2jLabel;
    public static com.toedter.calendar.JDateChooser dateDi;
    public static com.toedter.calendar.JDateChooser dateVe;
    public static javax.swing.JComboBox<String> denComboBox;
    public static javax.swing.JComboBox<String> diComboBox;
    public static javax.swing.JComboBox<String> hangveComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JSpinner numeric1;
    public static javax.swing.JSpinner numeric2;
    public static javax.swing.JRadioButton oneRadioButton;
    private javax.swing.JButton submitButton2;
    public static javax.swing.JRadioButton twoRadioButton;
    // End of variables declaration//GEN-END:variables

}