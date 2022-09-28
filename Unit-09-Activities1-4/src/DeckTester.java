
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
		deck1.deal();
		System.out.println(deck1);
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		deck2.deal();
		System.out.println(deck2);
	
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		deck3.deal();
		System.out.println(deck3);
		
		
		String[] ranks4 = new String[52];
        String[] suits4 = new String[52];
        int[] pointValues4 = new int[52];
        for (int i = 0; i < 52; i++) {
            String rank = "";
            String suit = "";
            if ( (i+1) % 13 == 11 ) {
                rank = "Jack";
            }
            else if ( (i+1) % 13 == 12 ) {
                rank = "Queen";
            }
            else if ( (i+1) % 13 == 0 ) {
                rank = "King";
            }
            else if ( (i+1) % 13 == 1 ) {
                rank = "Ace";
            }
            else {
                rank = Integer.toString((i + 1) % 13);
            }
            
            if (i < 13) {
                suit = "Hearts";
            }
            else if (i < 26) {
                suit = "Diamonds";
            }
            else if (i < 39) { 
                suit = "Clubs";
            }
            else {
                suit = "Spades";
            }
            
            ranks4[i] = rank;
            suits4[i] = suit;
            pointValues4[i] = ((i+1) % 13);
        }
        
        Deck deck4 = new Deck(ranks4, suits4, pointValues4);
        System.out.println(deck4);
	}
}
