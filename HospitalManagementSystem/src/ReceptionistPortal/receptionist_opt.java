/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_opt extends javax.swing.JFrame {

    /**
     * Creates new form receptionist_opt
     */
    public receptionist_opt() {
        initComponents();
        showtime();
        showdate();
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
        jPanel3 = new javax.swing.JPanel();
        registrationdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addopt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        billfee1 = new javax.swing.JTextField();
        patientidd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        patientidd3 = new javax.swing.JTextField();
        checkoptid = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        receptionistname = new javax.swing.JLabel();
        receptionistid = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        registrationdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(registrationdate);
        registrationdate.setBounds(230, 20, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(370, 210, 70, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.add(jTextField2);
        jTextField2.setBounds(460, 310, 150, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Phone No.");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 260, 70, 30);

        phone2.setEditable(false);
        phone2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phone2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.add(phone2);
        phone2.setBounds(120, 260, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("First Name");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 210, 70, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.add(jTextField4);
        jTextField4.setBounds(120, 210, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Doctor" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(120, 310, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("OPTID");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 100, 80, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Bill Fee Rs: ");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(380, 260, 70, 30);

        addopt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addopt.setText("ADD");
        addopt.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(addopt);
        addopt.setBounds(270, 410, 150, 40);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Deptarment");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(370, 310, 70, 30);

        billfee1.setEditable(false);
        billfee1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        billfee1.setText("1000");
        billfee1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        billfee1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(billfee1);
        billfee1.setBounds(460, 260, 60, 30);

        patientidd.setEditable(false);
        patientidd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.add(patientidd);
        patientidd.setBounds(120, 100, 59, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Patient ID : ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 160, 70, 30);

        patientidd3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        patientidd3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientidd3KeyTyped(evt);
            }
        });
        jPanel3.add(patientidd3);
        patientidd3.setBounds(120, 160, 59, 30);

        checkoptid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkoptid.setText("Check");
        jPanel3.add(checkoptid);
        checkoptid.setBounds(200, 160, 70, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Doctor");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(50, 310, 50, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.add(jTextField3);
        jTextField3.setBounds(460, 210, 150, 30);

        receptionistname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receptionistname.setText("Null");
        jPanel3.add(receptionistname);
        receptionistname.setBounds(530, 50, 120, 20);

        receptionistid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receptionistid.setText("Null");
        jPanel3.add(receptionistid);
        receptionistid.setBounds(530, 20, 120, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Reception ID : ");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(420, 20, 90, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Reception Name : ");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(410, 50, 110, 20);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(250, 170, 670, 490);

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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Add OPT ");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(490, 130, 120, 40);

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
        jPanel4.setBounds(0, 10, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void showtime(){
        
        new Timer(0, (ActionEvent ae) -> {
            Date d = new Date();
            SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss a");
            timegetting.setText(t.format(d));
        }).start();
    }
    private void showdate(){
        
         new Timer(0, (ActionEvent ae) -> {
            Date d = new Date();
            SimpleDateFormat t = new SimpleDateFormat("yyyy-MM-dd");
            registrationdate.setText(t.format(d));
        }).start();
    }
    
    private void patientidd3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientidd3KeyTyped
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_patientidd3KeyTyped

    private void rp_registration_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_registration_btnActionPerformed
        receptionist_mainmenu rm = new receptionist_mainmenu();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_registration_btnActionPerformed

    private void rp_admit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_admit_btnActionPerformed
        receptionist_admitpatient radp = new receptionist_admitpatient();
        radp.setVisible(true);
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
        receptionist_admitpatientdetail adpd = new receptionist_admitpatientdetail();
        adpd.setVisible(true);
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
            java.util.logging.Logger.getLogger(receptionist_opt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receptionist_opt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receptionist_opt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionist_opt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new receptionist_opt().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addopt;
    private javax.swing.JTextField billfee1;
    private javax.swing.JButton checkoptid;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField patientidd;
    private javax.swing.JTextField patientidd3;
    private javax.swing.JTextField phone2;
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
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
