//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 13 Jan 2022
//Class - APCSA
//Lab  - Unit 0b1

public class Variables {

  public static void main(String[] args) {
    //define 1 variable of each of the
    //following data types
    //byte		short		int 		long
    //float		double
    //char      boolean		String

    //integer variables
    byte byteOne = 127;
    short shortOne = 255;
    int intOne = 46757;
    long longOne = 2150000000L;

    //decimal variables
    float floatOne = 10.73F;
    double doubleOne = 17.12;

    //other integer types
    char letterA = 65;

    //other types
    String stringOne = "Hello World";
    boolean booleanOne = true;

    //output your information here
    System.out.println("/////////////////////////////////");
    System.out.println("*                               *");
    System.out.println("*        integer types          *");
    System.out.println("*                               *");
    System.out.println("* 8 bit - byteOne = " + byteOne + "\t\t*");
    System.out.println("* 16 bit - shortOne = " + shortOne + "\t*");
    System.out.println("* 32 bit - intOne = " + intOne + "\t*");
    System.out.println("* 64 bit - longOne = " + longOne + "\t*");
    System.out.println("*                               *");
    System.out.println("*        decimal types          *");
    System.out.println("*                               *");
    System.out.println("* 32 bit - floatOne = " + floatOne + "\t*");
    System.out.println("* 64 bit - doubleOne = " + doubleOne + "\t*");
    System.out.println("*                               *");
    System.out.println("*      other integer types      *");
    System.out.println("*                               *");
    System.out.println("* 16 bit - letterA = " + letterA + "\t\t*");
    System.out.println("*                               *");
    System.out.println("*         other types           *");
    System.out.println("*                               *");
    System.out.println("* stringOne = " + stringOne + "\t*");
    System.out.println("* booleanOne = " + booleanOne + "\t\t*");
    System.out.println("*                               *");
    System.out.println("/////////////////////////////////");
  }
}
