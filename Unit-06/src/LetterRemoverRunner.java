//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class LetterRemoverRunner {

  public static void main(String args[]) {
    //add test cases
    LetterRemover remover = new LetterRemover();

    remover.setRemover("I am Sam I am", 'a');
    System.out.println(remover);
    System.out.println(remover.removeLetters());

    System.out.println();

    remover.setRemover("ssssssssxssssesssssesss", 's');
    System.out.println(remover);
    System.out.println(remover.removeLetters());

    System.out.println();

    remover.setRemover("qwertyqwertyqwerty", 'a');
    System.out.println(remover);
    System.out.println(remover.removeLetters());

    System.out.println();

    remover.setRemover("abababababa", 'b');
    System.out.println(remover);
    System.out.println(remover.removeLetters());

    System.out.println();

    remover.setRemover("abaababababa", 'x');
    System.out.println(remover);
    System.out.println(remover.removeLetters());
  }
}
