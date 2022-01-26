//(c) A+ Computer Science
//www.apluscompsci.com
//Name Daniel Egorov

import static java.lang.System.*;

public class WordRunner {
	public static void main ( String[] args ) {
		//add test cases
    Word backWord = new Word();

    backWord.setString("Hello");
    System.out.println(backWord.getFirstChar());
    System.out.println(backWord.getLastChar());
    System.out.println(backWord.getBackWards());
    System.out.println(backWord);

    System.out.println();

    backWord.setString("World");
    System.out.println(backWord.getFirstChar());
    System.out.println(backWord.getLastChar());
    System.out.println(backWord.getBackWards());
    System.out.println(backWord);

    System.out.println();

    backWord.setString("JukeBox");
    System.out.println(backWord.getFirstChar());
    System.out.println(backWord.getLastChar());
    System.out.println(backWord.getBackWards());
    System.out.println(backWord);

    System.out.println();

    backWord.setString("TCEA");
    System.out.println(backWord.getFirstChar());
    System.out.println(backWord.getLastChar());
    System.out.println(backWord.getBackWards());
    System.out.println(backWord);

    System.out.println();

    backWord.setString("UIL");
    System.out.println(backWord.getFirstChar());
    System.out.println(backWord.getLastChar());
    System.out.println(backWord.getBackWards());
    System.out.println(backWord);
	}
}