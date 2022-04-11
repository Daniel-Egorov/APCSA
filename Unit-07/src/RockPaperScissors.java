//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.Scanner;

public class RockPaperScissors {

  private String playChoice;
  private String compChoice;

  public RockPaperScissors() {
    this.setPlayers("");
  }

  public RockPaperScissors(String player) {
    this.setPlayers(player);
  }

  public void setPlayers(String player) {
    this.playChoice = player;
  }

  public String determineWinner() {
    int rand = (int) Math.floor(Math.random() * 3);
    switch (rand) {
      case 0:
        this.compChoice = "R";
        break;
      case 1:
        this.compChoice = "P";
        break;
      case 2:
        this.compChoice = "S";
        break;
    }

    if ( // all cases in which computer wins
      (this.compChoice.equals("R") && this.playChoice.equals("S")) ||
      (this.compChoice.equals("P") && this.playChoice.equals("R")) ||
      (this.compChoice.equals("S") && this.playChoice.equals("P"))
    ) return "Computer"; else if ( // all cases in which player wins
      (this.playChoice.equals("R") && this.compChoice.equals("S")) ||
      (this.playChoice.equals("P") && this.compChoice.equals("R")) ||
      (this.playChoice.equals("S") && this.compChoice.equals("P"))
    ) return "Player"; else return "Draw Game";
  }

  public String toString() {
    String winner = this.determineWinner();
    String output = "player had " + this.playChoice + "\ncomputer had " + this.compChoice + "\n";
    String p = ""; // store the full word of the player's choice
    String c = ""; // store the full word of the computer's choice

    output += winner;

    if (winner.equals("Draw Game")) return output;

    output += " wins";

    switch (this.playChoice) {
      case "R":
        p = "Rock";
        break;
      case "P":
        p = "Paper";
        break;
      case "S":
        p = "Scissors";
        break;
    }

    switch (this.compChoice) {
      case "R":
        c = "Rock";
        break;
      case "P":
        c = "Paper";
        break;
      case "S":
        c = "Scissors";
        break;
    }

    if (winner.equals("Player")) output += " <<" + p + " beats " + c + ">>"; else output +=
      " <<" + c + " beats " + p + ">>";

    return output;
  }
}
