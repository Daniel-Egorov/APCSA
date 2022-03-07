//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s ) {
    this.word = s;
	}

	public int compareTo( Word rhs ) {
    if (this.word.length() < rhs.toString().length()) return -1;
    else if (this.word.length() > rhs.toString().length()) return 1;
    else {
      if (this.word.compareTo(rhs.toString()) < 0) return -1;
      else if (this.word.compareTo(rhs.toString()) > 0) return 1;
    }
		return 0;
	}

	public String toString() {
		return this.word;
	}
}