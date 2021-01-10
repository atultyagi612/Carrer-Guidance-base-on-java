
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin_User_Details extends javax.swing.JPanel {

   String id,quali,nam,gend ,pas; 
    int sno,ag;
    String phon;
Connection con;
Statement stmt;
PreparedStatement ps;
 ResultSet rs=null;
DefaultTableModel model;
    public Admin_User_Details() {
        initComponents();
         try {
            initComponents();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        Table();
         model.setRowCount(0);
        Table();
        
    }

   public void Table(){
         try {   
             
            model =(DefaultTableModel)tabl.getModel();
     stmt=con.createStatement();
    ResultSet rs= stmt.executeQuery("Select * from login");
    while(rs.next())
    {sno=rs.getInt("sno");
    id=rs.getString("email");
    nam=rs.getString("name");
    gend=rs.getString("Gender");
    ag=rs.getInt("Age");
    phon=rs.getString("Phone");
    quali=rs.getString("courses");
    pas=rs.getString("password");
     model.addRow(new Object[]{sno,nam,id,pas,ag,gend,phon,quali});
   
    }
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null,ex);
    }
    }
   public  void Selected_from_table(){
        int row = tabl.getSelectedRow();
sn.setText(tabl.getModel().getValueAt(row,0).toString());
name.setText(tabl.getModel().getValueAt(row,1).toString());
email.setText(tabl.getModel().getValueAt(row,2).toString());
pass.setText(tabl.getModel().getValueAt(row,3).toString());
age.setText(tabl.getModel().getValueAt(row,4).toString());
gen.setText(tabl.getModel().getValueAt(row,5).toString());
ph.setText(tabl.getModel().getValueAt(row,6).toString());
qual.setText(tabl.getModel().getValueAt(row,7).toString());
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();
        qual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        jLabel9.setText("Password");

        pass.setEditable(false);
        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setText("Gender");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tabl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "sno", "name", "email", "password", "age", "gender", "phone", "courses"
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
            tabl.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        qual.setEditable(false);
        qual.setBackground(new java.awt.Color(255, 255, 255));
        qual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        qual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setText("Qualification");

        sn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                snFocusGained(evt);
            }
        });

        jLabel7.setText("SNo");

        ph.setEditable(false);
        ph.setBackground(new java.awt.Color(255, 255, 255));
        ph.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ph.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gen.setEditable(false);
        gen.setBackground(new java.awt.Color(255, 255, 255));
        gen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        gen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        age.setEditable(false);
        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone No");

        jLabel5.setText("Age");

        jLabel3.setText("Full Name");

        jLabel2.setText("Email ID");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/refresh-button.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qual, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(ph))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(pass))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sn, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(age)
                            .addComponent(name)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(gen))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(qual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            sno= Integer.parseInt(sn.getText());
            ps=con.prepareStatement("Delete from login where email=?;");
            ps.setString(1,email.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }catch (Exception ex) {
            System.out.print(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         model.setRowCount(0);
        Table();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked

Selected_from_table();
    }//GEN-LAST:event_tablMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(sn.getText().trim().equals("")){
        try {
             ps=con.prepareStatement("Select * from login where email=?");
              ps.setString(1,email.getText());
             rs=ps.executeQuery();
           
             if(rs.next()){
                 sn.setText(rs.getString("sno"));
                 name.setText(rs.getString("name"));
                 age.setText(rs.getString("Age"));
                 gen.setText(rs.getString("Gender"));
                 email.setText(rs.getString("email"));
                qual.setText(rs.getString("courses"));
                 ph.setText(rs.getString("Phone"));
             }
             else{
                 JOptionPane.showMessageDialog(null,"Not Found!");
             }
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
           else if(email.getText().trim().equals("")){
                System.out.print(sn.getText());
                 try {
             ps=con.prepareStatement("Select * from login where sno=?");
              ps.setString(1,sn.getText());
             rs=ps.executeQuery();
           
             if(rs.next()){
                 name.setText(rs.getString("name"));
                 age.setText(rs.getString("Age"));
                 gen.setText(rs.getString("Gender"));
                 email.setText(rs.getString("email"));
                qual.setText(rs.getString("courses"));
                 ph.setText(rs.getString("Phone"));
             }
             else{
                  JOptionPane.showMessageDialog(null,"Not Found!");
             }
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
           else{
                JOptionPane.showMessageDialog(null,"Plesae fill one of the serial no. or Email");
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void snFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_snFocusGained
       email.setText("");
    }//GEN-LAST:event_snFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        sn.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void tablKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablKeyReleased
       Selected_from_table();
    }//GEN-LAST:event_tablKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField qual;
    private javax.swing.JTextField sn;
    private javax.swing.JTable tabl;
    // End of variables declaration//GEN-END:variables
}
