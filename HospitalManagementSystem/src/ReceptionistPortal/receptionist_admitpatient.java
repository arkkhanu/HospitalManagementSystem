/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_admitpatient extends javax.swing.JFrame {

   
    public receptionist_admitpatient() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        getroom = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        chkavailblity1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        chkavailblity2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        chkavailblity3 = new javax.swing.JButton();
        patientidd2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        patientidd1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(947, 708));
        setResizable(false);
        setSize(new java.awt.Dimension(947, 708));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/p2.png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(50, 10, 130, 130);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Register Patient");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 30, 190, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Admit Patient");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 150, 190, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Bill for Admit");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 210, 190, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("OPT Patient Detail");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton7);
        jButton7.setBounds(10, 330, 190, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Admited Patient Detail");
        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton8);
        jButton8.setBounds(10, 270, 190, 40);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Check Room");
        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton9);
        jButton9.setBounds(10, 90, 190, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("Change Password");
        jButton10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton10);
        jButton10.setBounds(10, 430, 190, 40);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(20, 170, 210, 490);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        jPanel4.add(jButton1);
        jButton1.setBounds(760, 70, 150, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                      Receptionist Portal");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 50, 710, 70);

        timegetting.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timegetting.setText("Time");
        jPanel4.add(timegetting);
        timegetting.setBounds(440, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        getroom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getroom.setText("Get");
        getroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getroomActionPerformed(evt);
            }
        });
        jPanel1.add(getroom);
        getroom.setBounds(220, 320, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Room Category  ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 110, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(20, 120, 100, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Null");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 180, 70, 30);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(140, 120, 120, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ward Typ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 90, 110, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 270, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Doctor");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 270, 70, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Admit ID");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 180, 70, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 220, 70, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Status");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 220, 70, 30);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In", "Out" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(510, 220, 56, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Patient ID");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 220, 70, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Room No");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(280, 80, 70, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(280, 120, 80, 30);

        chkavailblity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkavailblity1.setText("Check ");
        chkavailblity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkavailblity1ActionPerformed(evt);
            }
        });
        jPanel1.add(chkavailblity1);
        chkavailblity1.setBounds(220, 220, 80, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Room No");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 320, 70, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Disease");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 370, 60, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(140, 370, 500, 30);

        chkavailblity2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkavailblity2.setText("Admit");
        chkavailblity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkavailblity2ActionPerformed(evt);
            }
        });
        jPanel1.add(chkavailblity2);
        chkavailblity2.setBounds(280, 430, 130, 40);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(140, 320, 70, 30);

        chkavailblity3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkavailblity3.setText("Check ");
        chkavailblity3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkavailblity3ActionPerformed(evt);
            }
        });
        jPanel1.add(chkavailblity3);
        chkavailblity3.setBounds(390, 120, 90, 30);

        patientidd2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd2.setText("Null");
        jPanel1.add(patientidd2);
        patientidd2.setBounds(570, 50, 50, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Reception ID : ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(450, 20, 100, 20);

        patientidd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd1.setText("Null");
        jPanel1.add(patientidd1);
        patientidd1.setBounds(570, 20, 50, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Reception Name : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 50, 110, 20);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(260, 170, 660, 490);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getroomActionPerformed

    private void chkavailblity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkavailblity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkavailblity1ActionPerformed

    private void chkavailblity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkavailblity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkavailblity2ActionPerformed

    private void chkavailblity3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkavailblity3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkavailblity3ActionPerformed

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
            java.util.logging.Logger.getLogger(receptionist_admitpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receptionist_admitpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receptionist_admitpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionist_admitpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receptionist_admitpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chkavailblity1;
    private javax.swing.JButton chkavailblity2;
    private javax.swing.JButton chkavailblity3;
    private javax.swing.JButton getroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel patientidd1;
    private javax.swing.JLabel patientidd2;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
