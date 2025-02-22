/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.swing;

import com.saad.Classes.Account;
import static com.saad.Classes.Account.*;
import static com.saad.Classes.Account.Signup;
import com.saad.Classes.Car;
import com.saad.ClientComponents.ClientFrame;
import com.saad.VisitorComponents.VisitorFrame;
import com.saad.main.main;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author saadk
 */
public class WelcomeSignupFrame extends javax.swing.JPanel {

    public WelcomeSignupFrame() {
        initComponents();
//                  logo.setSize(411, 55);
//        
//Icon originalIcon = logo.getIcon();
//int iconWidth = originalIcon.getIconWidth();
//int iconHeight = originalIcon.getIconHeight();
//Image scaledImage = new BufferedImage(iconWidth, iconHeight, BufferedImage.TYPE_INT_ARGB);
//Graphics2D graphics = (Graphics2D) scaledImage.getGraphics();
//originalIcon.paintIcon(logo, graphics, 0, 0);
//graphics.dispose();
//scaledImage = scaledImage.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
//logo.setIcon(new ImageIcon(scaledImage));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.saad.swing.PanelBorder();
        BackFromLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailSignup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PasswordSignup = new javax.swing.JTextField();
        SignupButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        footer1 = new com.saad.GlobalComponents.Footer();

        setMaximumSize(new java.awt.Dimension(650, 743));
        setMinimumSize(new java.awt.Dimension(650, 743));
        setPreferredSize(new java.awt.Dimension(650, 743));

        panelBorder1.setMaximumSize(new java.awt.Dimension(650, 768));
        panelBorder1.setMinimumSize(new java.awt.Dimension(650, 768));
        panelBorder1.setPreferredSize(new java.awt.Dimension(650, 768));

        BackFromLogin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        BackFromLogin.setForeground(new java.awt.Color(74, 74, 74));
        BackFromLogin.setText(" ← Back");
        BackFromLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 46, 48), 0, true));
        BackFromLogin.setContentAreaFilled(false);
        BackFromLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackFromLogin.setFocusPainted(false);
        BackFromLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackFromLoginMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("First Name :");

        FirstName.setForeground(new java.awt.Color(51, 51, 51));
        FirstName.setAlignmentY(0.0F);
        FirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        EmailSignup.setForeground(new java.awt.Color(51, 51, 51));
        EmailSignup.setAlignmentY(0.0F);
        EmailSignup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email :");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        LastName.setForeground(new java.awt.Color(51, 51, 51));
        LastName.setAlignmentY(0.0F);
        LastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Password :");

        PasswordSignup.setForeground(new java.awt.Color(51, 51, 51));
        PasswordSignup.setAlignmentY(0.0F);
        PasswordSignup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));

        SignupButton.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        SignupButton.setText("Sign up");
        SignupButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 46, 48), 0, true));
        SignupButton.setContentAreaFilled(false);
        SignupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButton.setFocusPainted(false);
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupButtonMouseExited(evt);
            }
        });

        logo.setFont(new java.awt.Font("MV Boli", 0, 77)); // NOI18N
        logo.setText("Rent Wheels");
        logo.setMaximumSize(new java.awt.Dimension(411, 55));
        logo.setMinimumSize(new java.awt.Dimension(411, 55));
        logo.setPreferredSize(new java.awt.Dimension(411, 55));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(BackFromLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PasswordSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(149, 149, 149))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(SignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmailSignup)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(73, 73, 73)
                .addComponent(SignupButton)
                .addGap(41, 41, 41)
                .addComponent(BackFromLogin)
                .addGap(27, 27, 27))
        );

        FirstName.setBackground(new Color(0,0,0,0));
        FirstName.setBackground(new Color(0,0,0,0));
        EmailSignup.setBackground(new Color(0,0,0,0));
        LastName.setBackground(new Color(0,0,0,0));
        PasswordSignup.setBackground(new Color(0,0,0,0));

        footer1.setMaximumSize(new java.awt.Dimension(650, 38));
        footer1.setMinimumSize(new java.awt.Dimension(650, 38));
        footer1.setPreferredSize(new java.awt.Dimension(650, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(footer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(footer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackFromLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackFromLoginMouseClicked
        this.setVisible(false);
        WelcomeFrame wf = new WelcomeFrame();
        wf.setVisible(true);
    }//GEN-LAST:event_BackFromLoginMouseClicked

    private void SignupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseClicked

        try {
            String First_name = FirstName.getText();
            String Last_name = LastName.getText();
            String email = EmailSignup.getText();
            String password = PasswordSignup.getText();
            
            Account account = Signup(First_name, Last_name, email, password);
            
            main thewelcomeframe = (main) SwingUtilities.getWindowAncestor(this);
            thewelcomeframe.setVisible(false);
            
            ClientFrame frame = new ClientFrame(account);
            frame.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(WelcomeSignupFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_SignupButtonMouseClicked

    private void SignupButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseEntered
        SignupButton.setBackground(Color.decode("#334d50"));
        SignupButton.setForeground(Color.decode("#FFFFDB"));
    }//GEN-LAST:event_SignupButtonMouseEntered

    private void SignupButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseExited
        SignupButton.setBackground(null);
        SignupButton.setForeground(Color.decode("#1E2E30"));
    }//GEN-LAST:event_SignupButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackFromLogin;
    private javax.swing.JTextField EmailSignup;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField PasswordSignup;
    private javax.swing.JButton SignupButton;
    private com.saad.GlobalComponents.Footer footer1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private com.saad.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
