package lab10;
import java.awt.Graphics;

public class Body {

   protected Graphics g;
   private Polygon shape;

   public Body(Graphics g, Point topLeft) {

      this.g = g;
   }

   public void Draw() {
      shape.fill();
   }

}
