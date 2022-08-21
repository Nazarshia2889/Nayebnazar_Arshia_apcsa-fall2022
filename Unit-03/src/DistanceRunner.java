//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in);
		
		//Test case #1 (1, 1, 2, 1)
		System.out.println("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.println("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		Distance distance = new Distance(x1, y1, x2, y2);
		distance.calcDistance();
		System.out.println(distance.toString());
		
		System.out.println("\n");
		//Test case #2 (1, 1, -2, 2)
		System.out.println("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter y2 :: ");
		y2 = keyboard.nextInt();
		Distance distance2 = new Distance(x1, y1, x2, y2);
		distance2.setCoordinates(x1, y1, x2, y2);
		distance2.calcDistance();
		System.out.println(distance2.toString());
		
		System.out.println("\n");
		//Test case #3 (1, 1, 0, 0)
		System.out.println("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter y2 :: ");
		y2 = keyboard.nextInt();
		Distance distance3 = new Distance(x1, y1, x2, y2);
		distance3.calcDistance();
		System.out.println(distance3.toString());
	}
}