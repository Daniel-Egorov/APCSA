//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class Toy {

  private String name;
  private int count;

  public Toy() {}

  public Toy(String name, int count) {
    this.setName(name);
    this.setCount(count);
  }

  public int getCount() {
    return this.count;
  }

  public void setCount(int cnt) {
    this.count = cnt;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String nm) {
    this.name = nm;
  }

  public String toString() {
    return "" + this.name + ": " + this.getCount();
  }
}
