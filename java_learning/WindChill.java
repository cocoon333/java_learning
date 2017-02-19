import java.util.Scanner;
public class WindChill{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the temperature(Fahrenheit): ");
        double t = reader.nextDouble();

        System.out.print("Enter the wind: ");
        double v = reader.nextDouble();

        System.out.println(35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));

    }
}
