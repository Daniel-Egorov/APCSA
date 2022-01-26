//(c) A+ Computer Science
//www.apluscompsci.com
//Name Daniel Egorov

import static java.lang.System.*;

public class Word {
	private String word;

	public Word() {
    this.setString("");
	}

	public Word(String s) {
    this.setString(s);
	}

	public void setString(String s) {
    this.word = s;
	}

	public char getFirstChar() {
		return this.word.charAt(0);
	}

	public char getLastChar() {
		return this.word.charAt(this.word.length() - 1);
	}

	public String getBackWards() {
		String back = "";

    for (int i = this.word.length() - 1; i > -1; i--) {
      back += this.word.charAt(i);
    }
    
		return back;
	}

 	public String toString() {
 		return this.word;
	}
}