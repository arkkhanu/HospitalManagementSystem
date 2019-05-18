/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

import LoginForm.loginsection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_billforadmit extends javax.swing.JFrame {

    int id = -1;
    String username = null;
    String dischargedatee = null;
    String todaydate = null;
  
    public receptionist_billforadmit() {
        initComponents();
        showtime();
        showdate();
    }

    public receptionist_billforadmit(int id , String username) {
        initComponents();
        showtime();
        showdate();
        this.id=id;
        this.username=username;
        rr_patrecp_tv.setText(String.valueOf(id));
        receptionistname.setText(username);
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
        logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dischargedate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        chkamount = new javax.swing.JButton();
        chkavailblity2 = new javax.swing.JButton();
        admitid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        chkavailblity3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        amountbox = new javax.swing.JTextField();
        dischargedateget = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        registrationdate = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rr_patrecp_tv = new javax.swing.JTextField();
        receptionistname = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel4.add(logout);
        logout.setBounds(760, 70, 150, 30);

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
        timegetting.setBounds(470, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Admit ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 150, 70, 30);

        dischargedate.setEditable(false);
        dischargedate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(dischargedate);
        dischargedate.setBounds(140, 270, 170, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Amount");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 370, 70, 30);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In", "Out" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(330, 320, 60, 30);

        chkamount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkamount.setText("Get");
        chkamount.setBorder(new javax.swing.border.MatteBorder(null));
        chkamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkamountActionPerformed(evt);
            }
        });
        jPanel1.add(chkamount);
        chkamount.setBounds(330, 370, 60, 30);

        chkavailblity2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkavailblity2.setText("Check Out");
        chkavailblity2.setBorder(new javax.swing.border.MatteBorder(null));
        chkavailblity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkavailblity2ActionPerformed(evt);
            }
        });
        jPanel1.add(chkavailblity2);
        chkavailblity2.setBounds(490, 420, 130, 40);

        admitid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        admitid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                admitidKeyTyped(evt);
            }
        });
        jPanel1.add(admitid);
        admitid.setBounds(140, 150, 70, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Patient ID");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 210, 70, 30);

        days.setEditable(false);
        days.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(days);
        days.setBounds(140, 320, 70, 30);

        chkavailblity3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkavailblity3.setText("Check ");
        chkavailblity3.setBorder(new javax.swing.border.MatteBorder(null));
        chkavailblity3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkavailblity3ActionPerformed(evt);
            }
        });
        jPanel1.add(chkavailblity3);
        chkavailblity3.setBounds(230, 150, 80, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Status");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(250, 320, 60, 30);

        amountbox.setEditable(false);
        amountbox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(amountbox);
        amountbox.setBounds(140, 370, 170, 30);

        dischargedateget.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dischargedateget.setText("Get");
        dischargedateget.setBorder(new javax.swing.border.MatteBorder(null));
        dischargedateget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargedategetActionPerformed(evt);
            }
        });
        jPanel1.add(dischargedateget);
        dischargedateget.setBounds(330, 270, 60, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Days");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 320, 70, 30);

        jTextField6.setEditable(false);
        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(140, 210, 170, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Discharge Date");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 270, 100, 30);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        registrationdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(200, 20, 140, 30);

        jTextField4.setEditable(false);
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(140, 100, 70, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Bill ID");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 100, 70, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("R ID : ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(470, 20, 40, 30);

        rr_patrecp_tv.setEditable(false);
        rr_patrecp_tv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rr_patrecp_tv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr_patrecp_tv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(rr_patrecp_tv);
        rr_patrecp_tv.setBounds(520, 20, 60, 30);

        receptionistname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        receptionistname.setText("Null");
        jPanel1.add(receptionistname);
        receptionistname.setBounds(520, 60, 120, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("R Name : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 60, 60, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(250, 170, 670, 490);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Bill For Admit");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(440, 130, 160, 40);

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

    
    void showtime(){
        new Timer(0, (ActionEvent ae) -> {
            Date d = new Date();
            SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss a");
            timegetting.setText(t.format(d));
        }).start();   
    }
    
    void showdate(){
        new Timer(0, (ActionEvent ae) -> {
            Date d = new Date();
            SimpleDateFormat t = new SimpleDateFormat("yyyy-MM-dd");
            registrationdate.setText(t.format(d));
            todaydate=registrationdate.getText();
        }).start(); 
    }
    
    
    
    private void chkamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkamountActionPerformed
        
        try{
            if(days.getText() == null || days.getText().equals("")){
                JOptionPane.showMessageDialog(null, "First get Discharge Date\n");
                
            }
            else{
                long tday = Long.parseLong(days.getText());
                // per day 1000 rupees; 
                String amount = String.valueOf(tday*1000);
                amountbox.setText(amount);
                System.out.println(tday);
            }
        }catch(NumberFormatException e ){System.out.println(e);}
        
    }//GEN-LAST:event_chkamountActionPerformed

    private void chkavailblity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkavailblity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkavailblity2ActionPerformed

    private void chkavailblity3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkavailblity3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkavailblity3ActionPerformed

    private void dischargedategetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargedategetActionPerformed
                
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
        dischargedatee = sdf.format(date);
        dischargedate.setText(dischargedatee);
        
//        String dd1 = dischargedate.getText();
        String dd1 = todaydate;
        String dd2 = "2019-05-01";
        long diff =-1;
        try{
            
            Date d1 = sdf.parse(dd1);
            Date d2 = sdf.parse(dd2);
            diff = d1.getDate()-d2.getDate();
            String totaldays = String.valueOf(diff);
            days.setText(totaldays);
        }catch(ParseException e){System.out.println(e);}
        
        
        
        System.out.println(diff);
    }//GEN-LAST:event_dischargedategetActionPerformed

    private void admitidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admitidKeyTyped
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_admitidKeyTyped

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginForm.loginsection lfl = new loginsection();
        lfl.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void rp_registration_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_registration_btnActionPerformed
        receptionist_mainmenu rmm = new receptionist_mainmenu(id,username);
        rmm.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_registration_btnActionPerformed

    private void rp_admit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_admit_btnActionPerformed
        receptionist_admitpatient radp = new receptionist_admitpatient(id,username);
        radp.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_admit_btnActionPerformed

    private void rp_bill_for_admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_bill_for_admitActionPerformed
        receptionist_billforadmit rba = new receptionist_billforadmit(id,username);
        rba.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_bill_for_admitActionPerformed

    private void rp_opt_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_opt_detailsActionPerformed
        receptionist_optdetail roptd = new receptionist_optdetail(id,username);
        roptd.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_opt_detailsActionPerformed

    private void rp_admit_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_admit_detailsActionPerformed
        receptionist_admitpatientdetail adpd = new receptionist_admitpatientdetail(id,username);
        adpd.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_admit_detailsActionPerformed

    private void rp_chk_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_chk_roomActionPerformed
        receptionist_checkroom rchr  = new receptionist_checkroom(id,username);
        rchr.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_chk_roomActionPerformed

    private void rp_opt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_opt_btnActionPerformed
        receptionist_opt ropt = new receptionist_opt(id,username);
        ropt.setVisible(true);
        dispose();
    }//GEN-LAST:event_rp_opt_btnActionPerformed

    private void rp_appointment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_appointment_btnActionPerformed
        receptionist_appoinment rap = new receptionist_appoinment(id,username);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionist_billforadmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new receptionist_billforadmit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admitid;
    private javax.swing.JTextField amountbox;
    private javax.swing.JButton chkamount;
    private javax.swing.JButton chkavailblity2;
    private javax.swing.JButton chkavailblity3;
    private javax.swing.JTextField days;
    private javax.swing.JTextField dischargedate;
    private javax.swing.JButton dischargedateget;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton logout;
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
    private javax.swing.JTextField rr_patrecp_tv;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
