//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality se = new StringEquality();
		
		se.setWords("hello", "goodbye");
		System.out.println(se.toString());
		
		se.setWords("one", "two");
		System.out.println(se.toString());
		
		se.setWords("three", "four");
		System.out.println(se.toString());
		
		se.setWords("TCEA", "UIL");
		System.out.println(se.toString());
		
		se.setWords("State", "Champions");
		System.out.println(se.toString());
		
		se.setWords("ABC", "ABC");
		System.out.println(se.toString());
		
		se.setWords("ABC", "CBA");
		System.out.println(se.toString());
		
		se.setWords("Same", "Same");
		System.out.println(se.toString());
	}
}