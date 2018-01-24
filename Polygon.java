import java.awt.Graphics;

public class Polygon extends DrawableObject {

   protected Point[] points;
   protected int numberOfPoints;

   protected int[] xPoints;
   protected int[] yPoints;

   /**
    * 
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
      }
      
      graphics.setColor(color);
      graphics.fillPolygon(xPoints, yPoints, numberOfPoints);
   }

}
