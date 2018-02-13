package lab10;
import java.awt.Graphics;

/**
 * Represents the body of a car
 */
public class Body {

   /** The graphics object to be used */
   protected Graphics graphics;
   /** The general shape of the body */
   private Polygon shape;

   /**
    * @param graphics
    *   The graphics object to be used
    * @param topLeft
    *   the top left corner of the body's rectangular bounding box
    */
   public Body(Graphics graphics, Point position) {
      this.graphics = graphics;
   }
   
   /**
    * Draws the body
    */
   public void draw() {
      //shape.fill();
   }

}
