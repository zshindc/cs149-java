import java.util.Scanner;

/**
 * CS 149 Exercise 4.2 Input Utility.
 *
 * @author Zachary Shin
 * @version 09/22/21
 */
public class InputUtil {

   /**
    * Displays the given prompt, followed by ": ", and returns the next line of
    * user input. The input is entered on the same line as the prompt.
    *
    * @param in the Scanner to use
    * @param prompt the text to display
    * @return the user's input
    */
   public static String inputLine(Scanner in, String prompt) {
      System.out.print(prompt + ": ");
      return in.nextLine();
   }

   /**
    * Displays the given prompt, followed by ": ", and returns the next double
    * from the user. This method automatically consumes the newline character,
    * assuming that the double is the entire next line of input.
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
    * Tests the inputLine and inputDouble utility methods.
    *
    * @param args command-line arguments
    */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String prompt = "Give me a double";
      System.out.printf("You entered: %.2f", inputDouble(in, prompt));
      prompt = "\nGive me a line";
      System.out.printf("You entered: %s\n", inputLine(in, prompt));
  
   }

}