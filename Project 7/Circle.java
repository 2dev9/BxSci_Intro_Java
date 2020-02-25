import java.awt.*;

public class Circle{// class header
  // local variables for the circle info 
  private int x_Center;
  private int y_Center;
  private int radius;
  private Color circleColor;
  
  // constructor for a circle
 
  public Circle(int xCenter, int yCenter, int size, Color color){
    x_Center = xCenter;
    y_Center = yCenter;
    radius = size;
    circleColor = color;
  }
  // draw in a filled circle
  public void drawFilled(Graphics pen){
  
    pen.setColor(circleColor);
    pen.fillOval(x_Center - radius, y_Center - radius, radius*2, radius*2);

  }
  
  public void drawFilled(Graphics pen, Color color){
  
    pen.setColor(color);
    pen.fillOval(x_Center - radius, y_Center - radius, radius*2, radius*2);

  }
  
  //draw in an empty rectangle
  public void drawEmpty(Graphics pen){
  
    pen.setColor(circleColor);
    pen.drawOval(x_Center - radius, y_Center - radius, radius*2, radius*2);

  }
}

