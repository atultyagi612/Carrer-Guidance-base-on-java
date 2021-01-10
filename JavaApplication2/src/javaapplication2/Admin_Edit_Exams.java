
package javaapplication2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Admin_Edit_Exams extends javax.swing.JPanel {
  Connection con=null;
     ResultSet rs=null;
     PreparedStatement ps=null;
    DefaultTableModel model;
    String id,quali,nam,gend ,pas,phon,sno;
    public Admin_Edit_Exams() {
       initComponents();
        try{
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");  
        }
        catch(SQLException e){
            System.out.print(e);
        }
        refresh();
    }
public  void Selected_from_table(){
        int row = tabl.getSelectedRow();   
        tname.setText(tabl.getModel().getValueAt(row,1).toString());
 try{
               ps=con.prepareStatement("select * from examdetail where name =?");
               ps.setString(1,tname.getText());
               rs=ps.executeQuery();
               if(rs.next()){
                   fillabout.setText(rs.getString("about"));
                   filldates.setText(rs.getString("dates"));
                   filleligibility.setText(rs.getString("eligibility"));
                   fillsyllabus.setText(rs.getString("syllabus"));
                   filllink.setText(rs.getString("link"));
               }
             
             else{
                 JOptionPane.showMessageDialog(null,"The Details are not available");
             }
    }
    catch(HeadlessException | SQLException e){
}

   }
   public void refresh(){
    model =(DefaultTableModel)tabl.getModel();
     model.setRowCount(0);
  try{
    ps=con.prepareStatement("Select * from  `examdetail`");
    rs=ps.executeQuery();
    while(rs.next())
    {sno=rs.getString("id");
    nam=rs.getString("name");
    model.addRow(new Object[]{sno,nam});
    }
    }
  catch(SQLException e){
      
  }  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detail = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        fillabout = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        filleligibility = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        fillsyllabus = new javax.swing.JTextArea();
        tname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        filldates = new javax.swing.JTextArea();
        filllink = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        detail.setBackground(new java.awt.Color(255, 255, 255));
        detail.setMaximumSize(new java.awt.Dimension(1300, 560));
        detail.setMinimumSize(new java.awt.Dimension(1300, 560));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("About :-");

        fillabout.setColumns(20);
        fillabout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fillabout.setRows(5);
        fillabout.setBorder(null);
        jScrollPane16.setViewportView(fillabout);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setText("Dates :-");

        filleligibility.setColumns(20);
        filleligibility.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filleligibility.setRows(5);
        filleligibility.setBorder(null);
        jScrollPane17.setViewportView(filleligibility);

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel41.setText("Syllabus :-");

        jScrollPane24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fillsyllabus.setColumns(20);
        fillsyllabus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fillsyllabus.setRows(5);
        fillsyllabus.setBorder(null);
        jScrollPane24.setViewportView(fillsyllabus);

        tname.setEditable(false);
        tname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        filldates.setColumns(20);
        filldates.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filldates.setRows(5);
        jScrollPane1.setViewportView(filldates);

        filllink.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("link");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setText("Eligibility :-");

        tabl.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Exam Name"
            }
        ));
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
        jScrollPane2.setViewportView(tabl);
        if (tabl.getColumnModel().getColumnCount() > 0) {
            tabl.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(detailLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(37, 37, 37)
                            .addComponent(filllink, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailLayout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailLayout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(detailLayout.createSequentialGroup()
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane24))
                                .addGroup(detailLayout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(detailLayout.createSequentialGroup()
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel34))
                        .addGap(26, 26, 26)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailLayout.createSequentialGroup()
                        .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(26, 26, 26)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(filllink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            ps=con.prepareStatement("update examdetail set about=?,dates=?,eligibility=?,syllabus=?,link=? where name=?");
            ps.setString(1,fillabout.getText());
            ps.setString(2,filldates.getText());
            ps.setString(3,filleligibility.getText());
            ps.setString(4,fillsyllabus.getText());
            ps.setString(5,filllink.getText());
            ps.setString(6,tname.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update Successfully");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);

        }

    }//GEN-LAST:event_updateActionPerformed

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked
        Selected_from_table();
    }//GEN-LAST:event_tablMouseClicked

    private void tablKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablKeyReleased
        Selected_from_table(); 
    }//GEN-LAST:event_tablKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detail;
    private javax.swing.JTextArea fillabout;
    private javax.swing.JTextArea filldates;
    private javax.swing.JTextArea filleligibility;
    private javax.swing.JTextField filllink;
    private javax.swing.JTextArea fillsyllabus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JTable tabl;
    private javax.swing.JTextField tname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
