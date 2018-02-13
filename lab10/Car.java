package lab10;
import java.awt.Graphics;

/**
 * Represents a car
 */
public class Car {
   
   /** The body of the car */
   private Body body;
   private static final int bodyXOffset = 0;
   private static final int bodyYOffset = 25;
   
   /** the left wheel of the car */
   private Wheel leftWheel;
   private static final int leftWheelXOffset = 0;
   private static final int leftWheelYOffset = 50;
   
   /** the right wheel of the car */
   private Wheel rightWheel;
   private static final int rightWheelXOffset = 100;
   private static final int rightWheelYOffset = 50;
   
   /** the top left corner of the car's rectangular bounding box */
   protected Point position;
   
   /**
    * @param graphics
    *   The graphics class to be used
    * @param position
    *   the top left corner of the car's rectangular bounding box
    */
   public Car(Graphics graphics, Point position) {
      final int positionX = position.getX();
      final int positionY = position.getY();
      
      this.body = new Body(
         graphics,
         new Point(bodyXOffset, bodyYOffset
      ));
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
      leftWheel.draw();
      rightWheel.draw();
   }
}
