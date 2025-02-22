/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.ClientComponents;

import com.saad.AdminComponents.*;
import com.saad.ClientComponents.*;
import com.saad.Classes.Car;
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
public class NotifCard extends javax.swing.JPanel {


    public NotifCard(Notification notif) {
        initComponents();       
        setOpaque(false);
        
        this.msg.setText(notif.getMessage());
        this.resl.setText(Integer.toString(notif.getId_reservation()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        resl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(900, 100));
        setMinimumSize(new java.awt.Dimension(900, 100));
        setPreferredSize(new java.awt.Dimension(900, 100));

        msg.setBackground(new java.awt.Color(255, 255, 255));
        msg.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        msg.setForeground(new java.awt.Color(51, 51, 51));
        msg.setOpaque(true);

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("OK");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        resl.setBackground(new java.awt.Color(255, 255, 255));
        resl.setForeground(new java.awt.Color(255, 255, 255));
        resl.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(resl)
                .addGap(13, 13, 13)
                .addComponent(jButton4)
                .addGap(31, 31, 31))
            .addComponent(msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        try {
            int account_id = Integer.parseInt(ClientMenu.Id_Account.getText());
            int resId = Integer.parseInt(this.resl.getText());
            
            markNotificationAsSeen(resId);
            NotifStatus(account_id);
            
          deleteNotificationReservation(resId);

            
         JPanel parentPanel = (JPanel) getParent(); // Assuming this method is within the NotifFrame panel
        parentPanel.remove(this);
        parentPanel.revalidate();
        parentPanel.repaint();

            
        } catch (SQLException ex) {
            Logger.getLogger(NotifCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton4MouseClicked

@Override
 protected void paintChildren(Graphics grphcs) {
Graphics2D g2 = (Graphics2D) grphcs;
g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel resl;
    // End of variables declaration//GEN-END:variables
}
