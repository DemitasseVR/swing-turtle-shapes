import brushes.CircleBrush;
import brushes.PinwheelBrush;
import brushes.PolyBrush;
import turtles.World;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    World world = new World(300, 300);

    PolyBrush starBrush = new PolyBrush(world);
    starBrush.setName("Starry-eyed Dirtle");
    starBrush.setAllColors(Color.ORANGE);
    starBrush.drawStar(20, 50, 100);
    starBrush.printInfoForShape("Star");

    PolyBrush polyBrush = new PolyBrush(world);
    polyBrush.setName("Pent-up Penny");
    polyBrush.setAllColors(Color.GREEN);
    polyBrush.drawPoly(200, 30, 5, 50);
    polyBrush.printInfoForShape("Pentagon");

    CircleBrush circleBrush = new CircleBrush(world);
    circleBrush.setName("Smooth Sailing Sam");
    circleBrush.setAllColors(Color.BLUE);
    circleBrush.drawCircle(70, 200, 50);
    circleBrush.printInfoForShape("Circle");

    PinwheelBrush pinwheelBrush = new PinwheelBrush(world);
    pinwheelBrush.setName("Windmill Willy");
    pinwheelBrush.setAllColors(Color.MAGENTA);
    pinwheelBrush.drawPinwheel(220, 200, 50);
    pinwheelBrush.printInfoForShape("Pinwheel");

    world.setVisible(true);
  }
}
