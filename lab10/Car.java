//package stuff
package lab10;
import java.awt.Graphics;

/**
 * Represents a car
 */
public class Car {
   
   //decalare variables
   private Body body;
   protected Point position;
   
   /**
    * @param graphics
    *   The graphics class to be used
    * @param position
    *   the top left corner of the car's rectangular bounding box
    */
   public Car(Graphics graphics, Point position) {
      this.body = new Body(graphics, new Point(100, 100));
   }
   
   /**
    * Draws the car
    */
   public void draw() {
      
   }
}
