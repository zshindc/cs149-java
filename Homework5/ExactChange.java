import java.util.Scanner; 
/**
 * CS 149 Exercise 5.3 Exact Change Program.
 * 
 * @author Zachary Shin
 * @version 10/10/21
 */
 
public class ExactChange { 
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
      System.out.printf("\nChange Due $%.2f\n", change);
      
      double holder = change * 100;
      System.out.println();
      int dollars = (int) Math.round(holder) / 100;
      int quarters = (int) Math.round(holder) % 100 / 25;
      int dimes = (int) Math.round(holder) % 100 % 25 / 10;
      int nickels = (int) Math.round(holder) % 100 % 25 % 10 / 5;
      int pennies = (int) Math.round(holder) % 100 % 25 % 10 % 5;
      
      if (dollars > 1) {
         System.out.printf("%d dollars\n", dollars);
      } else if (dollars == 1) {
         System.out.print("1 dollar\n");
      } else {
         System.out.print("");
      }
      
      if (quarters > 1) {
         System.out.printf("%d quarters\n", quarters);
      } else if (quarters == 1) {
         System.out.print("1 quarter\n");
      } else {
         System.out.print("");
      }
      
      if (dimes > 1) {
         System.out.printf("%d dimes\n", dimes);
      } else if (dimes == 1) {
         System.out.print("1 dime\n");
      }
         
      if (nickels > 1) {
         System.out.printf("%d nickels\n", nickels);
      } else if (nickels == 1) {
         System.out.print("1 nickel\n");
      } else {
         System.out.print("");
      }
               
      if (pennies > 1) {
         System.out.printf("%d pennies\n", pennies);
      } else if (pennies == 1) {
         System.out.print("1 penny\n");
      } else {
         System.out.print("");
      }                   
   }
}