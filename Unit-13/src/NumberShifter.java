//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberShifter {

  public static int[] makeLucky7Array(int size) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      int rand = (int) (Math.random() * 10) + 1;
      array[i] = rand;
    }
    return array;
  }

  public static void shiftEm(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 7) {
        for (int j = 0; j < i; j++) {
          if (array[j] != 7) {
            array[i] = array[j];
            array[j] = 7;
            break;
          }
        }
      }
    }
  }
}
