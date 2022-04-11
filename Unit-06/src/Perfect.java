//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class Perfect {

  private int number;

  //add constructors
  public Perfect() {
    this.setNum(0);
  }

  public Perfect(int num) {
    this.setNum(num);
  }

  //add a set method
  public void setNum(int num) {
    this.number = num;
  }

  public boolean isPerfect() {
    /*
    MAX prevents checking more numbers than necessary,
    originally it would check all numbers up until the
    number we are checking, but now it only checks up to
    the floored integer of the square root of the number

    MAX allows all numbers beyond the square root of 
    the number to be pre determined as a divisor or not

    take 6 for example, the divisors are 1, 2, 3 (and 6)
    the floored integer square root of 6 is 2, meaning we 
    only have to check the numbers 1 and 2. checking 2 we 
    see that it is a divisor, and from there we can conclude
    its pair (3) is also a divisor, and because we check only up
    to 2, we know we dont have to check 4 or 5 because they
    arent paired with any of the divisors we have already
    calculated, therefore speeding up the calculation and 
    especially so for really large numbers
    */
    int MAX = (int) Math.floor(Math.sqrt(this.number));
    int divisorSum = 1; // to store the sum of every divisor

    int i = 2;
    while (i <= MAX) {
      if (this.number % i == 0) {
        divisorSum += i;
        divisorSum += this.number / i;
      }
      i++;
    }
    return divisorSum == this.number;
  }

  //add a toString
  public String toString() {
    if (this.isPerfect()) return this.number + " is perfect."; else return (this.number + " is not perfect.");
  }
}
