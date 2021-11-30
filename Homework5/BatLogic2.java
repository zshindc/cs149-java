/**
 * CS 149 Exercise 5.2 CodingBat Logic-2.
 *
 * @author Zachary Shin
 * @version 10/6/21
 */
public class BatLogic2 {

   /**
    * For this problem, we'll round an int value up to the next multiple of 10
    * if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately,
    * round down to the previous multiple of 10 if its rightmost digit is less
    * than 5, so 12 rounds down to 10.
    *
    * Given 3 ints, a b c, return the sum of their rounded values. To avoid
    * code repetition, write a separate helper "public int round10(int num)"
    * and call it 3 times. Write the helper entirely below and at the same
    * indent level as roundSum().
    *
    * @param a 1st number
    * @param b 2nd number
    * @param c 3rd number
    * @return sum of rounded values
    */
   public static int roundSum(int a, int b, int c) {
      return round10(a) + round10(b) + round10(c);
   }

   /**
    * Helper method for roundSum. Rounds the given integer to the closest
    * multiple of 10.
    *
    * @param num the number
    * @return rounded number
    */
   public static int round10(int num) {
      if (num % 10 <= 4) {
         return num / 10 * 10;
      }
      return num / 10 * 10 + 10;
   }

   /**
    * Given 2 int values greater than 0, return whichever value is nearest to
    * 21 without going over. Return 0 if they both go over.
    *
    * @param a value of 1st hand
    * @param b value of 2nd hand
    * @return value of the winner
    */
   public static int blackjack(int a, int b) {
      int value = 0;
      if (a <= 21 && b > 21) {
         value = a;
      } else if (b <= 21 && a > 21) {
         value = b;
      } else if (a <= 21 && b <= 21) {
         if (a <= b) {
            value = b;
         } else {
            value = a;
         }
      }
      return value;
   }
}