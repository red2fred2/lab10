import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends DrawableObject {

   protected Point[] points;
   protected int numberOfPoints = 0;

   protected int[] xPoints;
   protected int[] yPoints;

   /**
    * @param graphics
    *           specific graphics object
    * @param points
    *           array of polygon points
    */
   public Polygon(Graphics graphics, Point[] points) {
      super(graphics);

      for (Point point : points) {
         Utility.append(xPoints, point.getX());
         Utility.append(yPoints, point.getY());
         numberOfPoints++;
      }
   }

   /**
    * @param graphics
    *           specific graphics object
    * @param points
    *           array of polygon points
    * @param color
    */
   public Polygon(Graphics graphics, Point[] points, Color color) {
      super(graphics, color);

      for (Point point : points) {
         Utility.append(xPoints, point.getX());
         Utility.append(yPoints, point.getY());
         numberOfPoints++;
      }
   }

   public void draw() {
      graphics.setColor(color);
      graphics.drawPolygon(xPoints, yPoints, numberOfPoints);
   }

   public void fill() {
      graphics.setColor(color);
      graphics.fillPolygon(xPoints, yPoints, numberOfPoints);
   }

}
