/*
 * JPanel upon which drawing will be created using a polygon
 * Prashant Gupta & Rajeev Patel
 * 14 April 2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


public class DrawingBoard3 extends JPanel{
    
    int strokeWid = 2;

    public void paintComponent(Graphics g) {

        this.setBackground(Color.WHITE);
        int x = this.getWidth() / 2;
        int y = this.getHeight() / 2;

        drawDesign(g, x, y, 35, 3, 90, 30);
        drawDesign(g, x, y, 100, 5, 36, 9);
        drawDesign(g, x, y, 200, 6, 0, 9);
        drawDesign(g, x, y, 225, 11, 0, 36);
    }

    public void drawDesign(Graphics g, int startX, int startY, int halfWid,
            int numOfPoints, int angle, int angleIncr) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeWid));
        AffineTransform initRotation = g2.getTransform();

        int maxAngle = 360;

        int[] xes = new int[numOfPoints];
        int[] yes = new int[numOfPoints];

        for(int pointNum = 0; pointNum < numOfPoints; pointNum++) {
            double rotationAngle = Math.PI * (2 * pointNum + 1) / numOfPoints;
            xes[pointNum] = startX + (int) (halfWid * Math.cos(rotationAngle));
            yes[pointNum] = startY - (int) (halfWid * Math.sin(rotationAngle));
        }
        

        int fade = 5;
        while(angle < maxAngle) {

            Color color = new Color(255 - fade, 0, 0);
            g2.rotate(Math.toRadians(angle), startX, startY);
            g.setColor(color);
            g.drawPolygon(xes, yes, numOfPoints);

            angle += angleIncr;
            fade += 5;
        }
        g2.setTransform(initRotation);
    }

    public static void main(String[] args) {

        int frameWid = 900;
        int frameHeight = 700;

        JFrame drawingFrame = new JFrame();
        drawingFrame.setTitle("My Rotation Image  Prashant Gupta");
        drawingFrame.setSize(frameWid, frameHeight);
        drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingFrame.add(new DrawingBoard3());

        drawingFrame.setVisible(true);
    }
}
