//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 3 Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Distance distance = new Distance();
		
		for (int i = 0; i < 5; i++) { // run 5 times
			System.out.print("Enter X1 :: ");
			int x1 = keyboard.nextInt();
			
			System.out.print("Enter Y1 :: ");
			int y1 = keyboard.nextInt();
			
			System.out.print("Enter X2 :: ");
			int x2 = keyboard.nextInt();
			
			System.out.print("Enter Y2 :: ");
			int y2 = keyboard.nextInt();
			
			//add test cases
			distance.setCoordinates(x1, y1, x2, y2);
			System.out.println(distance);
		}	
	}
}