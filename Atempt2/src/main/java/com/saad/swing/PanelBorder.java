package com.saad.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class PanelBorder extends javax.swing.JPanel {

    public PanelBorder() {
        initComponents();
         setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 46, 48), 5, true));
        setPreferredSize(new java.awt.Dimension(1300, 769));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("PanelBorder1");
    }// </editor-fold>//GEN-END:initComponents

@Override
 protected void paintChildren(Graphics grphcs) {
     Graphics2D g2 = (Graphics2D) grphcs;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    GradientPaint g = new GradientPaint(0, 0, Color.decode("#474747"), 0, getHeight(), Color.decode("#A8A8A8"));
    g2.setPaint(g);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);  
    super.paintChildren(grphcs);
    }
 
 private int x;
private int y;

public void initMoving2(JFrame frame) {
    addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent me) {
            int newX = (me.getXOnScreen() - x) ;
            int newY = me.getYOnScreen() - y;
            frame.setLocation(newX, newY);
        }
    });
    addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent me) {
            x = me.getX();
            y = me.getY();
        }
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
