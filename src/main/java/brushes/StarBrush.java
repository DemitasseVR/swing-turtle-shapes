package brushes;

import turtles.ModelDisplay;
import turtles.Picture;
import turtles.SimpleTurtle;

public class StarBrush extends SimpleTurtle
{
  /** Constructor that takes the model display
   * @param display the thing that displays the model
   */
  public StarBrush(ModelDisplay display)
  {
    super(display);
  }

  public void drawStar(int x, int y, int points){
    penDown();
    turnRight();
    for(int i = 0; i < 20; i++){
      turn(180- calcInternalAngle(points));
      forward();
    }
    penUp();
  }

  private double calcInternalAngle(int points) {
    return 180*(1-4.0/points);
  }
}