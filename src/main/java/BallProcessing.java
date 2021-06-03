import processing.core.PApplet;

public class BallProcessing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int BALL_COUNT = 4;
    public static final int FRAME = 5;
    public static final int DIAMETER = 10;
    public int[] unitsPerFrame = new int[BALL_COUNT];
    public int[] xPosition = new int[BALL_COUNT];
    public int[] yPosition = new int[BALL_COUNT];

    public static void main(String[] args) {
        PApplet.main("BallProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballSetup();
    }

    private void ballSetup() {
        for (int index = 0; index < BALL_COUNT; index++) {
            xPosition[index] = 1;
            yPosition[index] = HEIGHT * (index + 1) / FRAME;
            unitsPerFrame[index] = index + 1;
        }
    }

    @Override
    public void draw() {
        for (int index = 0; index < BALL_COUNT; index++) {
            circle(index);
            moveCircle(index);
        }
    }

    private void moveCircle(int index) {
        xPosition[index] += unitsPerFrame[index];
    }

    private void circle(int index) {
        ellipse(xPosition[index], yPosition[index], DIAMETER, DIAMETER);
    }
}