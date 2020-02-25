// main method - runs the simulation
// ask user for data, validate input
// create coin, die , counters, flip coin and roll die
// print results

// import Scanner 
import java.util.Scanner;

public class Chance
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in); // create scanner object
    System.out.println("Do you want to do:roll a die, flip a coin or both? Enter a valid answer as: 'd, r, die, roll', for a die roll, the corresponding answer for a coin flip, or simply:both");//asks the user which type of sim. to run
    String sim = sc.next();//collect the answer
    while (!(sim.equals("b")) &&!(sim.equals("both")) && !(sim.equals("d")) && !(sim.equals("roll")) && !(sim.equals("die")) && !(sim.equals("r")) && !(sim.equals("die roll")) && !(sim.equals("f")) && !(sim.equals("flip")) && !(sim.equals("coin")) && !(sim.equals("c")) && !(sim.equals("coin flip")))//while the respones is invalid
    {
      System.out.println("Enter an answer as: 'die', 'roll', 'r', 'd', 'die roll' or the coin flip variants or 'both'");//tells the user the example respones
      sim = sc.next();//record the simulation
    }
    if ((sim.equals("d")) || (sim.equals("roll")) || (sim.equals("die")) || (sim.equals("r")) || (sim.equals("die roll")))//gives user a hoice in entry type
      dieRoll();//roll the die
    else if ((sim.equals("f")) || (sim.equals("flip")) || (sim.equals("coin")) || (sim.equals("c")) || (sim.equals("coin flip")))//gives user a hoice in entry type
      coinFlip();//flip the coin
    else
    {
      dieRoll();//roll the die
       System.out.println(); // a line of white space
      coinFlip();//flip the coin
    }
  }
  
    
  /*********************************************************************
    * public static void coinFlip()
    * Bevon Howell
    * 
    * Validates data, creates a coin, flips the coin, records flips znd prints the results
    *NONE
    ********************************************************************/
  public static void coinFlip()
  {Scanner sc = new Scanner(System.in);//create a scanner
    System.out.println("How many flips? (1-1000)");//ask the user how many flips to do
    int numFlips = sc.nextInt(); // collect the answer
    
    while((numFlips < 1) || ( numFlips > 1000) )//while the answer is invalid
    {// keep asking user for method 
      System.out.println("Not valid, how many flips? (1-1000)");
      numFlips = sc.nextInt(); // box to enter number, no int since already declared
    }
    // create a Coin
    Coin quarter = new Coin();
    
    // declare and initialize heads/tails counter
    int heads = 0, tails = 0;
    
    // loop input times
    for(int i = 0; i < numFlips; i++)
    { 
      // flip the coin
      quarter.flip();
      
      // test if heads
      if(quarter.isHeads())
        heads = heads + 1;//add to the heaads counter
      else
        tails++;//add to the tails counter
    }
    
    //print results
    System.out.println(); // a line of white space
    System.out.println("Total number of flips: " + numFlips);// tell the user how many flips were doen
    System.out.println("Heads:" + heads + "  , Tails:" + tails);//print the invidual results
  }
  
  
    /*********************************************************************
    * public static void dieRoll()
    * Bevon Howell
    * 
    * Validates data, creates a die, rolls the die, records rolls znd prints the results
    *NONE
    ********************************************************************/
  public static void dieRoll()
  {
    Scanner sc = new Scanner(System.in);//create a Scanner
    System.out.println("How many rolls? (1-1000)");// ask how many rolls will be done
    int numRolls = sc.nextInt(); //collect the answer
    
    while((numRolls < 1) || ( numRolls > 1000) )//while the response is invalid
    {// keep asking user for method 
      System.out.println("Not valid, how many flips? (1-1000)");
      numRolls = sc.nextInt(); // box to enter number, no int since already declared
    }
    // create a Die
    Die cube = new Die();
    
    // declare and initialize heads/tails counter
    int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
    
    // loop input times
    for(int i = 0; i < numRolls; i++)
    { 
      // roll the die
      cube.roll();
      
      // tests for the result of the flip
      if(cube.isWhich()==1)//if the side is one
        ones++;//add to the ones counter
      else if(cube.isWhich()==2)//if the side is two
        twos++;//add to the twos counter
      else if(cube.isWhich()==3)//if the side is three
        threes++;//add to the threes counter
      else if(cube.isWhich()==4)//if the side is four
        fours++;//add to the fours counter
      else if(cube.isWhich()==5)//if the side is five
        fives++;//add to the fives counter
      else
        sixes++;//add to the sixes counter
      
    }
    
    //print results
    System.out.println(); // a line  of white space
    System.out.println("Total number of rolls: " + numRolls);//tells the user the number of rolls done
    System.out.println("Ones:" + ones + ", Twos:" + twos + ", Threes:" + threes + ", Fours:" + fours + ", Fives:" + fives + ", Sixes:" + sixes);//prints the answers
    
    
    
  }
}