//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class WordSortTwo {

  private String[] wordRay;

  public WordSortTwo(String sentence) {
    this.wordRay = sentence.split(" ");
  }

  public void sort() {
    for (int i = 0; i < this.wordRay.length; i++) {
      String lowest = this.wordRay[i];
      int lowestIndex = i;

      for (int j = i + 1; j < this.wordRay.length; j++) {
        if (this.wordRay[j].compareTo(lowest) < 0) {
          lowest = this.wordRay[j];
          lowestIndex = j;
        }
      }

      this.wordRay[lowestIndex] = this.wordRay[i];
      this.wordRay[i] = lowest;
    }
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < this.wordRay.length; i++) output += this.wordRay[i]  + "\n";
    return output + "\n\n";
  }
}
