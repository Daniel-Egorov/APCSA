//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToyStoreRunner {

  public static void main(String args[]) {
    ToyStore toyStore = new ToyStore();
    toyStore.loadToys(
      "sorry bat sorry sorry sorry train train teddy teddy ball ball"
    );
    System.out.println(toyStore);
    System.out.println(toyStore.getMostFrequentToy());
  }
}
