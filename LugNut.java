import java.awt.Color;
import java.awt.Graphics;

class LugNut extends Circle {
   
   public LugNut(Graphics g, Point topLeft) {
      super(g, topLeft, new Point(topLeft.getX() + 5, topLeft.getY() + 5));
      super.setColor(Color.black);
   }
   
   public void draw() {
      super.fill();
   }
}