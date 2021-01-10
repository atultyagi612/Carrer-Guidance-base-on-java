/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
import javax.swing.border.Border;

/**
 *
 * @author Deadpooltyagi
 */
public class User_Exams extends javax.swing.JPanel {

   
    String name;
    Connection con;
     ResultSet rs;
     PreparedStatement ps;
      Border border;
     String url = null;
     GridBagLayout layout=new GridBagLayout();
    public User_Exams() {
        initComponents();
        
        try{
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC","root","");  
        }
        catch(SQLException e){
            System.out.print(e);
        }
        engin1.setVisible(true);
        detail.setVisible(false);
        engin1.setVisible(true);
        empty();
        
         border = BorderFactory.createLineBorder(Color.white,3,true);
         
         
    }
    public void paper(String edit){ 
      engin1.setVisible(true);
      jScrollPane5.getVerticalScrollBar().setValue(0);
      pfirst.setVisible(true);
      psecond.setVisible(true); 
      pthird.setVisible(true); 
      pfourth.setVisible(true); 
      pfifth.setVisible(true); 
      psixth.setVisible(true);  
      pseventh.setVisible(true); 
      peight.setVisible(true);
      
        try {
           
             ps=con.prepareStatement("Select * from exam where first=?");
              ps.setString(1,edit);
             rs=ps.executeQuery();          
             if(rs.next()){              
                 lfirst.setText(rs.getString("second"));
                 lsecond.setText(rs.getString("third"));
                 lthird.setText(rs.getString("fourth"));
                 lfourth.setText(rs.getString("fifth"));
                 lfifth.setText(rs.getString("sixth"));
                 lsixth.setText(rs.getString("seventh"));
                 lseventh.setText(rs.getString("eight")); 
                 dates(lfirst.getText(),afirst);
                 dates(lsecond.getText(),asecond);
                 dates(lthird.getText(),athird);
                 dates(lfourth.getText(),afourth);
                 dates(lfifth.getText(),afifth);
                 dates(lsixth.getText(),asixth);
                 dates(lseventh.getText(),aseventh);
                 dates(leight.getText(),aeight);
                
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void profile(String examname){
         jScrollPane5.getVerticalScrollBar().setValue(0);
        jScrollPane5.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
         engin1.setVisible(false);
        detail.setVisible(true);
        
        
        try {
          
             ps=con.prepareStatement("Select * from examdetail where name=?");
              ps.setString(1,examname);
             rs=ps.executeQuery();          
             if(rs.next()){              
                 fillabout.setText(rs.getString("about"));
                 filldates.setText(rs.getString("dates"));
                 filleligibility.setText(rs.getString("eligibility"));
                  fillsyllabus.setText(rs.getString("syllabus"));
                  url=rs.getString("link");
                  
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void empty() {
     if(lsixth.getText().trim().equals("")) {
       peight.setVisible(false);
   }
      if(lfifth.getText().trim().equals("")) {
       pfifth.setVisible(false);
   }
       if(lsixth.getText().trim().equals("")) {
       psixth.setVisible(false);
   }
        if(lseventh.getText().trim().equals("")) {
       pseventh.setVisible(false);
   }
         if(lsecond.getText().trim().equals("")) {
       psecond.setVisible(false);
   }
          if(lthird.getText().trim().equals("")) {
       pthird.setVisible(false);
   }
           if(lfourth.getText().trim().equals("")) {
       pfourth.setVisible(false);
   }
            if(lfifth.getText().trim().equals("")) {
       pfifth.setVisible(false);
   }
            if(lfirst.getText().trim().equals("")) {
       pfirst.setVisible(false);
   }
        
        
       
}
    public void dates(String ldate,JTextArea labelname){
         try {
          
             ps=con.prepareStatement("Select * from examdetail where name=?");
              ps.setString(1,ldate);
             rs=ps.executeQuery();          
             if(rs.next()){                           
                 labelname.setText(rs.getString("dates"));
                 
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(User_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }

   public void Selected_Stream_Border(JLabel tru){
       
       
       
        jLabel20.setForeground(Color. white);
        jLabel21.setForeground(Color. white);
        jLabel28.setForeground(Color. white);
       jLabel22.setForeground(Color. white);
       jLabel27.setForeground(Color. white);
       jLabel25.setForeground(Color. white);
       jLabel29.setForeground(Color. white);
       jLabel30.setForeground(Color. white);
       jLabel31.setForeground(Color. white);
       jLabel32.setForeground(Color. white);
       jLabel33.setForeground(Color. white);
         
       jLabel20.setBorder(null);
       jLabel21.setBorder(null);
      jLabel28.setBorder(null);
       jLabel22.setBorder(null);
       jLabel25.setBorder(null);
       jLabel27.setBorder(null); 
       jLabel29.setBorder(null);
       jLabel30.setBorder(null);
       jLabel31.setBorder(null);
       jLabel32.setBorder(null);
       jLabel33.setBorder(null);
       
       
       
    tru.setVisible(true);
    tru.setBorder(border);
    tru.setForeground(Color. lightGray);
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EXAMS = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        engin1 = new javax.swing.JPanel();
        name_of_stream = new javax.swing.JLabel();
        psecond = new javax.swing.JPanel();
        lsecond = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        asecond = new javax.swing.JTextArea();
        pfirst = new javax.swing.JPanel();
        lfirst = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        afirst = new javax.swing.JTextArea();
        pthird = new javax.swing.JPanel();
        lthird = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        athird = new javax.swing.JTextArea();
        pfourth = new javax.swing.JPanel();
        lfourth = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        afourth = new javax.swing.JTextArea();
        peight = new javax.swing.JPanel();
        leight = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        aeight = new javax.swing.JTextArea();
        pfifth = new javax.swing.JPanel();
        lfifth = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        afifth = new javax.swing.JTextArea();
        psixth = new javax.swing.JPanel();
        lsixth = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        asixth = new javax.swing.JTextArea();
        pseventh = new javax.swing.JPanel();
        lseventh = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        aseventh = new javax.swing.JTextArea();
        detail = new javax.swing.JPanel();
        examname4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        fillabout = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        filldates = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        filleligibility = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        fillsyllabus = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 80, 161));
        setMaximumSize(new java.awt.Dimension(1300, 560));
        setMinimumSize(new java.awt.Dimension(1300, 560));

        EXAMS.setBackground(new java.awt.Color(0, 80, 161));

        jPanel10.setBackground(new java.awt.Color(0, 80, 161));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ENGINEERING AND ARCHITECTURE");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("LAW");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SCHOOL");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("<html>MANAGEMENT AND <br>BUSINESS ADMINISTRATION</html>");
        jLabel20.setToolTipText("asdfads\nsdfsd");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("<html>MEDIA , JARNALISM <br>MASS COMUNICATION</html>");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ANIMATION AND DESIGN");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("COMPUTE APPLICATIONS & IT");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("<html>MEDICINE AND <br>ALLIED SCIENCE</html>");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("FINANCE AND ACCOUNTS");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("HOSPITALITY  AND TOURISM ");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("PHARMACY");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        engin1.setBackground(new java.awt.Color(255, 255, 255));
        engin1.setMaximumSize(new java.awt.Dimension(1300, 1300));
        engin1.setMinimumSize(new java.awt.Dimension(1300, 1300));
        engin1.setPreferredSize(new java.awt.Dimension(1300, 1300));

        name_of_stream.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name_of_stream.setText("Please Select The Stream!");

        psecond.setBackground(new java.awt.Color(255, 255, 255));
        psecond.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        psecond.setMaximumSize(new java.awt.Dimension(300, 370));
        psecond.setMinimumSize(new java.awt.Dimension(300, 370));

        lsecond.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lsecond.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lsecond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsecondMouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setText("DATES :-");

        asecond.setEditable(false);
        asecond.setColumns(20);
        asecond.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        asecond.setRows(5);
        asecond.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        asecond.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        asecond.setFocusable(false);
        jScrollPane12.setViewportView(asecond);

        javax.swing.GroupLayout psecondLayout = new javax.swing.GroupLayout(psecond);
        psecond.setLayout(psecondLayout);
        psecondLayout.setHorizontalGroup(
            psecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psecondLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(psecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addComponent(lsecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(psecondLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        psecondLayout.setVerticalGroup(
            psecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psecondLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfirst.setBackground(new java.awt.Color(255, 255, 255));
        pfirst.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pfirst.setMaximumSize(new java.awt.Dimension(300, 370));
        pfirst.setMinimumSize(new java.awt.Dimension(300, 370));

        lfirst.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lfirst.setText("   ");
        lfirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lfirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lfirstMouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel40.setText("DATES :-");

        jScrollPane13.setBorder(null);
        jScrollPane13.setEnabled(false);

        afirst.setEditable(false);
        afirst.setColumns(20);
        afirst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        afirst.setRows(5);
        afirst.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        afirst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        afirst.setFocusable(false);
        jScrollPane13.setViewportView(afirst);

        javax.swing.GroupLayout pfirstLayout = new javax.swing.GroupLayout(pfirst);
        pfirst.setLayout(pfirstLayout);
        pfirstLayout.setHorizontalGroup(
            pfirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lfirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pfirstLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13))
                .addContainerGap())
        );
        pfirstLayout.setVerticalGroup(
            pfirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pthird.setBackground(new java.awt.Color(255, 255, 255));
        pthird.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pthird.setMaximumSize(new java.awt.Dimension(300, 370));
        pthird.setMinimumSize(new java.awt.Dimension(300, 370));

        lthird.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lthird.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lthird.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lthirdMouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setText("DATES :-");

        athird.setEditable(false);
        athird.setColumns(20);
        athird.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        athird.setRows(5);
        athird.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        athird.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        athird.setFocusable(false);
        jScrollPane18.setViewportView(athird);

        javax.swing.GroupLayout pthirdLayout = new javax.swing.GroupLayout(pthird);
        pthird.setLayout(pthirdLayout);
        pthirdLayout.setHorizontalGroup(
            pthirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pthirdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pthirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18)
                    .addComponent(lthird, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pthirdLayout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pthirdLayout.setVerticalGroup(
            pthirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pthirdLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lthird, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfourth.setBackground(new java.awt.Color(255, 255, 255));
        pfourth.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pfourth.setMaximumSize(new java.awt.Dimension(300, 370));
        pfourth.setMinimumSize(new java.awt.Dimension(300, 370));

        lfourth.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lfourth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lfourth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lfourthMouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setText("DATES :-");

        afourth.setEditable(false);
        afourth.setColumns(20);
        afourth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        afourth.setRows(5);
        afourth.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        afourth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        afourth.setFocusable(false);
        jScrollPane19.setViewportView(afourth);

        javax.swing.GroupLayout pfourthLayout = new javax.swing.GroupLayout(pfourth);
        pfourth.setLayout(pfourthLayout);
        pfourthLayout.setHorizontalGroup(
            pfourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfourthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19)
                    .addComponent(lfourth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pfourthLayout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pfourthLayout.setVerticalGroup(
            pfourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfourthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lfourth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peight.setBackground(new java.awt.Color(255, 255, 255));
        peight.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        peight.setMaximumSize(new java.awt.Dimension(300, 370));
        peight.setMinimumSize(new java.awt.Dimension(300, 370));

        leight.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        leight.setText("               ");
        leight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leightMouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setText("DATES :-");

        aeight.setEditable(false);
        aeight.setColumns(20);
        aeight.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aeight.setRows(5);
        aeight.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        aeight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aeight.setFocusable(false);
        jScrollPane20.setViewportView(aeight);

        javax.swing.GroupLayout peightLayout = new javax.swing.GroupLayout(peight);
        peight.setLayout(peightLayout);
        peightLayout.setHorizontalGroup(
            peightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20)
                    .addComponent(leight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(peightLayout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        peightLayout.setVerticalGroup(
            peightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leight, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfifth.setBackground(new java.awt.Color(255, 255, 255));
        pfifth.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pfifth.setMaximumSize(new java.awt.Dimension(300, 370));
        pfifth.setMinimumSize(new java.awt.Dimension(300, 370));

        lfifth.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lfifth.setText("               ");
        lfifth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lfifth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lfifthMouseClicked(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setText("DATES :-");

        afifth.setEditable(false);
        afifth.setColumns(20);
        afifth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        afifth.setRows(5);
        afifth.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        afifth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        afifth.setFocusable(false);
        jScrollPane22.setViewportView(afifth);

        javax.swing.GroupLayout pfifthLayout = new javax.swing.GroupLayout(pfifth);
        pfifth.setLayout(pfifthLayout);
        pfifthLayout.setHorizontalGroup(
            pfifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfifthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22)
                    .addComponent(lfifth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pfifthLayout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pfifthLayout.setVerticalGroup(
            pfifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfifthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lfifth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        psixth.setBackground(new java.awt.Color(255, 255, 255));
        psixth.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        psixth.setMaximumSize(new java.awt.Dimension(300, 370));
        psixth.setMinimumSize(new java.awt.Dimension(300, 370));

        lsixth.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lsixth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lsixth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsixthMouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel60.setText("DATES :-");

        asixth.setEditable(false);
        asixth.setColumns(20);
        asixth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        asixth.setRows(5);
        asixth.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        asixth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        asixth.setFocusable(false);
        jScrollPane23.setViewportView(asixth);

        javax.swing.GroupLayout psixthLayout = new javax.swing.GroupLayout(psixth);
        psixth.setLayout(psixthLayout);
        psixthLayout.setHorizontalGroup(
            psixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psixthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(psixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23)
                    .addComponent(lsixth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(psixthLayout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        psixthLayout.setVerticalGroup(
            psixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psixthLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lsixth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pseventh.setBackground(new java.awt.Color(255, 255, 255));
        pseventh.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pseventh.setMaximumSize(new java.awt.Dimension(300, 370));
        pseventh.setMinimumSize(new java.awt.Dimension(300, 370));

        lseventh.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lseventh.setText("               ");
        lseventh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lseventh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lseventhMouseClicked(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel56.setText("DATES :-");

        aseventh.setEditable(false);
        aseventh.setColumns(20);
        aseventh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aseventh.setRows(5);
        aseventh.setText("dfdsgdfs\ndfgsdfgdfgdgggggggggggggg\nfdddddddddddddddddddddddddddddd\ndfffffffffffffffffffff\n\ndfffffffffffffffffffffffffffffffffff");
        aseventh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aseventh.setFocusable(false);
        jScrollPane21.setViewportView(aseventh);

        javax.swing.GroupLayout pseventhLayout = new javax.swing.GroupLayout(pseventh);
        pseventh.setLayout(pseventhLayout);
        pseventhLayout.setHorizontalGroup(
            pseventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pseventhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pseventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21)
                    .addComponent(lseventh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pseventhLayout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pseventhLayout.setVerticalGroup(
            pseventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pseventhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lseventh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout engin1Layout = new javax.swing.GroupLayout(engin1);
        engin1.setLayout(engin1Layout);
        engin1Layout.setHorizontalGroup(
            engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engin1Layout.createSequentialGroup()
                .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(engin1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfifth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(engin1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(pseventh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(peight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(engin1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pthird, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfourth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psixth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(engin1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(name_of_stream, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        engin1Layout.setVerticalGroup(
            engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_of_stream, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psecond, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pfourth, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pthird, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(psixth, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfifth, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(engin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peight, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pseventh, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        detail.setBackground(new java.awt.Color(255, 255, 255));
        detail.setMaximumSize(new java.awt.Dimension(1140, 510));
        detail.setMinimumSize(new java.awt.Dimension(1140, 510));
        detail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                detailKeyPressed(evt);
            }
        });

        examname4.setBackground(new java.awt.Color(255, 255, 255));
        examname4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("About :-");

        fillabout.setEditable(false);
        fillabout.setColumns(20);
        fillabout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fillabout.setRows(5);
        fillabout.setBorder(null);
        jScrollPane16.setViewportView(fillabout);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setText("Dates :-");

        filldates.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setText("Eligibility :-");

        filleligibility.setEditable(false);
        filleligibility.setColumns(20);
        filleligibility.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filleligibility.setRows(5);
        filleligibility.setBorder(null);
        jScrollPane17.setViewportView(filleligibility);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("apply");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/icon/arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel41.setText("Syllabus :-");

        jScrollPane24.setBorder(null);

        fillsyllabus.setColumns(20);
        fillsyllabus.setRows(5);
        jScrollPane24.setViewportView(fillsyllabus);

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(485, 485, 485)
                .addComponent(examname4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailLayout.createSequentialGroup()
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(detailLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailLayout.createSequentialGroup()
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel34))
                                .addGap(68, 68, 68)
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(detailLayout.createSequentialGroup()
                                        .addComponent(filldates, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 190, Short.MAX_VALUE))
                                    .addComponent(jScrollPane16)))
                            .addGroup(detailLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailLayout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane24)))))
                .addGap(112, 112, 112))
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examname4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addGap(52, 52, 52)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(31, 31, 31)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filldates, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jLayeredPane1.setLayer(engin1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(detail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(engin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 857, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(engin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane5.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout EXAMSLayout = new javax.swing.GroupLayout(EXAMS);
        EXAMS.setLayout(EXAMSLayout);
        EXAMSLayout.setHorizontalGroup(
            EXAMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EXAMSLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        EXAMSLayout.setVerticalGroup(
            EXAMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EXAMSLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXAMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(EXAMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
  String edit = jLabel21.getText();
  paper(edit);
   empty();
   name_of_stream.setText(edit);
   
   
 JLabel tru=jLabel21;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
 String edit = jLabel22.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel22;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
       String edit = jLabel25.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel25;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
String edit = jLabel20.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel20;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
       String edit = jLabel27.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel27;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
       String edit = jLabel28.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel28;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       String edit = jLabel29.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel29;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
       String edit = jLabel30.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel30;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        String edit = jLabel31.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel31;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
       String edit = jLabel32.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel32;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        String edit = jLabel33.getText();
        paper(edit);
        empty();
        name_of_stream.setText(edit);
        
        JLabel tru=jLabel33;
   Selected_Stream_Border(tru);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
System.out.print(url);
        try {
            try {
                Desktop.getDesktop().browse(new URL(url).toURI());  // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(User_Exams.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       engin1.setVisible(true);
        detail.setVisible(false);
        jScrollPane5.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED); 
        jScrollPane5.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }//GEN-LAST:event_backMouseClicked

    private void detailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detailKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_detailKeyPressed

    private void lsixthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsixthMouseClicked

        profile(lsixth.getText());
         examname4.setText(lsixth.getText());
    }//GEN-LAST:event_lsixthMouseClicked

    private void lfifthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lfifthMouseClicked
        String ename =lfifth.getText();
        profile(ename);
         examname4.setText(lfifth.getText());
    }//GEN-LAST:event_lfifthMouseClicked

    private void lthirdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lthirdMouseClicked
        profile(lthird.getText());
         examname4.setText(lthird.getText());
    }//GEN-LAST:event_lthirdMouseClicked

    private void lfirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lfirstMouseClicked

        profile(lfirst.getText());
        examname4.setText(lfirst.getText());
    }//GEN-LAST:event_lfirstMouseClicked

    private void lsecondMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsecondMouseClicked
                profile(lsecond.getText());
        examname4.setText(lsecond.getText());
    }//GEN-LAST:event_lsecondMouseClicked

    private void lfourthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lfourthMouseClicked
        examname4.setText(lfourth.getText()); 
         profile(lfourth.getText());
    }//GEN-LAST:event_lfourthMouseClicked

    private void lseventhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lseventhMouseClicked
        examname4.setText(lseventh.getText());
         profile(lseventh.getText());
    }//GEN-LAST:event_lseventhMouseClicked

    private void leightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leightMouseClicked
         examname4.setText(leight.getText());profile(leight.getText());
    }//GEN-LAST:event_leightMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EXAMS;
    private javax.swing.JTextArea aeight;
    private javax.swing.JTextArea afifth;
    private javax.swing.JTextArea afirst;
    private javax.swing.JTextArea afourth;
    private javax.swing.JTextArea asecond;
    private javax.swing.JTextArea aseventh;
    private javax.swing.JTextArea asixth;
    private javax.swing.JTextArea athird;
    private javax.swing.JLabel back;
    private javax.swing.JPanel detail;
    private javax.swing.JPanel engin1;
    private javax.swing.JLabel examname4;
    private javax.swing.JTextArea fillabout;
    private javax.swing.JLabel filldates;
    private javax.swing.JTextArea filleligibility;
    private javax.swing.JTextArea fillsyllabus;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel leight;
    private javax.swing.JLabel lfifth;
    private javax.swing.JLabel lfirst;
    private javax.swing.JLabel lfourth;
    private javax.swing.JLabel lsecond;
    private javax.swing.JLabel lseventh;
    private javax.swing.JLabel lsixth;
    private javax.swing.JLabel lthird;
    private javax.swing.JLabel name_of_stream;
    private javax.swing.JPanel peight;
    private javax.swing.JPanel pfifth;
    private javax.swing.JPanel pfirst;
    private javax.swing.JPanel pfourth;
    private javax.swing.JPanel psecond;
    private javax.swing.JPanel pseventh;
    private javax.swing.JPanel psixth;
    private javax.swing.JPanel pthird;
    // End of variables declaration//GEN-END:variables
}
