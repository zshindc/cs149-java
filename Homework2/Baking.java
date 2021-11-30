/**
 * Exercise 2.4 Baking Bread program.
 * 
 * @author Zachary Shin
 * @version 09/12/21
 */
 
public class Baking {
   /** Ingredients calculated in the String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      int breadWeight = 16;
      int guests = 25;
      double servingSize = 2.5;
      double loaves = (servingSize * guests) / breadWeight;
      System.out.println("For " + guests + " people, "
         + "you will need " + loaves + " loaves of bread:");
      System.out.println();
      System.out.println("  " + (loaves * 1.5) + " teaspoons"
         + " instant yeast");
      System.out.println("  " + (loaves * 1.5) + " teaspoons"
         + " salt");
      System.out.println("  " + (loaves * 1.5) + " teaspoons"
         + " sugar");
      System.out.println("  " + (loaves * 2.5) + " cups all-purpose"
         + " flour");
      System.out.println("  " + (loaves * 2) + " cups sourdough"
         + " starter");
      System.out.println("  " + (loaves * 0.5) + " cups lukewarm water");
   }
}