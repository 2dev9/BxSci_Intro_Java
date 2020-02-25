//*****************************************************************************
//  ButtonListener.java
//
//  Represents the push button listener for the PushCounter program.
//*****************************************************************************

import java.awt.event.*; //import awt package

public class ButtonListener2 implements ActionListener {


   private PushCounterPanel panel;// declare private PushCounterPanel object
   
   //--------------------------------------------------------------------------
   //  Stores the panel in order to update the counter.
   //--------------------------------------------------------------------------
   public ButtonListener2 (PushCounterPanel PushCPanel){
   
     panel = PushCPanel;// set panel variable equal to the panel passed via parameter
   
   }

   //--------------------------------------------------------------------------
   //  Updates the counter and label when the button is pushed.
   //--------------------------------------------------------------------------
   public void actionPerformed(ActionEvent event){
   
      // run incrementCount method against the panel
     panel.decrementCount ();
  
  
   }

}