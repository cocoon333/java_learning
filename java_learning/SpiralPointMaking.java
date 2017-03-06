public class SpiralPointMaking{
    public static double[][] run(double[] args){
        double previous_pointx = 0.0;
        double previous_pointy = 0.0;
        double pointx;
        double pointy;
        int    numSteps = 100;
        int    numCycles = 1;
        double offsetx = 0.5;
        double offsety = 0.5;
        double xpoints[] = new double[numSteps*numCycles];
        double ypoints[] = new double[numSteps*numCycles];
        double b = args[0];
        double a = args[1];
        double theta_offset = args[2];

        theta_offset = theta_offset*Math.PI;
        pointx = a*Math.pow(Math.E, b * (2*Math.PI)/numSteps * 0)*Math.cos((2*Math.PI)/numSteps * 0 + theta_offset) + offsetx;
        pointy = a*Math.pow(Math.E, b * (2*Math.PI)/numSteps * 0)*Math.sin((2*Math.PI)/numSteps * 0 + theta_offset) + offsety;


        for (int i = 0; i < numCycles; ++i){
            for (int j = 0; j < numSteps; ++j) {
                previous_pointx = pointx;
                previous_pointy = pointy;

                pointx = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j ))*Math.cos((2*Math.PI)/numSteps * j+theta_offset) + offsetx;
                pointy = a * Math.pow(Math.E, b * ((2*Math.PI*i) + (2*Math.PI)/numSteps * j ))*Math.sin((2*Math.PI)/numSteps * j+theta_offset) + offsety;

                xpoints[(i+1)*j] = pointx;
                ypoints[(i+1)*j] = pointy;
            }
        }
        double output[][] = {xpoints, ypoints};
        return (output);
    }
}
