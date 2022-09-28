//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		String choice;
		
		do{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a word :: ");
			String word = keyboard.next();
			TriangleWord.printTriangle(word);
			
			
			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));
	}
}