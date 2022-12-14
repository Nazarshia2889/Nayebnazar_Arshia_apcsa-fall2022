//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

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
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double newHours = ((double) minutes / 60);
		mph = (distance / (hours + newHours));
	}

	public void print()
	{
		System.out.printf("%1$d miles in %2$d hours and %3$d minutes = %4$.0f MPH \n", distance, hours, minutes, mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return String.format("%d miles", distance) + String.format(" in %d hours", hours) + String.format(" and %d minutes", minutes) +  String.format(" = %.3f MPH", mph);
	}
}