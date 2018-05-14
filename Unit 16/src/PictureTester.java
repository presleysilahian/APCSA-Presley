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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  public static void testKeepOnlyRed()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.explore();
	  temple.keepOnlyRed();
	  temple.explore();
  }
  public static void testKeepOnlyGreen()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.keepOnlyGreen();
	  swan.explore();
  }
  public static void testNegate()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.negate();
	  swan.explore();
  }
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorDiagonal();
	  seagull.explore();
  }
  public static void testCopy()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.copy(beach, 0, 320);
	  beach.explore();
  }
  public static void testSharpen(int x, int y, int w, int h)
  {
       Picture redMoto = new Picture("water.jpg");
       redMoto.explore();
       redMoto.sharpen(x,y,w,h);
       redMoto.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEncodeAndDecode()
  {
	  Picture beach = new Picture("beach.jpg");
	  Picture newPic = new Picture("apple.jpg");
	  beach.explore();
	  beach.encode(newPic);
	  beach.decode().explore();
	  beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate(); 
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();  
	//testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
	//testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testSharpen(50,50,500,400);
	testEncodeAndDecode();
  }
}