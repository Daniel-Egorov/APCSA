//� A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 14 Jan 2022
//Class - APCSA
//Lab  - Unit 1

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars() {
	   out.println("********************");
   }

   public void printTwentyDashes() {
	   out.println("--------------------");
   }

   public void printTwoBlankLines() {
	   out.println("\n");
   }
   
   public void printASmallBox() {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox() { 	
	   printASmallBox();
	   printASmallBox();
   }   
}