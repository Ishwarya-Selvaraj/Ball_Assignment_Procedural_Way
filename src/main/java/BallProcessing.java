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
        ellipse(x1,height/5, diameter, diameter);
        ellipse(x2,height*2/5, diameter, diameter);
        ellipse(x3,height*3/5, diameter, diameter);
        ellipse(x4,height*4/5, diameter, diameter);
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
    }

}


//import processing.core.PApplet;
//
//public class BallProcessing extends PApplet {
//
//    public static final int WIDTH = 640;
//    public static final int HEIGHT = 480;
//    public static final int Diameter = 10;
//    int x=0;
//
//    public static void main(String[] args) {
//        PApplet.main("BallProcessing");
//    }
//
//    @Override
//    public void settings() {
//        super.settings();
//        size(WIDTH, HEIGHT);
//    }
//
//    @Override
//    public void setup() {
//        System.out.println("Inside setup method");
//    }
//
//    @Override
//    public void draw() {
//        PaintWhite();
//        drawCircle();
//    }
//
//    private void drawCircle() {
//        ellipse(x, mouseY, Diameter, Diameter);
//        x++;
//    }
//
//    private void PaintWhite() {
//        background(255);
//    }
//}
