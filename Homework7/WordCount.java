import java.util.Scanner;

/**
 * CS 149 Exercise 7.3 Word/Line Count.
 *
 * @author Zachary Shin
 * @version 10/20/21
 */
public class WordCount {
   /** Analyze class counts newlines, words, and characters.
   * from parameter text
   *
   * @param text file filled with computer text
   * @return threeInts array of newline count, word count, and character count
   */
   public static int[] analyze(String text) {
      int[] count = new int[3];
      count[0] = 0;
      count[1] = 0;
      count[2] = 0;
      Scanner in = new Scanner(text);
      
      int lengthText = text.length();
      count[2] = lengthText;
     
      int words = 0;
      char[] n = new char[lengthText];
      for (int i = 0; i < text.length(); i++) {
         n[i] = text.charAt(i);
         if (i > 0 && n[i] != ' ' && n[i - 1] == ' '
            || n[0] != ' ' && i == 0) {
            words++;
         }
      }
      count[1] = words;
      
      int newLine = 0;
      int value = 0;
      while ((value = text.indexOf("\n", value) + 1) != 0) {
         newLine++;
      }
      count[0] = newLine;
      
      System.out.println("New Lines: " + count[0]);
      System.out.println("Word Count: " + count[1]);
      System.out.println("Character Count: " + count[2]);
   
      return count;
   }
   public static void main(String[] args) {
      analyze("This is the first line.\nThis is the second.");
   }
}