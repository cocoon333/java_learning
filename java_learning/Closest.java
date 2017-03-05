import java.util.Scanner;
public class Closest{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x coordinate for point one");
        double x1 = scanner.nextDouble();
        System.out.println("Input y coordinate for point one");
        double y1 = scanner.nextDouble();
        System.out.println("Input z coordinate for point one");
        double z1 = scanner.nextDouble();

        System.out.println("Input x coordinate for point two");
        double x2 = scanner.nextDouble();
        System.out.println("Input y coordinate for point two");
        double y2 = scanner.nextDouble();
        System.out.println("Input z coordinate for point two");
        double z2 = scanner.nextDouble();

        System.out.println("Input x coordinate for point three");
        double x3 = scanner.nextDouble();
        System.out.println("Input y coordinate for point three");
        double y3 = scanner.nextDouble();
        System.out.println("Input z coordinate for point three");
        double z3 = scanner.nextDouble();

        double sum1 = (x - x1) * (x - x1) + (y - y1) * (y - y1) + (z - z1) * (z - z1);
        double sum2 = (x - x2) * (x - x2) + (y - y2) * (y - y2) + (z - z2) * (z - z2);
        double sum3 = (x - x3) * (x - x3) + (y - y3) * (y - y3) + (z - z3) * (z - z3);

        if (sum1 <= sum2 && sum1<=sum3){
            System.out.println(x1);
            System.out.println(y1);
            System.out.println(z1);
        }
    
        else if (sum2 <= sum1 && sum2<=sum3){
            System.out.println(x2);
            System.out.println(y2);
            System.out.println(z2);
        }

        else if (sum3 <= sum2 && sum3<=sum1){
            System.out.println(x3);
            System.out.println(y3);
            System.out.println(z3);
        }
    }
}
