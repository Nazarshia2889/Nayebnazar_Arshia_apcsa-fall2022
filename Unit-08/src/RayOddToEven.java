//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
//	public static boolean go(int[] ray)
	public static int go(int[] ray)
	{
		int oddIndex = -1;
		int evenIndex = -1;
		for(int i = 0; i < ray.length; i++) {
			if(oddIndex == -1) {
				if(ray[i] % 2 == 1) {
					oddIndex = i;
				}
				continue;
			}
			if(ray[i] % 2 == 0) {
				evenIndex = i;
				break;
			}
		}
		if(oddIndex == -1 || evenIndex == -1) {
			return -1;
		}
		return evenIndex - oddIndex;
	}
}