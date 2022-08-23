//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare wc = new WordsCompare();
	   
	   wc.setWords("abe", "ape");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("giraffe", "gorilla");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("one", "two");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("fun", "funny");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("giraffe", "gorilla");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("123", "19");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("193", "1910");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("goofy", "godfather");
	   wc.compare();
	   System.out.println(wc.toString());
	   
	   wc.setWords("funnel", "fun");
	   wc.compare();
	   System.out.println(wc.toString());
	}
}