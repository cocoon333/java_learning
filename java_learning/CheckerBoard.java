public class CheckerBoard{
    public static void main(String[] args){
        double n = Double.parseDouble(args[0]);
        double half_length = 1/n;
        System.out.println(half_length);

        for (int i = 1; i<=n; ++i){
            for (int j = 1; j<=n; ++j){
                if (i%2 == 1){
                    if (j % 2 == 0) StdDraw.setPenColor();
                    else StdDraw.setPenColor(StdDraw.RED);
                }
                else{
                    if (j % 2 == 0) StdDraw.setPenColor(StdDraw.RED);
                    else StdDraw.setPenColor();
                }
                StdDraw.filledSquare(j*half_length, i*half_length, half_length);
            }
        }
        StdDraw.show();
    }
}
