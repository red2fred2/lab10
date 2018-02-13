package lab10;

/**
 * An x, y point
 */
class Point {

   /** The X component of the point */
   private int x;
   /** The Y component of the point */
   private int y;

   /**
    * Creates a point from X and Y components
    * @param x
    *   The X component of the point
    * @param y
    *   The Y component of the point
    */
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * @return
    *   X component of the point
    */
   public int getX() {
      return this.x;
   }

   /**
    * @return
    *   Y component of the point
    */
   public int getY() {
      return this.y;
   }
   
}