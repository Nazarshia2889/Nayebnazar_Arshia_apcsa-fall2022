//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNumber(0);
   }
   
   public Perfect(int n) {
	   setNumber(n);
   }

	//add a set method
   public void setNumber(int n) {
	   number = n;
   }

	public boolean isPerfect()
	{
		int i = 1;
		int sum = 0;
		while(i < number) {
			if(number % i == 0) {
				sum += i;
			}
			i++;
		}
		if(number == sum) {
			return true;
		}
		return false;
	}

	//add a toString
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
}