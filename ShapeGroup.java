import java.awt.*;

public class ShapeGroup {
   
   Graphics g;
   
   Rectangle[] rectangles;
   Circle[] circles;
   Line[] lines;
   Polygon[] polygons;
   
   public ShapeGroup(Graphics g) {
      this.g = g;
   }
   
   public void add(Rectangle... rects) {
      for(Rectangle rectangle : rects) {
         Utility.append(this.rectangles, rectangle);
      }
   }
   
   public void add(Circle... circs) {
      for(Circle circle : circs) {
         Utility.append(this.circles, circle);
      }
   }
   
   public void add(Line... lin) {
      for(Line line : lin) {
         Utility.append(this.lines, line);
      }
   }
   
   public void add(Polygon... polys) {
      for(Polygon polygon : polys) {
         Utility.append(this.polygons, polygon);
      }
   }
   
   private void draw(Rectangle rect) {rect.draw();}
   private void draw(Circle circ) {circ.draw();}
   private void draw(Line lin) {lin.draw();}
   private void draw(Polygon poly) {poly.draw();}
   
   private void fill(Rectangle rect) {rect.fill();}
   private void fill(Circle circ) {circ.fill();}
   private void fill(Polygon poly) {poly.fill();}
   
   protected void drawAll() {
      for(Rectangle rect : rectangles) draw(rect);
      for(Circle circ : circles) draw(circ);
      for(Line lin : lines) draw(lin);
      for(Polygon poly : polygons) draw(poly);
   }
   
   protected void fillAll() {
      /*if(rectangles.length > 0) {
         for(Rectangle rect : rectangles) fill(rect);
      }
      if(circles.length > 0) {
         for(Circle circ : circles) fill(circ);
      }
      if(lines.length > 0) {
         for(Line lin : lines) draw(lin);
      }
      if(polygons.length > 0) {
         for(Polygon poly : polygons) fill(poly);
      }*/
   }
   
}
