import turtles.TurtleBrush;
import turtles.World;

public class Main {
  public static void main(String[] args) {  
    World world = new World(600,600);
   
     
    TurtleBrush starBrush = new TurtleBrush(world);
    TurtleBrush polyBrush = new TurtleBrush(world);
    TurtleBrush circleBrush = new TurtleBrush(world);
    TurtleBrush initialBrush = new TurtleBrush(world);
  
    world.setVisible(true);
  }
}
