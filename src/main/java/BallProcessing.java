import processing.core.PApplet;

public class BallProcessing extends PApplet {

    final int width = 600;
    final int height = 600;
    final int diameter = 10;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;

    public static void main(String[] args) {
        PApplet.main("BallProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        System.out.println("Inside setup");
    }

    @Override
    public void draw() {
        Ball1Creation();
        Ball2Creation();
        Ball3Creation();
        Ball4Creation();

    }

    private void Ball4Creation() {
        ellipse(x4,height*4/5, diameter, diameter);
        x4+=4;
    }

    private void Ball3Creation() {
        ellipse(x3,height*3/5, diameter, diameter);
        x3+=3;
    }

    private void Ball2Creation() {
        ellipse(x2,height*2/5, diameter, diameter);
        x2+=2;
    }

    private void Ball1Creation() {
        ellipse(x1,height/5, diameter, diameter);
        x1+=1;
    }

}