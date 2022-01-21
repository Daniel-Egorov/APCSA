//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 21 Jan 2022
//Class - APCSA
//Lab  - Unit 5 StringEquality

import static java.lang.System.*;

public class StringEqualityRunner {
	public static void main( String args[] ) {
		//add test cases
		StringEquality comparator = new StringEquality();
		
		comparator.setWords("hello", "goodbye");
		System.out.println(comparator);
		
		comparator.setWords("one", "two");
		System.out.println(comparator);
		
		comparator.setWords("three", "four");
		System.out.println(comparator);
		
		comparator.setWords("TCEA", "UIL");
		System.out.println(comparator);
		
		comparator.setWords("State", "Champions");
		System.out.println(comparator);
		
		comparator.setWords("ABC", "ABC");
		System.out.println(comparator);
		
		comparator.setWords("ABC", "CBA");
		System.out.println(comparator);
		
		comparator.setWords("Same", "Same");
		System.out.println(comparator);
	}
}