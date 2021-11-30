/**
 * Exercise 2.5 Calculate BMR program.
 * 
 * @author Zachary Shin
 * @version 09/12/21
 */
 
public class Calories {
   /** BMR calculated in the String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      int years = 25;
      int feet = 5;
      int inches = 10;
      int pounds = 160;
      int ounces = 3;
      double kg = (ounces * 0.0283495) + (pounds * 16 * 0.0283495);
      double cm = (feet * 12 * 2.54) + (inches * 2.54);
      double mBMR = (10 * kg) + (6.25 * cm) - (5 * years) + 5;
      double fBMR = (10 * kg) + (6.25 * cm) - (5 * years) - 161;
      System.out.println("Male BMR is " + mBMR + " calories/day.");
      System.out.print("Female BMR is " + fBMR + " calories/day.");       
   }
}