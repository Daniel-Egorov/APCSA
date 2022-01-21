//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 21 Jan 2022
//Class - APCSA
//Lab  - Unit 5 WordsCompare

import static java.lang.System.*;

public class WordsCompareRunner {
   public static void main( String args[] ) {
	   WordsCompare comparator = new WordsCompare();
	   
	   comparator.setWords("abe", "ape");
	   System.out.println(comparator);
	   
	   comparator.setWords("girrafe", "gorilla");
	   System.out.println(comparator);
	   
	   comparator.setWords("one", "two");
	   System.out.println(comparator);
	   
	   comparator.setWords("fun", "funny");
	   System.out.println(comparator);
	   
	   comparator.setWords("123", "19");
	   System.out.println(comparator);
	   
	   comparator.setWords("193", "1910");
	   System.out.println(comparator);
	   
	   comparator.setWords("goofy", "godfather");
	   System.out.println(comparator);
	   
	   comparator.setWords("funnel", "fun");
	   System.out.println(comparator);
   }
}