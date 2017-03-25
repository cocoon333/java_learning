public class GoldenRatio{
    public static void main(String[] args){
        double n = Double.parseDouble(args[0]);
        System.out.println(ratio(n));
    }

    public static double ratio(double n){
        if (n == 0) return 1.0;

        return 1 + 1 / ratio(n-1);
    }

    public static double ratio2(double n){
        int res = 0
        while (n != 0){
            res = 1 + 1 / res
            n -= 1;
        }
    }

}
