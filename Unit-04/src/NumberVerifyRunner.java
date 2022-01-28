//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 4 NumberVerify

import static java.lang.System.*;

import java.util.Scanner;

public class NumberVerifyRunner {

  public static void main(String[] args) {
    //add in input
    Scanner keyboard = new Scanner(System.in);

    System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
    System.out.println("5 is even :: " + NumberVerify.isEven(5));

    //add in more test cases
    System.out.print("Enter an integer :: ");
    int test = keyboard.nextInt();
    System.out.println(
      String.format("%d is odd :: %b", test, NumberVerify.isOdd(test))
    );
    System.out.println(
      String.format("%d is even :: %b", test, NumberVerify.isEven(test))
    );

    System.out.print("Enter an integer :: ");
    test = keyboard.nextInt();
    System.out.println(
      String.format("%d is odd :: %b", test, NumberVerify.isOdd(test))
    );
    System.out.println(
      String.format("%d is even :: %b", test, NumberVerify.isEven(test))
    );

    System.out.print("Enter an integer :: ");
    test = keyboard.nextInt();
    System.out.println(
      String.format("%d is odd :: %b", test, NumberVerify.isOdd(test))
    );
    System.out.println(
      String.format("%d is even :: %b", test, NumberVerify.isEven(test))
    );
  }
}
