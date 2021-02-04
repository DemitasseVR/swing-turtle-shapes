import brushes.CircleBrush;
import brushes.PolyBrush;
import turtles.World;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    World world = new World(600,600);

/*    StarBrush starBrush = new StarBrush(world);
    starBrush.setPenWidth(5);
    starBrush.drawStar(300, 300, 8);*/
    PolyBrush starBrush = new PolyBrush(world);
    starBrush.setPenWidth(5);
    starBrush.setColor(Color.RED);
    starBrush.setShellColor(Color.RED);
    starBrush.drawStar(200);

    PolyBrush polyBrush = new PolyBrush(world);
    polyBrush.setPenWidth(5);
    polyBrush.setColor(Color.BLUE);
    polyBrush.setShellColor(Color.BLUE);
    polyBrush.drawPoly(5, 100);


    CircleBrush circleBrush = new CircleBrush(world);
    circleBrush.setPenWidth(5);
    circleBrush.setColor(Color.GREEN);
    circleBrush.setShellColor(Color.GREEN);
    circleBrush.drawCircle(300, 300, 100);

    System.out.println("test");
    world.setVisible(true);
  }
}
