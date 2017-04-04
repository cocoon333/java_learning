import java.awt.Color;
public class BouncingBalls { 

    public static void main(String[] args) {

        // number of bouncing balls
        int n = Integer.parseInt(args[0]);

        // set boundary to box with coordinates between -1 and +1
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);

        // create an array of n random balls
        Ball[] balls = new Ball[n];
        for (int i = 0; i < n; i++)
            balls[i] = new Ball();

        // do the animation loop
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.BLACK);
        while (true) {
            // move the n balls
            for (int i = 0; i < n; i++) {
                balls[i].move();
            }

            // draw the n balls
            StdDraw.setPenColor(Color.getHSBColor((float) Math.random(), 1.0f, 1.0f));
            for (int i = 0; i < n; i++) {
                balls[i].draw();
            }
            StdDraw.show();
            StdDraw.pause(20);
            StdDraw.clear(StdDraw.BLACK);
        }
    }
}
