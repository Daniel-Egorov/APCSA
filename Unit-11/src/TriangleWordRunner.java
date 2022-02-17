//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleWordRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String choice = "";
    do {
      out.print("\nEnter a word to make a triangle :: ");
      String word = keyboard.next();

      TriangleWord.printTriangle(word);

      System.out.print("\nDo you want to enter more sample input? ");
      choice = keyboard.next();
    } while (choice.equals("Y") || choice.equals("y"));
  }
}
