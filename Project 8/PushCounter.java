/*****************************************************************************
  * PushCounter.java
  * 
  * Demonstrates a graphical user interface and an event listener.
  ******************************************************************************/

// import JFrame class
import javax.swing.JFrame;

// class header
public class PushCounter{
  //--------------------------------------------------------------------------
  // Creates and displays the main program frame.
  //--------------------------------------------------------------------------
  // main method
  public static void main(String args[]){ 
    
    // Construct a new JFrame object, title it "Push Counter"
    JFrame pushCounter = new JFrame("Push Counter");
    
    // Construct a new PushCounterPanel object
    PushCounterPanel panel = new PushCounterPanel();
    
    // add the panel to the frame
    pushCounter.add(panel);
    
    // set default close operation to EXIT_ON_CLOSE from JFrame
    pushCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
    // pack the frame
    pushCounter.pack();
    
    // make the frame visible
    pushCounter.setVisible(true);
  }
}