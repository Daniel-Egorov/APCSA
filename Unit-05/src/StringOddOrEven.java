//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 20 Jan 2022
//Class - APCSA
//Lab  - Unit 5 StringOddOrEven

import static java.lang.System.*;

import java.util.Scanner;

public class StringOddOrEven {

  private String word;

  public StringOddOrEven() {}

  public StringOddOrEven(String s) {
    this.word = s;
  }

  public void setString(String s) {
    this.word = s;
  }

  public boolean isEven() {
    return this.word.length() % 2 == 0;
  }

  public String toString() {
    String result;
    if (this.isEven()) result = "even"; else result = "odd";

    String output = this.word + " is " + result;
    return output;
  }
}
