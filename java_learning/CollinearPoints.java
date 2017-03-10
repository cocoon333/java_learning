public class CollinearPoints{
    public static void main(String[] args){
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        int x3 = Integer.parseInt(args[4]);
        int y3 = Integer.parseInt(args[5]);

        assert(double_equal(5, 5.0));
        System.out.println(areCollinear(x1, y1, x2, y2, x3, y3));
    }

    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3){
        double slope = y1/x1/1.0;
        if (double_equal(x2 * slope, y2) && double_equal(x3 * slope, y3)) return true;
        return false;
    }
    
    public static boolean double_equal(double d1, double d2){
        if (d1+0.000000000000001 > d2 && d1-0.000000000000001 < d2) return true;
        return false;
    }
}
