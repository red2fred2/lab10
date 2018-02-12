import java.awt.Color;
import java.awt.Graphics;

public class Body {

protected Graphics g;
private Point topLeft;
private Polygon shape;

public Body(Graphics g, Point topLeft) {

this.g = g;
this.topLeft = topLeft;
Point one = new Point(10,10);
Point two = new Point(100,100);
Point three = new Point(200,200);
Point four = new Point(250,200);

this.shape = new Polygon(g, [new Point(10,10), new Point(20,20), new Point(100,100)], Color.red);
}

public void Draw() {

shape.fill();

}

}
