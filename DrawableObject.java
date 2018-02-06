import java.awt.Color;
import java.awt.Graphics;

/**
 * An object to be drawn
 */
class DrawableObject {

   private Graphics graphics;
   private Color color;

   /**
    * @param graphics
    *           specific graphics object
    */
   public DrawableObject(Graphics graphics) {
      this.graphics = graphics;
      this.color = new Color(0);
   }

   /**
    * @param graphics
    *           specific graphics object
    * @param color
    *           object color
    */
   public DrawableObject(Graphics graphics, Color color) {
      this.graphics = graphics;
      this.color = color;
   }
   
   public void setColor(Color color) {
      this.color = color;
   }

}