import java.util.Scanner;

/**
 * CS 149 Exercise 5.4 Credit Card.
 *
 * @author Zachary Shin
 * @version 10/10/21
 */
public class CreditCard {

   /**
    * Displays the given prompt, followed by ": ", and returns the next double
    * from the user. If the user input is not a double, this method discards
    * the next token and returns 0. It also consumes the newline character,
    * assuming that the input is the entire next line.
    *
    * @param in the Scanner to use
    * @param prompt the text to display
    * @return the user's input
    */
   public static double inputDouble(Scanner in, String prompt) {
      System.out.print(prompt + ": ");
      double num = in.nextDouble();
      in.nextLine();
      return num;
   }

   /**
    * This method will take in the previous balance and additional charges and
    * compute the amount of interest. If the priorBalance is 0 or less, the
    * interest is 0. If there was a priorBalance, the interest is 2% of the
    * priorBalance plus the additional charges.
    *
    * @param priorBalance balance before new charges
    * @param addtlCharges charges added this month
    * @return amount of interest to charge
    */
   public static double calculateInterest(double priorBalance,
           double addtlCharges) {
      double interest = 0.0;
      
      if (priorBalance > 0.0) {
         interest = 0.02 * (priorBalance + addtlCharges);
      }
      return interest;
         
   }

   /**
    * This method will take in the previous balance and additional charges and
    * compute the minimum payment.
    * <ul>
    * <li>$0.00 : for new balance less than $0</li>
    * <li>new balance : for new balance between $0 and $49.99 (inclusive)</li>
    * <li>$50.00 : for new balance between $50 and $300 (inclusive)</li>
    * <li>20% of the new balance : for new balance over $300</li>
    * </ul>
    *
    * @param balance after interest and charges are added
    * @return minimum payment amount
    */
   public static double calculateMinPayment(double balance) {
      double minPay = 0.00;
      
      if (balance > 0.00) {
         if (balance >= 50.00) {
            if (balance >= 300.00) {
               minPay = 0.20 * balance;
            }
         } else {
            minPay = 50.00;
         }
      } else {
         minPay = balance;
      }
      return minPay;
   }

   /**
    * Prompts the user for previous balance and additional charges; calculates
    * the interest, new balance, and minimum payment; displays the resulting
    * credit card statement.
    *
    * @param args command-line arguments
    */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      // make sure that the number entered is a double; if so, read it in;
      // if not, use a default value of zero; no error message to the user
      double priorBalance = inputDouble(in, "Type the previous balance");
      double addtlCharges = inputDouble(in, "Type the additional charges");

      // perform the calculation of interest, new balance, minimum payment
      double interest = calculateInterest(priorBalance, addtlCharges);
      double newBalance = priorBalance + addtlCharges + interest;
      double minPayment = calculateMinPayment(newBalance);

      // output the resulting credit card statement
      System.out.println("");
      System.out.println("CS CARD International Statement");
      System.out.println("===============================");
      System.out.printf("Previous balance:    $ %,8.2f\n", priorBalance);
      System.out.printf("Additional charges:  $ %,8.2f\n", addtlCharges);
      System.out.printf("Interest:            $ %,8.2f\n", interest);
      System.out.printf("New balance:         $ %,8.2f\n", newBalance);
      System.out.printf("Minimum payment:     $ %,8.2f\n", minPayment);
   }

}
