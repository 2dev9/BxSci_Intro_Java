//import drawing stuff
import java.awt.*;

public class Rectangle
{
  //local variables for rectangle info
  private int xstart, ystart, rectheight, rectwidth;
  private Color rectColor;
  
  //constructor which gives the local variables a variable
  public Rectangle(int x_start, int y_start, int width, int height, Color color){
  xstart = x_start;
  ystart = y_start;
  rectheight = height;
  rectwidth = width;
  rectColor = color;
  }

  //draws an empty rectangle
  public void drawEmpty(Graphics pen)
  {
    pen.setColor(rectColor);
    pen.drawRect(xstart, ystart, rectheight, rectwidth);
  }
  
  //draws a filled rectangle
   public void drawFilled(Graphics pen)
  {
    pen.setColor(rectColor);
    pen.fillRect(xstart, ystart, rectwidth, rectheight);
  }


}