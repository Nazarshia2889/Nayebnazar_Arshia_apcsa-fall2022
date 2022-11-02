//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int digits = getNumDigits(number);
		int[] sorted = new int[digits];
		for(int i = 0; i < digits; i++) {
			sorted[i] = number % 10;
			number = number / 10;
		}
		for(int i = 1; i < sorted.length; i++) {
			int newCounter = i;
			for(int j = i-1; j >= 0; j--) {
				if(sorted[newCounter] < sorted[j]) {
					int temp = sorted[j];
					sorted[j] = sorted[newCounter];
					sorted[newCounter] = temp;
				}
				newCounter--;
			}
		}
		return sorted;
	}
}