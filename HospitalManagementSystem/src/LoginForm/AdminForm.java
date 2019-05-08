/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import java.awt.Color;

/**
 *
 * @author AbdulRehman
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminpass_et = new javax.swing.JPasswordField();
        adminuser_et = new javax.swing.JTextField();
        admincancel_btn = new javax.swing.JButton();
        adminloginbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(870, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 230, 90, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 290, 90, 30);

        adminpass_et.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(adminpass_et);
        adminpass_et.setBounds(420, 290, 180, 30);

        adminuser_et.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(adminuser_et);
        adminuser_et.setBounds(420, 230, 180, 30);

        admincancel_btn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        admincancel_btn.setForeground(new java.awt.Color(0, 51, 51));
        admincancel_btn.setText("Cancel");
        admincancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admincancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(admincancel_btn);
        admincancel_btn.setBounds(490, 380, 90, 30);

        adminloginbtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminloginbtn.setForeground(new java.awt.Color(0, 51, 51));
        adminloginbtn.setText("Login");
        adminloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminloginbtn);
        adminloginbtn.setBounds(380, 380, 90, 30);

        jLabel5.setBackground(new java.awt.Color(0, 102, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("       Login Here as Admin");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 140, 340, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 120, 340, 340);
        jLabel2.setBackground(new Color(0,0,0,50));

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                      Hospital Management System");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 20, 870, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/r9.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admincancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admincancel_btnActionPerformed
        // TODO add your handling code here:
        MainLoginForm mainloginform = new MainLoginForm();
        mainloginform.setVisible(true);
        dispose();
    }//GEN-LAST:event_admincancel_btnActionPerformed

    private void adminloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminloginbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admincancel_btn;
    private javax.swing.JButton adminloginbtn;
    private javax.swing.JPasswordField adminpass_et;
    private javax.swing.JTextField adminuser_et;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}