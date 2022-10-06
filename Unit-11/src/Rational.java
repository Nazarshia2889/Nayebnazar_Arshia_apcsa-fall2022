//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational() {
		setNumerator(1);
		setDenominator(1);
	}
	
	public Rational(int numerator, int denominator) {
		setRational(numerator, denominator);
	}


	//write a setRational method
	public void setRational(int newNumerator, int newDenominator) {
		setNumerator(newNumerator);
		if(newDenominator != 0) {
			setDenominator(newDenominator);
		}
		else {
			setDenominator(1);
		}
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int newNumerator) {
		numerator = newNumerator;
	}
	
	public void setDenominator(int newDenominator) {
		if(newDenominator != 0) {
			denominator = newDenominator;
		}
		else {
			denominator = 1;
		}
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = (numerator * other.denominator) + (other.numerator * denominator);
		denominator = (denominator * other.denominator);
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		int gcd = 0;
		for(int i = 1; i < min; i++) {
			if(numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		Rational rational = new Rational(numerator, denominator);

		return rational.compareTo((Rational) obj) == 0;
	}

	public int compareTo(Rational other)
	{
		double first = (double) numerator/denominator;
		double second = (double) other.numerator/other.denominator;
		if(first < second) {
			return -1;
		}
		else if(first > second) {
			return 1;
		}
		return 0;
	}



	
	//write  toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	
}