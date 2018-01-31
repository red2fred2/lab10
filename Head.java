import java.awt.*;

class Head {

   private Circle shape;
   private Point overallTopLeft;
   private Point overallBottomRight;
   
   public Head(Graphics g, Point overallTopLeft, Point overallBottomRight) {
      this.overallTopLeft = overallTopLeft;
      this.overallBottomRight = overallBottomRight;
      shape = new Circle(g, overallTopLeft, overallBottomRight);
   }
   
   public void draw() {
      shape.fill();
   }
}