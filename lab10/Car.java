package lab10;

import java.awt.Color;
import java.awt.Graphics;



public class Car {

   private Graphics graphics;

   public Car(Graphics g) {
      graphics = g;
      Body body = new Body(g, new Point(100, 100));
   }
}