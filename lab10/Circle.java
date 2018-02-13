package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * The representation of a circle
 */
class Circle extends DrawableObject {

   /** Top left corner of the circle's bounding box */
   protected Point topLeft;
   /** Circle diameter */
   private int diameter;

   /**
    * @param graphics
    *           specific graphics object
    * @param topLeft
    *   Top left corner of the circle's bounding box
    * @param diameter
    *   Circle's diameter
    */
   public Circle(Graphics graphics, Point topLeft, int diameter) {
      super(graphics);

      this.topLeft = topLeft;
      this.diameter = diameter;
   }

   /**
    * @param graphics
    *   Specific graphics object
    * @param topLeft
    *   Top left corner of the circle's bounding box
    * @param diameter
    *   This circle's diameter
    * @param color
    */
   public Circle(Graphics graphics, Point topLeft, int diameter, Color color) {
      super(graphics, color);

      this.topLeft = topLeft;
      this.diameter = diameter;
   }

   /**
    * Draws the circle which this object represents
    */
   public void draw() {
      graphics.setColor(color);
      graphics.drawOval(topLeft.getX(), topLeft.getY(), diameter, diameter);
   }

   /**
    * Draws the circle which this object represents
    */
   public void fill() {
      graphics.setColor(color);
      graphics.fillOval(topLeft.getX(), topLeft.getY(), diameter, diameter);
   }
   
   /**
    * Sets this circle's color
    */
   public void setColor(Color color) {
      super.setColor(color);
   }

}
