package brushes;

import turtles.ModelDisplay;

public class PinwheelBrush extends Brush {
    public PinwheelBrush(ModelDisplay display) {
        super(display);
    }

    public void drawPinwheel(int x, int y, int radius){
        hopTo(x, y);
        for(int i = 0; i < 4; i++){
            drawLargeTriangle(radius);
            drawSmallTriangle(radius);
        }
    }

    private void drawLargeTriangle(int radius){
        drawTriangle(radius, calcHypotenuse(radius));
    }

    private void drawSmallTriangle(int radius){
        drawTriangle(calcBase(radius), radius);
    }

    private void drawTriangle(int base, int hypotenuse){
        forward(base);
        turn(-90);
        forward(base);
        turn(-135);
        forward(hypotenuse);
        turn(-90);
    }

    private int calcHypotenuse(int base){
        return (int)Math.round(Math.sqrt(2 * Math.pow(base, 2)));
    }

    private int calcBase(int hypotenuse){
        return (int)Math.sqrt(Math.pow(hypotenuse, 2) / 2);
    }
}
