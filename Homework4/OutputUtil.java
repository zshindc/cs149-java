/**
 * CS 149 Exercise 4.1 Output Utility.
 *
 * @author Zachary Shin
 * @version 09/22/21
 */
public class OutputUtil {

   /**
    * Prints the given double as money formatted with comma separators and two
    * decimal places. The prefix is displayed before the value, and the suffix
    * is displayed after the value.
    *
    * @param prefix currency symbol to display before (e.g., "$")
    * @param value amount of money to format to two decimals
    * @param suffix currency symbol to display after (e.g., " CHF")
    */
   public static void printMoney(String prefix, double value, String suffix) {
      System.out.printf("%s%,3.2f%s", prefix, value, suffix);
   }

   /**
    * Prints the given time as HH:MM:SS in 24-hour format. The hour can be
    * either 1 or 2 digits, but the minute and second must be two digits.
    *
    * @param hour the hour (0 to 23)
    * @param minute the minute (0 to 59)
    * @param second the second (0 to 59)
    */
   public static void printTime(int hour, int minute, int second) {
      System.out.printf("%d:%02d:%02d", hour, minute, second);
   }
   

   /**
    * Tests the printMoney and printTime utility methods.
    *
    * @param args command-line arguments
    */
   public static void main(String[] args) {
      printMoney("$", 1.20, "");
      System.out.printf("\n");
      printMoney("", 3.45, " CHF");
      System.out.printf("\n");
      printTime(7, 30, 0);
      System.out.printf("\n");
      printTime(12, 8, 3);
      System.out.printf("\n");
   } 
   
   

}