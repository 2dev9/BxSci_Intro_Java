/*
 */
import java.util.Scanner;//imports the scanner

public class MyCalculator//declares the MyCalculator Class
{
  
  /***************************************************************
    * public static void main(String[] args)
    * Devon Howell
    * 
    * Asks the user for a basic operation to be done on certain numbers
    * NONE
    * **************************************************************/
  public static void main(String[] args)
  {Scanner scan = new Scanner (System.in);//creates a new Scanner
    System.out.println("How many operations will you be doing?" );//asks the user how many operations to perform
    int times = scan.nextInt();//store the times for the code to repeat
    for( int i=0; i<times; i++)//repeats "times" times
    {
      System.out.println("Enter the First Number" );//prompts the user for the first number
      double n1 = scan.nextDouble();//saves the next double as n1
      System.out.println("Enter an operation as +,-,* or/");//prompts the user for the operation
      String operation = scan.next(); //saves the next double for future use
      System.out.println("Enter the Second Number");//prompts the user for the second number
      double n2 = scan.nextDouble();//saves the next double as n2
      System.out.println("You entered " + n1 + " " + operation + " " + n2);//tells the user what he/she entered
      if( operation.equals("+"))//if addition
      {
        double x = addition(n1,n2);//runs addition with the entered numbers
        System.out.println(x);//shows the user the answer to the operation
      }
      else if( operation.equals("-"))//if subtraction
      {double x = subtraction(n1,n2);//runs subtraction with the entered numbers
        System.out.println(x);//shows the user the answer to the operation
      }
      else if( operation.equals("*"))//if multiplication
      {double x = multiplication(n1,n2);//runs multiplication with the entered numbers
        System.out.println(x);//shows the user the answer to the operation
      }
      else if( operation.equals("/"))//if division
      {double x = division(n1,n2);//runs division with the entered numbers
        System.out.println(x);//shows the user the answer to the operation
      }
      else//if not an operation
      {System.out.println("That is not a valid operation, please run the program again");//tells the user to try again
      }
      if(times>1)//if the user wants multiple operations
      {
        if (i<times-1){//if there is more than one operaion left
          System.out.println("Begin the Next Operation, the last answer is above" );//reminds the user to start over
        }
      }
    }
  }
    
    /***************************************************************
      * public static double addition(double n1,double n2)
      * Devon Howell
      * 
      * Finds the sum of two numbers
      * n1- the first number to be added
      * n2- the second number to be added
      * **************************************************************/
    public static double addition(double n1,double n2)
    {double sum= n1+n2;//records the sum of the entered numbers
      return sum;//returns the sum
    }
    /***************************************************************
      * public static double subtraction(double n1,double n2)
      * Devon Howell
      * 
      * Finds the difference of two numbers
      * n1- the number being subracted from
      * n2- the number subtrated from the first
      * **************************************************************/
    public static double subtraction(double n1,double n2)
    {double difference= n1-n2;//records the difference of the entered numbers
      return difference;//returns the difference
    }
    /***************************************************************
      * public static double multiplication(double n1,double n2)
      * Devon Howell
      * 
      * Finds the product of two numbers
      * n1- the number being multiplied
      * n2- the second number to be multiplied
      * **************************************************************/
    public static double multiplication(double n1,double n2)
    {double product= n1*n2;//records the product of the entered numbers
      return product;//returns the product
    }
    /***************************************************************
      * public static double division(double n1,double n2)
      * Devon Howell
      * 
      * Finds the quotient of two numbers
      * n1- the dividend
      * n2- the divisor
      * **************************************************************/
    public static double division(double n1,double n2)
    {double quotient= n1/n2;//records the quotient of the entered numbers
      return quotient;//returns the quotient
    }
    
  }