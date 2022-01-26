//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class LetterRemover {
   private String sentence;
   private char lookFor;

	public LetterRemover() {
		//call set
    char c = 0;
    this.setRemover("", c);
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
    this.setRemover(s, rem);
  }
	
	public void setRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() {
		String cleaned = sentence;

    while (cleaned.contains("" + this.lookFor)) {
      cleaned = cleaned.substring(0, cleaned.indexOf("" + this.lookFor)) + 
                cleaned.substring(cleaned.indexOf("" + this.lookFor) + 1);
    }
    
		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor;
	}
}