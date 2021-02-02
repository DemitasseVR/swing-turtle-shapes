import brushes.PolyBrush;
import brushes.StarBrush;
import turtles.World;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    World world = new World(1200,1200);

/*    StarBrush starBrush = new StarBrush(world);
    starBrush.setPenWidth(5);
    starBrush.drawStar(300, 300, 8);*/
    PolyBrush polyBrush = new PolyBrush(world);
    polyBrush.drawPoly(200, 5);
    polyBrush.setColor(Color.BLUE);
    System.out.println("test");
    world.setVisible(true);
  }
}
