package lab10;
import java.awt.Color;
import java.awt.Graphics;

class Wheel extends Circle {

   final private int diameter = 40;

   public Wheel(Graphics g, Point topLeft) {
      super(g, topLeft, new Point(topLeft.getX() + 50, topLeft.getY() + 50));
      super.setColor(Color.gray);
   }
   public void draw() {
      super.fill();  
   }
}