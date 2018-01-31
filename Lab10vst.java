import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
       
       Head head = new Head(g, new Point(0, 0), new Point(200, 200));
       head.draw();
   }
}
