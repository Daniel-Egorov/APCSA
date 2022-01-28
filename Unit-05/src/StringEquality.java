//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 21 Jan 2022
//Class - APCSA
//Lab  - Unit 5 StringEquality

import static java.lang.System.*;

public class StringEquality {

  private String wordOne, wordTwo;

  public StringEquality() {}

  public StringEquality(String one, String two) {
    this.setWords(one, two);
  }

  public void setWords(String one, String two) {
    this.wordOne = one;
    this.wordTwo = two;
  }

  public boolean checkEquality() {
    return this.wordOne.equals(this.wordTwo);
  }

  public String toString() {
    if (!this.checkEquality()) return (
      wordOne + " does not have the same letters as " + wordTwo + "\n"
    ); else return wordOne + " has the same letters as " + wordTwo + "\n";
  }
}
