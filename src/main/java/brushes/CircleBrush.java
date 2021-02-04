package brushes;

import turtles.ModelDisplay;
import turtles.SimpleTurtle;

public class CircleBrush extends SimpleTurtle
{
  public CircleBrush(ModelDisplay display) {
    super(display);
  }

  public void drawCircle(int x, int y, int radius){
    hopTo(calcX(0, x, radius), calcY(0, y, radius));
    for(int i = 0; i < 360; i++){
      moveTo(calcX(i, x, radius), calcY(i, y, radius));
    }
  }

  private int calcX(double angle, int centerX, int radius){
    return (int)(centerX + radius * Math.cos(Math.toRadians(angle)));
  }

  private int calcY(double angle, int centerY, int radius){
    return (int)(centerY + radius * Math.sin(Math.toRadians(angle)));
  }

  private void hopTo(int x, int y){
    penUp();
    moveTo(x, y);
    penDown();
  }
}