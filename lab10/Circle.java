package lab10;
import java.awt.Color;
import java.awt.Graphics;

class Circle extends DrawableObject {

   protected Point topLeft;
   protected Point bottomRight;

   protected int leftX;
   protected int topY;
   protected int rightX;
   protected int bottomY;
   protected int width;
   protected int height;

   /**
    * @param graphics
    *           specific graphics object
    * @param topLeft
    * @param bottomRight
    */
   public Circle(Graphics graphics, Point topLeft, Point bottomRight) {
      super(graphics);

      this.topLeft = topLeft;
      this.bottomRight = bottomRight;

      this.leftX = topLeft.getX();
      this.topY = topLeft.getY();
      this.rightX = bottomRight.getX();
      this.bottomY = bottomRight.getY();

      this.width = this.rightX - this.leftX;
      this.height = this.bottomY - this.topY;
   }

   /**
    * @param graphics
    *           specific graphics object
    * @param leftX
    * @param topY
    * @param width
    * @param height
    */
   public Circle(Graphics graphics, int leftX, int topY, int width, int height) {
      super(graphics);

      this.topLeft = new Point(leftX, topY);
      this.bottomRight = new Point(rightX, bottomY);

      this.leftX = leftX;
      this.topY = topY;
      this.width = width;
      this.height = height;

      this.rightX = leftX + width;
      this.topY = topY + height;
   }

   /**
    * @param graphics
    *           specific graphics object
    * @param topLeft
    * @param bottomRight
    * @param color
    */
   public Circle(Graphics graphics, Point topLeft, Point bottomRight, Color color) {
      super(graphics, color);

      this.topLeft = topLeft;
      this.bottomRight = bottomRight;

      this.leftX = topLeft.getX();
      this.topY = topLeft.getY();
      this.rightX = bottomRight.getX();
      this.bottomY = bottomRight.getY();

      this.width = this.rightX - this.leftX;
      this.height = this.bottomY - this.topY;
   }

   /**
    * @param graphics
    *           specific graphics object
    * @param leftX
    * @param topY
    * @param width
    * @param height
    * @param color
    */
   public Circle(Graphics graphics, int leftX, int topY, int width, int height, Color color) {
      super(graphics, color);

      this.topLeft = new Point(leftX, topY);
      this.bottomRight = new Point(rightX, bottomY);

      this.leftX = leftX;
      this.topY = topY;
      this.width = width;
      this.height = height;

      this.rightX = leftX + width;
      this.topY = topY + height;
   }

   public void draw() {
      final int leftX = topLeft.getX();
      final int topY = topLeft.getY();
      final int width = rightX - leftX;
      final int height = bottomY - topY;

      graphics.setColor(color);
      graphics.drawOval(leftX, topY, width, height);
   }

   public void fill() {
      final int leftX = topLeft.getX();
      final int topY = topLeft.getY();
      final int width = rightX - leftX;
      final int height = bottomY - topY;

      graphics.setColor(color);
      graphics.fillOval(leftX, topY, width, height);
   }
   
   public void setColor(Color color) {
      super.setColor(color);
   }

}