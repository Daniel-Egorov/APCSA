//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 3 MPH

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins) {
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH() {
		int mins = (hours * 60) + minutes;
		double mpm = (double)distance / (double)mins;
		mph = mpm * 60;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	public String toString() {
		return String.format("%d miles in %d hours and %d minutes = %.3f MPH", distance, hours, minutes, mph);
	}
}