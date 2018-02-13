package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a car wheel
 */
class Wheel extends Circle {

   /**
    * @param graphics
    *   graphics object
    * @param topLeft
    *   top left corner of this wheel's bounding box
    */
   public Wheel(Graphics graphics, Point topLeft) {
      super(graphics, topLeft, 50);
      setColor(new Color(50,50,50));
   }
   
   /**
    * Draws the wheel
    */
   public void draw() {
      super.fill();  
   }
   
}
