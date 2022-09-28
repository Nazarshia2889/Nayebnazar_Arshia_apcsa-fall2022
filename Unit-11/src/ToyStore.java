//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] toysArr = toys.split(" ");
		for(String toy : toysArr) {
			boolean found = false;
			for(Toy t: toyList) {
				if(t.getName().equals(toy)) {
					t.setCount(t.getCount() + 1);
					found = true;
				}
			}
			if(found == false) {
				toyList.add(new Toy(toy));
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy : toyList) {
  			if(toy.getName().equals(nm)) {
  				return toy;
  			}
  		}
   		return new Toy();
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}