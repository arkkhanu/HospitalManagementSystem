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
public class admin_details_billforadmit extends javax.swing.JFrame {

    /**
     * Creates new form admin_details_billforadmit
     */
    public admin_details_billforadmit() {
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BillID", "AdID", "PID", "Disch-Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 1100, 410);

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
        jButton17.setBounds(540, 150, 60, 30);

        jButton16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton16.setText("Check");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton16);
        jButton16.setBounds(450, 150, 60, 30);

        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jTextField17);
        jTextField17.setBounds(340, 150, 90, 30);

        jButton18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton18.setText("Print");
        jButton18.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton18);
        jButton18.setBounds(620, 150, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1120, 650);

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
            java.util.logging.Logger.getLogger(admin_details_billforadmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_details_billforadmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_details_billforadmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_details_billforadmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_details_billforadmit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField17;
    // End of variables declaration//GEN-END:variables
}
