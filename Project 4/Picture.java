import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import javax.swing.*;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  
  /************************ CONSTRUCTORS ***********************
    *************************************************************
    ******************** DO NOT MODIFY THESE ********************/  
  
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
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
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
  
  /*********************** ATTN MQS21 STUDENT!! ************************/
  /********************************************************************/
  /**************************** METHODS ********************************
    *********************************************************************
    ******************** ADD YOUR OWN BELOW HERE ************************/
  
  
  
  /***************************************************************
    * METHOD NAME (PARAMETERS)
    * Author: YOUR NAME
    * 
    * DESCRIPTION OF WHAT THE METHOD DOES, AND 
    * WHAT YOUR PARAMETERS ARE FOR.
    * **************************************************************/
  
  public static void main(String[] args) 
  {String file =  FileChooser.pickAFile();
    Picture pic = new Picture (file);
    Picture pic2 = new Picture (file);
    Picture pic3 = new Picture (file);
    Picture pic4 = new Picture (file);
    Picture pic5 = new Picture (file);
    Picture pic6 = new Picture (file);
    //pic2.createGrayPicture();
    pic2.createSepiaPicture (1.5, 1.26);
    pic2.show();
    pic3.createSepiaPicture(1.9,1.5);
    pic3.show();
    //pic4.createNegativePicture();
    pic4.createSepiaPicture (1.5, 1.1);
    pic4.show();
   // pic.keepColor("red");
    pic.createSepiaPicture (1.6, 1.2);
    pic.show();
   // pic5.removeColor("red");
    pic5.createSepiaPicture (1.7, 1.3);
    pic5.show();
   // pic6.changePercentColor("red", 12.4);
    pic6.createSepiaPicture (1.8, 1.465);
    pic6.show();
  
  }
  
  /***************************************************************
    * public void createGrayPicture()
    * Devon Howell
    * 
    * Creates a gray version of the choosen file
    * NONE
    * **************************************************************/
  public void createGrayPicture()
  { 
    Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    for (Pixel pixelObj : pixelArray)// loops the code by the array length times
    {
      int grayVal;//declares grayVal
      grayVal = ( pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue() ) / 3;//set grayVal equal to an average of other colors
      pixelObj.setGreen(grayVal);//sets green equal to grayVal
      pixelObj.setRed(grayVal);//sets red equal to grayVal
      pixelObj.setBlue(grayVal);//sets blue equal to grayVal
    }
    
  }
  
  /***************************************************************
    * public void createSepiaPicture()
    * Devon Howell
    * 
    * Creates a sepia version of the choosen file
    * NONE
    * **************************************************************/
  public void createSepiaPicture (double pred, double pgreen)
  { 
    
    this.createGrayPicture();//grayscales the picture
    Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    for (Pixel pixelObj : pixelArray)// loops the code by the array length times
    {
      pixelObj.setRed((int)(pixelObj.getRed()*pred));
      pixelObj.setGreen((int)( pixelObj.getGreen()*pgreen));
    }
    
  }
  
  /***************************************************************
    * public void createNegativePicture()
    * Devon Howell
    * 
    * Creates a negative version of the choosen file
    * NONE
    * **************************************************************/
  public void createNegativePicture ()
  {
    
    Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    for (Pixel pixelObj : pixelArray)// loops the code by the array length times
    {
      pixelObj.setRed((255-pixelObj.getRed()));
      pixelObj.setBlue((255-pixelObj.getBlue()));
      pixelObj.setGreen((255-pixelObj.getGreen()));
    }//ends for-each loop
  }
  
  
  /***************************************************************
    * public void keepColor (String colour)
    * Devon Howell
    * 
    * Keep the color selected by the parameter
    * String colour: Color red, blue or green, that will be kept
    * **************************************************************/
  public void keepColor (String colour)
  {Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    
    for (Pixel pixelObj : pixelArray)// loops the code by the array length times
    {if (colour == "red")//asks if the colour is red
      {
      pixelObj.setBlue(0);
      pixelObj.setGreen(0);
    }// ends conditional if 
    else if (colour == "blue")//asks if the colour is blue
    {
      pixelObj.setRed(0);
      pixelObj.setGreen(0);
    }//end conditional else if
    else
    {
      pixelObj.setRed(0);
      pixelObj.setBlue(0);
    }//end conditional else if
    }//ends for-each loop
  }//ends changePercentColor
  
  
  /***************************************************************
    * public void removeColor (String colour)
    * Devon Howell
    * 
    * Removes the color selected by the parameter
    * String colour: Color red, blue or green, that will be removed
    * **************************************************************/
  public void removeColor(String colour)
  {Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    for(int i=0; i<pixelArray.length; i++)
    {if (colour == "blue")//asks if the colour is blue
      {
      pixelArray[i].setBlue(0);
      
    }// ends conditional if 
    else if (colour == "green")//asks if the colour is green
    {
      pixelArray[i].setGreen(0);
    }//end conditional else if
    else
    {
      pixelArray[i].setRed(0);
    }//end conditional else 
    }//ends for loop
  }//ends removeColor
  
  /***************************************************************
    * public void changePercentColor (String colour, double changeVal)
    * Devon Howell
    * 
    * Removes the color selected by the parameter
    * String colour: Color red, blue or green, that will be removed
    * **************************************************************/
  public void changePercentColor (String colour,double percent)
  {Pixel [ ] pixelArray = this.getPixels();//puts pixels in an array called pixelArray
    int i=0; 
    while(i<pixelArray.length)// loops the code by the array length times
    {if (colour == "blue")//asks if the colour is blue
      {
      pixelArray[i].setBlue((int)(pixelArray[i].getBlue()*percent));//goes through each pixel and makes it bluer
      }// ends conditional if 
    else if (colour == "green")//asks if the colour is green
    {
      pixelArray[i].setGreen((int)(pixelArray[i].getGreen()*percent));//goes through each pixel and makes it greener
    }//end conditional else if
    else
    {
      pixelArray[i].setRed((int)(pixelArray[i].getRed()*percent));//goes through each pixel and makes it reder
    }//end conditional else
    i++;//increments i
    }//ends while loop
  }//ends changePercentColor
  
  
  
  
  
} // this "}" is the end of class Picture, put all new methods before this
