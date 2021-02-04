package brushes;

import turtles.ModelDisplay;
import turtles.Picture;
import turtles.SimpleTurtle;

public class PolyBrush extends Brush {

  public PolyBrush(ModelDisplay display) {
    super(display);
  }

  public void drawStar(int x, int y, int size){
    hopTo(x, y);
    drawPoly(144, size, 5);
  }

  public void drawPoly(int x, int y, int sides, int sideLength){
    hopTo(x, y);
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