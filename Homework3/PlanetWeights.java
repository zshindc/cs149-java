/**import Scanner class.
 *
 * 
 *
 */
import java.util.Scanner; 

/**
 * Exercise 3.4 Planet Weights Program.
 * 
 * @author Zachary Shin
 * @version 09/19/21
 */
public class PlanetWeights { 
   
    
   /** calculations in String class.
    * 
    * @param args command line args 
    */  
   public static void main(String[] args) {
      final double WEIGHT_EARTH_TO_MERCURY_CONV = 0.378;
      final double WEIGHT_EARTH_TO_VENUS_CONV = 0.907;
      final double WEIGHT_EARTH_TO_MOON_CONV = 0.166;
      final double WEIGHT_EARTH_TO_MARS_CONV = 0.377;
      final double WEIGHT_EARTH_TO_JUPITER_CONV = 2.364;
      final double WEIGHT_EARTH_TO_SATURN_CONV = 1.064;
      final double WEIGHT_EARTH_TO_URANUS_CONV = 0.889;
      final double WEIGHT_EARTH_TO_NEPTUNE_CONV = 1.125;
      final double WEIGHT_EARTH_TO_PLUTO_CONV = 0.067; 
      String item;
      String unit;
      double itemWeight;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the name of the item: ");
      item = in.nextLine();
      
      System.out.print("How much does the item weigh? ");
      itemWeight = in.nextDouble();
      
      in.nextLine();
      System.out.print("What is the unit of measure? ");
      unit = in.nextLine();
      
      System.out.printf("\nOn Mercury, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_MERCURY_CONV);
      
      System.out.printf("\nOn Venus, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_VENUS_CONV);
         
      System.out.printf("\nOn the Moon, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_MOON_CONV);
      
      System.out.printf("\nOn Mars, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_MARS_CONV);
      
      System.out.printf("\nOn Jupiter, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_JUPITER_CONV);
      
      System.out.printf("\nOn Saturn, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_SATURN_CONV);
         
      System.out.printf("\nOn Uranus, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_URANUS_CONV);
         
      System.out.printf("\nOn Neptune, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_NEPTUNE_CONV);
         
      System.out.printf("\nOn Pluto, the " + item + " weighs about "
         + "%,.3f " + unit + ".", 
         itemWeight * WEIGHT_EARTH_TO_PLUTO_CONV);
   }
}