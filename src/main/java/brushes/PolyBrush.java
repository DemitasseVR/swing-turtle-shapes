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

  public void drawStar(int size){
    drawPoly(144, size, 5);
  }

  public void drawPoly(int sides, int sideLength){
    drawPoly(calcExternalAngle(sides), sideLength, sides);
  }

  private void drawPoly(double angle, int length, int repetitions){
    turnRight();
    for(int i = 0; i < repetitions; i++){
        forward(length);
        turn(angle);
    }
    turnLeft();
  }

  private void hopTo(int x, int y){
    penUp();
    moveTo(x, y);
    penDown();
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