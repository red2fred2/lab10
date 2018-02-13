package lab10;
import java.awt.Color;
import java.awt.Graphics;

class Wheel extends Circle {

   public Wheel(Graphics g, Point topLeft) {
      super(g, topLeft, 50);
      super.setColor(Color.gray);
   }
   public void draw() {
      super.fill();  
   }
   
}
