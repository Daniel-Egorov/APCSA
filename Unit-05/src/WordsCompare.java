//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 21 Jan 2022
//Class - APCSA
//Lab  - Unit 5 WordsCompareRunner

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare() {
	}

	public WordsCompare(String one, String two) {
		this.setWords(one, two);
	}

	public void setWords(String one, String two) {
		this.wordOne = one;
		this.wordTwo = two;
		this.compare();
	}

	public void compare() {
		compare = this.wordOne.compareTo(this.wordTwo);
	}

	public String toString() {
		if(compare<0) {
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else {
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}