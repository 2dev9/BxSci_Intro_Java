//*****************************************************************************
//  PushCounterPanel.java
//
//  Represents the main panel for the PushCounter program, containing a
//  button and a label displaying how many times the button was pushed.
//*****************************************************************************

import java.awt.*;// import awt package
import javax.swing.*;// import swing package


public class PushCounterPanel extends JPanel{


  // declare private int variable for counting
  private int push;
  // declare private JLabel variable
  private JLabel label;
  // declare private JButton variables
  private JButton upButton, downButton, exitButton, resetButton;
  // declare private JFrame variables

  /***********************************
    * PushCounterPanel
    * constructor method
    * ***********************************/
  public PushCounterPanel (){
   
      push = 0;   //set counter to 0

      label = new JLabel ("Pushes: " + push); //instantiate the label variable 
      
      resetButton = new JButton ("Replay"); //instantiate the resetButton variable
      upButton = new JButton ("Push Me!"); // instantiate the button variable 
      downButton = new JButton ("Then, Don't Touch Me"); //instantiate the button2 variable
      exitButton = new JButton ("Satisfaction!"); //instantiate the closeButton variable
      
      ButtonListener listener = new ButtonListener (this);// Construct a ButtonListener object --> new ButtonListener(this);
      ButtonListener2 listener2 = new ButtonListener2 (this);// Construct a ButtonListener object --> new ButtonListener(this);
      ButtonListener3 listener3 = new ButtonListener3 (this); // Construct a ButtonListener object --> new ButtonListener(this);
      ButtonListener4 listener4 = new ButtonListener4 (this); // Construct a ButtonListener object --> new ButtonListener(this);
     
      upButton.addActionListener (listener);// add listener to button 
      resetButton.addActionListener (listener3) ; //add listener to button
      downButton.addActionListener (listener2); //add listener to button
      exitButton.addActionListener (listener4); //add listener to button
      
      add(upButton); // add upButton
      add (downButton); //add downButton
      add (exitButton); //add exitButton
      add (resetButton) ; // add resetButton
      add(label); // add label

      setBackground (Color.CYAN);// set background to ?cyan
      setPreferredSize(new Dimension(350, 60));// setPreferredSize to a new Dimension(350, 60)
  }
   
   /*********************************************************
     *  incrementCount
     *  Increments the counter and updates the label accordingly.
     * *******************************************************/
  public void incrementCount (){
   
      push++; //increment counter by 1
      label.setText ("Pushes: " + push); // setText on the label to ("Pushes: " + counter)
   

  }
  
  /*************************************************
    * decrementCount
    * Decreases the counter and updates the label 
    * *********************************************/
  public void decrementCount () {
    
    push--; //decrement counter by 1
    label.setText ("Pushes: " + push); //setText on the label 
   }
  /*******************************************
    * resetCount
    * Sets the counter to zero and changes the label 
    * *********************************************/
  public void resetCount () {
    push=0; //set counter to zero
    label.setText ("Pushes: " + push); //setText on the label
  }
  
 
}