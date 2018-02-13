package lab10;

/**
 * An x, y point
 */
class Point {

   private int x;
   private int y;

   public Point() {
      this.x = 0;
      this.y = 0;
   }

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }
   
}
