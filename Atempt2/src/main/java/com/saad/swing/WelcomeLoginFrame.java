
package com.saad.swing;

import com.saad.AdminComponents.AdminFrame;
import com.saad.Classes.Account;
import static com.saad.Classes.Account.*;
import com.saad.Classes.Car;
import com.saad.ClientComponents.ClientCarCard;
import com.saad.ClientComponents.ClientCarFrameSP;
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
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/**
 *
 * @author saadk
 */
public class WelcomeLoginFrame extends javax.swing.JPanel {

    /**
     * Creates new form WelcomeLoginFrame
     */
    public WelcomeLoginFrame() {
        initComponents();
//          logo.setSize(411, 55);
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
//
//          view.setSize(25, 27);
//        
//Icon originalIcon2 = view.getIcon();
//int iconWidth2 = originalIcon2.getIconWidth();
//int iconHeight2 = originalIcon2.getIconHeight();
//Image scaledImage2 = new BufferedImage(iconWidth2, iconHeight2, BufferedImage.TYPE_INT_ARGB);
//Graphics2D graphics2 = (Graphics2D) scaledImage2.getGraphics();
//originalIcon2.paintIcon(view, graphics2, 0, 0);
//graphics2.dispose();
//scaledImage2 = scaledImage2.getScaledInstance(view.getWidth(), view.getHeight(), Image.SCALE_SMOOTH);
//view.setIcon(new ImageIcon(scaledImage2));

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
        jLabel2 = new javax.swing.JLabel();
        EmailTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        BackFromLogin = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        PasswordTf = new javax.swing.JPasswordField();
        view = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        footer1 = new com.saad.GlobalComponents.Footer();

        setMaximumSize(new java.awt.Dimension(650, 743));
        setMinimumSize(new java.awt.Dimension(650, 743));
        setPreferredSize(new java.awt.Dimension(650, 743));

        panelBorder1.setMaximumSize(new java.awt.Dimension(650, 768));
        panelBorder1.setMinimumSize(new java.awt.Dimension(650, 768));
        panelBorder1.setPreferredSize(new java.awt.Dimension(650, 768));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        EmailTf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EmailTf.setForeground(new java.awt.Color(51, 51, 51));
        EmailTf.setAlignmentY(0.0F);
        EmailTf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        loginButton.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 51, 51));
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 46, 48), 0, true));
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

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

        ErrorMessage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(132, 34, 34));

        PasswordTf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordTf.setForeground(new java.awt.Color(51, 51, 51));
        PasswordTf.setAlignmentY(0.0F);
        PasswordTf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));
        PasswordTf.setCaretColor(new java.awt.Color(140, 140, 140));

        view.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(31, 47, 49)));
        view.setMaximumSize(new java.awt.Dimension(25, 27));
        view.setMinimumSize(new java.awt.Dimension(25, 27));
        view.setPreferredSize(new java.awt.Dimension(25, 27));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
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
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackFromLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(filler1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailTf)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordTf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackFromLogin)
                .addGap(107, 107, 107))
        );

        EmailTf.setBackground(new Color(0,0,0,0));
        PasswordTf.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(footer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(651, 651, 651))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(footer1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked

    String email = EmailTf.getText();
    String password = PasswordTf.getText();

    Account account = Login(email, password);
    boolean liAdmin = LoginAdmin(email, password);

    if (account != null) {
        if (liAdmin == false) {
            
            try {
                main thewelcomeframe = (main) SwingUtilities.getWindowAncestor(this);
                thewelcomeframe.setVisible(false);
                
                ClientFrame frame = new ClientFrame(account);
                frame.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(WelcomeLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else {
            
            main thewelcomeframe = (main) SwingUtilities.getWindowAncestor(this);
            thewelcomeframe.setVisible(false);
            
            LinkedList<Car> carList = null;
            try {
                carList = Car.listCars();
            } catch (SQLException ex) {
                System.out.println("Error while retrieving cars: " + ex.getMessage());
            }
            AdminFrame af = new AdminFrame(carList);
            af.setVisible(true);
        }
    } else {
        ErrorMessage.setText("Invalid email or password");
    }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(Color.decode("#000000"));
        loginButton.setForeground(Color.decode("#000000"));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(null);
        loginButton.setForeground(Color.decode("#333333"));
    }//GEN-LAST:event_loginButtonMouseExited

    private void BackFromLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackFromLoginMouseClicked
        this.setVisible(false);
        WelcomeFrame wf = new WelcomeFrame();
        wf.setVisible(true);
    }//GEN-LAST:event_BackFromLoginMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
    PasswordTf.setEchoChar((char) 0);        // TODO add your handling code here:
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
    PasswordTf.setEchoChar('*');     }//GEN-LAST:event_viewMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackFromLogin;
    private javax.swing.JTextField EmailTf;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JPasswordField PasswordTf;
    private javax.swing.Box.Filler filler1;
    private com.saad.GlobalComponents.Footer footer1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private com.saad.swing.PanelBorder panelBorder1;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
