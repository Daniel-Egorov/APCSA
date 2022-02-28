//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class ToyRunner {

  public static void main(String[] args) {
    Toy toy = new Toy();
    toy.setName("sorry");
    toy.setCount(1);
    out.println(toy);

    toy.setName("gi joe");
    toy.setCount(5);
    out.println(toy);
  }
}
