/**
 * CS 149 Exercise 6.1 CodingBat String-1.
 *
 * @author Zachary Shin
 * @version 10/13/21
 */
public class BatString1 {

   /**
    * Given a string of even length, return the first half. So the string
    * "WooHoo" yields "Woo".
    *
    * @param str input string
    * @return result string
    */
   public static String firstHalf(String str) {
      return str.substring(0, str.length() / 2);
   }

   /**
    * Given a string, return a version w/o the first and last char. So "Hello"
    * yields "ell". The string length will be at least 2.
    *
    * @param str input string
    * @return result string
    */
   public static String withoutEnd(String str) {
      return str.substring(1, str.length() - 1);
   }

   /**
    * Given a string, return the string made of its first two chars, so the
    * String "Hello" yields "He". If the string is shorter than length 2,
    * return whatever there is, so "X" yields "X", and the empty string ""
    * yields the empty string "".
    *
    * @param str input string
    * @return result string
    */
   public static String firstTwo(String str) {
      if (str.length() > 1) {
         return str.substring(0, 2);
      }
      return str;
   }

   /**
    * Given a string, return a new string made of 3 copies of the last 2 chars
    * of the original string. The string length will be at least 2.
    *
    * @param str input string
    * @return result string
    */
   public static String extraEnd(String str) {
      String end = str.substring(str.length() - 2);
      return end + end + end;
   }   

   /**
    * Given two strings, append them together (known as "concatenation") and
    * return the result. However, if the concatenation creates a double-char,
    * then omit one of the chars, so "abc" and "cat" yields "abcat".
    *
    * @param a first string
    * @param b second string
    * @return result string
    */
   public static String conCat(String a, String b) {
      String result = a + b;
      if (a.length() > 0 && b.length() > 0) {
         char backA = a.charAt(a.length() - 1);
         char frontB = b.charAt(0);
         if (backA == frontB) {
            return a.substring(0, a.length() - 1) + b;
         }
      }
      return result;
   }

}