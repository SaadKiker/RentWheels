/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.saad.VisitorComponents;

import com.saad.AdminComponents.AdminCarCard;
import com.saad.AdminComponents.AdminCarFrame;
import com.saad.Classes.Account;
import static com.saad.Classes.Account.findAccount;
import com.saad.Classes.Car;
import com.saad.Classes.Comment;
import com.saad.Classes.Notification;
import com.saad.ClientComponents.ClientFrame;
import com.saad.ClientComponents.ClientMenu;
import com.saad.ClientComponents.ClientResCard;
import com.saad.ClientComponents.ClientResFrame;
import com.saad.ClientComponents.NotifCard;
import com.saad.ClientComponents.NotifFrame;
import java.awt.Color;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author saadk
 */
public class VisitorFrame extends javax.swing.JFrame {

    /**
     * Creates new form VisitorFrame
     */
    public VisitorFrame(LinkedList<Car> cars) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
         loginHeadPanel1.initMoving(VisitorFrame.this); 
         
         if (cars != null) {
            for (Car car : cars) {
                VisitorCarCard carCard = new VisitorCarCard(car);
                VisitorCarFrame.CarCardGrid.add(carCard);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        loginHeadPanel1 = new com.saad.GlobalComponents.LoginHeadPanel();
        VisitorCardPanel = new javax.swing.JPanel();
        clientCarFrameSP1 = new com.saad.VisitorComponents.VisitorCarFrameSP();
        commentSP1 = new com.saad.VisitorComponents.CommentSP();
        jPanel1 = new javax.swing.JPanel();
        visitorMenu1 = new com.saad.VisitorComponents.VisitorMenu();
        footer21 = new com.saad.GlobalComponents.Footer2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1487, 815));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        VisitorCardPanel.setLayout(new java.awt.CardLayout());
        VisitorCardPanel.add(clientCarFrameSP1, "card2");
        VisitorCardPanel.add(commentSP1, "card3");

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(visitorMenu1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(VisitorCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, Short.MAX_VALUE))
            .addComponent(loginHeadPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginHeadPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VisitorCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(footer21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


            try {
            
            LinkedList<Car> carList1 = null;
            carList1 = Car.listCars();
            
            LinkedList<Notification> NotifList = null;
            NotifList = Notification.getNotifications();
            
            LinkedList<Comment> cmtlist = null;
            cmtlist = Comment.getComments();
            
            LinkedList<Car> carList2 = null;
            
            
            if (carList1 != null) {
                for (Car car : carList1) {
                    com.saad.ClientComponents.ClientCarCard carCard = new com.saad.ClientComponents.ClientCarCard(car);
                    com.saad.ClientComponents.ClientCarFrame.CarCardGrid.add(carCard);
                }
            }

            
            if (NotifList != null) {
                  for (Notification notification : NotifList) {
                      NotifCard notifCard = new NotifCard(notification);
                      NotifFrame.CarCardGrid.add(notifCard);
                  }
          }
            
            if (cmtlist != null) {
                  for (Comment cmt : cmtlist) {
                      com.saad.ClientComponents.CommentCard commentCard = new com.saad.ClientComponents.CommentCard(cmt);
                      com.saad.ClientComponents.CommentFrame.CarCardGrid.add(commentCard);
                  }
          }
            
            


        } catch (SQLException ex) {      
            Logger.getLogger(ClientFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    public JPanel getVisitorCardPanel() {
    return VisitorCardPanel;
}
    public JPanel getcommentSP1() {
    return commentSP1;
}
    

public JPanel getvisitorCarFrameSP2() {
    return clientCarFrameSP1;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisitorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisitorFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VisitorCardPanel;
    private com.saad.VisitorComponents.VisitorCarFrameSP clientCarFrameSP1;
    private com.saad.VisitorComponents.CommentSP commentSP1;
    private com.saad.GlobalComponents.Footer2 footer21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.saad.GlobalComponents.LoginHeadPanel loginHeadPanel1;
    private com.saad.VisitorComponents.VisitorMenu visitorMenu1;
    // End of variables declaration//GEN-END:variables
}
