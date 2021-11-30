/**
 * CS 149 Exercise 6.2 CodingBat String-2.
 *
 * @author Zachary Shin
 * @version 10/13/21
 */
public class BatString2 {

   /**
    * Given a string, return a string where for every char in the original,
    * there are two chars.
    *
    * @param str input string
    * @return result string
    */
   public static String doubleChar(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
         result = result + str.charAt(i) + str.charAt(i);
      }
      return result;
   }

   /**
    * Return true if the string "cat" and "dog" appear the same number of times
    * in the given string.
    *
    * @param str input string
    * @return result boolean
    */
   public static boolean catDog(String str) {
      int cat = 0;
      int dog = 0;
      String catName = "cat";
      String dogName = "dog";
  
      for (int i = 0; i < str.length() - 2; i++) {
         if (catName.equals(str.substring(i, i + 3))) {
            cat++;
         }
         if (dogName.equals(str.substring(i, i + 3))) {
            dog++;
         }
      }
      return cat == dog;
   }

}
