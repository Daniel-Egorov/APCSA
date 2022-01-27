//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov
//Date - 27 Jan 2022

public class RayDown {
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray) {
    for (int i = 1; i < numArray.length; i++) {
      /*
      if the current number is greater than 
      or equal to the first number then that
      means that it is not descending
      */
      if (numArray[i] >= numArray[i - 1]) return false;
    }
		return true;
	}	
}