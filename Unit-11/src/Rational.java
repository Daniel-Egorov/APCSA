//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

class Rational implements Comparable<Rational> {

  //add two instance variables
  private int numerator;
  private int denominator;

  //write two constructors
  public Rational() {
    this.setRational(1, 1);
  }

  public Rational(int numerator, int denominator) {
    this.setRational(numerator, denominator);
    this.reduce();
  }

  //write a setRational method
  public void setRational(int num, int den) {
    this.setNumer(num);
    this.setDenom(den);
    this.reduce();
  }

  //write  a set method for numerator and denominator
  public void setNumer(int num) {
    this.numerator = num;
  }

  public void setDenom(int den) {
    this.denominator = den;
  }

  public void add(Rational other) {
    //num1/den1 + num2/den2
    //new numerator = (num1 * den2 + num2 * den1)
    //new denominator = (den1 * den2)
    this.setRational(
        (this.numerator * other.getDenom() + other.getNumer() * this.denominator),
        (this.denominator * other.getDenom())
      );
    this.reduce();
  }

  private void reduce() {
    int gcd = this.gcd(this.numerator, this.denominator);
    if (gcd != 0) {
      // cant call this.setRational() because it will result in an infinite loop
      this.setNumer(this.numerator / gcd);
      this.setDenom(this.denominator / gcd);
    }
  }

  private int gcd(int numOne, int numTwo) {
    int small;
    if (numOne > numTwo) small = numTwo; else small = numOne;
    /*
    start the divisor at the smallest of the two numbers
    then keep dividing both numbers by the divisor and 
    decrementing the divisor by one until the remainder
    of both divisions is 0 
    */
    for (int div = small; div > 1; div--) {
      if (numOne % div == 0 && numTwo % div == 0) return div;
    }
    return 0;
  }

  public Object clone() {
    return new Rational(this.numerator, this.denominator);
  }

  //ACCESSORS
  //write get methods for numerator and denominator
  public int getNumer() {
    return this.numerator;
  }

  public int getDenom() {
    return this.denominator;
  }

  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj.getClass() != this.getClass()) return false;
    Rational other = (Rational) obj;
    return this.compareTo(other) == 0;
  }

  public int compareTo(Rational other) {
    double otherDiv = (double) other.getNumer() / other.getDenom();
    double thisDiv = (double) this.numerator / this.denominator;
    if (thisDiv > otherDiv) return 1; else if (thisDiv < otherDiv) return -1; else return 0;
  }

  //write  toString() method
  public String toString() {
    return this.numerator + "/" + this.denominator;
  }
}
