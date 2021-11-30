/**
 * Exercise 2.2 Greeting Program.
 * 
 * @author Zachary Shin
 * @version 1.0
 * Acknowledgment: I received no outside help on this assignment and have
 * abided by the JMU Honor Code
 */
public class Greeting {
  
   /**
   *
   * main method.
   *
   * @param args main argument
   */
   public static void main(String[] args) {
   
      int classOf = 2005;
      double sleep = 7.5;
      String name = "Chris Mayfield";
      String major = "Computer Science";
      
      System.out.print("Hi! My name is " + name);
      System.out.print(", and I'm a " + major + " major.");
      System.out.print(" I plan to graduate with ");
      System.out.print("the class of " + classOf + ",");
      System.out.print(" but I only get about " + sleep);
      System.out.print(" hours of sleep per night. Go Dukes!");
   }
 
}