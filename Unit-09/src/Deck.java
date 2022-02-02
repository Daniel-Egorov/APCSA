import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    int max = ranks.length * suits.length;
    this.size = max;
    this.cards = new Card[max];

    int index = 0;
    for (int i = 0; i < suits.length; i++) { // for every suit in suits
      for (int j = 0; j < ranks.length; j++) { // for every rank in ranks
        this.cards[index] = new Card(ranks[j], suits[i], values[j]);
        index++;
      }
    }
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    return this.cards.length == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    return this.size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void perfectShuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    Card[] shuffled = new Card[52];
    int k = 0;
    for (int j = 0; j < 26; j++) {
      shuffled[k] = this.cards[j];
      k += 2;
    }

    k = 1;
    for (int j = 26; j < 52; j++) {
      shuffled[k] = this.cards[j];
      k += 2;
    }
    this.cards = shuffled;
    this.size = 52;
	}

  public void selectionShuffle() {
    Card[] shuffled = new Card[52];
    for (int k = 0; k < 52; k++) {
      int rand;
      do {
        rand = (int) Math.floor(Math.random() * 52);
      } while (this.cards[rand] == null);
      shuffled[k] = this.cards[rand];
      this.cards[rand] = null;
    }
    this.cards = shuffled;
    this.size = 52;
  }

  public void efficientShuffle() {
    for (int k = 51; k > 0; k--) {
      int rand = (int) Math.floor(Math.random() * (k + 1));
      Card temp = this.cards[rand];
      this.cards[rand] = this.cards[k];
      this.cards[k] = temp;
    }
    this.size = 52;
  }

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    if (this.size - 1 < 0) return null;
    return this.cards[--this.size]; // decrement size by one and return the card at that index;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + this.cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = this.cards.length - 1; k >= this.size; k--) {
			rtn = rtn + this.cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - this.size) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
