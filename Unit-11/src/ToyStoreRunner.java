//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore ts = new ToyStore();
		
		ts.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		
		System.out.println(ts);
		System.out.println(ts.getMostFrequentToy());
		ts.sortToysByCount();
		System.out.println(ts);

	}
}