//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for(int i = 1; i < wordRay.length; i++) {
			int newCounter = i;
			for(int j = i-1; j >= 0; j--) {
				if(wordRay[newCounter].compareTo(wordRay[j]) < 0) {
					String temp = wordRay[j];
					wordRay[j] = wordRay[newCounter];
					wordRay[newCounter] = temp;
				}
				newCounter--;
			}
		}
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}