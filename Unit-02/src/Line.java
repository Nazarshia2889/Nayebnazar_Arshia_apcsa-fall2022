//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arshia Nayebnazar
//Date - 08/18/2022

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double slope = (double) (y2 - y1)/(x2 - x1);
		return slope;
	}

}