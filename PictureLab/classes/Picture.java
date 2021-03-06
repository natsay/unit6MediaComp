import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List


/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    
    /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorVerticalRightToLeft() 
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }    
     
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorHorizontal() 
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    for (int row = 0; row < width; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[width-1-row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
      
      
  }
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    for (int row = 0; row < width; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[width-1-row][col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 

  }    

  

  
  public void mirrorArms() 
  {
    Pixel[][] pixels = this.getPixels2D();
    int mirrorPoint= 193; 
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    //left arm
    for( int row=158; row<mirrorPoint; row++) 
    {
        for(int col=108; col<178; col++) 
        {
            topPixel = pixels[row][col];
            bottomPixel = pixels[mirrorPoint - row+ mirrorPoint][col];
            bottomPixel.setColor(topPixel.getColor());
            
        }    
    }
    
    //right arm 
    for( int row=171; row<mirrorPoint; row++) 
    {
        for(int col=239; col<294; col++) 
        {
            topPixel = pixels[row][col];
            bottomPixel = pixels[mirrorPoint - row+ mirrorPoint][col];
            bottomPixel.setColor(topPixel.getColor());
            
        }    
    }
    
     
  }
  
  public void cropAndCopy( Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol,
         int startDestRow, int startDestCol )
  {
      Pixel[][] sourceGrid = sourcePicture.getPixels2D();
      Pixel[][] endGrid = this.getPixels2D();
      Pixel sourcePixel = null; 
      Pixel endPixel = null;
      int count1=0;
      int count2=0;
      for(int row=startSourceRow; row<endSourceRow; row++)
      {
          for(int col=startSourceCol; col<endSourceCol; col++) 
          {
              sourcePixel=sourceGrid[row][col]; 
              endPixel=endGrid[startDestRow+count1][startDestCol+count2]; 
              endPixel.setColor(sourcePixel.getColor()); 
              count2++; 
          }
          count1++; 
          count2=0; 
      }     
         

  } 
  
    
  
  public void mirrorGull() 
  {
    Pixel[][] pixels = this.getPixels2D();
    int mirrorPoint= 100; 
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    //left arm
    for( int row=235; row<323; row++) 
    {
        for(int col=238; col<mirrorPoint; col++) 
        {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][mirrorPoint - col+ mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
            
        }    
    }
    
      
  }  
  public void keepOnlyBlue() 
  {
      Pixel[][] pixels = this.getPixels2D();
      for(Pixel[] rowArray: pixels) 
      {
          for(Pixel pixelObj: rowArray) 
          {
              pixelObj.setRed(0); 
              pixelObj.setGreen(0); 
          }     
      }    
      
  } 
  
   public void keepOnlyRed() 
  {
      Pixel[][] pixels = this.getPixels2D();
      for(Pixel[] rowArray: pixels) 
      {
          for(Pixel pixelObj: rowArray) 
          {
              pixelObj.setBlue(0); 
              pixelObj.setGreen(0); 
          }     
      }    
      
  } 
  
  
   public void keepOnlyGreen() 
  {
      Pixel[][] pixels = this.getPixels2D();
      for(Pixel[] rowArray: pixels) 
      {
          for(Pixel pixelObj: rowArray) 
          {
              pixelObj.setRed(0); 
              pixelObj.setBlue(0); 
          }     
      }    
      
  } 
  
  public Picture scaleByHalf()
  {
      Picture picture = new Picture(1152, 1536);
      Pixel[][] pixels = this.getPixels2D();
      Pixel[][] picturePixels = picture.getPixels2D();
      Pixel origPixel = null;
      int counter1 = 0;
      int counter2 = 0;

      for (int i = 0; i < pixels.length; i += 2)
      {
          for (int j = 0; j < pixels[i].length; j += 2)
          {
              origPixel = pixels[i][j];
              picturePixels[counter1][counter2].setColor(origPixel.getColor());
              counter2++;
          }
          counter1++;
          counter2 = 0;
      }

      return picture;
    }

  
  
  public void negate() 
  {
      Pixel[][] pixels = this.getPixels2D();
      for(Pixel[] rowArray: pixels) 
      {
          for(Pixel pixelObj: rowArray) 
          {
              pixelObj.setRed(255-pixelObj.getRed());
              pixelObj.setGreen(255-pixelObj.getGreen()); 
              pixelObj.setBlue(255-pixelObj.getBlue());
          }     
      }    
      
  }   
  
  public void grayscale() 
  {
      Pixel[][] pixels = this.getPixels2D();
      for(Pixel[] rowArray: pixels) 
      {
          for(Pixel pixelObj: rowArray) 
          {
              int avg= (int)((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
              pixelObj.setRed(avg);
              pixelObj.setGreen(avg);
              pixelObj.setBlue(avg);
          }     
      }    
      
  }     
  public void mirrorDiagonal() // mirrors from top right to bottom left
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topRightPixel = null;
      Pixel bottomLeftPixel = null;
      int length;
      if (pixels.length < pixels[0].length) 
      {
          length = pixels.length; 
      }
      else 
      {
          length = pixels[0].length; 
      }
      
      for (int row = 0; row < length; row++)
      {
          for (int col = row; col < length; col++)
          {
              topRightPixel = pixels[row][col];
              bottomLeftPixel = pixels[col][row];
              bottomLeftPixel.setColor(topRightPixel.getColor());
          }
      }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  // this } is the end of class Picture, put all new methods before this

}    
  
