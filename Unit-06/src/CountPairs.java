//(c) A+ Computer Science
//www.apluscompsci.com
//Name Daniel Egorov

import static java.lang.System.*;

public class CountPairs {

  public static int pairCounter(String str) {
    int count = 0;
    for (int i = 1; i < str.length(); i++) {
      /*
      if the character at index i is the same as the 
      character at index i - 1, increment count by one
      */
      if (str.charAt(i) == str.charAt(i - 1)) count++;
    }
    return count;
  }
}
