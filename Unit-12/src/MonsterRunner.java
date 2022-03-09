//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.util.Scanner;

public class MonsterRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int size;

    //ask for name and size
    System.out.print("Enter 1st Monster's name :: ");
    name = keyboard.next();
    System.out.print("Enter 1st Monster's size :: ");
    size = keyboard.nextInt();
    //instantiate monster one
    Skeleton monsterOne = new Skeleton(name, size);

    //ask for name and size
    System.out.print("Enter 2nd Monster's name :: ");
    name = keyboard.next();
    System.out.print("Enter 2nd Monster's size :: ");
    size = keyboard.nextInt();
    //instantiate monster two
    Skeleton monsterTwo = new Skeleton(name, size);

    System.out.println();

    System.out.println("Monster 1 - " + monsterOne);
    System.out.println("Monster 2 - " + monsterTwo);

    System.out.println();

    if (monsterOne.isBigger(monsterTwo)) System.out.println(
      "Monster one is bigger than Monster two"
    ); else System.out.println("Monster one is smaller than Monster two");

    if (monsterOne.namesTheSame(monsterTwo)) System.out.println(
      "Monster one has the same name as Monster two"
    ); else System.out.println(
      "Monster one does not have the same name as Monster two"
    );
  }
}
