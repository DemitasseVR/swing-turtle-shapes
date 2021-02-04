package brushes;

import turtles.ModelDisplay;
import turtles.SimpleTurtle;

import java.awt.*;

public class Brush extends SimpleTurtle {

    public Brush(ModelDisplay display) {
        super(display);
        setDefaults();
    }

    public void printInfoForShape(String shapeName){
        printHeader(shapeName);
        System.out.printf("Name: %s \nColor: %s \nDist from origin: %f\n",
                getName(),
                getPenColor().toString().toLowerCase(),
                calcOriginDist());
    }

    public void setAllColors(Color color){
        setPenColor(color);
        setBodyColor(color);
        setShellColor(Color.DARK_GRAY);
    }

    public void hopTo(int x, int y){
        penUp();
        moveTo(x, y);
        penDown();
    }

    private void printHeader(String shapeName){
        printBorder(shapeName.length());
        System.out.println(shapeName);
        printBorder(shapeName.length());
    }

    private void printBorder(int length) {
        for(int i = 0; i < length; i++){
            System.out.print('-');
        }
    }

    private double calcOriginDist(){
        return getDistance(0, 0);
    }

    private void setDefaults() {
        setPenWidth(3);
        setAllColors(Color.GRAY);
    }
}
