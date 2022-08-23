//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven oe = new StringOddOrEven();
		String word;
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
		
		System.out.println("Enter a word :: ");
		word = keyboard.nextLine();
		oe.setString(word);
		System.out.println(oe.toString());
	}
}