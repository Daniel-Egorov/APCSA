//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

public class TriangleFive {

  private char letter;
  private int amount;

  public TriangleFive() {
    this.setAmount(0);
  }

  public TriangleFive(char c, int amt) {
    this.setLetter(c);
    this.setAmount(amt);
  }

  public void setLetter(char c) {
    this.letter = c;
  }

  public void setAmount(int amt) {
    this.amount = amt;
  }

  public String toString() {
    String output = "";
    char c = this.letter; // copy of {this.letter}
    int l = 0; // keep track of how many times not to place a letter
    for (int k = 0; k < this.amount; k++) { // for every row
      for (int i = 0 + k; i < this.amount; i++) { // for every letter that will be appended in the current row
        for (int j = this.amount - l; j > 0; j--) { // for every character to be appended {j} times
          /*
          this will add the current character {c} to the output j times. 
          j starts at the given amount but then decrements by one 
          each letter because of {l}. this is why {l} has to get reset
          each time we start a new row because the first letter must 
          always be printed this.amount times
          */
          output += c;
        }
        output += " "; // after placing a series of letters, put a space to separate them
        if (c == 'z' || c == 'Z') c -= 25; // loop back to beginning of alphabet
        else c++; // go to the next letter in the alphabet
        l++; // increase the number of times not to place the current letter
      }
      c = this.letter; // reset the letter copy back to the specified letter to start the next row
      output += "\n";
      l = 0; // must reset {l} to 0 because each new row starts with {this.amount} of {this.letter}
    }
    return output;
  }
}
