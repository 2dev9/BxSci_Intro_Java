/*****************************************************************************
  * PushCounter.java
  * 
  * Demonstrates a graphical user interface and an event listener.
  ******************************************************************************/

// import JFrame class
import javax.swing.JFrame;

// class header
public class TrafficLight{
  //--------------------------------------------------------------------------
  // Creates and displays the main program frame.
  //--------------------------------------------------------------------------
  // main method
  public static void main(String args[]){ 
    
    // Construct a new JFrame object, title it "Traffic Light Simulator"
    JFrame frame = new JFrame("Traffic Light Simulator");
    
    // Construct a new PushCounterPanel object
    TrafficLightPanel panel = new TrafficLightPanel();
    
    // add the panel to the frame
    frame.add(panel);
    
    // set default close operation to EXIT_ON_CLOSE from JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
    // pack the frame
    frame.pack();
    
    // make the frame visible
    frame.setVisible(true);
  }
}