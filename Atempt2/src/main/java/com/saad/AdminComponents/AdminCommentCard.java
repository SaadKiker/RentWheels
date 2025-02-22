/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.AdminComponents;

import com.saad.ClientComponents.*;
import com.saad.AdminComponents.*;
import com.saad.Classes.Account;
import static com.saad.Classes.Account.findAccount;
import com.saad.ClientComponents.*;
import com.saad.Classes.Car;
import com.saad.Classes.Comment;
import static com.saad.Classes.Comment.deleteComment;
import com.saad.Classes.Notification;
import static com.saad.Classes.Notification.checkNotificationSeenStatus;
import static com.saad.Classes.Notification.deleteNotificationReservation;
import static com.saad.Classes.Notification.markNotificationAsSeen;
import static com.saad.ClientComponents.ClientFrame.NotifStatus;
import com.saad.main.main;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author saadk
 */
public class AdminCommentCard extends javax.swing.JPanel {


    public AdminCommentCard(Comment comment) {
        initComponents();       
        setOpaque(false);
        
        this.text.setText(comment.getText());
        
        
        Account a = findAccount(comment.getAccount()); 
        if(a!=null){
        this.AccountName.setText(a.FirstName + " " + a.LastName);
        this.id_acc.setText(Integer.toString(a.Id));
        this.comid.setText(Integer.toString(comment.getId()));}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        id_acc = new javax.swing.JLabel();
        AccountName = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        comid = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(900, 100));
        setMinimumSize(new java.awt.Dimension(900, 100));
        setPreferredSize(new java.awt.Dimension(900, 100));

        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        text.setForeground(new java.awt.Color(51, 51, 51));
        text.setOpaque(true);

        id_acc.setBackground(new java.awt.Color(255, 255, 255));
        id_acc.setForeground(new java.awt.Color(255, 255, 255));
        id_acc.setOpaque(true);

        AccountName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AccountName.setText(" ");

        jButton4.setBackground(new java.awt.Color(236, 95, 95));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Delete comment");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        comid.setBackground(new java.awt.Color(255, 255, 255));
        comid.setForeground(new java.awt.Color(255, 255, 255));
        comid.setText(" ");
        comid.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(id_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comid, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AccountName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(id_acc)
                        .addGap(15, 15, 15)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comid)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        try {
    int commentId = Integer.parseInt(this.comid.getText());
        
    deleteComment(commentId);
    
    JPanel parentPanel = (JPanel) getParent(); // Assuming this method is within the panel that contains the comment
    parentPanel.remove(this);
    parentPanel.revalidate();
    parentPanel.repaint();
    
} catch (SQLException ex) {
    Logger.getLogger(CommentCard.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton4MouseClicked

@Override
 protected void paintChildren(Graphics grphcs) {
Graphics2D g2 = (Graphics2D) grphcs;
g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountName;
    private javax.swing.JLabel comid;
    private javax.swing.JLabel id_acc;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
