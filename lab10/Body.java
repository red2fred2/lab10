package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents the body of a car
 */
public class Body {

   /** The graphics object to be used */
   protected Graphics graphics;
   /** The general shape of the body */
   private Rectangle base;
   private static final int baseWidth = 275;
   private static final int baseHeight = 50;


   /**
    * @param graphics
    *   The graphics object to be used
    * @param topLeft
    *   the top left corner of the body's rectangular bounding box
    * @param color
    *   body color
    */
   public Body(Graphics graphics, Point position, Color color) {
      
      
      this.graphics = graphics;
      this.base = new Rectangle(
         graphics,
         new Point(
            position.getX(),
            position.getY()
         ), 
         new Point(
            position.getX() + baseWidth,
            position.getY() + baseHeight
         ),
         color
      );
   }
   
   /**
    * Draws the body
    */
   public void draw() {
      base.fill();
   }

}
