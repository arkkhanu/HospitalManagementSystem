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
public class admin_salary extends javax.swing.JFrame {

    /**
     * Creates new form admin_salary
     */
    public admin_salary() {
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
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        registrationdate = new javax.swing.JTextField();
        salarytype = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        searching = new javax.swing.JTextField();
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
        timegetting.setBounds(510, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("Generate Salary");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton6);
        jButton6.setBounds(110, 430, 140, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Status");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 370, 40, 30);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(260, 20, 140, 30);

        salarytype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salarytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Doctor", "Receptionist", "Nurse" }));
        jPanel1.add(salarytype);
        salarytype.setBounds(110, 80, 140, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField10);
        jTextField10.setBounds(110, 240, 140, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Check");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton7);
        jButton7.setBounds(190, 160, 60, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("ID of Employee ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 90, 94, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("E-F-Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 200, 60, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField11);
        jTextField11.setBounds(110, 280, 140, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(110, 200, 140, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("E-L-Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 240, 60, 30);

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(110, 160, 70, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Salary");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 280, 40, 30);

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField14);
        jTextField14.setBounds(110, 370, 140, 30);

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton12.setText("Get");
        jButton12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton12);
        jButton12.setBounds(210, 330, 40, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 330, 30, 30);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField15);
        jTextField15.setBounds(110, 330, 90, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Salary ID");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 120, 60, 30);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(jTextField16);
        jTextField16.setBounds(110, 120, 140, 30);

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
                {null, null, null, null, null}
            },
            new String [] {
                "SalID", "E-ID", "Month", "Salary", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 160, 370, 300);

        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton15.setText("Print");
        jButton15.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton15);
        jButton15.setBounds(600, 120, 60, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("ID of Employee ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 160, 94, 30);

        jButton16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton16.setText("Check");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton16);
        jButton16.setBounds(430, 120, 60, 30);

        jButton17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton17.setText("Reset");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton17);
        jButton17.setBounds(520, 120, 60, 30);

        searching.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searching.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        searching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchingKeyTyped(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(310, 120, 100, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(230, 160, 700, 500);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Salary");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(520, 120, 90, 40);

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

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
       
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField13KeyTyped

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
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_detail_btn;
    private javax.swing.JButton a_doctor_btn;
    private javax.swing.JButton a_internall_btn;
    private javax.swing.JButton a_nurse_btn;
    private javax.swing.JButton a_receptionist_btn;
    private javax.swing.JButton a_salay_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField registrationdate;
    private javax.swing.JComboBox<String> salarytype;
    private javax.swing.JTextField searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
