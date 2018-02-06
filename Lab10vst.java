import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
       
       Circle circle = new Circle(g, new Point(100, 100), new Point(200, 200), new Color(0x50, 0x20, 0x20));
       circle.fill();
   }
}
