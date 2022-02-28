//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToyStore {

  private ArrayList<Toy> toyList;

  public ToyStore() {}

  public void loadToys(String toys) {
    String[] newToys = toys.split(" ");
    this.toyList = new ArrayList<Toy> ();

    for (int i = 0; i < newToys.length; i++) {
      if (this.getThatToy(newToys[i]) != null) {
        Toy temp = this.getThatToy(newToys[i]);
        temp.setCount(temp.getCount() + 1); // increment the toy count by one
        // replace the toy object with the newly incremented by one toy object
        this.toyList.set(this.toyList.indexOf(this.getThatToy(newToys[i])), temp);
      }
      else {
        Toy temp = new Toy();
        temp.setName(newToys[i]);
        temp.setCount(1);
        this.toyList.add(temp);
      }
    }
    this.sortToysByCount();
  }

  public Toy getThatToy(String nm) {
    if (this.toyList == null) return null;
    for (int i = 0; i < this.toyList.size(); i++) {
      if (this.toyList.get(i).getName().equals(nm)) return this.toyList.get(i);
    }
    return null;
  }

  public String getMostFrequentToy() {
    return "max == " + this.toyList.get(0).getName();
  }

  public void sortToysByCount() {
    for (int i = 0; i < this.toyList.size() - 1; i++) {
      for (int j = 0; j < this.toyList.size() - 1; j++) {
        if (this.toyList.get(j).getCount() < this.toyList.get(j + 1).getCount()) {
          Toy temp = this.toyList.get(j + 1);
          this.toyList.set(j + 1, this.toyList.get(j));
          this.toyList.set(j, temp);
        }
      }
    }
  }

  public String toString() {
    return "" + Arrays.toString(this.toyList.toArray());
  }

  public static void main(String[] args) {
    ToyStore toyStore = new ToyStore();
    toyStore.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
    System.out.println(toyStore);
    System.out.println(toyStore.getMostFrequentToy());
  }
}
