//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 3 Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		calcDistance();
	}

	public void calcDistance()
	{
		double xPow = Math.pow(xTwo - xOne, 2);
		double yPow = Math.pow(yTwo - yOne, 2);
		distance = Math.sqrt(xPow + yPow);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return String.format("distance == %.3f", distance);
	}
}