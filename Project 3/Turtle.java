/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */

import java.awt.*; //Import the package for Color

public class Turtle extends SimpleTurtle
{
  /************************ CONSTRUCTORS ***********************
    *************************************************************
    ******************** DO NOT MODIFY THESE ********************/
  
  /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  
  /*********************** ATTN MQS21 STUDENT!! *************************
    **********************************************************************
    ***************************** METHODS ********************************
    **********************************************************************
    ******************** ADD YOUR OWN BELOW HERE ************************/
  
  
  
  /*********************************************************************
    * METHOD NAME (PARAMETERS)
    * Author: YOUR NAME
    * 
    * DESCRIPTION OF WHAT THE METHOD DOES, AND 
    * WHAT YOUR PARAMETERS ARE FOR.
    ********************************************************************/
  //* 
  public static void main(String[] args) throws Exception
  {
    World earth = new World ();//creates an instance of a world named earth
    
    Turtle ninja = new Turtle (500, 100,earth);//creates an instance of a turtle named ninja
    
    
    ninja.drawRegularPolygon (7,50,Color.MAGENTA);//draws a regular septagon with a length of 50 pixels
    ninja.drawName(100,Color.RED);//wries the name DEVI with a the D's longest side being 100 pixels in length
  
    
    
    
    
  } // end of main method
  /*********************************************************************
    * public void drawName (int length)
    * Author: Devon Howell
    * 
    * Method to draw the name Devi using the Turtle "stylo" in the World "terre"
    * length- the size of the letter D's longest side, also determine the size of all other letters
    * colour- color of the I's dot
    ********************************************************************/
  //* 
  public void drawName(int length,Color colour)
  { World terre = new World ();// create the World "terre"
    Turtle stylo = new Turtle (200,200,terre);// creates stylo in the World terre at (200,200)
    stylo.drawD(length);//draw a D with a side length of "length"
    stylo.turnToFace(300,200);// turns to face 300,200
    stylo.moveOver(100);//moves over 100 pixels
    stylo.drawE(length/2);// draws an E with a side length of .5("length")
    stylo.turnToFace (350,200);// turns to face 350,200
    stylo.moveOver(100);//moves over 100 pixels
    stylo.drawV(length/2,55);// draws a V with a length of .75("length") and an angle o 55 degrees
    stylo.turnToFace(355,100);// turns to face 355,100
    stylo.penUp();//puts the pen up
    stylo.moveTo (430,175);//moves to (430,175)
    stylo.penDown();//puts the pen down
    stylo.drawI(length/2,colour);//draws a I with a length of .5("length") and a dot that is the "colour" color
  }
  
  /*********************************************************************
    * public void drawD ()
    * Author: Devon Howell
    * 
    * Method to draw the D from the word DEVI
    * length- size of the D's longest vertical side
    ********************************************************************/
  //* 
  public void drawD (int length)
  {
    this.forward (length);//moves forward length
    this.turnRight ();//turns right
    this.forward (length/2);//moves forward 1/2 0f the length
    this.turn(75);//thruns 105 degrees
    this. forward (length/4);// moves 1/4 of the length
    this.turn (15);//turns 165 degrees
    this.forward(length/2);// move 1/2 of the length
    this.turn(15);//turns 165 degrees
    this.forward(length/4);//moves 1/4 of the length
    this.turn(75);//turns 105 degrees
    this.forward (length/2);//moves 1/3 of the length
  }
  
  /*********************************************************************
    * public void drawE(int length)
    * Author: Devon Howell
    * 
    * Method to draw the E in DEVI
    * length-size of the E's longest vertical side
    ********************************************************************/
  public void drawE(int length)
  {
    this.drawSquare(length,Color.BLACK);//draws a black square with a length of length
    this.turn(90);//turns right
    this.forward(length/2);//moves forward half of the length
    this.turn(-90);//turns right in the other direction
    this.forward(length);//moves forward length
  }
  
  /*********************************************************************
    * public void drawV(int length, int angle)
    * Author: Devon Howell
    * 
    * Method to draw the V in DEVI
    * length-size of the V
    * angle- the angle the turtle moves from the vertical line through the center of the V
    ********************************************************************/
  public void drawV(int length, int angle)
  {
    this.penDown();
    this.turn(-angle/2);// turn -one-half of the angle
    this.forward(length);//goes forward length
    this.backward(length);//moves backward length
    this.turn(angle);//turns "angle" degrees
    this.forward(length);//moves forward length
    this.backward(length);//move backward length
  }
  /*********************************************************************
    * public void drawI(int length, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw the I in DEVI
    * length-size of the I
    * colour- color of the I's dot
    ********************************************************************/
  
  public void drawI(int length, Color colour)
  {
    this.forward(length);//moves forward length
    this.moveOver(length);//runs the moveOver method to move length pixels
    this.drawCircle (1,colour);// draws a cricle with a radius of 1 that is the "colour" color
  }
  /*********************************************************************
    * public void moveOver ()
    * Author: Devon Howell
    * 
    * Method to move the turtle "pixels" pixels
    * "pixels" is the number of pixels the object go forward
    ********************************************************************/               
  
  //moveOver method, moves the shapes 100 pixels from eachother
  public void moveOver (int pixels)
  {
    this.penUp (); // puts the pen up
    this. forward (pixels); //moves "pixels" pixels
    this.penDown (); //puts the pen back down
  }
  
   /*********************************************************************
     * public void drawTriangle (int length, Color colour)
     * Author: Devon Howell
     * 
     * Method to draw a regular triangle
     * length- length of each side of the triangle
     * color-color of the triangle
     ********************************************************************/    
  public void drawTriangle (int length, Color colour)
  {
    this.setPenColor(colour);
    int counter = 0; //declares the counter variable
    while(counter<3){ //repeats 3 times
      this.forward(length);// move 50 pixels
      this.turn(120);// moves 180-120 degrees
      counter++; //increments by 1
    }
  }// end of drawTtriangle
  
  /*********************************************************************
    * public void drawSquare (int length, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw a square
    * length- length of each side of the square
    * color-color of the square
    ********************************************************************/ 
  public void drawSquare (int length, Color colour)
  {
    this.setPenColor(colour);
    int counter = 0; //declares the counter variable
    while(counter<4){ //repeats 4 times
      this.forward(length);
      this.turn(-90); // turns 180-90 degrees
      counter++;//increments by 1
    }
  }
  
   /*********************************************************************
   * public void drawTriangle (int length, Color colour)
   * Author: Devon Howell
   * 
   * Method to draw a regular pentagon
   * length- length of each side of the pentagon
   * color-color of the pentagon
   ********************************************************************/ 
    public void drawPentagon(int length,Color colour)
  {
    this.setPenColor(colour);
    int counter = 0; //declares the counter variable
    while(counter<5){ //repeats 5 times
      this.forward(length); // move 50 pixels
      this.turn(72); // turns 180-72 degrees
      counter++;//increments by 1
    }
  }//end of drawPentagon method
  
  /*********************************************************************
    * public void drawHexagon(int length, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw a regular hexagon
    * length- length of each side of the hexagon
    * color-color of the hexagon drawn
    ********************************************************************/ 
  public void drawHexagon(int length, Color colour)
  {
    this.setPenColor(colour);
    int counter = 0; //declares the counter variable
    while(counter<6){ //repeats 6 times
      this.forward(length);// move 50 pixels
      this.turn(60);// turns 180-60 degrees; mod 180
      counter++;//increments by 1
    }
  }//end of drawHexagon method
  
  /*********************************************************************
    * public void drawCircle (int length, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw a circle
    * radius- radius of the circle
    * colour- the color of the pen used
    ********************************************************************/ 
  
  public void drawCircle(int radius, Color colour)
  {
    this.setPenColor(colour);
    int counter = 0; //declares the counter variable
    while(counter<360){ //repeats 6 times
      this.forward(radius);// move 50 pixels
      this.turn(179);// turns 180-179 degrees; mod 180
      counter++;//increments by 1
    }
  }//end of drawCircle method
  
  /*********************************************************************
    * public void drawRectangle(int sideWidth,int height,int penWidth, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw a rectangle
    * "colour" is the color of the pen used to draw the rectangle. 
    * "sideWidth" defines the rectangle with while "height" defines the rectangle's height
    *"penWidth" the width of the pen 
    ********************************************************************/ 
  public void drawRectangle(int sideWidth,int height,int penWidth, Color colour)
  {
    this.setPenColor(colour); //sets pen color to colour
    this.setPenWidth(penWidth); // sets pen width to variable "penWidth"
    int counter = 0; // declares counter variable
    while (counter<2){ // 
      this. forward(sideWidth); // goes forward sideWidth pixels
      this.turn (90); // turns 90 degrees
      this.forward(height);// goes forward height pixels
      this.turn(90);// turns 90 degrees
      counter++;// adds 1 to the counter variable
    }
  }//ends the drawRectangle method
  
  
  
  /*********************************************************************
    * public void drawTriangle drawRegularPolygon (int sideNumber,int sideLength, Color colour)
    * Author: Devon Howell
    * 
    * Method to draw a generic regular polygon given
    * sideNumber defines the number of sides the polygon has. sideLength determines the length of each side. "colour" is the color of the pen used to draw the figure
    ********************************************************************/
  
  public void drawRegularPolygon (int sideNumber,int sideLength, Color colour)
  { this.setPenColor (colour);//sets turtle pen color to "colour"
    int counter = 0; // declares counter variable
    while (counter<sideNumber){//loops "sideNumber" times
      this.forward(sideLength);// moves forward "sideLength" pixels
      this.turn(360/sideNumber);// turns 360/sideNumber degrees
      counter++;// adds one to the counter
    }
  }//end of drawRegularPolygon
  
  
  } // this } is the end of class Turtle, put all new methods before this