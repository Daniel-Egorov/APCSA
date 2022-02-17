//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 16 Feb 2022

import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray ) {
    int oddIndex = -1;
    int evenIndex = -1;

    for (int i = 0; i < ray.size(); i++) {

      // if an even number is found and no odd number has been found
      if (ray.get(i) % 2 == 0 && oddIndex == -1) continue;
      // if an odd number is found and no odd number has been found
      if (ray.get(i) % 2 == 1 && oddIndex == -1) oddIndex = i;
      if (ray.get(i) % 2 == 0 && oddIndex != -1) evenIndex = i;
    }
    if (
      oddIndex == -1 ||
      evenIndex == -1
    ) return -1;
    return evenIndex - oddIndex;
	}
}