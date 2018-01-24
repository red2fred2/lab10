public class ShapeGroup {

   Rectangle[] rectangles;
   Circle[] circles;
   Line[] lines;
   Polygon[] polygons;

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
      for(Rectangle rect : rectangles) fill(rect);
      for(Circle circ : circles) fill(circ);
      for(Line lin : lines) draw(lin);
      for(Polygon poly : polygons) fill(poly);
   }
   
}
