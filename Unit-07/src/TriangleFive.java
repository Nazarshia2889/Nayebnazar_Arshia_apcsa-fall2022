//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char newLetter;
		for(int i = amount; i >= 1; i--) {
			for(int j = amount; j >= ((amount - i)+1); j--) {
				newLetter = (char) (letter + (amount - j));
				if(newLetter > 'Z') {
					newLetter = (char) (newLetter % 'Z' + ('A' - 1));
				}
				output += (newLetter + "").repeat(j) + " ";
			}
			output += "\n";
 		}
		return output;
	}
}