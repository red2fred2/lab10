import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
   public static Object[] append(int[] xPoints, int i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(xPoints));
      temp.add(i);
      return temp.toArray();
   }

}
