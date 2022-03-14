//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.util.*;

public class TotalRow {

  public static List<Integer> getRowTotals(int[][] m) {
    //add code here
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < m.length; i++) {
      int sum = 0;
      for (int j = 0; j < m[i].length; j++) {
        sum += m[i][j];
      }
      result.add(sum);
    }
    return result;
  }
}
