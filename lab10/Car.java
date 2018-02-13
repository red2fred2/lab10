package lab10;
import java.awt.Graphics;

public class Car {
   
   Body body;
   
   public Car(Graphics g) {
      this.body = new Body(g, new Point(100, 100));
   }
   
   public void draw() {
      
   }
}
