import static org.junit.Assert.*;
import org.junit.Test;

/**
 * CS 149 Exercise 9.2 Testing Array-1.
 *
 * @author Zachary Shin
 * @version 11/10/21
 */
public class BatArray1Test {
   
   /**
    * Test commonEnd method.    
    */
   @Test public void testcommonEnd() {
      int[] a1 = {64, 2, 4};
      int[] b1 = {65, 3, 4};
      assertTrue("Both arrays have same last number",
         BatArray1.commonEnd(a1, b1));
                   
      int[] a2 = {64, 2, 3};
      int[] b2 = {64, 3, 4};
      assertTrue("Both arrays have same first number",
         BatArray1.commonEnd(a2, b2));             
      
      int[] a3 = {64, 2, 4};
      int[] b3 = {64, 3, 4};
      assertTrue("Both arrays have same first & last number",
         BatArray1.commonEnd(a3, b3));
                   
      int[] a4 = null;
      int[] b4 = null;
      assertFalse("null arrays = False",
         BatArray1.commonEnd(a4, b4));
      
      int[] a6 = null;
      int[] b6 = {64, 3, 4};
      assertFalse("a6 is null arrays = False",
         BatArray1.commonEnd(a6, b6));
                   
      int[] a7 = {64, 3, 4};
      int[] b7 = null;
      assertFalse("null arrays = False",
         BatArray1.commonEnd(a7, b7));      
      
      int[] a5 = {};
      int[] b5 = {};
      assertFalse("Empty arrays = false",
         BatArray1.commonEnd(a5, b5));
      
      int[] a8 = {1, 3, 4};
      int[] b8 = {};
      assertFalse("Empty array in b8 = false",
         BatArray1.commonEnd(a8, b8));   
      
      int[] a9 = {};
      int[] b9 = {1, 3, 4};
      assertFalse("Empty array in b8 = false",
         BatArray1.commonEnd(a9, b9));
      
      int[] a10 = {1};
      int[] b10 = {1, 3, 4};
      assertTrue("Both arrays with same number",
         BatArray1.commonEnd(a10, b10)); 
      
      int[] a11 = {2, 3, 1};
      int[] b11 = {1};
      assertTrue("Both arrays with same number",
         BatArray1.commonEnd(a11, b11)); 
                
      int[] a12 = {1, 3, 1};
      int[] b12 = {2, 4, 5};
      assertFalse("Both arrays not same numbers",
         BatArray1.commonEnd(a12, b12));                         
   }
   
   /**
    * Test midThree method.    
    */
   @Test public void testmidThree() {
      int[] nums1 = null;
      assertNull("Should equal null",
         BatArray1.midThree(nums1));
                   
      int[] nums = {};
      assertNull("Should equal null",
         BatArray1.midThree(nums)); 
      
      int[] nums2 = null;
      assertNull("Should equal null",
         BatArray1.midThree(nums2)); 
      
      int[] nums3 = {1, 2};
      assertNull("Should equal null",
         BatArray1.midThree(nums3));
      
      int[] nums4 = {1, 2, 3};
      int[] answer2 = {1, 2, 3};
      assertArrayEquals("Should return {1, 2, 3}", answer2,
                   BatArray1.midThree(nums4));
                   
      int[] nums5 = {1, 2, 3, 4, 5, 6};
      assertNull("Null",
         BatArray1.midThree(nums5)); 
      
      int[] nums6 = {1, 2, 3, 4, 5, 6, 7};
      int[] answer3 = {3, 4, 5};
      assertArrayEquals("Should return {3, 4, 5}", answer3,
                   BatArray1.midThree(nums6));
                                                       
   }
   
   /**
    * Test maxTriple method.    
    */
   @Test public void testmaxTriple() {
      int[] nums = null;
      int expect = 0;
      assertEquals("Equals Null", expect,
         BatArray1.maxTriple(nums));
                    
      int[] nums1 = {};
      assertEquals("Equals Null", expect,
         BatArray1.maxTriple(nums1));  
                  
      int[] nums2 = {1, 1, 1, 1};
      assertEquals("Equals 0", expect,
         BatArray1.maxTriple(nums2));  
                   
      int[] nums3 = {1, 0, 0};
      assertEquals("Index 0 largest", 1,
         BatArray1.maxTriple(nums3));
      
      int[] nums7 = {1, 2, 0};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums7)); 
  
      int[] nums8 = {1, 0, 2};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums8)); 
      
      int[] nums9 = {0, 1, 2};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums9)); 
      
      int[] nums10 = {2, 0, 1};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums10));  
      
      int[] nums11 = {0, 2, 1};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums11)); 
      
      int[] nums12 = {2, 1, 0};
      assertEquals("Index 2 largest", 2,
         BatArray1.maxTriple(nums12));
             
  
      int[] nums4 = {0, 1, 0};
      assertEquals("Index 1 largest", 1,
         BatArray1.maxTriple(nums4)); 
                   
      int[] nums5 = {0, 0, 1};
      assertEquals("Index 2 largest", 1,
         BatArray1.maxTriple(nums5));
      
      int[] nums6 = {0};
      assertEquals("Index 0 largest", 0,
         BatArray1.maxTriple(nums6));
                
   }
}
