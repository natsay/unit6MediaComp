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
  
  public static void testScaleByHalf() 
  {
      Picture water= new Picture("water.jpg"); 
      water.explore(); 
      Picture newWater=water.scaleByHalf(); 
      newWater.explore();
  } 
  
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
      
  }    

  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
    public static void testCropandCopy() 
  {
    Picture beach = new Picture("beach.jpg");
    Picture water = new Picture("water.jpg");
    water.explore();
    water.cropAndCopy(beach,100, 200, 100, 200 ,300 ,300);
    water.explore();
      
  }     
  
  public static void testMirrorHorizontal() 
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
      
  } 
  public static void testMirrorHorizontalBotToTop() 
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
      
  } 
  public static void testMirrorArms() 
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
      
      
  }   
  public static void testMirrorGulls() 
  {
    Picture seagul = new Picture("seagull.jpg");
    seagul.explore();
    seagul.mirrorGull();
    seagul.explore();
      
      
  }  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
      
  } 
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
      
  }    
  


  public static void testKeepOnlyRed() 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
      
      
  }  
  public static void testKeepOnlyGreen() 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
      
      
  }  
  
  public static void testGrayscale() 
  {
    Picture beach = new Picture("beach.jpg");
    
    beach.explore();
    beach.grayscale();
    beach.explore();
      
      
  }
  
   
  
  public static void testScalebyHalf() 
  {
      Picture beach = new Picture("beach.jpg");
      Picture water = new Picture("water.jpg");
      beach.explore();
      water.scaleByHalf(); 
      water.explore();
  }    
  

  
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
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
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //error:DigitalPicture p=new DigitalPicture();
    //interface does not implement their methods,unless every method is implement cannot create 
    //object instances
    //DigitalPicture p= new SimplePicture(); 
    //works: local varibales can reference 
    //DigitalPicture p = new Picture(); 
    //works; picture is implements that of simple picture
    //can always sign a reference lower in anarchy 
    //SimplePicture p = new Picture(); 
    //works: variable of parent class,object created is that of a subclass 
    //Picture p = new SimplePicture(); 
    //error
    testZeroBlue();
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
    testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}