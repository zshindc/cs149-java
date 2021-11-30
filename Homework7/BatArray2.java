/**
 * CS 149 Exercise 7.1 CodingBat Array-2.
 *
 * @author Zachary Shin
 * @version 10/20/21
 */
public class BatArray2 {

   /**
    * Given a number n, create and return a new int array of length n,
    * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which
    * case just return a length 0 array. You do not need a separate
    * if-statement for the length-0 case; the for-loop should naturally execute
    * 0 times in that case, so it just works.
    *
    * @param n length of the sequence
    * @return sequence of ints 0..n-1
    */
   public static int[] fizzArray(int n) {
      int[] result = new int[n];
      for (int i = 0; i < n; i++) {
         result[i] = i;
      }
      return result;
   }

   /**
    * Given a number n, create and return a new string array of length n,
    * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which
    * case just return a length 0 array. Note: String.valueOf(xxx) will make
    * the String form of most types.
    *
    * @param n length of the sequence
    * @return sequence of "0"..n-1
    */
   public static String[] fizzArray2(int n) {
      String[] result = new String[n];
      for (int i = 0; i < n; i++) {
         result[i] = String.valueOf(i);
      }
      return result;
   }

   /**
    * Given start and end numbers, return a new array containing the sequence
    * of integers from start up to but not including end, so start=5 and end=10
    * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
    * start number. Note that a length-0 array is valid.
    *
    * @param start the starting number
    * @param end the ending number (not included)
    * @return sequence of start..end-1
    */
   public static int[] fizzArray3(int start, int end) {
      int[] result = new int[end - start];
      for (int i = start; i < end; i++) {
         result[i - start] = i;
      }
      return result;
   }

   /**
    * A version of the famous FizzBuzz problem which is sometimes given as a
    * first problem for job interviews. (See also: FizzBuzz Code.) Consider the
    * series of numbers beginning at start and running up to but not including
    * end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return
    * a new String[] array containing the string form of these numbers, except
    * for multiples of 3, use "Fizz" instead of the number, for multiples of 5
    * use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
    *
    * This version is a little more complicated than the usual version since
    * you have to allocate and index into an array instead of just printing,
    * and we vary the start/end instead of just always doing 1..100.
    *
    * @param start the starting number
    * @param end the ending number (not included)
    * @return FizzBuzz sequence array
    */
   public static String[] fizzBuzz(int start, int end) {
      int n = end - start;
      String[] result = new String[n];
        
        
      int value = 0;
      for (int i = start; i < end; i++) {
         boolean fizz = i % 3 == 0;
         boolean buzz = i % 5 == 0;
          
         if (fizz && buzz) {
            result[value] = "FizzBuzz";
         } else if (fizz) {
            result[value] = "Fizz";
         } else if (buzz) {
            result[value] = "Buzz";
         } else {
            result[value] = String.valueOf(i);
         }
         value++;
      }
      return result;
   }
}