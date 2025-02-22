package com.saad.GlobalComponents;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginHeadPanel extends JPanel {

    private final Color backgroundColor = new Color(51,51,51); // Set the background color
    private final JButton minimizeButton = new JButton("-");
    private final JButton closeButton = new JButton("x");

    public LoginHeadPanel() {
        // Set the panel properties
        setPreferredSize(new Dimension(800, 20));
        setBackground(backgroundColor);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        // Set up the minimize button
        minimizeButton.setPreferredSize(new Dimension(25, 25));
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setBorder(BorderFactory.createEmptyBorder());
        minimizeButton.setOpaque(false);
        minimizeButton.setFont(new Font("Arial", Font.BOLD, 16));
        minimizeButton.setForeground(Color.decode("#CCCCCC"));
        minimizeButton.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                // Change this to minimize the app
                JFrame frame = (JFrame) LoginHeadPanel.this.getRootPane().getParent();
                frame.setState(JFrame.ICONIFIED);
            }
        });
        minimizeButton.setToolTipText("Minimize");
        add(minimizeButton);

        // Set up the close button
        closeButton.setPreferredSize(new Dimension(25, 25));
        closeButton.setContentAreaFilled(false);
        closeButton.setBorder(BorderFactory.createEmptyBorder());
        closeButton.setOpaque(false);
        closeButton.setFont(new Font("Arial", Font.BOLD, 16));
        closeButton.setForeground(Color.decode("#CCCCCC"));
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0); // Change this to close the app
            }
        });
        closeButton.setToolTipText("Close");
        add(closeButton);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(backgroundColor);
        int width = getWidth();
        int height = getHeight();
        // Draw the rounded rectangle shape
        GeneralPath path = new GeneralPath();
        path.moveTo(0, height);
        path.lineTo(0, 15);
        path.append(new RoundRectangle2D.Double(0, 0, width - 15, height, 15, 15), true);
        path.lineTo(width - 15, height);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);

        path.closePath();
        g2.fill(path);

}


private int x;
private int y;

public void initMoving(JFrame frame) {
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


}