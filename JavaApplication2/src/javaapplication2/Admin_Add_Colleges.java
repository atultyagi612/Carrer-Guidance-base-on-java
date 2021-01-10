
package javaapplication2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class Admin_Add_Colleges extends javax.swing.JPanel {

     Connection con=null;
     ResultSet rs=null;
     PreparedStatement ps=null;
     String collegeid;
    public Admin_Add_Colleges() {
        initComponents();
         try{
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");  
        }
        catch(SQLException e){
            System.out.print(e);
        }
         fill_jlist();
    }
    public void fill_jlist(){
         LinkedList<String>  list=new LinkedList<>();
        DefaultListModel model=new DefaultListModel();
        try{
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");
             ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Non-Medical"));
              }
               ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Medical"));
              }
               ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Management"));
              }
               ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Commerce"));
              }
               ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Arts and Humanities"));
              }
               ps=con.prepareStatement("Select * from courses1"); 
             rs=ps.executeQuery();
              while(rs.next()){
               list.add(rs.getString("Other Professional Courses"));
              }
        }
        catch(SQLException e ){
            
        }
        int i;
        for(i=0;i<list.size();i++){
        model.addElement(list.get(i));
         }
        list1.setModel(model);
           
    }
    public void Add_College(){
         try{
       
         ps=con.prepareStatement("insert into ccollegenames (id,names,location,affiliated,ownership,accepted_exams,url) Values(null,'"+setcollegename.getText()+"',"
                 + "'"+tlocation.getText()+"','"+taffiliated.getText()+"','"+townership.getText()+"','"+taccepted_exams.getText()+"','"+url.getText()+"')");
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Sucess");
        
        ps=con.prepareStatement("select * from ccollegenames where names=?");
        ps.setString(1,setcollegename.getText());
        rs=ps.executeQuery();
        if(rs.next()){
            collegeid=rs.getString("id");
            JOptionPane.showMessageDialog(null,"Alloted id will be "+rs.getString("id"));
        }
     }
     
     catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null,e);
     }
         
         
         
        LinkedList<String>  list2=new LinkedList<>(list1.getSelectedValuesList());
 LinkedList<String>  list3=new LinkedList<>();
 
      System.out.print(list2+""+list2.size()); 
      for(int i=0;i<list2.size();i++){
      try{
          ps=con.prepareStatement("select * from `course_detail` where Names =?");
          ps.setString(1,list2.get(i));
          rs=ps.executeQuery();
          if(rs.next()){
              list3.add(rs.getString("id"));
          }
      }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }}
      for(int i=0;i<list3.size();i++){
      try{
          ps=con.prepareStatement("INSERT INTO courselinkcollege (courseId,collegeId) VALUES( '"+list3.get(i)+"', '"+collegeid+"');"); 
          ps.executeUpdate();
      }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }}
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
        link = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id_of_college = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));
        setPreferredSize(new java.awt.Dimension(1300, 560));

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

        link.setText("Add College");
        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });

        list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list1.setToolTipText("");
        list1.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        list1.setMaximumSize(new java.awt.Dimension(39, 100));
        list1.setMinimumSize(new java.awt.Dimension(39, 1));
        list1.setSelectedIndex(12);
        list1.setSelectedIndices(new int[] {12});
        list1.setVisibleRowCount(19);
        jScrollPane1.setViewportView(list1);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Select Courses");

        jButton1.setText("Add Courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("College id :- ");

        jButton2.setText("Delete All Assign Courses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/etc.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/etc.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43)
                                .addComponent(id_of_college, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id_of_college, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
Add_College();    
     
    }//GEN-LAST:event_linkActionPerformed

    private void taccepted_examsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taccepted_examsActionPerformed
      
    }//GEN-LAST:event_taccepted_examsActionPerformed

    private void setcollegenameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setcollegenameFocusGained
       if(setcollegename.getText().trim().equals("College Name"))
           setcollegename.setText("");
    }//GEN-LAST:event_setcollegenameFocusGained

    private void setcollegenameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setcollegenameFocusLost
         if(setcollegename.getText().trim().equals(""))
           setcollegename.setText("College Name");
    }//GEN-LAST:event_setcollegenameFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  LinkedList<String>  list2=new LinkedList<>(list1.getSelectedValuesList());
 LinkedList<String>  list3=new LinkedList<>();
 
      System.out.print(list2+""+list2.size()); 
      for(int i=0;i<list2.size();i++){
      try{
          ps=con.prepareStatement("select * from `course_detail` where Names =?");
          ps.setString(1,list2.get(i));
          rs=ps.executeQuery();
          if(rs.next()){
              list3.add(rs.getString("id"));
          }
      }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }}
      for(int i=0;i<list3.size();i++){
      try{
          ps=con.prepareStatement("INSERT INTO courselinkcollege (courseId,collegeId) VALUES( '"+list3.get(i)+"', '"+id_of_college.getText()+"');"); 
          ps.executeUpdate();
         
      }
      
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }}
     JOptionPane.showMessageDialog(null,"Sucessfully added courses "+ list1.getSelectedValuesList()+"to college id "+id_of_college.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
     
      try{
          ps=con.prepareStatement("DELETE FROM `courselinkcollege` WHERE collegeId = ?"); 
          ps.setString(1,id_of_college.getText());
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Sucessfully Delete assign  courses ");
      }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       JOptionPane.showMessageDialog(null,"<html>1. Add Courses :- <br>  you can add courses to a college by prividing college id <br> you can get college id in modify college page<br><br>"
               + "2. Delete All Assign Courses :- <br> to add new courses to a college you must first delete all assign courses <br>and the add courses by Add Courses button </html>");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         JOptionPane.showMessageDialog(null,"<html>1. Add Colleges :- <br> You can add college by providing its  detains<br> and select provided courses from right side table <br> <br> for select multiple courses use   "
                 + "ctrl</html>");
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel college_no;
    private javax.swing.JTextField id_of_college;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton link;
    private javax.swing.JList<String> list1;
    private javax.swing.JTextField setcollegename;
    private javax.swing.JTextField taccepted_exams;
    private javax.swing.JTextField taffiliated;
    private javax.swing.JTextField tlocation;
    private javax.swing.JTextField townership;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
