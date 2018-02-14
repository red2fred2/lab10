package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents the window of a car
 */
public class Window {

   /** The graphics object to be used */
   protected Graphics graphics;
   /** The general shape of the body */
   private Rectangle window;
   private static final int windowWidth = 50;
   private static final int windowHeight = 40;

   /**
    * @param graphics
    *   The graphics object to be used
    * @param topLeft
    *   the top left corner of the window's
    */
   public Window(Graphics graphics, Point position) {
      
      
      this.graphics = graphics;
      this.window = new Rectangle(
         graphics,
         new Point(
            position.getX(),
            position.getY()
         ), 
         new Point(
            position.getX() + windowWidth,
            position.getY() + windowHeight
         ),
         new Color(225,245,255)
      );
   }
   
   /**
    * Draws the window
    */
   public void draw() {
      window.fill();
   }

}
