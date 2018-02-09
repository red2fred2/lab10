import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
       Door door = new Door(g, new Point(100, 100));
       door.draw();
   }
}
