public class Haversine{
    public static void main(String[] args){
        double input = Double.parseDouble(args[0]);

        System.out.println(haversine(input));
    }

    public static double haversine(double n){
        n = (Math.sin(n/2.0)) * (Math.sin(n/2.0));
        return n;
    }
}
