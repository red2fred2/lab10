import java.awt.Color;
import java.awt.Graphics;

class Wheel extends Circle {

final private int diameter = 40;

public Wheel(Graphics g, Point topLeft) {

   super(g, topLeft.getX(), topLeft.getY(), topLeft.getX() + diameter, topLeft.getY() + diameter);
   super.setColor(Color.grey)
}
}