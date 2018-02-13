package lab10;
import java.awt.Graphics;
import java.util.Vector;

/**
 * Represents a car
 */
public class Car {
   
   private static final Vector<int[][]> bodyOffset = new Vector(0, 25);
   
   
   
   /** The body of the car */
   private Body body;
   /** the top left corner of the car's rectangular bounding box */
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
      body.Draw();
   }
}
