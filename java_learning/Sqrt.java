public class Sqrt { 
    public static void main(String[] args) { 
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;
        double t = c;
        if (c == 0){
            System.out.println(c);
            return;
        }

        else if (c < 0){
            System.out.println("There is no square root to a negative number");
            return;
        }

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
