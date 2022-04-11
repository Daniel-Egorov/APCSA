//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleWord {

  //instance variables and constructors could be present, but are not necessary

  public static void printTriangle(String word) {
    for (int j = 1; j < word.length() + 1; j++) {
      String toPrint = word.substring(0, j);
      for (int i = 0; i < toPrint.length(); i++) out.print(word.substring(0, j));
      out.println();
    }
  }
}
