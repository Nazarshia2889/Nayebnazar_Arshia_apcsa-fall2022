/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"hearts", "clubs", "spades"};
		int[] points = {10, 11, 12};
		Deck deck1 = new Deck(ranks, suits, points);
		
		String[] ranks2 = {"5", "2", "1"};
		String[] suits2 = {"diamonds", "hearts", "clubs"};
		int[] points2 = {5, 2, 1};
		Deck deck2 = new Deck(ranks2, suits2, points2);
		
		String[] ranks3 = {"7", "2", "8"};
		String[] suits3 = {"spades", "hearts", "diamonds"};
		int[] points3 = {10, 11, 12};
		Deck deck3 = new Deck(ranks3, suits3, points3);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println(deck2);
		deck2.shuffle();
		System.out.println(deck2);
		
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		System.out.println(deck3);
		deck3.shuffle();
		System.out.println(deck3);
	}
}
