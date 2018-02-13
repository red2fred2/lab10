package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * An object to be drawn
 */
class DrawableObject {

   /** The root graphics object */
   protected Graphics graphics;
   /** Object color */
   protected Color color;

   /**
    * @param graphics
    *   The root graphics object
    */
   public DrawableObject(Graphics graphics) {
      this.graphics = graphics;
      this.color = Color.GRAY;
   }

   /**
    * @param graphics
    *   The root graphics object
    * @param color
    *   object color
    */
   public DrawableObject(Graphics graphics, Color color) {
      this.graphics = graphics;
      this.color = color;
   }
   
   /**
    * Sets the object's color
    * @param color
    *   Object's color
    */
   public void setColor(Color color) {
      this.color = color;
   }

}
