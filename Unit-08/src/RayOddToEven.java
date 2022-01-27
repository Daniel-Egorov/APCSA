//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 27 Jan 2022

public class RayOddToEven {
	public static int go(int[] ray) {
    int oddIndex = -1;
    int evenIndex = -1;
    
    for (int i = 0; i < ray.length; i++) {
      // if an even number is found but an odd number hasn't yet been, skip
      if (ray[i] % 2 == 0 && oddIndex == -1) continue;

      // if an odd number is found and on odd number hasn't yet been found save the index
      if (ray[i] % 2 == 1 && oddIndex == -1) oddIndex = i;
      /*
      if an even number is found and an odd number has 
      been found and an even number has yet to be found, 
      save the index
      */
      if (ray[i] % 2 == 0 && oddIndex != -1 && evenIndex == -1) evenIndex = i;
    }
    // if either an odd or even number hasn't been found, return -1
    if (oddIndex == -1 || evenIndex == -1) return -1;
    // return the distance between the indices
		return evenIndex - oddIndex;
	}
}