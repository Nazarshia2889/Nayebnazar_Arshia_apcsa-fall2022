//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name: ");
		String monsterOne = keyboard.nextLine();
		
		System.out.println("Enter 1st monster's size: ");
		int monsterOneSize = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton firstMonster = new Skeleton(monsterOne, monsterOneSize);
		
		Scanner keyboard2 = new Scanner(System.in);
		//ask for name and size
		System.out.println("Enter 2nd monster's name: ");
		String monsterTwo = keyboard2.nextLine();
		
		System.out.println("Enter 2nd monster's size: ");
		int monsterTwoSize = keyboard2.nextInt();
		
		//instantiate monster two
		Skeleton secondMonster = new Skeleton(monsterTwo, monsterTwoSize);
		
		
		System.out.println();
		System.out.println("Monster 1 - " + firstMonster);
		System.out.println("Monster 2 - " + secondMonster);
		System.out.println();
		if(firstMonster.isBigger(secondMonster)) {
			System.out.println("Monster one is bigger than monster two.");
		}
		else if(firstMonster.isSmaller(secondMonster)) {
			System.out.println("Monster one is smaller than monster two");
		}
		
		if(firstMonster.namesTheSame(secondMonster)) {
			System.out.println("Monster one has the same name as monster two.");
		}
		else {
			System.out.println("Monster one does not have the same name as monster two.");
		}
		keyboard.close();
		keyboard2.close();
	}
}