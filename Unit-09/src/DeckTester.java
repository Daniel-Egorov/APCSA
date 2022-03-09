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
    String[] ranks = {
      "ace",
      "king",
      "queen",
      "jack",
      "ten",
      "nine",
      "eight",
      "seven",
      "six",
      "five",
      "four",
      "three",
      "two",
    };

    String[] suits = { "spades", "diamonds", "clubs", "hearts" };

    int[] values = { 11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

    Deck deck = new Deck(ranks, suits, values);
    deck.shuffle();
    deck.deal();
    deck.deal();
    System.out.println(deck.toString());
  }
}
