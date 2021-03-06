/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

import DBConnectionP.DBConnection;
import LoginForm.loginsection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_optdetail extends javax.swing.JFrame {

    
    DBConnection conn = new DBConnection();
    int id= -1;
    String username=null;
 
    public receptionist_optdetail() {
        initComponents();
//        show_user();
//        fillcombo();
          _error.setVisible(false);
          showdate();
          showtime();
    }

    public receptionist_optdetail(int id , String username) {
        initComponents();
        showdate();
        showtime();
        this.id=id;
        this.username=username;
        rr_patrecp_tv.setText(String.valueOf(id));
        receptionistname.setText(username);
        _error.setVisible(false);
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
        searching_ed = new javax.swing.JTextField();
        resetAll = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        registrationdate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        rr_patrecp_tv = new javax.swing.JTextField();
        receptionistname = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        searching = new javax.swing.JButton();
        _error = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        optid_ed = new javax.swing.JTextField();
        gender_ed = new javax.swing.JTextField();
        age_ed = new javax.swing.JTextField();
        plname_ed = new javax.swing.JTextField();
        pfname_ed = new javax.swing.JTextField();
        prid_ed = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dlname_ed = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        dfname_ed = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        chkin_ed = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rp_registration_btn = new javax.swing.JButton();
        rp_admit_btn = new javax.swing.JButton();
        rp_bill_for_admit = new javax.swing.JButton();
        rp_opt_details = new javax.swing.JButton();
        rp_admit_details = new javax.swing.JButton();
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

        timegetting.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timegetting.setText("Time");
        jPanel4.add(timegetting);
        timegetting.setBounds(510, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        searching_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searching_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        searching_ed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searching_edKeyTyped(evt);
            }
        });
        jPanel1.add(searching_ed);
        searching_ed.setBounds(180, 130, 60, 30);

        resetAll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resetAll.setText("Rest");
        resetAll.setBorder(new javax.swing.border.MatteBorder(null));
        resetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAllActionPerformed(evt);
            }
        });
        jPanel1.add(resetAll);
        resetAll.setBounds(380, 130, 80, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("OPT ID");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(90, 130, 70, 30);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.gray));
        registrationdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(220, 20, 140, 30);

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

        searching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching.setText("Search");
        searching.setBorder(new javax.swing.border.MatteBorder(null));
        searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingActionPerformed(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(270, 130, 80, 30);

        _error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _error.setForeground(new java.awt.Color(255, 0, 0));
        _error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _error.setText("*");
        jPanel1.add(_error);
        _error.setBounds(240, 140, 20, 10);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("OPTID");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(70, 220, 70, 30);

        optid_ed.setEditable(false);
        optid_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        optid_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        optid_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(optid_ed);
        optid_ed.setBounds(70, 250, 70, 30);

        gender_ed.setEditable(false);
        gender_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gender_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(gender_ed);
        gender_ed.setBounds(520, 320, 100, 30);

        age_ed.setEditable(false);
        age_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        age_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        age_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(age_ed);
        age_ed.setBounds(430, 320, 70, 30);

        plname_ed.setEditable(false);
        plname_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        plname_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plname_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(plname_ed);
        plname_ed.setBounds(260, 320, 140, 30);

        pfname_ed.setEditable(false);
        pfname_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pfname_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pfname_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(pfname_ed);
        pfname_ed.setBounds(70, 320, 140, 30);

        prid_ed.setEditable(false);
        prid_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prid_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prid_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(prid_ed);
        prid_ed.setBounds(170, 250, 70, 30);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("GENDER");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(520, 290, 70, 30);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("AGE");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(430, 290, 60, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Last Name");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(260, 290, 70, 30);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Patient First Name");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(70, 290, 140, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("PRID");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(170, 220, 70, 30);

        dlname_ed.setEditable(false);
        dlname_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dlname_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dlname_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(dlname_ed);
        dlname_ed.setBounds(260, 400, 140, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Last Name");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(260, 370, 70, 30);

        dfname_ed.setEditable(false);
        dfname_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dfname_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dfname_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(dfname_ed);
        dfname_ed.setBounds(70, 400, 140, 30);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Doctor First Name");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(70, 370, 140, 30);

        chkin_ed.setEditable(false);
        chkin_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkin_ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chkin_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(chkin_ed);
        chkin_ed.setBounds(430, 400, 140, 30);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Check IN");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(430, 370, 70, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(260, 170, 660, 490);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("OPT Details");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(490, 130, 130, 40);

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel4.add(logoutbtn);
        logoutbtn.setBounds(780, 60, 150, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                      Receptionist Portal");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 40, 710, 70);

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
        rp_opt_details.setBounds(10, 380, 190, 40);

        rp_admit_details.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rp_admit_details.setText("Admited Patient Detail");
        rp_admit_details.setBorder(new javax.swing.border.MatteBorder(null));
        rp_admit_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_admit_detailsActionPerformed(evt);
            }
        });
        jPanel2.add(rp_admit_details);
        rp_admit_details.setBounds(10, 320, 190, 40);

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
        }).start();
        
    }
    
  
    
    
    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        LoginForm.loginsection lfl = new loginsection();
        lfl.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

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

    private void searching_edKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searching_edKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_searching_edKeyTyped

    private void searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingActionPerformed
        if(searching_ed.getText().equals("")){_error.setVisible(true);}
        if(!searching_ed.getText().isEmpty()){
        
            _error.setVisible(false);
            boolean found = false;
            try{
                String query = "select optid ,rp.rpid , fname , lname , ge.gname , rp.age , dfname , dlname , "
                + "entdate from patientopt p , regpatient rp , doctor d , gender ge  where p.rpid=rp.rpid and "
                + "p.did=d.did and rp.sexid=ge.gid and p.optid="+searching_ed.getText();
                conn.OpenConnection();
                conn.GetData(query);
                while(conn.rst.next()){
                    found=true;
                    optid_ed.setText(String.valueOf(conn.rst.getInt("optid")));
                    pfname_ed.setText(conn.rst.getString("fname"));
                    plname_ed.setText(conn.rst.getString("lname"));
                    prid_ed.setText(String.valueOf(conn.rst.getInt("rpid")));
                    age_ed.setText(String.valueOf(conn.rst.getInt("age")));
                    gender_ed.setText(conn.rst.getString("gname"));
                    dfname_ed.setText(conn.rst.getString("dfname"));
                    dlname_ed.setText(conn.rst.getString("dlname"));
                    String chkin = (conn.rst.getString("entdate"));
                    chkin_ed.setText(chkin.substring(0,10));
                    break;
                }
                if(found == false){
                    JOptionPane.showMessageDialog(null, "Sorry ..! Not Found such OPT Paitent");
                    searching_ed.setText("");
                    optid_ed.setText("");
                    pfname_ed.setText("");
                    plname_ed.setText("");
                    prid_ed.setText("");
                    age_ed.setText("");
                    gender_ed.setText("");
                    dfname_ed.setText("");
                    dlname_ed.setText("");
                    chkin_ed.setText("");
                    
                }
            }catch(SQLException e ){System.out.println(e);}
        }
        
    }//GEN-LAST:event_searchingActionPerformed

    private void resetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAllActionPerformed
        
        searching_ed.setText("");
        optid_ed.setText("");
        pfname_ed.setText("");
        plname_ed.setText("");
        prid_ed.setText("");
        age_ed.setText("");
        gender_ed.setText("");
        dfname_ed.setText("");
        dlname_ed.setText("");
        chkin_ed.setText("");
        
    }//GEN-LAST:event_resetAllActionPerformed

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
            java.util.logging.Logger.getLogger(receptionist_optdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new receptionist_optdetail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _error;
    private javax.swing.JTextField age_ed;
    private javax.swing.JTextField chkin_ed;
    private javax.swing.JTextField dfname_ed;
    private javax.swing.JTextField dlname_ed;
    private javax.swing.JTextField gender_ed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextField optid_ed;
    private javax.swing.JTextField pfname_ed;
    private javax.swing.JTextField plname_ed;
    private javax.swing.JTextField prid_ed;
    private javax.swing.JLabel receptionistname;
    private javax.swing.JTextField registrationdate;
    private javax.swing.JButton resetAll;
    private javax.swing.JButton rp_admit_btn;
    private javax.swing.JButton rp_admit_details;
    private javax.swing.JButton rp_appointment_btn;
    private javax.swing.JButton rp_bill_for_admit;
    private javax.swing.JButton rp_opt_btn;
    private javax.swing.JButton rp_opt_details;
    private javax.swing.JButton rp_registration_btn;
    private javax.swing.JTextField rr_patrecp_tv;
    private javax.swing.JButton searching;
    private javax.swing.JTextField searching_ed;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
