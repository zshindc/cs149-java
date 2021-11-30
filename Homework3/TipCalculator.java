/**import Scanner class.
 *
 * 
 *
 */
import java.util.Scanner; 
/**
 * Exercise 3.2 Tip Calculator Program.
 * 
 * @author Zachary Shin
 * @version 09/15/21
 */
 
public class TipCalculator { 
   /** Compute and display tip & total amount in String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      double billamount;
      double tip;
      int people;
      Scanner in = new Scanner(System.in);
  
  
      System.out.print("Enter bill amount: ");
      billamount = in.nextDouble();
      
      System.out.print("Percentage to tip: ");
      tip = in.nextInt();
 
      System.out.print("Number of people: ");
      people = in.nextInt();
      
      double tipamount = billamount * (tip / 100);
      double totalamount = billamount + tipamount;
      double tipperperson = tipamount / people;
      double totalperperson = totalamount / people;
      
      System.out.println();
      System.out.printf("Tip amount: $%.2f", tipamount);
      System.out.println();
      System.out.printf("Total amount: $%.2f", totalamount);
      System.out.println();
      System.out.println();
      System.out.printf("Tip per person: $%.2f", tipperperson);
      System.out.println();
      System.out.printf("Total per person: $%.2f", totalperperson);
   }
}