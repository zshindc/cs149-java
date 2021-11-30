/**import Scanner class.
 *
 * 
 *
 */
import java.util.Scanner; 
/**
 * Exercise 3.3 Add Minutes Program.
 * 
 * @author Zachary Shin
 * @version 09/19/21
 */
 
public class AddMinutes { 
   /** Display added minutes to time in String class. 
   * 
   * @param args command line args 
   */
   public static void main(String[] args) {
      int hour;
      int addedHours;
      int minute;
      int addedMinutes;
      int additionalHour;
      int minutesleft;
      Scanner in = new Scanner(System.in);
  
  
      System.out.print("Starting hour (0-23)? ");
      hour = in.nextInt();
      
      System.out.print("Starting minute (0-59)? ");
      minute = in.nextInt();
 
      System.out.print("How many minutes to add? ");
      addedMinutes = in.nextInt();
      
      addedHours = addedMinutes / 60;
      minutesleft = addedMinutes % 60;
      
      additionalHour = (minute + minutesleft) / 60;
      hour = (hour + addedHours + additionalHour) % 24;
      minute = (minute + minutesleft) % 60;
      
      System.out.printf("\nThe time is %d:%02d", hour, minute);
   }
}    