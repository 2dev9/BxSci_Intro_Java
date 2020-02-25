// import stuff
import javax.swing.JPanel;
import java.awt.*;

// class header
public class ShapePanel extends JPanel
{
  // declare circle object
  private Circle circle, circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9, circle10, circle11, circle12, circle13, circle14, circle15, circle16, circle17;
  private Rectangle rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8;
  
  // constructor for a CirclePanel
  // defines what happens when panel constructed
  public ShapePanel()
  {
    // construct images
    makeBullseye();
    makeSnowmen();
    makeOlympicRings();
    makeUglyDoll();
 
    
    // set size of panel
    setPreferredSize(new Dimension(1000,1200));
    
    // set background color
    setBackground(Color.black);
  }
  
  //create a bulleye by creating 4 circles
  public void makeBullseye()
  {
    circle1 = new Circle(600, 600, 200, Color.red);
    circle2 = new Circle(600, 600, 150, Color.white);
    circle3 = new Circle(600, 600, 100, Color.red);
    circle4 = new Circle(600, 600, 50, Color.white);
  }
  
  //create a smowman by creating circles and rectangles
  public void makeSnowmen()
  {
    circle5 = new Circle(120, 100, 40, Color.white);
    circle6 = new Circle(120, 180, 60, Color.white);
    circle7 = new Circle(120, 300, 80, Color.white); 
    rect1 = new Rectangle(100,80,10,10, Color.black);
    rect2 = new Rectangle(140,80,10,10, Color.black);
    circle8 = new Circle(120, 165, 5, Color.black);
    circle9 = new Circle(120, 180, 5, Color.black);
    circle10 = new Circle(120, 195, 5, Color.black);
  }
  
  //draws Olympic Rings
  public void makeOlympicRings()
  {
    circle = new Circle(350, 200, 100, Color.blue);
    circle11 = new Circle(470, 300, 100, Color.yellow);
    circle12 = new Circle(590, 200, 100, Color.white);
    circle13 = new Circle(710, 300, 100, Color.green);
    circle14 = new Circle(830, 200, 100, Color.red);
    
  }
  
  //draw an ugly (as in "u-g-l-y, you ain't got no alibi, you ugly") doll
  public void makeUglyDoll()
  {
    rect3 = new Rectangle(200,500,100,100, Color.magenta);
    rect4 = new Rectangle(155,540,45,10, Color.yellow);
    rect5 = new Rectangle(300,540,10,45, Color.yellow);
    rect6 = new Rectangle(240,600,10,50, Color.gray);
    rect7 = new Rectangle(260,600,10,30, Color.gray);
    circle15 = new Circle(250,540,30, Color.white);
    circle16 = new Circle(250,540,20, Color.cyan);
    circle17 = new Circle(250,540,5, Color.black);
    rect8 = new Rectangle(280,580,30,5, Color.black);
    
    
    
  }
  
  // this method is run by set visable
  //creates all rectangles and circles
  public void paintComponent(Graphics pen){
    super.paintComponent(pen);
    circle1.drawFilled(pen);
    circle2.drawFilled(pen);
    circle3.drawFilled(pen);
    circle4.drawFilled(pen);
    circle5.drawFilled(pen);
    circle6.drawFilled(pen);
    circle7.drawFilled(pen);
    circle8.drawFilled(pen);
    circle9.drawFilled(pen);
    circle10.drawFilled(pen);
    rect1.drawFilled(pen);
    rect2.drawFilled(pen);
    rect3.drawFilled(pen);
    rect4.drawFilled(pen);
    rect5.drawFilled(pen);
    rect6.drawFilled(pen);
    rect7.drawFilled(pen);
    rect8.drawFilled(pen);
    circle.drawEmpty(pen);
    circle11.drawEmpty(pen);
    circle12.drawEmpty(pen);
    circle13.drawEmpty(pen);
    circle14.drawEmpty(pen);
    circle15.drawFilled(pen);
    circle16.drawFilled(pen);
    circle17.drawFilled(pen);
  }
}