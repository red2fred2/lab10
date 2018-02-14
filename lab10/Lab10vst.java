package lab10;

import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
	   
	   //declare variables
	   final Point car1Position = new Point(100, 100);
	   final Point car2Position = new Point(400, 100);
      
	   //initialize objects
       Car car1 = new Car(g, car1Position, new Color(200,5,15 ));
       Car car2 = new Car(g, car2Position, new Color(15,5,200 ));
       
       //do the thing
       car1.draw();
       car2.draw();
   }
}
