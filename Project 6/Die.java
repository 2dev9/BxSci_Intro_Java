/*
 * Die.java
 * 
 * Describes a Die object that can be rolled
 *
 */
public class Die//declare the new class driver Coin
{
//final CONSTANTS 
  private final int ONE = 0, TWO = 1, THREE=2, FOUR=3, FIVE=4, SIX=5;
  
//variable to hold the side value(1, 2, 3, 4, 5 or 6) of the coin
  private int side;
  
/*********************************************************************
    * public Die()
    * Devon Howell
    * 
    * constructs a die by initializing the side value
    *NONE
    ********************************************************************/
  public Die() 
  {
    roll();//initializes the side of the die
  }
  
/*********************************************************************
    * public void roll()
    * Devon Howell
    * 
    * rolls the die by genearting a side value between, but not including, 0 and 6
    *NONE
    ********************************************************************/
  public void roll()
  {
    side =(int)(Math.random() * 6);//generate random 0 or 6
  }
  
  /*********************************************************************
    * public int isWhich()
    * Devon Howell
    * 
    * tests the side value of the die and returns the corresponding integer
    *NONE
    ********************************************************************/
  public int isWhich()
  {
    if (side == ONE)//if the side is ONE
      return 1;//answer is 1
    else if (side == TWO)//if the side is TWO
      return 2;//answer is 2
    else if (side == THREE)//if the side is THREE
      return 3;//answer is 3
    else if (side == FOUR)//if the side is FOUR
      return 4;//answer is 4
    else if (side == FIVE)//if the side is FIVE
      return 5;//answer is 5
    else
      return 6;//answer is 6
  }
  
}