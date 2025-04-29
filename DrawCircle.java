import java.applet.Applet;
import java.awt.Graphics;

public class DrawCircle extends Applet {
    public void paint(Graphics g) {
        // Set circle properties
        int x = 50;      // x-coordinate of circle's top-left corner
        int y = 50;      // y-coordinate of circle's top-left corner
        int width = 100;  // width of circle
        int height = 100; // height of circle
        
        // Draw the circle
        g.drawOval(x, y, width, height);
    }
}