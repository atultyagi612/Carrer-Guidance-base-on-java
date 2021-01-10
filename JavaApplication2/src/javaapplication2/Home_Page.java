
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home_Page extends javax.swing.JPanel {

   Connection con=null;
     ResultSet rs=null;
     PreparedStatement ps=null;
    public Home_Page(String name) {
        initComponents();
        String user_name = null;
        
         try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");
             ps=con.prepareStatement("Select * from login where email=?");
              ps.setString(1, name);
             rs=ps.executeQuery();
           
             if(rs.next()){
                 user_name=rs.getString("name");
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
          User_Welcome.setText("WELCOME "+user_name);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User_Welcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        User_Welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        User_Welcome.setText("WELCOME ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("We work with complete dedication hard-work and integrity for the students, to help them make the right career choice. The main motive\n of our team is to guide the students with the rich amount of knowledge about the examinations, colleges, universities, courses etc. \nThe team has been working completely hard to gather the information about all the examinations, colleges, courses and other essential \ninformation which is all required to make a child’s career. We are Family like team of about 7 members. Every member has equal\n importance to create this venture. Currently all of us are pursuing Bachelor of  Computer science & Technology sure will work again \nwith the same  integrity in future to create realistic projects for human benefits. Any individual who will be having a newcomer to our\n site will sign up with his/her personal details. The form would also ask about the current class, preferred stream,  and some other \nessential details. After this project the person would be re-directed to another page and according to his preferred choices all the\n results will be shown. The re-directed page would include all the courses  available in all colleges in India. This is the working \nprocess which helps to guide the students in a right way");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(User_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel User_Welcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
