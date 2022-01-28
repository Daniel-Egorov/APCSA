//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 4 Discount

import static java.lang.System.*;

import java.util.Scanner;

public class DiscountRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    out.print("Enter the original bill amount :: ");
    double amt = keyboard.nextDouble();

    System.out.printf(
      "Bill after discount :: %.2f",
      Discount.getDiscountedBill(amt)
    );
  }
}
