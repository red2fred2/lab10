package lab10;

import java.awt.*;
import java.applet.*;


public class Lab10vst extends Applet {
	public void paint(Graphics g) {
	   
	   //declare variables
	   final Point carPosition = new Point(100, 100);
	   
	   //initialize objects
       Car car = new Car(g, carPosition, new Color(200,5,15 ));
       
       //do the thing
       car.draw();
   }
}
