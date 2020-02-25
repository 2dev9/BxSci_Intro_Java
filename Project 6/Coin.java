/*
 * Coin.java
 * 
 * Describes a Coin object that can be flipped
 *
 */
public class Coin//declare the new class driver Coin
{
//final CONSTANTS (represented in all caps)
  private final int HEADS = 0, TAILS = 1;
  
//variable to hold the face value(heads or tails) of the coin
  private int face;
  
/*********************************************************************
    * public Coin()
    * Benjamin Cornish
    * 
    * constructs a Coin by initializing the face  value
    *NONE
    ********************************************************************/
  public Coin() 
  {
    flip();//initializes the face of the coin
  }
  
/*********************************************************************
    * public void roll()
    * Benjamin Cornish
    * 
    * flips the coin by genearting a face value between, but not including, 0 and 2
    *NONE
    ********************************************************************/
  public void flip()
  {
    face =(int)(Math.random() * 2);//generate random 0 or 1
  }
  
  /*********************************************************************
    * public boolean isHeads()
    * Benjamin Cornish
    * 
    * retuns true if the face is heads, otehrwise returns false
    *NONE
    ********************************************************************/
  public boolean isHeads()
  {
    if (face == HEADS)
      return true;
    else
      return false;
  }
  
}