/**import Scanner class.
 *
 * 
 *
 */
import java.util.Scanner; 
/**
 * Exercise 3.1 Vacations Program.
 * 
 * @author Zachary Shin
 * @version 09/15/21
 */
 
public class Vacations { 
   /** Input adjectives and nouns in the String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      String adjective1;
      String adjective2;
      String noun1;
      String noun2;
      Scanner in = new Scanner(System.in);
  
      System.out.print("Adjective: ");
      adjective1 = in.nextLine();
      
      System.out.print("Adjective: ");
      adjective2 = in.nextLine();
 
      System.out.print("Noun: ");
      noun1 = in.nextLine();
      
      System.out.print("Noun: ");
      noun2 = in.nextLine();
      
      System.out.println();
      
      System.out.println("A vacation is when you take a trip "
         + "to some " + adjective1 + " place with your "
         + adjective2 + " family.");
      
      System.out.print("Usually you go to some place " 
         + "that is near a/an " + noun1 + " or up "
         + "on a/an " + noun2 + ".");
   }
}