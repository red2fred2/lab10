import java.awt.Color;
import java.awt.Graphics;

class Door {
   
   protected Graphics g;
   private Point topLeft;
   private Polygon[] shape;
   
   public Door(Graphics g, Point topLeft) {
      this.g = g;
      this.topLeft = topLeft;
      
      Point one = new Point(0, 0);
      Point two = new Point(100, 100);
      Point three = new Point(100, 0);
      Point four = new Point(0, 0);
      
      Point[] arr = new Point[4];
      arr.push(one);
      arr.push(two);
      arr.push(three);
      arr.push(four);
      
      this.shape = new Polygon(g, arr, Color.red);
   }
   
   public void draw() {
      shape.fill();
   }
}