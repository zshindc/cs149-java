import java.util.Scanner;

/**
 * CS 149 Exercise 6.3 Magic 8-Ball.
 *
 * @author Zachary Shin
 * @version 10/17/21
 */
public class EightBall {

   /**
    * Displays the given prompt, followed by "[yes/no]: ". Returns true if the
    * next line of user input is "y" or "yes" ignoring case, false otherwise.
    *
    * @param in the Scanner to use
    * @param prompt the text to display
    * @return true if yes, false if no
    */
   public static boolean inputYesNo(Scanner in, String prompt) {
      System.out.print(prompt + "[yes/no]: ");
      
      String yesNo = in.nextLine();
      boolean x;
      
      if (yesNo.equals("y")) {
         x = true;
      } else if (yesNo.equals("Y")) {
         x = true;
      } else if (yesNo.equals("yes")) {
         x = true;
      } else if (yesNo.equals("Yes")) {
         x = true;
      } else if (yesNo.equals("YES")) {
         x = true;
      } else {
         x = false;
      }
      return x;
   }

   /**
    * Gets the next question from the user. The length of the question must be
    * between 1 and 60 characters, and the question must end with a '?'. This
    * method keeps asking the user for a question until they enter a valid one.
    *
    * @param in the Scanner to use
    * @param prompt the text to display
    * @return the user's question
    */
   public static String getQuestion(Scanner in, String prompt) {
      boolean invalid = true;
      String question = "";
      while (invalid) {
         System.out.print(prompt);
         question = in.nextLine();
         
         if (question.length() == 0) {
            System.out.println("Your question is blank");
         } else if (question.length() > 60) {
            System.out.println("Your question is too long");
         } else if (!question.endsWith("?")) {
            System.out.println("Your question must end with a ?");
         } else {
            invalid = false;
            return question;
         }
      }
      return question;
   }

   /**
    * Simulate a Magic 8-Ball. Original code by Arch Harris and Nancy Harris.
    *
    * @param args command-line arguments
    */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Magic 8-Ball");

      // run the program as long as the user wants
      while (inputYesNo(in, "\nDo you want to ask a question? ")) {

         // get the next question
         String question = getQuestion(in, "What is your question? ");
         System.out.println();

         // pick a random answer
         String answer;
         int randInt = (int) (Math.random() * 20 + 1);
         switch (randInt) {
            case 1:
               answer = "Signs point to yes.";
               break;
            case 2:
               answer = "Yes.";
               break;
            case 3:
               answer = "Reply hazy, try again.";
               break;
            case 4:
               answer = "Without a doubt.";
               break;
            case 5:
               answer = "My sources say no.";
               break;
            case 6:
               answer = "As I see it, yes.";
               break;
            case 7:
               answer = "You may rely on it.";
               break;
            case 8:
               answer = "Concentrate and ask again.";
               break;
            case 9:
               answer = "Outlook not so good.";
               break;
            case 10:
               answer = "It is decidedly so.";
               break;
            case 11:
               answer = "Better not tell you now.";
               break;
            case 12:
               answer = "Very doubtful.";
               break;
            case 13:
               answer = "Yes - definitely.";
               break;
            case 14:
               answer = "It is certain.";
               break;
            case 15:
               answer = "Cannot predict now.";
               break;
            case 16:
               answer = "Most likely.";
               break;
            case 17:
               answer = "Ask again later.";
               break;
            case 18:
               answer = "My reply is no.";
               break;
            case 19:
               answer = "Outlook good.";
               break;
            case 20:
               answer = "Don't count on it.";
               break;
            default:
               answer = "HUH?";
               break;
         }

         // output the results
         System.out.printf("Question: %s\n", question);
         System.out.printf("  Answer: %s\n", answer);
      }
      System.out.println("Goodbye!");
   }

}