import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-99);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		arr.add(12345);
		System.out.println(new ListDown().go(arr));
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(9);
		arr2.add(8);
		arr2.add(7);
		arr2.add(6);
		arr2.add(5);
		arr2.add(4);
		arr2.add(3);
		arr2.add(2);
		arr2.add(1);
		arr2.add(-99);
		System.out.println(new ListDown().go(arr2));
		
		
		
	}
}