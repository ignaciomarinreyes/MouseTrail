package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    private Point [] points;
    private int index = 0;
    public Canvas() {
        points = new Point [5];
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        this.setForeground(Color.RED);
        if (points[points.length-1] != null) {
            for (Point point : points) {
                g.fillOval(point.x, point.y, 15, 15);
            }
        }
    }

    public void paintBackground(Colour color) {
        switch (color) {
            case BLUE:

                this.setBackground(Color.blue);
                break;
            case RED:

                this.setBackground(Color.red);
                break;
            case GREEN:
                this.setBackground(Color.green);
                break;
            default:
                this.setBackground(Color.white);
        }
    }
    
    public void setTrailColour(Colour color) {
        //To-DO
        switch (color) {
            case BLUE:
               
                //this.setBackground(Color.blue);
                break;
            case RED:

                //this.setBackground(Color.red);
                break;
            case GREEN:
                //this.setBackground(Color.green);
                break;
            default:
                //this.setBackground(Color.white);
        }
    }
    public void createTrail(Point point) throws InterruptedException{
        points[index%5] = point;
        index++;
        Thread.sleep(50);
    }
}
