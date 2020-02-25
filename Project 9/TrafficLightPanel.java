import javax.swing.JPanel;//import JPanel
import java.awt.*;//import Grahics and drawing classes
import java.awt.event.*;// import events

/*TrafficPanel.java
 *
 * Describes the function of a panel on which circles can be drawn to simulate the operation of a traffic light
 */

public class TrafficLightPanel extends JPanel
{  
  
  //declare variables needed throughout code
  private final int RED = 0, YELLOW = 1, GREEN = 3, FLASH_Y = 4;// establishes constants for states
  private boolean power, blinking;// establishes a boolean for ON and OFf and for blinking
  private int currentColor; // declares variable to hold the state
  
  public TrafficLightPanel()
  {
    power = false;//power is false
    blinking = true;// blinking is true
    currentColor = RED;//currentColor is Red
    addKeyListener(new KeyBoardListener());
    this.setFocusable(true);//allow the panel to be painted on
    setBackground(new Color(225,200,0));//setBackground to a yellowish color
    setPreferredSize(new Dimension(800, 1000));// set the size to 800, 1000
    
  }
  /*********************************************
   * public int colorChange()
   * 
   * Changes the state based on the current state
   */
  public void colorChange() {    
    switch (currentColor) {
      // if current color is red, switch to green
      case RED:
        currentColor = GREEN;
        break;
        
      //if current color is yellow, switch to red
      case YELLOW:
        currentColor = RED;
        break;
        
      //if current color is green, switch to yellow
      case GREEN:
        currentColor = YELLOW;
        break;
        
      //if the system is flashing and is changed, send the system back to red
      case FLASH_Y:
        currentColor = RED;
        break;
    }
    
  }
  /*******************************************
   * public void togglePower()
   * 
   * Turns power from on to off and vice versa
   */
  public void togglePower()
  { 
    // if on turn off
    if(power)
      power = false;
    
    //if off turn on
    else
      power = true;
    
  }
  
  /*********************************
   * public void paintComponent()
   * 
   * Paints all cicle based on case
   */
  public void paintComponent(Graphics pen)
  {
    super.paintComponent(pen);// ccalls paintComponent from parent class
    
    //creates and draws 3 Circles
    Circle circle1 = new Circle (400,100,100,Color.black);
    circle1.drawFilled(pen);
    Circle circle2 = new Circle (400,350,100,Color.black);
    circle2.drawFilled(pen);
    Circle circle3 = new Circle (400,600,100,Color.black);
    circle3.drawFilled(pen);
    
    
    //if the system is on
    if(power)
    {
      switch(currentColor){
        //if the state is red, make the top light red
        case RED:
          circle1.drawFilled(pen, Color.red);
          break;
          
          //if the state is yellow, make the top light yellow
        case YELLOW:
          circle2.drawFilled(pen, Color.yellow);
          break;
          
          //if the state is green, make the top light green
        case GREEN:
          circle3.drawFilled(pen, Color.green);
          break;
          
          //if the state is flashing, ...
        case FLASH_Y:
          
          try
        {
          if(blinking)
            circle2.drawFilled(pen, Color.yellow);//draw a yellow circle   
          
          else
            circle2.drawFilled(pen, Color.black); //make the circle black    
          
          blinking = !blinking;//change blinking to loop forever
          Thread.sleep(500);//sleep for 1/2 secs
        }
          catch(Exception e){}//in the case this doesn't work
          repaint();// repaint to loop forever
          
      }
    }
  }
  
  
  /*************************************
    *private class KeyBoard Listener implements KeyListener
    *
    * Describes state changes every time a key is pressed
    */
  private class KeyBoardListener implements KeyListener// KeyBoardListener gets its backbone for KeyListener 
  {
    //if a specific key is pressed
    public void keyPressed(KeyEvent e){
      
      if (e.getKeyCode() == e.VK_O )// if o key
      {
        togglePower();//turn on or off
        repaint();// repaint accordingly
      }
      
      else if (power && e.getKeyCode() == e.VK_SPACE)// if space key and system is on
      {
        colorChange();//change color state variable
        repaint();// repaint accordingly
      }
      
      else if (power && e.getKeyCode() == e.VK_F)// if f key and system is on
      {
        currentColor = FLASH_Y;//send system into blinking state
        repaint();// repaint accordingly
      }
      
      else
        System.out.println("NO");//NO OTHER COMBO ACCEPTED
    }
    
    
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
  }
  
  
  
}