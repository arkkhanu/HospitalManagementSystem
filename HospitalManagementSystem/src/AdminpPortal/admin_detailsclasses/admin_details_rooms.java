/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminpPortal.admin_detailsclasses;

import AdminpPortal.admin_details;

/**
 *
 * @author AbdulRehman
 */
public class admin_details_rooms extends javax.swing.JFrame {

    /** Creates new form admin_details_rooms */
    public admin_details_rooms() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField26 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1147, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1147, 680));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 650));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/admin (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 130, 130);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RoomID", "RoomCat", "Ward", "Status", "Nurse-ID", "N-F-Name", "N-L-Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(630, 220, 490, 410);

        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton15.setText("Back");
        jButton15.setBorder(new javax.swing.border.MatteBorder(null));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(970, 70, 80, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                              ADMIN Portal");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 50, 910, 70);

        jButton17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton17.setText("Reset");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton17);
        jButton17.setBounds(980, 170, 60, 30);

        jButton16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton16.setText("Check");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton16);
        jButton16.setBounds(870, 170, 60, 30);

        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField17);
        jTextField17.setBounds(760, 170, 90, 30);

        jButton18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton18.setText("Print");
        jButton18.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton18);
        jButton18.setBounds(1060, 170, 60, 30);

        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField18.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField18);
        jTextField18.setBounds(150, 230, 100, 30);

        jButton19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton19.setText("Check");
        jButton19.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton19);
        jButton19.setBounds(280, 400, 60, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Room ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 230, 70, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("RoomCategory");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 300, 90, 30);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField19.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField19);
        jTextField19.setBounds(150, 300, 100, 30);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField20.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField20);
        jTextField20.setBounds(150, 350, 100, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ward");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 350, 40, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nurse ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 400, 60, 30);

        jTextField21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField21.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField21);
        jTextField21.setBounds(150, 400, 100, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("N-F-Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 450, 70, 30);

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField22.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField22);
        jTextField22.setBounds(150, 450, 100, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Ward");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 300, 40, 30);

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField24.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField24);
        jTextField24.setBounds(360, 300, 100, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 350, 40, 30);

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField25.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField25);
        jTextField25.setBounds(360, 350, 100, 30);

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField23.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField23);
        jTextField23.setBounds(360, 450, 100, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("N-L-Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 450, 70, 30);

        jButton20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton20.setText("Check");
        jButton20.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton20);
        jButton20.setBounds(280, 230, 60, 30);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "RoomID", "NurseID" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(630, 170, 100, 30);

        jTextField26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField26.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField26);
        jTextField26.setBounds(150, 530, 100, 30);

        jButton21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton21.setText("Update");
        jButton21.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton21);
        jButton21.setBounds(370, 400, 60, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Room ID-2");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 530, 70, 30);

        jButton22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton22.setText("Swap");
        jButton22.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton22);
        jButton22.setBounds(280, 530, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 1140, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        admin_details ad = new admin_details();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_details_rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_details_rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_details_rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_details_rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_details_rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    // End of variables declaration//GEN-END:variables

}
