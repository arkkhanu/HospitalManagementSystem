/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminpPortal.admin_internalclasses;

import AdminpPortal.admin_internal;
import java.awt.event.KeyEvent;

/**
 *
 * @author AbdulRehman
 */
public class admin_internal_ward extends javax.swing.JFrame {

    /**
     * Creates new form admin_internal_ward
     */
    public admin_internal_ward() {
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
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        searching = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        i_addqualification = new javax.swing.JButton();
        i_addroomcate = new javax.swing.JButton();
        i_addrooms = new javax.swing.JButton();
        i_addward = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(947, 708));
        setResizable(false);
        setSize(new java.awt.Dimension(947, 708));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/admin (1).png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(50, 10, 130, 130);

        timegetting.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timegetting.setText("Time");
        jPanel4.add(timegetting);
        timegetting.setBounds(500, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(240, 20, 140, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "WID", "WardName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 160, 260, 210);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Check");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton7);
        jButton7.setBounds(540, 120, 60, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Reset");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton5);
        jButton5.setBounds(620, 120, 60, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Cate-ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 90, 50, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 150, 80, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ward ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 150, 50, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ward Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 210, 70, 30);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 210, 150, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("Add");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton6);
        jButton6.setBounds(130, 410, 100, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 410, 100, 30);

        searching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        searching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchingKeyTyped(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(430, 120, 70, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(230, 160, 700, 500);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Add Ward");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(490, 130, 120, 30);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel4.add(back);
        back.setBounds(760, 70, 150, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("           ADMIN Portal -- Internal ");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 50, 710, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        i_addqualification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i_addqualification.setText("Add Qualification");
        i_addqualification.setBorder(new javax.swing.border.MatteBorder(null));
        i_addqualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_addqualificationActionPerformed(evt);
            }
        });
        jPanel2.add(i_addqualification);
        i_addqualification.setBounds(10, 90, 190, 40);

        i_addroomcate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i_addroomcate.setText("Add Room Cate");
        i_addroomcate.setBorder(new javax.swing.border.MatteBorder(null));
        i_addroomcate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_addroomcateActionPerformed(evt);
            }
        });
        jPanel2.add(i_addroomcate);
        i_addroomcate.setBounds(10, 210, 190, 40);

        i_addrooms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i_addrooms.setText("Add Rooms");
        i_addrooms.setBorder(new javax.swing.border.MatteBorder(null));
        i_addrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_addroomsActionPerformed(evt);
            }
        });
        jPanel2.add(i_addrooms);
        i_addrooms.setBounds(10, 270, 190, 40);

        i_addward.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i_addward.setText("Add Ward");
        i_addward.setBorder(new javax.swing.border.MatteBorder(null));
        i_addward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_addwardActionPerformed(evt);
            }
        });
        jPanel2.add(i_addward);
        i_addward.setBounds(10, 150, 190, 40);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(10, 160, 210, 500);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        admin_internal aii = new admin_internal();
        aii.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void i_addqualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_addqualificationActionPerformed
        admin_internal_qualification  aiq= new admin_internal_qualification();
        aiq.setVisible(true);
        dispose();
    }//GEN-LAST:event_i_addqualificationActionPerformed

    private void i_addroomcateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_addroomcateActionPerformed
        admin_internal_roomcate arc = new admin_internal_roomcate();
        arc.setVisible(true);
        dispose();
    }//GEN-LAST:event_i_addroomcateActionPerformed

    private void i_addroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_addroomsActionPerformed
        admin_internal_rooms arr = new admin_internal_rooms();
        arr.setVisible(true);
        dispose();
    }//GEN-LAST:event_i_addroomsActionPerformed

    private void i_addwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_addwardActionPerformed
        admin_internal_ward aw = new admin_internal_ward();
        aw.setVisible(true);
        dispose();
    }//GEN-LAST:event_i_addwardActionPerformed

    private void searchingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_searchingKeyTyped

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
            java.util.logging.Logger.getLogger(admin_internal_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_internal_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_internal_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_internal_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_internal_ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton i_addqualification;
    private javax.swing.JButton i_addroomcate;
    private javax.swing.JButton i_addrooms;
    private javax.swing.JButton i_addward;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
