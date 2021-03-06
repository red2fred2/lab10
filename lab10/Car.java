package lab10;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a car
 */
public class Car {
   
   /** The body of the car */
   private Body body;
   private static final int bodyXOffset = 0;
   private static final int bodyYOffset = 50;
   
   /** The roof of the car */
   private Roof roof;
   private static final int roofXOffset = 50;
   private static final int roofYOffset = 0;
   
   /** the left wheel of the car */
   private Wheel leftWheel;
   private static final int leftWheelXOffset = 25;
   private static final int leftWheelYOffset = 75;
   
   /** the right wheel of the car */
   private Wheel rightWheel;
   private static final int rightWheelXOffset = 200;
   private static final int rightWheelYOffset = 75;
   
   /** the top left corner of the car's rectangular bounding box */
   protected Point position;
   
   /**
    * @param graphics
    *   The graphics class to be used
    * @param position
    *   the top left corner of the car's rectangular bounding box
    * @param color
    *   body color
    */
   public Car(Graphics graphics, Point position, Color color) {
      final int positionX = position.getX();
      final int positionY = position.getY();
      
      this.body = new Body(
         graphics,
         new Point(
            position.getX() + bodyXOffset,
            position.getY() + bodyYOffset
         ),
         color
      );
      
      this.roof = new Roof(
         graphics,
         new Point(
            position.getX() + roofXOffset,
            position.getY() + roofYOffset
         ),
         color
      );
      
      this.leftWheel = new Wheel(
         graphics,
         new Point(positionX + leftWheelXOffset, positionY + leftWheelYOffset)
      );
      
      this.rightWheel = new Wheel(
         graphics,
         new Point(positionX + rightWheelXOffset, positionY + rightWheelYOffset)
      );
   }
   
   /**
    * Draws the car
    */
   public void draw() {
      body.draw();
      roof.draw();
      leftWheel.draw();
      rightWheel.draw();
   }
}
