public class SpiralMice{
    public static void main(String[] args){
        int points = Integer.parseInt(args[0]);
        double previous_pointx = 0.0;
        double previous_pointy = 0.0;
        double pointx[] = new double[points];
        double pointx1[] = new double[points];
        double pointy[] = new double[points];
        double pointy1[] = new double[points];
        int    numSteps = 100;
        int    numCycles = 10;
        double b = -0.3;
        double a = 1;
        for (int point=0; point<points; ++point){
            int input[] = {points, point};
            double output[] = NestedPolygons.polygon(input);
            pointx[point] = output[0];
            pointx1[point] = output[0];
            pointy[point] = output[1];
            pointy1[point] = output[1];
        }

        for (int i = 0; i < numCycles; ++i){
            for (int j = 0; j < numSteps; ++j) {
                for (int k = 0; k < points; ++k){
                    if (k+1 < points) StdDraw.line(pointx[k], pointy[k], pointx[k+1], pointy[k+1]);
                    else StdDraw.line(pointx[k], pointy[k], pointx[0], pointy[0]);
                }

                for (int k=0; k<points; ++k){
                    pointx[k] = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j))*Math.cos((2*Math.PI)/numSteps * j)/3.0 + pointx1[k];
                    pointy[k] = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j))*Math.sin((2*Math.PI)/numSteps * j)/3.0 + pointy1[k];

                    System.out.println(pointx[k]);
                    System.out.println(pointy[k]);
                }
            }
        }
    }
}
