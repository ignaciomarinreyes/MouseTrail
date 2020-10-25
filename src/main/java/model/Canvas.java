package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

public class Canvas extends JPanel {

    private final Point[] points;
    private int index = 0;
    private Color backgroundColour= Color.WHITE;
    private Color trailColour = new Color(255,153,153);
    
    public Canvas() {
        points = new Point[5];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(backgroundColour);
        this.setForeground(trailColour);
        if (points[points.length - 1] != null) {
            for (Point point : points) {
                g.fillOval(point.x, point.y, 15, 15);
            }
        }
    }

    public void setBackgroundColour(Color color) {
        this.backgroundColour = color;
    }

    public void setTrailColour(Color color) {
        this.trailColour = color;
    }

    public void createTrail(Point point) throws InterruptedException {
        points[index % 5] = point;
        index++;
        Thread.sleep(40);
    }
}
