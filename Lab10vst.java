import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
		//Head head = new Head(g, new Point(100, 100), new Point(500, 500));
      
       Circle object = new Circle(g, new Point(0, 0), new Point(500, 500));
       
       ShapeGroup group = new ShapeGroup(g);
       //group.add(object);
       group.fillAll();
	}
}
