/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.ClientComponents;

import com.saad.VisitorComponents.*;
import com.saad.ClientComponents.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author saadk
 */
public class CommentFrame extends javax.swing.JPanel {

    /**
     * Creates new form AdminCarFrame
     */
    public CommentFrame() {
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

        clientCarCard2 = new com.saad.ClientComponents.ClientCarCard();
        CarCardGrid = new javax.swing.JPanel();

        setBackground(new java.awt.Color(226, 226, 226));
        setForeground(new java.awt.Color(255, 255, 255));

        CarCardGrid.setBackground(new java.awt.Color(211, 211, 211));
        CarCardGrid.setOpaque(false);
        CarCardGrid.setLayout(new java.awt.GridLayout(100, 1, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(CarCardGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CarCardGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel CarCardGrid;
    private com.saad.ClientComponents.ClientCarCard clientCarCard2;
    // End of variables declaration//GEN-END:variables
}
