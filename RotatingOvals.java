/*
 * JPanel upon which drawing will be created
 * C. Anderson
 * 10/29/2020
 */

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {

    private int strokeWeight = 2;

    public void paintComponent(Graphics g) {

        this.setBackground(Color.WHITE);
        drawDesign(g, 400, 350, 100, 0, 360);
    }

    public void drawDesign(Graphics g, int xCenter, int yCenter, int radius, 
        int angle, int maxAngle) {

        int angleIncrement = 10;
        int size = 40;
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeWeight));

        while(angle < maxAngle) {

            int x1 = xCenter + (int) (radius * Math.cos(Math.toRadians(angle)));
            int y1 = yCenter + (int) (radius * Math.sin(Math.toRadians(angle)));
            g.drawOval(x1, y1, size, size);

            angle += angleIncrement;
        }
    }

    public static void main(String[] args) {
        
        int winWidth = 900;
        int winHeight = 700;

        JFrame myFrame = new JFrame("My Rotation Image");
        myFrame.setSize(winWidth, winHeight);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.add(new DrawingBoard());
        
        myFrame.setVisible(true);
    }
}