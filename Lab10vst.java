import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
       Wheel wheel = new Wheel(g, new Point(100, 100));
        Wheel wheel2 = new Wheel(g, new Point(200, 100));
       wheel.draw();
        wheel2.draw();
        
       Door door = new Door(g, new Point(100, 100));
       door.draw();
   }
}
