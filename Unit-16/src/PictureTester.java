/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  private static String pathPrefix = "/Users/eggnog/Developer/APCSA/Unit-16/src/images/";
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture(pathPrefix + "caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture(pathPrefix + "temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(pathPrefix + "640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture(pathPrefix + "swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testKeepOnlyRed() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }

  public static void testKeepOnlyGreen() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture(pathPrefix + "water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  public static void testMirrorArms() {
    Picture snowman = new Picture(pathPrefix + "snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture(pathPrefix + "seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  public static void testMirrorDiagonal() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }

  public static void testCopy() {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    Picture seagull = new Picture(pathPrefix + "seagull.jpg");
    beach.copy(seagull, 235, 238, 320, 344, 0, 0);
    beach.explore();
  }

  public static void testEncodeAndDecode() {

  }

  public static void testGetCountRedOverValue(int value) {

  }

  public static void testSetRedToHalfValue(int value) {

  }

  public static void testGetAverageForColumn(int col) {

  }

  public static void testEdgeDetection2() {

  }

  public static void testChromakey() {

  }

  public static void testSetRedToHalfValueInTopHalf() {

  }

  public static void testClearBlueOverValue(int val) {
    Picture beach = new Picture(pathPrefix + "beach.jpg");
    beach.explore();
    beach.clearBlueOverValue(val);
    beach.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture swan = new Picture(pathPrefix + "swan.jpg");
    swan.explore();
    swan.mirrorVerticalRightToLeft();
    swan.explore();
  }
  
  public static void testMirrorHorizontal() {
    Picture motorcycle = new Picture(pathPrefix + "redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture motorcycle = new Picture(pathPrefix + "redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  
  public static void testMyCollage() {
    Picture canvas = new Picture(pathPrefix + "640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater(); // TODO: done
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();
    // testMirrorTemple();
    // testMirrorArms(); // TODO: done
    // testMirrorGull(); // TODO: done
    // testMirrorDiagonal(); // TODO
    // testCollage();
    // testCopy();
    testMyCollage();
    // testEdgeDetection();
    // testEdgeDetection2(); // TODO
    // testChromakey(); // TODO
    // testEncodeAndDecode(); // TODO
    // testGetCountRedOverValue(250); // TODO
    // testSetRedToHalfValueInTopHalf(); // TODO
    // testClearBlueOverValue(0); // TODO
    // testGetAverageForColumn(0); // TODO
  }
}