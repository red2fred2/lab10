package lab10;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents the roof of a car
 */
public class Roof {

   /** The graphics object to be used */
   protected Graphics graphics;
   /** The general shape of the roof */
   private Rectangle roofMiddle;
   private static final int roofWidth = 175;
   private static final int roofHeight = 50;

   /**
    * @param graphics
    *   The graphics object to be used
    * @param topLeft
    *   the top left corner of the roof's rectangular bounding box
    * @param color
    *   body color
    */
   public Roof(Graphics graphics, Point position, Color color) {
         
         
      this.graphics = graphics;
      this.roofMiddle = new Rectangle(
         graphics,
         new Point(
            position.getX(),
            position.getY()
         ), 
         new Point(
            position.getX() + roofWidth,
            position.getY() + roofHeight
         ),
         color
      );
   }

   /**
    * Draws the body
    */
   public void draw() {
      roofMiddle.fill();
   }
}
