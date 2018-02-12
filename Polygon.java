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
      super.graphics.setColor(color);
      super.graphics.drawPolygon(xPoints, yPoints, numberOfPoints);
   }

   public void fill() {
      super.graphics.setColor(color);
      super.graphics.fillPolygon(xPoints, yPoints, numberOfPoints);
   }
   
   public void setColor(Color color) {
      super.setColor(color);
   }

}
