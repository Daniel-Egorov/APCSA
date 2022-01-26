//(c) A+ Computer Science
//www.apluscompsci.com
//Name Daniel Egorov

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne() {
    this.setWord("");
	}

	public TriangleOne(String s) {
    this.setWord(s);
	}

	public void setWord(String s) {
    this.word = s;
	}

	public void print() {
    for (int i = this.word.length(); i > 0; i--) {
      System.out.println(this.word.substring(0, i));
    }
	}
}