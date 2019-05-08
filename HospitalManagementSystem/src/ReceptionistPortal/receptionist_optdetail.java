/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

import DBConnectionP.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_optdetail extends javax.swing.JFrame {

   
    public ArrayList<receptionist_optdetailjavaclass> userlist(){
        ArrayList<receptionist_optdetailjavaclass> userList = new ArrayList<>();
        try{
            DBConnectionP.DBConnection conn = new DBConnection();
            conn.OpenConnection();
            String sql = "select * from ark";
            conn.GetData(sql);
            receptionist_optdetailjavaclass rpd ;
            while(conn.rst.next()){
                rpd = new receptionist_optdetailjavaclass(
                        conn.rst.getInt("optid"),
                        conn.rst.getInt("pid"),
                        conn.rst.getInt("age"),
                        conn.rst.getString("pfn"),
                        conn.rst.getString("pln"),
                        conn.rst.getString("gender"),
                        conn.rst.getString("doctor")
                );
               userList.add(rpd);
            }
            
        }catch(SQLException e ){System.out.println(e);}
     return userList;   
    }
    
    public void show_user(){
    
        ArrayList<receptionist_optdetailjavaclass> list = userlist();
        DefaultTableModel model = (DefaultTableModel) jTable_opt.getModel();
        Object[] row = new Object[7];
        for(int i=0 ; i<list.size() ; i++){
            row[0] = list.get(i).getOptid();
            row[1] = list.get(i).getPno();
            row[2] = list.get(i).getP_f_name();
            row[3] = list.get(i).getP_l_name();
            row[4] = list.get(i).getAe();
            row[5] = list.get(i).getGender();
            row[6] = list.get(i).getDoctorname();
            model.addRow(row);
        }
           
    }
    
    private void fillcombo(){
        try{
            String query = "select * from rk";
            DBConnection conn = new DBConnection();
            conn.OpenConnection();
            conn.GetData(query);
            while(conn.rst.next()){
                String value = conn.rst.getString("c2");
                optidcombo.addItem(value);
            }
            conn.CloseConnection();
        }catch(SQLException e ){System.out.println(e);}
    }
    
    public receptionist_optdetail() {
        initComponents();
        show_user();
        fillcombo();
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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timegetting = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_opt = new javax.swing.JTable();
        optidcombo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        searching = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        patientidd1 = new javax.swing.JLabel();
        patientidd2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Register Patient");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 30, 190, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Admit Patient");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 150, 190, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Bill for Admit");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 210, 190, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("OPT Patient Detail");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton7);
        jButton7.setBounds(10, 330, 190, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Admited Patient Detail");
        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton8);
        jButton8.setBounds(10, 270, 190, 40);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Check Room");
        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton9);
        jButton9.setBounds(10, 90, 190, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("Change Password");
        jButton10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jButton10);
        jButton10.setBounds(10, 430, 190, 40);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(20, 170, 210, 490);

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
        timegetting.setBounds(440, 10, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jTable_opt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OptID", "P No", "P-F-Name", "P-L-Name", "Age", "Gender", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(jTable_opt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 630, 270);

        optidcombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        optidcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one" }));
        optidcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optidcomboActionPerformed(evt);
            }
        });
        jPanel1.add(optidcombo);
        optidcombo.setBounds(90, 130, 130, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(260, 130, 130, 30);

        searching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searching.setText("Search");
        jPanel1.add(searching);
        searching.setBounds(410, 130, 130, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("OPT ID/Contact NO");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(90, 100, 130, 20);

        patientidd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd1.setText("Null");
        jPanel1.add(patientidd1);
        patientidd1.setBounds(570, 30, 50, 20);

        patientidd2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientidd2.setText("Null");
        jPanel1.add(patientidd2);
        patientidd2.setBounds(570, 60, 50, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Reception Name : ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 60, 110, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Reception ID : ");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(450, 30, 100, 20);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(260, 170, 660, 490);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void optidcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optidcomboActionPerformed
        
//        String ss = optidcombo.getSelectedItem().toString();
//        patientidd1.setText(ss);
          
          String data = optidcombo.getSelectedItem().toString();
          if(!data.equals("Select one")){
             patientidd2.setText(data);
          }
          else{
              patientidd2.setText(data);
          }
        
        
    }//GEN-LAST:event_optidcomboActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receptionist_optdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_opt;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> optidcombo;
    private javax.swing.JLabel patientidd1;
    private javax.swing.JLabel patientidd2;
    private javax.swing.JButton searching;
    private javax.swing.JLabel timegetting;
    // End of variables declaration//GEN-END:variables
}