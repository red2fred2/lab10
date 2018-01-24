import java.awt.Graphics;

class Rectangle extends DrawableObject {
   
   protected int leftX;
   protected int topY;
   protected int rightX;
   protected int bottomY;
   protected int width;
   protected int height;
   
   //constructor
   public Rectangle(Graphics g, Point topLeft, Point bottomRight) {//
      super(g);
	   
	  this.leftX = topLeft.getX();
      this.topY = topLeft.getY();
      this.rightX = bottomRight.getX();
      this.bottomY = bottomRight.getY();
      
      this.width = this.rightX - this.leftX;
      this.height = this.bottomY - this.topY;
   }
   
   public Rectangle(Graphics g, int leftX, int topY, int width, int height) {
      super(g);
   }
   
   protected void rect(Point topLeft, Point bottomRight) {
      final int leftX = topLeft.getX();
      final int topY = topLeft.getY();
      
      final int width = rightX - leftX;
      final int height = bottomY - topY;
      
      graphics.drawRect(leftX, topY, width, height);
   }
}