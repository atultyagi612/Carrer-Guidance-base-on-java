/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {

    
    Connection con;
    PreparedStatement ps;
    public Signup() {
        try {
            initComponents();
           // Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ema = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        study = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        tage = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        cpass = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setBounds(new java.awt.Rectangle(30, 30, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(0, 80, 161));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 3, 3, new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel19.setText("SIGN UP");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/New folder/signup.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("_________________________________________________________________________");

        ema.setBackground(new java.awt.Color(246, 245, 245));
        ema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ema.setText("Email ID");
        ema.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        ema.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ema.setName(""); // NOI18N
        ema.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emaFocusLost(evt);
            }
        });
        ema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(246, 245, 245));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setText("Password");
        pass.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pass.setName(""); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/New folder/close.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Already have an account ? ");

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("sign in");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        study.setBackground(new java.awt.Color(246, 245, 245));
        study.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        study.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Graduate", "Non-Medical", "Medical", "Commerse", "Arts/Humanities", "Class 11", "Class 10" }));
        study.setToolTipText("");
        study.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        study.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Please fill this form to create an account");

        fname.setBackground(new java.awt.Color(246, 245, 245));
        fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fname.setText("Full Name");
        fname.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));
        fname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fname.setName(""); // NOI18N
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        tage.setBackground(new java.awt.Color(246, 245, 245));
        tage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tage.setText("Age");
        tage.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));
        tage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tage.setName(""); // NOI18N
        tage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tageFocusLost(evt);
            }
        });
        tage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tageActionPerformed(evt);
            }
        });

        phone1.setBackground(new java.awt.Color(246, 245, 245));
        phone1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phone1.setText("Phone No.");
        phone1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        phone1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phone1.setName(""); // NOI18N
        phone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone1FocusLost(evt);
            }
        });
        phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone1ActionPerformed(evt);
            }
        });

        cpass.setBackground(new java.awt.Color(246, 245, 245));
        cpass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cpass.setText("Re-enter Password");
        cpass.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cpass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cpass.setName(""); // NOI18N
        cpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpassFocusLost(evt);
            }
        });
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        male.setText("Male");

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        female.setText("Female");

        others.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        others.setText("Others");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ema, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(male)
                                .addGap(18, 18, 18)
                                .addComponent(female)
                                .addGap(26, 26, 26)
                                .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(study, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(others))
                .addGap(32, 32, 32)
                .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(study, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tageActionPerformed

    private void tageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tageFocusLost
        if (tage.getText().trim().equals("")) {
            tage.setText("Age");}
    }//GEN-LAST:event_tageFocusLost

    private void tageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tageFocusGained
if (tage.getText().trim().equals("Age")) {
            tage.setText("");}        // TODO add your handling code here:
    }//GEN-LAST:event_tageFocusGained

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
      if (fname.getText().trim().equals("")) {
            fname.setText("Full Name");}  // TODO add your handling code here:
    }//GEN-LAST:event_fnameFocusLost

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
       if (fname.getText().trim().equals("Full Name")) {
            fname.setText("");}
    }//GEN-LAST:event_fnameFocusGained

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
             new User_Login().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        // TODO add your handling code here:
        if (pass.getText().trim().equals("")) {
            pass.setText("Password");}
    }//GEN-LAST:event_passFocusLost

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if (pass.getText().trim().equals("Password")) {
            pass.setText("");}        // TODO add your handling code here:
    }//GEN-LAST:event_passFocusGained

    private void emaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaActionPerformed

    private void emaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaFocusLost
        // TODO add your handling code here:
        if (ema.getText().trim().equals("")) {
            ema.setText("Email ID ");}
    }//GEN-LAST:event_emaFocusLost

    private void emaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaFocusGained
        if (ema.getText().trim().equals("Email ID")) {
            ema.setText("");}        // TODO add your handling code here:
    }//GEN-LAST:event_emaFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
       String name=fname.getText();
       String gender = null;
       String course =(String) study.getSelectedItem();
       String phone=phone1.getText();
       String email=ema.getText();
       String age=tage.getText();
       String password=pass.getText();
       String cpassword=cpass.getText();
       
       if(male.isSelected()) {
           gender ="male";    
       } 
       else if (female.isSelected()){
           gender="female";
           }
       else if(others.isSelected()){
           gender="others";
       }
      
       if(!password.equals(cpassword)){
           JOptionPane.showMessageDialog(null,"The comform password is not matched");
       }
        
       else if(male.isSelected()&&female.isSelected()||male.isSelected()&&others.isSelected()||others.isSelected()&&female.isSelected()||male.isSelected()&&female.isSelected()&&others.isSelected()){
           JOptionPane.showMessageDialog(null,"please choose only one gender");
       }
       else if(gender == null){
           JOptionPane.showMessageDialog(null,"please choose the gender");
       }
       else if(Pattern.matches("[789]{1}[0-9]{9}",phone1.getText())==false){
         JOptionPane.showMessageDialog(null,"Incorrect Phone number");
    }
       
       else if("".equals(age)){
            JOptionPane.showMessageDialog(null,"please fill the age");
       }
       
       else if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}$",pass.getText())==false) {
           JOptionPane.showMessageDialog(null,"Password must have a number,lower or upper case letter , a special character and minimum 8 characters ,");
       } else if(isValid(email)){
           try{
               ps=con.prepareStatement("insert into login(name,email,password,Age,Gender,Phone,courses)values('"+name+"','"+email+"','"+password+"','"+age+"','"+gender+"','"+phone+"','"+course+"')");
               ps.executeUpdate();
               this.dispose();
               new User_Login().setVisible(true);
           }
           catch(SQLException e){
               JOptionPane.showMessageDialog(null,e);
               
           }  
       }
       else{
           JOptionPane.showMessageDialog(null,"Please fill the valid email ");
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void phone1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone1FocusGained
if (phone1.getText().trim().equals("Phone No.")) {
            phone1.setText("");}        // TODO add your handling code here:
    }//GEN-LAST:event_phone1FocusGained

    private void phone1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone1FocusLost
        if (phone1.getText().trim().equals("")) {
            phone1.setText("Phone No.");}
    }//GEN-LAST:event_phone1FocusLost

    private void phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1ActionPerformed

    private void cpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassFocusGained
   if (cpass.getText().trim().equals("Re-enter Password")) {
            cpass.setText("");}     
    }//GEN-LAST:event_cpassFocusGained

    private void cpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassFocusLost
        if (cpass.getText().trim().equals("")) {
            cpass.setText("Re-enter Password");}
    }//GEN-LAST:event_cpassFocusLost

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpass;
    private javax.swing.JTextField ema;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone1;
    private javax.swing.JComboBox<String> study;
    private javax.swing.JTextField tage;
    // End of variables declaration//GEN-END:variables
}
