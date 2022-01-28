//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 27 Jan 2022

public class RaySumLast {

  public static int go(int[] ray) {
    if (ray.length == 0) return -1;

    int sum = 0;
    int last = ray[ray.length - 1];
    for (int i = 0; i < ray.length - 1; i++) {
      if (ray[i] > last) sum += ray[i];
    }

    if (sum == 0) return -1;
    return sum;
  }
}
