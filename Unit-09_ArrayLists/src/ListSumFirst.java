//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 15 Feb 2022

import java.util.List;

public class ListSumFirst {

  public static int go(List<Integer> ray) {
    int sum = 0;

    for (int i = 1; i < ray.size(); i++) if (ray.get(i) > ray.get(0)) sum +=
      ray.get(i);

    if (sum == 0) return -1;
    return sum;
  }
}
