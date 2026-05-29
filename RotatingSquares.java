/*
 * Jpanel upon which drawing will be created using polygon
 * C. Anderson
 */

import javax.swing.*;
import java.awt.*;

public class DrawingBoard2 extends JPanel {
    
    int strokeWidth = 2;

    public void paintComponent(Graphics g) {

        this.setBackground(Color.WHITE);
        this.drawDesign(g, 350, 300, 100, 90);
    }

    public void drawDesign(Graphics g, int xCenter, int yCenter, 
            int halfWidth, int maxAngle) {
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeWidth));

        int angle = 0;
        int angleIncr = 10;

        while(angle < maxAngle) {
            int x1 = xCenter + (int) (halfWidth * 
                Math.cos(Math.toRadians(angle)));
            int x2 = xCenter + (int) (halfWidth *
                Math.cos(Math.toRadians(angle + 90)));
            int x3 = xCenter + (int) (halfWidth *
                Math.cos(Math.toRadians(angle + 180)));
            int x4 = xCenter + (int) (halfWidth * 
                Math.cos(Math.toRadians(angle + 270)));
     
            int y1 = yCenter + (int) (halfWidth * 
                Math.sin(Math.toRadians(angle)));
            int y2 = yCenter + (int) (halfWidth * 
                Math.sin(Math.toRadians(angle + 90)));
            int y3 = yCenter + (int) (halfWidth * 
                Math.sin(Math.toRadians(angle + 180)));
            int y4 = yCenter + (int) (halfWidth * 
                Math.sin(Math.toRadians(angle + 270)));
    
            int[] xes = {x1, x2, x3, x4};
            int[] yes = {y1, y2, y3, y4};
    
            g.drawPolygon(xes, yes, xes.length);
            angle += angleIncr;
        }
    }

    public static void main(String[] args) {
        
        int winWidth = 900;
        int winHeight = 700;

        JFrame myFrame = new JFrame("My Rotation Image");
        myFrame.setSize(winWidth, winHeight);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.add(new DrawingBoard2());
        
        myFrame.setVisible(true);
    }
}
