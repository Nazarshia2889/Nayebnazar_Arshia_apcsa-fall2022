//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "x", "2", "9", "b", "7", "c"};
		Grid grid = new Grid(10, 10, vals);
		System.out.println(grid);
		System.out.println(grid.findMax(vals) + " occurs the most.");
	}
}