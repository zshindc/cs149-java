import java.util.Scanner; 
/**
 * CS 149 Exercise 3.5 Change Machine Program.
 * 
 * @author Zachary Shin
 * @version 09/19/21
 */
 
public class ChangeMachine { 
   /** Calculate change  in String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Total amount? ");
      double amount = in.nextDouble();
      
      System.out.print("Cash payment? ");
      int cash = in.nextInt();
      
      double change = Math.round((cash - amount) * 100.00) / 100.00;
      System.out.println("\nChange Due $" + change);
      
      double holder = change * 100;
      System.out.println();
      int dollars = (int) Math.round(holder) / 100;
      int quarters = (int) Math.round(holder) % 100 / 25;
      int dimes = (int) Math.round(holder) % 100 % 25 / 10;
      int nickels = (int) Math.round(holder) % 100 % 25 % 10 / 5;
      int pennies = (int) Math.round(holder) % 100 % 25 % 10 % 5;
      
      System.out.println("  Dollars: " + dollars);
      System.out.println(" Quarters: " + quarters);
      System.out.println("    Dimes: " + dimes);
      System.out.println("  Nickels: " + nickels);
      System.out.println("  Pennies: " + pennies);
      
   }
}