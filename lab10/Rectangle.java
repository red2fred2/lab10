package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a rectangle
 */
class Rectangle extends DrawableObject {

   /** Top left corner */
   protected Point topLeft;
   /** Bottom right corner */
   protected Point bottomRight;

   /**
    * @param graphics
    *   The specific graphics object
    * @param topLeft
    *   Top left corner
    * @param bottomRight
    *   Bottom right corner
    */
   public Rectangle(Graphics graphics, Point topLeft, Point bottomRight) {
      super(graphics);

      this.topLeft = topLeft;
      this.bottomRight = bottomRight;
   }

   /**
    * @param graphics
    *   specific graphics object
    * @param topLeft
    * @param bottomRight
    * @param color
    */
   public Rectangle(Graphics graphics, Point topLeft, Point bottomRight, Color color) {
      super(graphics, color);

      this.topLeft = topLeft;
      this.bottomRight = bottomRight;
   }

   /**
    * Draws the rectangle
    */
   public void draw() {

      super.graphics.setColor(color);
      super.graphics.drawRect(topLeft.getX(), topLeft.getY(), bottomRight.getX() - topLeft.getX(), bottomRight.getY() - topLeft.getY());
   }

   /**
    * Draws the rectangle
    */
   public void fill() {
      super.graphics.setColor(color);
      super.graphics.drawRect(topLeft.getX(), topLeft.getY(), bottomRight.getX() - topLeft.getX(), bottomRight.getY() - topLeft.getY());
   }

}
