/**
 * CS 149 Exercise 9.1 CodingBat Array-1.
 *
 * @author Zachary Shin
 * @version 11/10/21
 */
public class BatArray1 {

   /**
     * Given two arrays of ints, a and b, return true if they have the same
     * first element or they have the same last element. This method should
     * return false if either array is empty or null.
     * 
     * @param a the 1st array
     * @param b the 2nd array
     * @return whether they have a common end
     */
   public static boolean commonEnd(int[] a, int[] b) {
      if (a == null || b == null || a.length <= 0 
         || b.length <= 0) {
         return false;
      }
      return a[0] == b[0] 
            || a[a.length - 1] == b[b.length - 1];
   }

   /**
     * Given an array of integers, return a new array of length 3 containing the
     * elements from the middle of the array. This method should return null if
     * the array length is even or less than 3.
     * 
     * @param nums the original array
     * @return the middle three values
     */
   public static int[] midThree(int[] nums) {
      int[] result = new int[3];
  
      if (nums == null || nums.length % 2 == 0 
         || nums.length < 3) {
         return null;
      }
      
      if (nums.length == 3) {
         result = nums;
      } else {
         result[0] = nums[(nums.length / 2) - 1];
         result[1] = nums[nums.length / 2];
         result[2] = nums[(nums.length / 2) + 1];
      }
      return result;
          
   }

   /**
     * Given an array of integers, look at the first, last, and middle values in
     * the array, and return the largest value. This method should return 0 if
     * the length of the array is even.
     * 
     * @param nums the original array
     * @return largest of three values
     */
   public static int maxTriple(int[] nums) {
      if (nums == null || nums.length % 2 == 0) {
         return 0;
      } else {
         int result = 0;
         int first = nums[0];
         int middle = nums[((nums.length + 1) / 2) - 1];
         int end = nums[nums.length - 1];
   
         if (first > middle && first > end 
            || nums.length == 1) {
            result = first;
         }
         if (middle > first && middle > end) {
            result = middle;
         }
         if (end > first && end > middle) {
            result = end;
         }
         return result;
      }  
   }
}