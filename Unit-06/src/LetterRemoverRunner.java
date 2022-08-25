//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover lr = new LetterRemover();
		lr.setRemover("I am Sam I am a", 'a');
		System.out.println(lr);
		System.out.println(lr.removeLetters());
		System.out.println("");
		
		lr.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(lr);
		System.out.println(lr.removeLetters());
		System.out.println("");
		
		lr.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(lr);
		System.out.println(lr.removeLetters());
		System.out.println("");
		
		lr.setRemover("abababababa", 'b');
		System.out.println(lr);
		System.out.println(lr.removeLetters());
		System.out.println("");
		
		lr.setRemover("abaababababa", 'x');
		System.out.println(lr);
		System.out.println(lr.removeLetters());
	}
}