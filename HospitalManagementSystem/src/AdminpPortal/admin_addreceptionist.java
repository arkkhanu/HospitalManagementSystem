/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminpPortal;

import AdminpPortal.admin_detailsclasses.admin_details_opt;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author AbdulRehman
 */
public class admin_addreceptionist extends javax.swing.JFrame {

    
    public admin_addreceptionist() {
        initComponents();
        showtime();
        showdate();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        registrationdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        city1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        searching = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        qualification = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        phoneno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a_doctor_btn = new javax.swing.JButton();
        a_nurse_btn = new javax.swing.JButton();
        a_receptionist_btn = new javax.swing.JButton();
        a_internall_btn = new javax.swing.JButton();
        a_salay_btn = new javax.swing.JButton();
        a_detail_btn = new javax.swing.JButton();

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        jPanel4.add(jButton1);
        jButton1.setBounds(760, 70, 150, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                      ADMIN Portal");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 50, 710, 70);

        timegetting.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timegetting.setText("Time");
        jPanel4.add(timegetting);
        timegetting.setBounds(480, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton4);
        jButton4.setBounds(340, 450, 100, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("Add");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton6);
        jButton6.setBounds(80, 450, 90, 30);

        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton11.setText("Update");
        jButton11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton11);
        jButton11.setBounds(210, 450, 100, 30);

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton12.setText("Search");
        jButton12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton12);
        jButton12.setBounds(600, 40, 90, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("L-Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 50, 30);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(90, 140, 130, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 100, 130, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Recept ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 60, 60, 30);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(220, 20, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 30, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("F-Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 100, 50, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Ph NO");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 140, 40, 30);

        gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender" }));
        jPanel1.add(gender);
        gender.setBounds(130, 190, 90, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 230, 30, 30);

        city1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        city1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        jPanel1.add(city1);
        city1.setBounds(90, 230, 130, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("DOB");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 100, 40, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField10);
        jTextField10.setBounds(90, 60, 40, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Qualification");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(250, 190, 75, 30);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(90, 350, 180, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 270, 50, 30);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(340, 310, 130, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Password");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 350, 60, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Salary");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 350, 40, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Email");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 310, 40, 30);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(90, 310, 230, 30);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(90, 270, 380, 30);

        searching.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searching.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        searching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchingKeyTyped(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(480, 40, 100, 30);

        age.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        age.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(90, 190, 30, 30);

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryKeyTyped(evt);
            }
        });
        jPanel1.add(salary);
        salary.setBounds(340, 350, 130, 30);

        qualification.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Qual" }));
        jPanel1.add(qualification);
        qualification.setBounds(330, 190, 130, 30);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(330, 100, 130, 30);

        phoneno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phoneno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenoKeyTyped(evt);
            }
        });
        jPanel1.add(phoneno);
        phoneno.setBounds(330, 140, 130, 30);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(480, 110, 200, 370);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(230, 160, 700, 500);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Add Receptionist");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(430, 120, 190, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        a_doctor_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_doctor_btn.setText("Doctor");
        a_doctor_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_doctor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_doctor_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_doctor_btn);
        a_doctor_btn.setBounds(10, 50, 190, 40);

        a_nurse_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_nurse_btn.setText("Nurse");
        a_nurse_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_nurse_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_nurse_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_nurse_btn);
        a_nurse_btn.setBounds(10, 170, 190, 40);

        a_receptionist_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_receptionist_btn.setText("Receptionist");
        a_receptionist_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_receptionist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_receptionist_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_receptionist_btn);
        a_receptionist_btn.setBounds(10, 110, 190, 40);

        a_internall_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_internall_btn.setText("Internal");
        a_internall_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_internall_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_internall_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_internall_btn);
        a_internall_btn.setBounds(10, 350, 190, 40);

        a_salay_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_salay_btn.setText("Salary");
        a_salay_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_salay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_salay_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_salay_btn);
        a_salay_btn.setBounds(10, 230, 190, 40);

        a_detail_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a_detail_btn.setText("Details");
        a_detail_btn.setBorder(new javax.swing.border.MatteBorder(null));
        a_detail_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_detail_btnActionPerformed(evt);
            }
        });
        jPanel2.add(a_detail_btn);
        a_detail_btn.setBounds(10, 290, 190, 40);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(10, 160, 210, 500);

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
    
    private void searchingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingKeyTyped

        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_searchingKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }

        if(age.getText().length() ==2 ){
            if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
                getToolkit().beep();
                evt.consume();
            }
        }

        if(age.getText().length() == 2){
            age.requestFocusInWindow();

        }
    }//GEN-LAST:event_ageKeyTyped

    private void phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }

        if(phoneno.getText().length() ==11 ){
            if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
                getToolkit().beep();
                evt.consume();
            }
        }

        if(phoneno.getText().length() == 11){
            phoneno.requestFocusInWindow();

        }
    }//GEN-LAST:event_phonenoKeyTyped

    private void salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyTyped

        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_salaryKeyTyped

    private void a_doctor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_doctor_btnActionPerformed
        admin_adddoctor add = new admin_adddoctor();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_doctor_btnActionPerformed

    private void a_nurse_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_nurse_btnActionPerformed
        admin_addnurse ann = new admin_addnurse();
        ann.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_nurse_btnActionPerformed

    private void a_receptionist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_receptionist_btnActionPerformed
        admin_addreceptionist arr = new admin_addreceptionist();
        arr.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_receptionist_btnActionPerformed

    private void a_internall_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_internall_btnActionPerformed
        admin_internal att = new admin_internal();
        att.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_internall_btnActionPerformed

    private void a_salay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_salay_btnActionPerformed
        admin_salary ass = new admin_salary();
        ass.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_salay_btnActionPerformed

    private void a_detail_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_detail_btnActionPerformed
        admin_details adt = new admin_details();
        adt.setVisible(true);
        dispose();
    }//GEN-LAST:event_a_detail_btnActionPerformed

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
            java.util.logging.Logger.getLogger(admin_details_opt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new admin_addreceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_detail_btn;
    private javax.swing.JButton a_doctor_btn;
    private javax.swing.JButton a_internall_btn;
    private javax.swing.JButton a_nurse_btn;
    private javax.swing.JButton a_receptionist_btn;
    private javax.swing.JButton a_salay_btn;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> city1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField phoneno;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JTextField registrationdate;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables

}
