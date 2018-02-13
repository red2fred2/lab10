package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Polygon wrapper class
 */
public class Polygon extends DrawableObject {

   /** array of Point objects */
   protected Point[] points;
   /** duh */
   protected int numberOfPoints = 0;

   /** array of X components */
   protected int[] xPoints;
   /** array of Y components */
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

   /**
    * Draws the polygon
    */
   public void draw() {
      super.graphics.setColor(color);
      super.graphics.drawPolygon(xPoints, yPoints, numberOfPoints);
   }

   /**
    * Draws the polygon
    */
   public void fill() {
      super.graphics.setColor(color);
      super.graphics.fillPolygon(xPoints, yPoints, numberOfPoints);
   }

}
