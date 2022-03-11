//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {

  private static int getNumDigits(int number) {
    int count = 0;
    while (number > 0) {
      count++;
      number /= 10;
    }
    return count;
  }

  public static int[] getSortedDigitArray(int number) {
    int[] sorted = new int[NumberSorter.getNumDigits(number)];

    for (int i = 0; i < sorted.length; i++) {
      sorted[i] = number % 10;
      number /= 10;
    }

    // quick sort
    for (int i = 0; i < sorted.length; i++) {
      int lowest = sorted[i];
      int lowestIndex = i;
      for (int j = i + 1; j < sorted.length; j++) {
        if (sorted[j] < lowest) {
          lowest = sorted[j];
          lowestIndex = j;
        }
      }

      // found lowest, now perform swap
      sorted[lowestIndex] = sorted[i];
      sorted[i] = lowest;
    }

    return sorted;
  }
}
