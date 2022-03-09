//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class Skeleton implements Monster {

  //add instance variables
  private String name;
  private int size;

  //add a constructor
  public Skeleton() {
    this.setNameAndSize("Skeleton", 1);
  }

  public Skeleton(String name, int size) {
    this.setNameAndSize(name, size);
  }

  //add code to implement the Monster interface
  public int getHowBig() {
    return this.size;
  }

  public String getName() {
    return this.name;
  }

  public boolean isBigger(Monster other) {
    return this.size > other.getHowBig();
  }

  public boolean isSmaller(Monster other) {
    return this.size < other.getHowBig();
  }

  public boolean namesTheSame(Monster other) {
    return this.name.equals(other.getName());
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setNameAndSize(String name, int size) {
    this.setName(name);
    this.setSize(size);
  }

  //add a toString
  public String toString() {
    return this.name + " " + this.size;
  }
}
