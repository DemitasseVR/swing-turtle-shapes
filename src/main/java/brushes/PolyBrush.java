package brushes;

import turtles.ModelDisplay;
import turtles.Picture;
import turtles.SimpleTurtle;

public class PolyBrush extends SimpleTurtle
{
  /** Constructor that takes the model display
   * @param display the thing that displays the model
   */
  public PolyBrush(ModelDisplay display) {
    super(display);
  }


  public void drawStar(int size, int sides){
    drawPoly(size, sides, -180);
  }

  public void drawPoly(int size, int sides){
    drawPoly(size, sides, 0);
  }

  private void drawPoly(int size, int sides, double angleOffset){
    for(int i = 0; i < sides; i++){
      forward(size);
      turn(calcExternalAngle(sides) + angleOffset);
    }
  }

  private double calcExternalAngle(int sides){
    return 180 - calcInternalAngle(sides);
  }

  private double calcInternalAngle(int sides) {
    return calcSumOfInternalAngles(sides) / sides;
  }

  private double calcSumOfInternalAngles(int sides){
    return (sides - 2) * 180;
  }
}