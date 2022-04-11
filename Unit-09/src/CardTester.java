/**
 * This is a class that tests the Card class.
 */
public class CardTester {

  /**
   * The main method in this class checks the Card operations for consistency.
   *	@param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    Card cardOne = new Card("Ten", "Diamonds", 10);
    Card cardTwo = new Card("Ace", "Spades", 1);
    Card cardThree = new Card("King", "Hearts", 13);

    // test toString()
    System.out.println("toString cardOne: " + cardOne);
    System.out.println("toString cardTwo: " + cardTwo);
    System.out.println("toString cardThree: " + cardThree);

    System.out.println();

    // test rank()
    System.out.println("rank cardOne: " + cardOne.rank());
    System.out.println("rank cardTwo: " + cardTwo.rank());
    System.out.println("rank cardThree: " + cardThree.rank());

    System.out.println();

    // test suit()
    System.out.println("suit cardOne: " + cardOne.suit());
    System.out.println("suit cardTwo: " + cardTwo.suit());
    System.out.println("suit cardThree: " + cardThree.suit());

    System.out.println();

    // test pointValue()
    System.out.println("value cardOne: " + cardOne.pointValue());
    System.out.println("value cardTwo: " + cardTwo.pointValue());
    System.out.println("value cardThree: " + cardThree.pointValue());

    System.out.println();

    // test matches()
    System.out.println("cardOne matches cardTwo: " + cardOne.matches(cardTwo));
    System.out.println("cardOne matches cardThree: " + cardOne.matches(cardThree));
    System.out.println("cardTwo matches cardThree: " + cardTwo.matches(cardThree));
    System.out.println("cardOne matches cardOne: " + cardOne.matches(cardOne));
  }
}
