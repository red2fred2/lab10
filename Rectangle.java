class Rectangle extends DrawableObject {
   
   int leftX;
   int topY;
   int rightX;
   int bottomY;
   int width;
   int height;
   
   //constructor
   public Rectangle(Graphics g, Point topLeft, Point bottomRight) {
      
   }
   
   protected rect(Point topLeft, Point bottomRight) {
      final int leftX = topLeft.getX();
      final int topY = topLeft.getY();
      
      final int width = ;
      final int height = bottomY - topY;
      
      g.drawRect(leftX, topY, );
   }
}