/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.ClientComponents;

import static com.saad.AdminComponents.AdminCarCard.getImageDataFromDatabase;
import com.saad.Classes.Account;
import static com.saad.Classes.Account.findAccount;
import com.saad.Classes.Car;
import com.saad.Classes.Comment;
import java.awt.BorderLayout;
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author saadk
 */
public class ClientCarCard extends javax.swing.JPanel {

    private final Color backgroundColor = new Color(0,102,0); // Set the background color

    public ClientCarCard(Car car) {
        initComponents();       
        setOpaque(false);
         setBackground(backgroundColor);
         this.IdCar.setText(Integer.toString(car.getRegistrationNumber()));
         this.CarName.setText(car.getModel());
         
if (car.getAvailability().equals("Available")) {
    this.CarAvailability.setText("Available");
    this.CarAvailability.setForeground(new Color(0, 102, 0));
} else if (car.getAvailability().equals("Occupied")) {
    this.CarAvailability.setText("Not Available");
    this.CarAvailability.setForeground(new Color(132, 0, 0));
}
         this.Color.setText(car.getColor());
        this.Price.setText(Double.toString(car.getPrice()));
        
          byte[] imageData = getImageDataFromDatabase(car.getRegistrationNumber());
  ImageIcon imageIcon = new ImageIcon(imageData);

carpic.setSize(287, 167);
        // Resize the image to match the width and height of the 'carpic' label
        Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(carpic.getWidth(), carpic.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Set the scaled image icon as the icon for the 'carpic' JLabel
        carpic.setIcon(scaledIcon);
        
        // Set the preferred size of the 'carpic' label to match the size of the scaled image
        carpic.setPreferredSize(new Dimension(scaledImage.getWidth(null), scaledImage.getHeight(null)));
        
        if(  this.CarAvailability.getText() == "Not Available" ){
            this.DetailsButton.setVisible(false);
        }
    String color = car.getColor();
    Color labelBackgroundColor;

  switch (color.toLowerCase()) {
        case "red":
            labelBackgroundColor = new Color(130, 0, 0); // RGB for red
            break;
        case "green":
            labelBackgroundColor = new Color(0, 102, 0); // RGB for green
            break;
        case "white":
            labelBackgroundColor = new Color(255, 255, 255); // RGB for white
            break;
        case "black":
            labelBackgroundColor = new Color(0, 0, 0); // RGB for black
            break;
        case "yellow":
            labelBackgroundColor = new Color(130, 120, 0); // RGB for yellow
            break;
        case "blue":
            labelBackgroundColor = new Color(0, 0, 120); // RGB for blue
            break;
        default:
            labelBackgroundColor = backgroundColor;
            break;
    }
    this.ColorIcon.setBackground(labelBackgroundColor);
     }
    public ClientCarCard() {
        initComponents();       
        setOpaque(false);
         setBackground(backgroundColor);         
    }
     public String getCarName() {
        return CarName.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carpic = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();
        ColorIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        DetailsButton = new javax.swing.JButton();
        CarName = new javax.swing.JLabel();
        CarAvailability = new javax.swing.JLabel();
        IdCar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(376, 321));
        setMinimumSize(new java.awt.Dimension(376, 321));
        setPreferredSize(new java.awt.Dimension(376, 321));

        carpic.setBackground(new java.awt.Color(255, 255, 255));
        carpic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 102)));
        carpic.setMaximumSize(new java.awt.Dimension(287, 167));
        carpic.setMinimumSize(new java.awt.Dimension(287, 167));
        carpic.setOpaque(true);
        carpic.setPreferredSize(new java.awt.Dimension(287, 167));

        Color.setBackground(new java.awt.Color(255, 255, 255));
        Color.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Color.setForeground(new java.awt.Color(255, 255, 255));
        Color.setOpaque(true);

        ColorIcon.setMaximumSize(new java.awt.Dimension(1, 1));
        ColorIcon.setMinimumSize(new java.awt.Dimension(1, 1));
        ColorIcon.setPreferredSize(new java.awt.Dimension(1, 1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Dh/Day");

        Price.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Price.setForeground(new java.awt.Color(51, 51, 51));
        Price.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        DetailsButton.setBackground(new java.awt.Color(255, 204, 51));
        DetailsButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DetailsButton.setForeground(new java.awt.Color(51, 51, 51));
        DetailsButton.setText("Rent");
        DetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        DetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DetailsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DetailsButtonMouseExited(evt);
            }
        });

        CarName.setFont(new java.awt.Font("Myanmar Text", 1, 20)); // NOI18N

        CarAvailability.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CarAvailability.setForeground(new java.awt.Color(51, 51, 51));

        IdCar.setBackground(new java.awt.Color(255, 255, 255));
        IdCar.setForeground(new java.awt.Color(255, 255, 255));
        IdCar.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IdCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carpic, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CarAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(IdCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carpic, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ColorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DetailsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsButtonMouseEntered
            DetailsButton.setBackground(new Color(193, 145, 0));    }//GEN-LAST:event_DetailsButtonMouseEntered

    private void DetailsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsButtonMouseExited
            DetailsButton.setBackground(new Color(255, 204, 51));
    }//GEN-LAST:event_DetailsButtonMouseExited

    private void DetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsButtonMouseClicked

   try {
            Car c;
            c = Car.findCar(Integer.parseInt(this.IdCar.getText()));

            int idAcc = Integer.parseInt(ClientFrame.Menu.Id_Account.getText());
            Account a = findAccount(idAcc);
            ReservationFrame rf = new ReservationFrame(c,a);
            rf.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(ClientCarCard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DetailsButtonMouseClicked

@Override
 protected void paintChildren(Graphics grphcs) {
Graphics2D g2 = (Graphics2D) grphcs;
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
super.paintChildren(grphcs);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CarAvailability;
    public static javax.swing.JLabel CarName;
    public javax.swing.JLabel Color;
    private javax.swing.JLabel ColorIcon;
    private javax.swing.JButton DetailsButton;
    public javax.swing.JLabel IdCar;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel carpic;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
