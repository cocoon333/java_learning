public class SpiralMice{
    public static void main(String[] args){
        int points = Integer.parseInt(args[0]);
        whirl(points);
    }
    
    public static void whirl(int points){
        while (true){
            StdDraw.clear();
            double whirl_x_coordinates[][] = new double[points][100];
            double whirl_y_coordinates[][] = new double[points][100];
            double b = -1;

            for (int i=0; i<points; ++i){
                double input[] = {b, 0.5, (2.0/points)*i};
                whirl_x_coordinates[i] = SpiralPointMaking.run(input)[0]; 
                whirl_y_coordinates[i] = SpiralPointMaking.run(input)[1]; 
            }

            for (int i=0; i<100; ++i){
                for (int j=0; j<points; ++j){
                    if (j < points-1) StdDraw.line(whirl_x_coordinates[j][i], whirl_y_coordinates[j][i], whirl_x_coordinates[j+1][i], whirl_y_coordinates[j+1][i]);
                    else StdDraw.line(whirl_x_coordinates[j][i], whirl_y_coordinates[j][i], whirl_x_coordinates[0][i], whirl_y_coordinates[0][i]);
                    StdDraw.pause(15);
                }
            }
        }
    }
}
