import java.awt.Color;
import java.awt.Graphics;

class LugNut extends Circle {
   
   final private int diameter = 5;
   
   public LugNut(Graphics g, Point topLeft) {
      super(g, topLeft.getX(), topLeft.getY(), topLeft.getX() + diameter, topLeft.getY() + diameter);
      super.setColor(Color.grey);
   }
   
   public void draw() {
      super.fill();
   }
}