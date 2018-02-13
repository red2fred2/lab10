package lab10;
import java.awt.Graphics;

/**
 * Represents a car
 */
public class Car {
   
   /** The body of the car */
   private Body body;
   private static final int bodyXOffset = 0;
   private static final int bodyYOffset = 25;
   
   /** the top left corner of the car's rectangular bounding box */
   protected Point position;
   
   /**
    * @param graphics
    *   The graphics class to be used
    * @param position
    *   the top left corner of the car's rectangular bounding box
    */
   public Car(Graphics graphics, Point position) {
      this.body = new Body(
         graphics,
         new Point(bodyXOffset, bodyYOffset
      ));
   }
   
   /**
    * Draws the car
    */
   public void draw() {
      body.Draw();
   }
}
