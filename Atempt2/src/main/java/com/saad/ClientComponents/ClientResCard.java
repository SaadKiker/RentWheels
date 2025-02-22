/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.ClientComponents;

import com.saad.AdminComponents.*;
import static com.saad.AdminComponents.AdminCarCard.getImageDataFromDatabase;
import com.saad.ClientComponents.*;
import com.saad.Classes.Car;
import com.saad.Classes.Reservation;
import static com.saad.Classes.Reservation.getReservationById;
import static com.saad.Classes.Reservation.getReservationId;
import com.saad.main.main;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author saadk
 */
public class ClientResCard extends javax.swing.JPanel {

    private final Color backgroundColor = new Color(255,255,255); // Set the background color

    public ClientResCard(Car car) {
        try {
            initComponents();
            setOpaque(false);
            setBackground(backgroundColor);
            this.setPreferredSize(new Dimension(900, 300));
            this.setMaximumSize(new Dimension(900, 300));
            this.setMinimumSize(new Dimension(900, 300));
            
            this.CarId.setText(Integer.toString(car.getRegistrationNumber()));
            this.CarId1.setText(Integer.toString(car.getRegistrationNumber()));
            this.CarName.setText(car.getModel());
            this.Color.setText(car.getColor());
            this.Price.setText(Double.toString(car.getPrice()));
            
            int idr = getReservationId(Integer.parseInt(ClientMenu.Id_Account.getText()),car.getRegistrationNumber());
            Reservation r = getReservationById(idr);
            
            this.end.setText(r.getEndDate());
            
            byte[] imageData = getImageDataFromDatabase(car.getRegistrationNumber());
            
            ImageIcon imageIcon = new ImageIcon(imageData);
            
            carpic.setSize(426, 230);
            // Resize the image to match the width and height of the 'carpic' label
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(carpic.getWidth(), carpic.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            
            // Set the scaled image icon as the icon for the 'carpic' JLabel
            carpic.setIcon(scaledIcon);
            
            // Set the preferred size of the 'carpic' label to match the size of the scaled image
            carpic.setPreferredSize(new Dimension(scaledImage.getWidth(null), scaledImage.getHeight(null)));
        } catch (SQLException ex) {
            Logger.getLogger(ClientResCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }

    public ClientResCard() {
                initComponents();       
        setOpaque(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        CarName = new javax.swing.JLabel();
        AvailabilityIcon = new javax.swing.JLabel();
        CarId = new javax.swing.JLabel();
        CarId1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        carpic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(900, 300));
        setMinimumSize(new java.awt.Dimension(900, 300));
        setPreferredSize(new java.awt.Dimension(900, 300));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Dh/Day");

        Price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(51, 51, 51));
        Price.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CarName.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N

        CarId.setBackground(new java.awt.Color(255, 255, 255));
        CarId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CarId.setForeground(new java.awt.Color(255, 255, 255));

        CarId1.setBackground(new java.awt.Color(255, 255, 255));
        CarId1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CarId1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("End date : ");

        end.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        end.setForeground(new java.awt.Color(51, 51, 51));
        end.setText(" ");

        carpic.setBackground(new java.awt.Color(255, 255, 255));
        carpic.setForeground(new java.awt.Color(255, 255, 255));
        carpic.setMaximumSize(new java.awt.Dimension(426, 230));
        carpic.setMinimumSize(new java.awt.Dimension(426, 230));
        carpic.setOpaque(true);
        carpic.setPreferredSize(new java.awt.Dimension(426, 230));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setText(" ");
        jLabel1.setOpaque(true);

        Color.setForeground(new java.awt.Color(255, 255, 255));
        Color.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(Color)
                .addGap(396, 396, 396)
                .addComponent(AvailabilityIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(carpic, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(CarName, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CarId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CarId1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Color))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(CarId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(CarId1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CarName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AvailabilityIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

@Override
 protected void paintChildren(Graphics grphcs) {
Graphics2D g2 = (Graphics2D) grphcs;
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
super.paintChildren(grphcs);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailabilityIcon;
    public javax.swing.JLabel CarId;
    public static javax.swing.JLabel CarId1;
    private javax.swing.JLabel CarName;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel carpic;
    private javax.swing.JLabel end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
