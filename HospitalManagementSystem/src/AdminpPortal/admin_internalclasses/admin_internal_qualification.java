/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminpPortal.admin_internalclasses;

import AdminpPortal.admin_internal;
import DBConnectionP.DBConnection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author AbdulRehman
 */
public class admin_internal_qualification extends javax.swing.JFrame {
        
    
        DBConnection conn = new DBConnection();
    
    
    /**
     * Creates new form admin_internal_qualification
     */
    
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
        
    private ArrayList<admin_internal_classes.qualiclass> userlist(){
        ArrayList<admin_internal_classes.qualiclass> userList = new ArrayList<>();
        try{
            
            conn.OpenConnection();
//            for jtable descending order
//            String selectquery="select * from Qualification";
            String selectquery="select * from Qualification order by qid desc";
            conn.GetData(selectquery);
            admin_internal_classes aic = new admin_internal_classes();
            admin_internal_classes.qualiclass aiq ;
//admin_internal_qualiclass aiq; 
            while(conn.rst.next()){
                aiq = aic.new qualiclass(
                conn.rst.getInt("qid"),
                conn.rst.getInt("qamount"),
                conn.rst.getString("qname")
                );
                userList.add(aiq);
            }
        }catch(SQLException e ){System.out.println(e);}
        return userList;
    }
    
    private void show_data(){
        ArrayList<admin_internal_classes.qualiclass> list = userlist();
        DefaultTableModel model = (DefaultTableModel) qualtable.getModel();
        Object[] row = new Object[3];
        for(int i=0 ; i<list.size() ; i++){
            row[0] = list.get(i).getQid();
            row[1] = list.get(i).getQname();
            row[2] = list.get(i).getQamount();
            model.addRow(row);
        }
     }
    
    
    public admin_internal_qualification() {
        initComponents();
        show_data();
        showdate();
        showtime();
        qal_amount_error.setVisible(false);
        qal_name_error.setVisible(false);
        Updatedata.setVisible(false);
//        select * from Qualification ORDER BY qid DESC Fetch first 1 rows only;
        qid_tv.setText(conn.getID("select * from Qualification ORDER BY qid DESC Fetch first 1 rows only"));
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
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        registrationdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        qualtable = new javax.swing.JTable();
        qid_tv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searching = new javax.swing.JTextField();
        qamount_ed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        qname_ed = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        adddata = new javax.swing.JButton();
        allreset = new javax.swing.JButton();
        qal_amount_error = new javax.swing.JLabel();
        qal_name_error = new javax.swing.JLabel();
        Updatedata = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        i_addqualification = new javax.swing.JButton();
        i_addroomcate = new javax.swing.JButton();
        i_addrooms = new javax.swing.JButton();
        i_addward = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

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

        timegetting.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timegetting.setText("Time");
        jPanel4.add(timegetting);
        timegetting.setBounds(490, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        registrationdate.setEditable(false);
        registrationdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrationdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        registrationdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(registrationdate);
        registrationdate.setBounds(230, 20, 140, 30);

        qualtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QID", "Cur-Qul", "Amt-P-Qul"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        qualtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qualtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(qualtable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(420, 140, 270, 290);

        qid_tv.setEditable(false);
        qid_tv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qid_tv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qid_tv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(qid_tv);
        qid_tv.setBounds(160, 100, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Qual-ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 70, 50, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Current Qualification");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 120, 30);

        searching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        searching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchingKeyTyped(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(420, 100, 70, 30);

        qamount_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qamount_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        qamount_ed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qamount_edKeyTyped(evt);
            }
        });
        jPanel1.add(qamount_ed);
        qamount_ed.setBounds(160, 220, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Amount Per Qual");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 100, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Reset");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton5);
        jButton5.setBounds(610, 100, 60, 30);

        qname_ed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qname_ed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.add(qname_ed);
        qname_ed.setBounds(160, 160, 150, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Check");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jButton7);
        jButton7.setBounds(520, 100, 60, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Qualification ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 100, 90, 30);

        adddata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adddata.setText("Add");
        adddata.setBorder(new javax.swing.border.MatteBorder(null));
        adddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddataActionPerformed(evt);
            }
        });
        jPanel1.add(adddata);
        adddata.setBounds(130, 410, 100, 30);

        allreset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        allreset.setText("Reset");
        allreset.setBorder(new javax.swing.border.MatteBorder(null));
        allreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allresetActionPerformed(evt);
            }
        });
        jPanel1.add(allreset);
        allreset.setBounds(250, 100, 60, 30);

        qal_amount_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qal_amount_error.setForeground(new java.awt.Color(255, 0, 0));
        qal_amount_error.setText("*");
        jPanel1.add(qal_amount_error);
        qal_amount_error.setBounds(320, 230, 10, 17);

        qal_name_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qal_name_error.setForeground(new java.awt.Color(255, 0, 0));
        qal_name_error.setText("*");
        jPanel1.add(qal_name_error);
        qal_name_error.setBounds(320, 170, 10, 17);

        Updatedata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Updatedata.setText("Update");
        Updatedata.setBorder(new javax.swing.border.MatteBorder(null));
        Updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatedataActionPerformed(evt);
            }
        });
        jPanel1.add(Updatedata);
        Updatedata.setBounds(250, 410, 100, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(230, 160, 700, 500);

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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Add Qualification");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(430, 130, 200, 30);

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

    private void i_addwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_addwardActionPerformed
        admin_internal_ward aw = new admin_internal_ward();
        aw.setVisible(true);
        dispose();
    }//GEN-LAST:event_i_addwardActionPerformed

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

    private void searchingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_searchingKeyTyped

    private void qamount_edKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qamount_edKeyTyped
       char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)  || (c==KeyEvent.VK_DELETE) )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_qamount_edKeyTyped

    private void adddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddataActionPerformed
        Boolean chkempty = false;
        if(qname_ed.getText().isEmpty() ){ chkempty = false; qal_name_error.setVisible(true);}
        if(qamount_ed.getText().isEmpty()){chkempty = false; qal_amount_error.setVisible(true);}
        if(!qamount_ed.getText().isEmpty() && !qname_ed.getText().isEmpty()){ chkempty=true;}
        if(chkempty==false){ JOptionPane.showMessageDialog(null, "Please Fill the Fileds");}
        
        if(chkempty == true){
            qal_name_error.setVisible(false);
            qal_amount_error.setVisible(false);
            try{
                conn.OpenConnection();
                String query="insert into Qualification (qname,qamount) values ('"+qname_ed.getText()+"',"+Integer.parseInt(qamount_ed.getText())+")";
                int flag = conn.InsertUpdateDelete(query);
                if(flag==1){
                    JOptionPane.showMessageDialog(null,"Successfully Inserted..!");
                    qname_ed.setText("");
                    qamount_ed.setText("");
                    DefaultTableModel model = (DefaultTableModel) qualtable.getModel();
                    qid_tv.setText(conn.getID("select * from Qualification ORDER BY qid DESC Fetch first 1 rows only"));
                    model.setRowCount(0);
                    show_data();
                    conn.CloseConnection();
                }
            }catch( Exception e ){System.out.println(e);}
        }
    }//GEN-LAST:event_adddataActionPerformed

    private void qualtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qualtableMouseClicked
        Updatedata.setVisible(true);
        int i = qualtable.getSelectedRow();
        TableModel model = qualtable.getModel();
        qid_tv.setText(model.getValueAt(i,0).toString());
        qname_ed.setText(model.getValueAt(i, 1).toString());
        qamount_ed.setText(model.getValueAt(i, 2).toString());
        adddata.setVisible(false);
    }//GEN-LAST:event_qualtableMouseClicked

    private void allresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allresetActionPerformed
        qid_tv.setText(conn.getID("select * from Qualification ORDER BY qid DESC Fetch first 1 rows only"));
        qname_ed.setText("");
        qamount_ed.setText("");
        qal_amount_error.setVisible(false);
        qal_name_error.setVisible(false);
        adddata.setVisible(true);
        Updatedata.setVisible(false);
    }//GEN-LAST:event_allresetActionPerformed

    private void UpdatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatedataActionPerformed
        
        Boolean chkempty = false;
        if(qname_ed.getText().isEmpty() ){ chkempty = false; qal_name_error.setVisible(true);}
        if(qamount_ed.getText().isEmpty()){chkempty = false; qal_amount_error.setVisible(true);}
        if(!qamount_ed.getText().isEmpty() && !qname_ed.getText().isEmpty()){ chkempty=true;}
        if(chkempty==false){ JOptionPane.showMessageDialog(null, "Please Fill the Fileds");}
       
        String qnameq=qname_ed.getText();
        int qamountq = Integer.parseInt(qamount_ed.getText());
       
        if(chkempty == true){
            try{
            qal_name_error.setVisible(false);
            qal_amount_error.setVisible(false);   
            conn.OpenConnection();
            int row = qualtable.getSelectedRow();
            int value = Integer.parseInt((qualtable.getModel().getValueAt(row, 0).toString()));
            String query = ("update Qualification set qname='"+qnameq+"' , qamount="+qamountq+" where qid="+value);
            int flag = conn.InsertUpdateDelete(query);
                if(flag==1){
                    JOptionPane.showMessageDialog(null,"Successfully Updated..!");
                    qname_ed.setText("");
                    qamount_ed.setText("");
                    DefaultTableModel model1 = (DefaultTableModel) qualtable.getModel();
                    qid_tv.setText(conn.getID("select * from Qualification ORDER BY qid DESC Fetch first 1 rows only"));
                    model1.setRowCount(0);
                    show_data();
                    adddata.setVisible(true);
                    conn.CloseConnection();
                    Updatedata.setVisible(false);
                }
            }catch(Exception e ){System.out.println(e);}
        }
        
    }//GEN-LAST:event_UpdatedataActionPerformed

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
            java.util.logging.Logger.getLogger(admin_internal_qualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_internal_qualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_internal_qualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_internal_qualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new admin_internal_qualification().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Updatedata;
    private javax.swing.JButton adddata;
    private javax.swing.JButton allreset;
    private javax.swing.JButton back;
    private javax.swing.JButton i_addqualification;
    private javax.swing.JButton i_addroomcate;
    private javax.swing.JButton i_addrooms;
    private javax.swing.JButton i_addward;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qal_amount_error;
    private javax.swing.JLabel qal_name_error;
    private javax.swing.JTextField qamount_ed;
    private javax.swing.JTextField qid_tv;
    private javax.swing.JTextField qname_ed;
    private javax.swing.JTable qualtable;
    private javax.swing.JTextField registrationdate;
    private javax.swing.JTextField searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}
