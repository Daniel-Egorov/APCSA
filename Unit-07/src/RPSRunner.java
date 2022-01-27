//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
    RockPaperScissors game = new RockPaperScissors();		
    String player = "";
		char response = 0;
		
      do {
        System.out.print("\nRock Paper Scissors - pick your weapon [R, P, S] :: ");
        
        player = keyboard.next().toUpperCase();
        
        game.setPlayers(player);
        System.out.println(game);
        
        System.out.print("\nDo you want to play again? [y/n] :: ");
        response = keyboard.next().charAt(0);
      } while (response == 'y');

      System.out.println("Thanks for playing!");
	}
}



