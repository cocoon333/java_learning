public class Pepys { 
    public static void main(String[] args) {
        int SIDES = 6;
        int trials = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[0]);
        int count = 0;
        for (int t = 1; t <= trials; t++) {
            int ones = 0;
            for (int i = 0; i < k * SIDES; i++) {
                double r = Math.random();
                if (r < 1.0 / SIDES){
                    ones++;
                }
                if (ones >= k) count++;
             }
        }
        System.out.println(1.0 * count / trials);
    }
}
