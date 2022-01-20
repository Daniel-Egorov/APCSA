//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 20 Jan 2022
//Class - APCSA
//Lab  - Unit 5 StringOddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args ) {
		String word;
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven str = new StringOddOrEven();
		
		System.out.print("Enter a word :: ");
		word = keyboard.next();
		str.setString(word);
		System.out.println(str.toString());
		
	}
}