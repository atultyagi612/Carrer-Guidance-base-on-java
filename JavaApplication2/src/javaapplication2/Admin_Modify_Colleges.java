/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Arrays.stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deadpooltyagi
 */
public class Admin_Modify_Colleges extends javax.swing.JPanel {
String sno,name,selectedcollege;
    DefaultTableModel model;
      Connection con=null;
     ResultSet rs=null;
     PreparedStatement ps=null;
    public Admin_Modify_Colleges() {
        initComponents();
         try {
            initComponents();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
         refresh();
         delete.setVisible(false);
    }
    
    
    public void refresh(){
       model = (DefaultTableModel)tabl.getModel();
     model.setRowCount(0);
  try{
    ps=con.prepareStatement("Select * from ccollegenames");
    rs=ps.executeQuery();
    while(rs.next())
    {sno=rs.getString("id");
    name=rs.getString("Names");
    model.addRow(new Object[]{sno,name});
    }
    }
  catch(SQLException e){
      
  }  
}
    
    public  void Selected_from_table(){
        int row = tabl.getSelectedRow();
college_no.setText(tabl.getModel().getValueAt(row,0).toString());
setcollegename.setText(tabl.getModel().getValueAt(row,1).toString());
 
try{
    ps=con.prepareStatement("select * from ccollegenames where id=?");
    ps.setString(1,college_no.getText());
    rs=ps.executeQuery();
    if(rs.next()){
        taccepted_exams.setText(rs.getString("accepted_exams"));
        townership.setText(rs.getString("ownership"));
        tlocation.setText(rs.getString("location"));
        taffiliated.setText(rs.getString("affiliated"));
        url.setText(rs.getString("url"));
        
    }
}catch(SQLException e){
    
}

   }
    public void updatecollege(){
    try {
        ps=con.prepareStatement("update ccollegenames set names =? ,location =? , affiliated =? , ownership =? , `accepted_exams` =? ,url =? where id=?");
        ps.setString(1,setcollegename.getText());
        ps.setString(2,tlocation.getText());
        ps.setString(3,taffiliated.getText());
        ps.setString(4,townership.getText());
        ps.setString(5,taccepted_exams.getText());
        ps.setString(6,url.getText());
        ps.setString(7,college_no.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Sucessfull updated");
    }
    catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex);
        Logger.getLogger(Admin_Modify_Colleges.class.getName()).log(Level.SEVERE, null, ex);
    }
                
    }
    public void delete(){
    try {
        ps=con.prepareStatement("DELETE FROM `ccollegenames` WHERE id=?");
        ps.setString(1,college_no.getText());
        ps.executeUpdate();
        ps=con.prepareStatement("DELETE FROM `courselinkcollege` WHERE collegeId =?");
        ps.setString(1,college_no.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Deleted successfully");
    } catch (SQLException ex) {
        Logger.getLogger(Admin_Modify_Colleges.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        college_no = new javax.swing.JLabel();
        setcollegename = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        taccepted_exams = new javax.swing.JTextField();
        townership = new javax.swing.JTextField();
        tlocation = new javax.swing.JTextField();
        taffiliated = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Affiliated To :- ");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Location :-");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Ownership :-");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Exams Accepted :- ");

        college_no.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        setcollegename.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        setcollegename.setText("College Name");
        setcollegename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setcollegenameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                setcollegenameFocusLost(evt);
            }
        });

        jLabel1.setText("url");

        taccepted_exams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taccepted_examsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tlocation, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(taffiliated)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(54, 54, 54)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(townership, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(taccepted_exams)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(college_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setcollegename, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setcollegename, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(college_no, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(taccepted_exams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(townership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(taffiliated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "College Names"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablMouseClicked(evt);
            }
        });
        tabl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabl);
        if (tabl.getColumnModel().getColumnCount() > 0) {
            tabl.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(119, 119, 119)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(delete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setcollegenameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setcollegenameFocusGained
        if(setcollegename.getText().trim().equals("College Name"))
        setcollegename.setText("");
    }//GEN-LAST:event_setcollegenameFocusGained

    private void setcollegenameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setcollegenameFocusLost
        if(setcollegename.getText().trim().equals(""))
        setcollegename.setText("College Name");
    }//GEN-LAST:event_setcollegenameFocusLost

    private void taccepted_examsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taccepted_examsActionPerformed

    }//GEN-LAST:event_taccepted_examsActionPerformed

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked
Selected_from_table();   
delete.setVisible(true);
    }//GEN-LAST:event_tablMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
updatecollege();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void tablKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablKeyReleased
       Selected_from_table();
    }//GEN-LAST:event_tablKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel college_no;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField setcollegename;
    private javax.swing.JTable tabl;
    private javax.swing.JTextField taccepted_exams;
    private javax.swing.JTextField taffiliated;
    private javax.swing.JTextField tlocation;
    private javax.swing.JTextField townership;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
