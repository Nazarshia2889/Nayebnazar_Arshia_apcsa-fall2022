//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int sumGreater = 0;
		boolean greater = false;
		for(int i = 1; i < ray.size(); i++) {
			if(ray.get(i) > first) {
				greater = true;
				sumGreater += ray.get(i);
			}
		}
		if(ray.size() == 0 || greater == false) {
			return -1;
		}
		return sumGreater;
	}
}