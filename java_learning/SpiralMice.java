public class SpiralMice{
    public static void main(String[] args){
        double previous_pointx = 0.0;
        double previous_pointy = 0.0;
        double pointx;
        double pointy;
        int    numSteps = 100;
        int    numCycles = 10;
        double offsetx = 0.5;
        double offsety = 0.5;
        double xpoints[] = new double[numSteps*numCycles];
        double ypoints[] = new double[numSteps*numCycles];
        double theta_offset = Double.parseDouble(args[2]);
        theta_offset = theta_offset*Math.PI;
        double b = Double.parseDouble(args[0]);
        double a = Double.parseDouble(args[1]);
        pointx = a*Math.pow(Math.E, b * (2*Math.PI)/numSteps * 0+theta_offset)*Math.cos((2*Math.PI)/numSteps * 0 + theta_offset) + offsetx;
        pointy = a*Math.pow(Math.E, b * (2*Math.PI)/numSteps * 0+theta_offset)*Math.sin((2*Math.PI)/numSteps * 0 + theta_offset) + offsetx;


        for (int i = 0; i < numCycles; ++i){
            for (int j = 0; j < numSteps; ++j) {
                previous_pointx = pointx;
                previous_pointy = pointy;

                pointx = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j + theta_offset))*Math.cos((2*Math.PI)/numSteps * j+theta_offset) + offsetx;
                pointy = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j + theta_offset))*Math.sin((2*Math.PI)/numSteps * j+theta_offset) + offsety;

                System.out.println(pointx);
                System.out.println(pointy);

                if (j >= 1){
                    xpoints[(i+1)*j] = pointx;
                    ypoints[(i+1)*j] = pointy;
                }
            }
        }
    my_return(pointx);
    }

    public static double[][] my_return(double[][] args){
        return args;
    }
}
