/**
 * CS 149 Exercise 5.1 CodingBat Logic-1.
 *
 * @author Zachary Shin
 * @version 10/6/21
 */
public class BatLogic1 {

   /**
    * The squirrels in Palo Alto spend most of the day playing. In particular,
    * they play if the temperature is between 60 and 90 (inclusive). Unless it
    * is summer, then the upper limit is 100 instead of 90. Given an int
    * temperature and a boolean isSummer, return true if the squirrels play and
    * false otherwise.
    *
    * @param temp the current temperature
    * @param isSummer true if it's summer
    * @return whether squirrels should play
    */
   public static boolean squirrelPlay(int temp, boolean isSummer) {
      int newTemp = temp;
      if (isSummer && temp > 90)  {
         newTemp = temp - 10;
      }
      return newTemp >= 60 && newTemp <= 90;
   }

   /**
    * You are driving a little too fast, and a police officer stops you. Write
    * code to compute the result, encoded as an int value: 0=no ticket, 1=small
    * ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed
    * is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
    * the result is 2. Unless it is your birthday -- on that day, your speed
    * can be 5 higher in all cases.
    *
    * @param speed your driving speed
    * @param isBirthday true if it's your birthday
    * @return 0=no ticket, 1=small ticket, 2=big ticket
    */
   public static int caughtSpeeding(int speed, boolean isBirthday) {
      int noTicket = 0;
      int smallTicket = 1;
      int bigTicket = 2;
      int value = noTicket;
      int newSpeed;
  
      if (isBirthday) {
         newSpeed = speed - 5;
      } else {
         newSpeed = speed;
      }
  
      if (newSpeed >= 61 && newSpeed <= 80) {
         value = smallTicket;
      }
      if (newSpeed > 80) {
         value = bigTicket;
      }
      return value;
   }

   /**
    * Return the sum of two 6-sided dice rolls, each in the range 1..6.
    * However, if noDoubles is true, if the two dice show the same value,
    * increment one die to the next value, wrapping around to 1 if its value
    * was 6.
    *
    * @param die1 value of 1st die
    * @param die2 value of 2nd die
    * @param noDoubles flag for doubles
    * @return sum of the dice values
    */
   public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
      int dieSum = die1 + die2;
      if (noDoubles && die1 == die2) {
         if (die1 == 6 && die2 == 6) {
            dieSum = 1 + die2; 
         } else { 
            dieSum = die1 + die2 + 1; 
         }
      } 
      return dieSum;
   }

   /**
    * Given two ints, each in the range 10..99, return true if there is a digit
    * that appears in both numbers, such as the 2 in 12 and 23. (Note:
    * division, e.g. n/10, gives the left digit while the % "mod" n%10 gives
    * the right digit.)
    *
    * @param a 1st number
    * @param b 2nd number
    * @return true if digit in both numbers
    */
   public static boolean shareDigit(int a, int b) {
      if (a % 10 == b % 10 || a / 10 == b / 10 
         || a % 10 == b / 10 || b % 10 == a / 10) {
         return true;
      }
      return false;
   }
   
   public static double addDouble(double x, double y) {
      return x + y;
   }
   
   public static void main(String[] args) {
      System.out.printf("String%dyep\n", 34);
   }
}