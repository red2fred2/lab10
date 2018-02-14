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
   
   /** The left window */
   private Window leftWindow;
   private static final int leftWindowXOffset = 10;
   private static final int leftWindowYOffset = 10;
   
   /** The right window */
   private Window rightWindow;
   private static final int rightWindowXOffset = 115;
   private static final int rightWindowYOffset = 10;
   
   
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
      
      this.leftWindow = new Window(graphics,
         new Point(
            position.getX() + leftWindowXOffset,
            position.getY() + leftWindowYOffset
         )
      );
      
      this.rightWindow = new Window(graphics,
         new Point(
            position.getX() + rightWindowXOffset,
            position.getY() + rightWindowYOffset
         )
      );
   }

   /**
    * Draws the body
    */
   public void draw() {
      roofMiddle.fill();
      leftWindow.draw();
      rightWindow.draw();
   }
}
