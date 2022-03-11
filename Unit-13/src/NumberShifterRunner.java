//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberShifterRunner {

  public static void main(String args[]) throws IOException {
    //add test cases
    for (int i = 0; i < 3; i++) {
      int[] array = NumberShifter.makeLucky7Array(20);
      System.out.println(Arrays.toString(array));
      NumberShifter.shiftEm(array);
      System.out.println(Arrays.toString(array));
      System.out.println();
    }
  }
}
