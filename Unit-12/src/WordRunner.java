//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		for(int i = 0; i < words.length; i++) {
			String s = file.nextLine();
			words[i] = new Word(s);
		}
		
		Arrays.sort(words);
		
		for(Word word : words) {
			System.out.println(word);
		}


	}
}