//� A+ Computer Science
//www.apluscompsci.com

//Name - Arshia Nayebnazar
//Date - 08/18/2022
//Class - AP CSA
//Lab  - Stars Runner

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	   StarsAndStripes ref = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
	   ref.printTwoBlankLines();
	   ref.printTwentyDashes();
	   ref.printTwentyStars();
	   ref.printTwentyDashes();
	   ref.printTwentyStars();
	   ref.printTwentyDashes();
	   ref.printTwentyStars();
	   ref.printTwentyDashes();
	   ref.printTwoBlankLines();
	   
	   ref.printASmallBox();
	   ref.printASmallBox();
   }
}