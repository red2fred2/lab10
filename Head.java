import java.awt.*;

class Head extends ShapeGroup {
   
   private Point overallTopLeft;
   private Point overallBottomRight;
   
   public Head(Graphics g,
               Point overallTopLeft,
               Point overallBottomRight) {
      super(g);
      this.overallTopLeft = overallTopLeft;
      this.overallBottomRight = overallBottomRight;
      this.add(new Circle(g, overallTopLeft, overallBottomRight));
   }
}