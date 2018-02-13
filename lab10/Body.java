package lab10;

import java.awt.Color;
import java.awt.Graphics;

public class Body {

protected Graphics g;
private Point topLeft;
private Polygon shape;

public Body(Graphics g, Point topLeft) {

   this.g = g;
   this.topLeft = topLeft;
   
}

public void Draw() {

shape.fill();

}

}
