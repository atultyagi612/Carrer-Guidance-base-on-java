
package javaapplication2;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Admin_page extends javax.swing.JFrame {
     Admin_Add_Colleges colleges;
     Admin_Add_Courses courses;
     Admin_Edit_Exams   exams;
     Admin_User_Details userdetail;
     Admin_Modify_Colleges modify;
      GridBagLayout layout=new GridBagLayout(); 
      
     
    Border border;
    public Admin_page() {
        initComponents();
        border = BorderFactory.createLineBorder(Color.white,3,true);
        modify=new Admin_Modify_Colleges();
        colleges=new Admin_Add_Colleges();
        courses=new  Admin_Add_Courses();
        exams=new Admin_Edit_Exams();
        userdetail =new  Admin_User_Details();
        
         GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        jPanel1.setLayout(layout); 
        jPanel1.add(userdetail);
        jPanel1.add(exams);
        jPanel1.add(courses);
        jPanel1.add(colleges);
        jPanel1.add(modify);
        falseall(User_Details); 
        userdetail.setVisible(true);
    }

    public final void falseall(JLabel tru){
        
         userdetail.setVisible(false);
         exams.setVisible(false);
         courses.setVisible(false);
         colleges.setVisible(false);
         modify.setVisible(false);
        
        Add_Courses.setForeground(Color. white);
      Modify_Colleges.setForeground(Color.white);
       Add_Colleges.setForeground(Color. white);
       Edit_Exams.setForeground(Color. white);
       User_Details.setForeground(Color. white);
       
       
         Modify_Colleges.setBorder(null);
       Add_Courses.setBorder(null);
       Edit_Exams.setBorder(null);
       Add_Colleges.setBorder(null);
       User_Details.setBorder(null); 
       
       
       
    tru.setVisible(true);
    tru.setBorder(border);
    tru.setForeground(Color. lightGray);
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Add_Courses = new javax.swing.JLabel();
        Edit_Exams = new javax.swing.JLabel();
        User_Details = new javax.swing.JLabel();
        Add_Colleges = new javax.swing.JLabel();
        Modify_Colleges = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 80, 161));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>Carrer<br>Guidance</html>");

        Add_Courses.setBackground(new java.awt.Color(255, 255, 255));
        Add_Courses.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Add_Courses.setForeground(new java.awt.Color(255, 255, 255));
        Add_Courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/courses.png"))); // NOI18N
        Add_Courses.setText("Add Courses ");
        Add_Courses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_CoursesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_CoursesMouseEntered(evt);
            }
        });

        Edit_Exams.setBackground(new java.awt.Color(255, 255, 255));
        Edit_Exams.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Edit_Exams.setForeground(new java.awt.Color(255, 255, 255));
        Edit_Exams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/test.png"))); // NOI18N
        Edit_Exams.setText("Edit  Exams   ");
        Edit_Exams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_ExamsMouseClicked(evt);
            }
        });

        User_Details.setBackground(new java.awt.Color(255, 255, 255));
        User_Details.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        User_Details.setForeground(new java.awt.Color(255, 255, 255));
        User_Details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/user.png"))); // NOI18N
        User_Details.setText("User Details");
        User_Details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_DetailsMouseClicked(evt);
            }
        });

        Add_Colleges.setBackground(new java.awt.Color(255, 255, 255));
        Add_Colleges.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Add_Colleges.setForeground(new java.awt.Color(255, 255, 255));
        Add_Colleges.setText("Add Colleges");
        Add_Colleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_CollegesMouseClicked(evt);
            }
        });

        Modify_Colleges.setBackground(new java.awt.Color(255, 255, 255));
        Modify_Colleges.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Modify_Colleges.setForeground(new java.awt.Color(255, 255, 255));
        Modify_Colleges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/courses.png"))); // NOI18N
        Modify_Colleges.setText("Modify Colleges");
        Modify_Colleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modify_CollegesMouseClicked(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Add_Courses, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add_Colleges, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modify_Colleges, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Edit_Exams, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(User_Details, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Courses, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Colleges, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Exams, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User_Details, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modify_Colleges, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 560));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_CoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_CoursesMouseClicked
        JLabel tru=Add_Courses;
        falseall(tru);
       courses.setVisible(true);  
    }//GEN-LAST:event_Add_CoursesMouseClicked

    private void Add_CoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_CoursesMouseEntered
     
    }//GEN-LAST:event_Add_CoursesMouseEntered

    private void Edit_ExamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_ExamsMouseClicked
        JLabel tru=Edit_Exams;
        falseall(tru);
        exams.setVisible(true);
    }//GEN-LAST:event_Edit_ExamsMouseClicked

    private void User_DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_DetailsMouseClicked

        JLabel tru=User_Details;
        falseall(tru);
        userdetail.setVisible(true);
        
    }//GEN-LAST:event_User_DetailsMouseClicked

    private void Add_CollegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_CollegesMouseClicked
       JLabel tru=Add_Colleges;
        falseall(tru);
        colleges.setVisible(true);
    }//GEN-LAST:event_Add_CollegesMouseClicked

    private void Modify_CollegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modify_CollegesMouseClicked
        JLabel tru=Modify_Colleges;
        falseall(tru);
        modify.setVisible(true);
    }//GEN-LAST:event_Modify_CollegesMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
 JLabel tru=Logout;
        falseall(tru);
        System.exit(0);
    }//GEN-LAST:event_LogoutMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Colleges;
    private javax.swing.JLabel Add_Courses;
    private javax.swing.JLabel Edit_Exams;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Modify_Colleges;
    private javax.swing.JLabel User_Details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
