import javax.swing.JFrame; // import swing package 
import java.awt.*;//imprt drawing package

public class ShapeFrame{ // class header
  public static void main(String[] args){ // main method
    //create a new frame
    JFrame frame = new JFrame("Shape Frame");
   
    //sets the default close action
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    //create a panel
    ShapePanel panel = new ShapePanel();
   
    //add panel to frame
    frame.add(panel);
   

    //pack the fram eto the correct size
    frame.pack();
   
    //show the frame
    frame.setVisible(true);
   
   
  }
}