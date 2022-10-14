//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;
	
	//add a constructor
	public Skeleton() {
		name = " ";
		size = 0;
	}
	
	public Skeleton(String newName, int newSize) {
		name = newName;
		size = newSize;
	}

	public int getHowBig() {

		return size;
	}

	public String getName() {

		return name;
	}


	public boolean isBigger(Monster other) {

		return size > other.getHowBig();
	}

	public boolean isSmaller(Monster other) {

		return size < other.getHowBig();
	}

	public boolean namesTheSame(Monster other) {
		return name.equals(other.getName());
	}

	//add code to implement the Monster interface

	//add a toString
	public String toString() {
		return name + " " + size;
	}
}