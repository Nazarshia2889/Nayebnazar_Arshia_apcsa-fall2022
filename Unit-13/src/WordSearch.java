//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for(int i = 0; i < size; i++) {
    		for(int j = 0; j < size; j++) {
    			m[i][j] = str.charAt(j + (i * size)) + "";
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	boolean curr = false;
    	for(int i = 0; i < m.length; i++) {
    		for(int j = 0; j < m[i].length; j++) {
    			curr = (checkRight(word, i, j) || checkLeft(word, i, j) ||
    					checkUp(word, i, j) || checkDown(word, i , j) ||
    					checkDiagUpRight(word, i , j) || checkDiagUpLeft(word, i , j) ||
    					checkDiagDownLeft(word, i , j) || checkDiagDownRight(word, i, j));
    			if(curr) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if(c + w.length() > m[r].length) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			c++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if(c - w.length() < 0) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			c--;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if(r - w.length() < 0) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r--;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if(r + w.length() > m.length) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r++;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if(r - w.length() < 0 || c + w.length() > m[r].length) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(r - w.length() < 0 || c - w.length() < 0) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if(r + w.length() > m.length || c - w.length() < 0) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r++;
			c--;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(r + w.length() > m.length || c + w.length() > m[r].length) {
			return false;
		}
		for(int i = 0; i < w.length(); i++) {
			if(!m[r][c].equals((w.charAt(i) + ""))) {
				return false;
			}
			r++;
			c++;
		}
		return true;
	}

    public String toString()
    {
 		return Arrays.toString(m);
    }
}
