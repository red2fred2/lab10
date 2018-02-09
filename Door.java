import java.awt.Color;
import java.awt.Graphics;

class Door {
   
   protected Graphics g;
   private Point topLeft;
   private Polygon[] shape;
   
   public Door(Graphics g, Point topLeft) {
      this.g = g;
      this.topLeft = topLeft;
      this.shape = new Polygon(g, [Point(0, 0), Point(100, 100), Point(100, 0), Point(0, 0)], Color.red);
   }
   
   public void draw() {
      shape.fill()
   }
}