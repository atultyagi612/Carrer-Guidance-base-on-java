/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deadpooltyagi
 */
public class Admin_Add_Courses extends javax.swing.JPanel {
String id,quali,nam,gend ,pas,phon,sno; 
    int ag;
    Connection con=null;
     ResultSet rs=null;
     PreparedStatement ps=null;
     String stream1;
     DefaultTableModel model;
     String sql,names;
    public Admin_Add_Courses() {
        initComponents();
        try{
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");  
        }
        catch(SQLException e){
            System.out.print(e);
        }
        set.setVisible(false);
  update.setVisible(false);
    }
public  void Selected_from_table(){
        int row = tabl.getSelectedRow();
        
        serial.setText(tabl.getModel().getValueAt(row,0).toString());
        name.setText(tabl.getModel().getValueAt(row,1).toString());
        if(name.getText().equals("")){
         set.setVisible(true);
          update.setVisible(false);
       }
     else{
    set.setVisible(false);
    update.setVisible(true);
}
 try{
               ps=con.prepareStatement("select * from course_detail where Names =?");
               ps.setString(1,name.getText());
               rs=ps.executeQuery();
               if(rs.next()){
                   about.setText(rs.getString("About"));
                   year.setText(rs.getString("year"));
               }
             
             else{
                 JOptionPane.showMessageDialog(null,"The Details are not available");
                 about.setText("Enter description");
                 year.setText("Enter year");
             }
    }
    catch(HeadlessException | SQLException e){
}

   }
public void refresh(){
    model =(DefaultTableModel)tabl.getModel();
     stream1=(String) stream.getSelectedItem();
     model.setRowCount(0);
  try{
    ps=con.prepareStatement("Select * from courses1");
    rs=ps.executeQuery();
    while(rs.next())
    {sno=rs.getString("id");
    nam=rs.getString(stream1);
    model.addRow(new Object[]{sno,nam});
    }
    }
  catch(SQLException e){
      
  }  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        about = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        stream = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        set = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        about.setColumns(20);
        about.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        about.setRows(5);
        about.setText("Enter description");
        about.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aboutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aboutFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(about);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Year :- ");

        year.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        year.setText("Enter year");
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name.setText("name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(year)
                .addGap(161, 161, 161))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(name)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        stream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-Medical", "Medical", "Management", "Commerce", "Arts and Humanities", "Other Professional Courses" }));
        stream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streamActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Exam Names"
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
        jScrollPane2.setViewportView(tabl);
        if (tabl.getColumnModel().getColumnCount() > 0) {
            tabl.getColumnModel().getColumn(0).setMinWidth(70);
            tabl.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabl.getColumnModel().getColumn(0).setMaxWidth(70);
            tabl.getColumnModel().getColumn(1).setPreferredWidth(15);
        }

        jButton1.setText("Add empty Row");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("For insert , First you want to add a new empty row");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("S No.");

        serial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        set.setText("Add new Course");
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });

        jButton2.setText("help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/etc.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(265, 265, 265)
                                    .addComponent(stream, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)
                                    .addGap(63, 63, 63)
                                    .addComponent(search)
                                    .addGap(123, 123, 123)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(set)
                                    .addGap(57, 57, 57)
                                    .addComponent(delete)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(stream, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(delete)
                                    .addComponent(search)
                                    .addComponent(update)
                                    .addComponent(set))))
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
try {
     stream1=(String) stream.getSelectedItem();
    String sql="SELECT * FROM courses1 where `"+stream1+"`=?";
    System.out.print(sql);
             ps=con.prepareStatement(sql);
              ps.setString(1,name.getText());
             rs=ps.executeQuery();
           
             if(rs.next()){
               serial.setText(rs.getString("id"));
               ps=con.prepareStatement("select * from course_detail where Names =?");
               ps.setString(1,name.getText());
               rs=ps.executeQuery();
               if(rs.next()){
                   about.setText(rs.getString("About"));
                   year.setText(rs.getString("year"));
               }
             }
             else{
                 JOptionPane.showMessageDialog(null,"Not Found!");
             }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }    
  update.setVisible(true);
   set.setVisible(false);
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      if(serial.getText().equals("")){
         JOptionPane.showMessageDialog(null,"please select a row from table");
       }else{
        sql="update  courses1  SET`"+stream1+"` =? where id=?";
        try {
            if(names==""){
                names=name.getText();
            }
             ps=con.prepareStatement(sql);
             ps.setString(1,name.getText());
             ps.setString(2,serial.getText());
             ps.executeUpdate();
             ps=con.prepareStatement("update  course_detail  SET About=? , year=? ,Names =? where Names=?");
              ps.setString(1,about.getText());
              ps.setString(2,year.getText());
              ps.setString(3,name.getText());
               ps.setString(4,names);
             ps.executeUpdate();
             names="";
           JOptionPane.showMessageDialog(null,"Update succesfull");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }}
    
      refresh();
    }//GEN-LAST:event_updateActionPerformed

    private void streamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streamActionPerformed
refresh(); 
  
    }//GEN-LAST:event_streamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{
               
             ps=con.prepareStatement("INSERT INTO `courses1` (`id`, `Non-Medical`, `Medical`, `Management`, `Commerce`, `Arts and Humanities`, `Other Professional Courses`) VALUES (NULL, '', '', '', '', '', '');"); 
             ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"sucess");
           }
           catch(SQLException e){
               JOptionPane.showMessageDialog(null,e);
               
           }
 refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked
       Selected_from_table();
       
    }//GEN-LAST:event_tablMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         sql="update  courses1  SET`"+stream1+"` =? where id=?";
        try {
             ps=con.prepareStatement(sql);
             System.out.println(sql);
             ps.setString(1,"");
             ps.setString(2,serial.getText());
             ps.executeUpdate();
            
            ps=con.prepareStatement("delete from `course_detail` where Names=?");
            ps.setString(1,name.getText());
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }catch (Exception ex) {
            System.out.print(ex);
        }
        refresh();
    }//GEN-LAST:event_deleteActionPerformed

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed

       if(serial.getText().equals("")){
         JOptionPane.showMessageDialog(null,"please select a row from table");
       }else{
        sql="update  courses1  SET `"+stream1+"` =? where id=?";
        try {
             ps=con.prepareStatement(sql);
             ps.setString(1,name.getText());
             ps.setString(2,serial.getText());
             ps.executeUpdate();
   
             ps=con.prepareStatement("INSERT INTO `course_detail` (`Names`, `About`, `year`) VALUES ( '"+name.getText()+"', '"+about.getText()+"', '"+year.getText()+"');");
             ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Insert succesfull");
            
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }}
    refresh();
    }//GEN-LAST:event_setActionPerformed

    private void aboutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aboutFocusGained
       if(about.getText().trim().equals("Enter description")){
           about.setText("");
       }
           
    }//GEN-LAST:event_aboutFocusGained

    private void aboutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aboutFocusLost
        if(about.getText().trim().equals("")){
           about.setText("Enter description");
        }
    }//GEN-LAST:event_aboutFocusLost

    private void yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusGained
       if(year.getText().trim().equals("Enter year")){
           year.setText("");
       }
    }//GEN-LAST:event_yearFocusGained

    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
       if(year.getText().trim().equals("")){
           year.setText("Enter year");
       }
    }//GEN-LAST:event_yearFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
      names=name.getText();
    }//GEN-LAST:event_nameFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(null,"If the details are not available of a exam then just delete it and and set new "
               + "any other proble");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         JOptionPane.showMessageDialog(null,"<html>   1. Search <br> you can search a course by selecting stream at top and then by providing course name<br>Also you can select courses of selected stream  from table at right side  <br><br>"
                 + "2. Update<br> you can update a college info  after selecting it fron table <br><br>"
                 + "3. Add Course  <br> you can add new college by selecting a empty row from the table<br>if there is no empty row in the table just click to <br>"
                 + "ADD EMPTY COLUMN to add a empty column<br><br>4. Delete <br>By delete the row of that course is set to empty and you can add new course later by selecting<br> that empty row </html>");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tablKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablKeyReleased
        Selected_from_table();
    }//GEN-LAST:event_tablKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea about;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JButton search;
    private javax.swing.JLabel serial;
    private javax.swing.JButton set;
    private javax.swing.JComboBox<String> stream;
    private javax.swing.JTable tabl;
    private javax.swing.JButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
