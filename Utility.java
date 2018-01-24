import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
   public static Object[] append(int[] array, int i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(array));
      temp.add(i);
      return temp.toArray();
   }
   
   public static Object[] append(Rectangle[] array, Rectangle i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(array));
      temp.add(i);
      return temp.toArray();
   }
   
   public static Object[] append(Circle[] array, Circle i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(array));
      temp.add(i);
      return temp.toArray();
   }
   
   public static Object[] append(Line[] array, Line i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(array));
      temp.add(i);
      return temp.toArray();
   }
   
   public static Object[] append(Polygon[] array, Polygon i) {
      ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(array));
      temp.add(i);
      return temp.toArray();
   }

}
