public class NestedPolygons{
    public static void main(String[] args){
        run(Integer.parseInt(args[0]));
    }

    public static double[][] run(int args){
        int k = 0;
        int center_coordinates = 266;
        double y_coordinates[] = new double[args];
        double x_coordinates[] = new double[args];

        assert (args >= 3);

        for (int i = 3; i <= args; ++i){
            for (int j = 0; j<i; ++j){
                int input[] = {i, j};
                double output[] = polygon(input);
                x_coordinates[j] = output[0];
                y_coordinates[j] = output[1];
            }
            for (int j =0; j<i; ++j){
                System.out.println(x_coordinates[j]);
                System.out.println(y_coordinates[j]);
                System.out.println();

                if (j < i-1) StdDraw.line(x_coordinates[j], y_coordinates[j], (x_coordinates[j+1]), (y_coordinates[j+1]));

                else StdDraw.line(x_coordinates[j], y_coordinates[j], (x_coordinates[0]), (y_coordinates[0]));
            }
			
        }
		double coordinates[][] = {x_coordinates, y_coordinates};
        return coordinates;
    }



    public static double[] polygon(int[] args){
        int points = args[0];
        int point = args[1];
        double res[] = new double[2];
        res[0] = 0.1*(points-2) * Math.cos(2.0/points*Math.PI*point) + 0.5;
        res[1] = 0.1*(points-2) * Math.sin(2.0/points*Math.PI*point) + 0.5;

        return res;
    }   
}
