/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

import java.awt.event.KeyEvent;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_admitpatientdetail extends javax.swing.JFrame {

    public receptionist_admitpatientdetail() {
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
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        optid_phno = new javax.swing.JTextField();
        searching = new javax.swing.JButton();
        receptionistname = new javax.swing.JLabel();
        receptionistid = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        registrationdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rp_registration_btn = new javax.swing.JButton();
        rp_admit_btn = new javax.swing.JButton();
        rp_bill_for_admit = new javax.swing.JButton();
        rp_opt_details = new javax.swing.JButton();
        rp_admit_details = new javax.swing.JButton();
        rp_chk_room = new javax.swing.JButton();
        rp_opt_btn = new javax.swing.JButton();
        rp_appointment_btn = new javax.swing.JButton();

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
        timegetting.setBounds(490, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AdmitID", "PatID", "P-F-Name", "P-L-Name", "RoomNo", "Ward", "Status", "Nurse"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 640, 180);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID", "OPT-ID", "Phone No" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(60, 120, 130, 30);

        optid_phno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        optid_phno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        optid_phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                optid_phnoKeyTyped(evt);
            }
        });
        jPanel1.add(optid_phno);
        optid_phno.setBounds(220, 120, 140, 30);

        searching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching.setText("Search");
        searching.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(searching);
        searching.setBounds(380, 120, 130, 30);

        receptionistname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receptionistname.setText("Null");
        jPanel1.add(receptionistname);
        receptionistname.setBounds(520, 50, 120, 20);

        receptionistid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receptionistid.setText("Null");
        jPanel1.add(receptionistid);
        receptionistid.setBounds(520, 20, 120, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Reception ID : ");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(410, 20, 90, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Reception Name : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(400, 50, 110, 20);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        registrationdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(220, 20, 140, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(260, 170, 660, 490);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Admit Patient Details");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(440, 130, 230, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        rp_registration_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_registration_btn.setText("Register Patient");
        rp_registration_btn.setBorder(new javax.swing.border.MatteBorder(null));
        rp_registration_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_registration_btnActionPerformed(evt);
            }
        });
        jPanel2.add(rp_registration_btn);
        rp_registration_btn.setBounds(10, 20, 190, 40);

        rp_admit_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_admit_btn.setText("Admit Patient");
        rp_admit_btn.setBorder(new javax.swing.border.MatteBorder(null));
        rp_admit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_admit_btnActionPerformed(evt);
            }
        });
        jPanel2.add(rp_admit_btn);
        rp_admit_btn.setBounds(10, 200, 190, 40);

        rp_bill_for_admit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_bill_for_admit.setText("Bill for Admit");
        rp_bill_for_admit.setBorder(new javax.swing.border.MatteBorder(null));
        rp_bill_for_admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_bill_for_admitActionPerformed(evt);
            }
        });
        jPanel2.add(rp_bill_for_admit);
        rp_bill_for_admit.setBounds(10, 260, 190, 40);

        rp_opt_details.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_opt_details.setText("OPT Patient Detail");
        rp_opt_details.setBorder(new javax.swing.border.MatteBorder(null));
        rp_opt_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_opt_detailsActionPerformed(evt);
            }
        });
        jPanel2.add(rp_opt_details);
        rp_opt_details.setBounds(10, 440, 190, 40);

        rp_admit_details.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_admit_details.setText("Admited Patient Detail");
        rp_admit_details.setBorder(new javax.swing.border.MatteBorder(null));
        rp_admit_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_admit_detailsActionPerformed(evt);
            }
        });
        jPanel2.add(rp_admit_details);
        rp_admit_details.setBounds(10, 380, 190, 40);

        rp_chk_room.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_chk_room.setText("Check Room");
        rp_chk_room.setBorder(new javax.swing.border.MatteBorder(null));
        rp_chk_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_chk_roomActionPerformed(evt);
            }
        });
        jPanel2.add(rp_chk_room);
        rp_chk_room.setBounds(10, 320, 190, 40);

        rp_opt_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_opt_btn.setText("Add OPT");
        rp_opt_btn.setBorder(new javax.swing.border.MatteBorder(null));
        rp_opt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_opt_btnActionPerformed(evt);
            }
        });
        jPanel2.add(rp_opt_btn);
        rp_opt_btn.setBounds(10, 80, 190, 40);

        rp_appointment_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_appointment_btn.setText("Appoinment");
        rp_appointment_btn.setBorder(new javax.swing.border.MatteBorder(null));
        rp_appointment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_appointment_btnActionPerformed(evt);
            }
        });
        jPanel2.add(rp_appointment_btn);
        rp_appointment_btn.setBounds(10, 140, 190, 40);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(20, 170, 210, 490);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void optid_phnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optid_phnoKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_optid_phnoKeyTyped

    private void rp_registration_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_registration_btnActionPerformed
        receptionist_mainmenu rm = new receptionist_mainmenu();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_registration_btnActionPerformed

    private void rp_admit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_admit_btnActionPerformed
        receptionist_admitpatient  adp = new receptionist_admitpatient();
        adp.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_admit_btnActionPerformed

    private void rp_bill_for_admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_bill_for_admitActionPerformed
        receptionist_billforadmit rba = new receptionist_billforadmit();
        rba.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_bill_for_admitActionPerformed

    private void rp_opt_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_opt_detailsActionPerformed
        receptionist_optdetail roptd = new receptionist_optdetail();
        roptd.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_opt_detailsActionPerformed

    private void rp_admit_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_admit_detailsActionPerformed
        receptionist_admitpatientdetail rad= new receptionist_admitpatientdetail();
        rad.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_admit_detailsActionPerformed

    private void rp_chk_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_chk_roomActionPerformed
        receptionist_checkroom rchr  = new receptionist_checkroom();
        rchr.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_chk_roomActionPerformed

    private void rp_opt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_opt_btnActionPerformed
        receptionist_opt ropt = new receptionist_opt();
        ropt.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_opt_btnActionPerformed

    private void rp_appointment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_appointment_btnActionPerformed
        receptionist_appoinment rap = new receptionist_appoinment();
        rap.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_appointment_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionist_admitpatientdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new receptionist_admitpatientdetail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField optid_phno;
    private javax.swing.JLabel receptionistid;
    private javax.swing.JLabel receptionistname;
    private javax.swing.JTextField registrationdate;
    private javax.swing.JButton rp_admit_btn;
    private javax.swing.JButton rp_admit_details;
    private javax.swing.JButton rp_appointment_btn;
    private javax.swing.JButton rp_bill_for_admit;
    private javax.swing.JButton rp_chk_room;
    private javax.swing.JButton rp_opt_btn;
    private javax.swing.JButton rp_opt_details;
    private javax.swing.JButton rp_registration_btn;
    private javax.swing.JButton searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
