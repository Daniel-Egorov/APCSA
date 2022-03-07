//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/eggnog/Developer/APCSA/Unit-12/src/words.dat"));

		int size = file.nextInt();
		file.nextLine();

    List<Word> sorted = new ArrayList<Word>();

    for (int i = 0; i < size; i++) {
      String word = file.next();
      Word wordObject = new Word(word);

      sorted.add(wordObject);
    }

    for (int i = 0; i < sorted.size(); i++) {
      for (int j = 0; j < sorted.size() - 1; j++) {
        if (sorted.get(j).compareTo(sorted.get(j + 1)) == 1) {
          Word temp = sorted.get(j);
          sorted.set(j, sorted.get(j + 1));
          sorted.set(j + 1, temp);
        }
      }
    }

		for (int i = 0; i < sorted.size(); i++) {
      System.out.println(sorted.get(i));
    }
	}
}