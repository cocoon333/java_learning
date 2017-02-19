import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter varible one: ");
        int a = reader.nextInt();

        System.out.print("Enter variable two: ");
        int b = reader.nextInt();

        int c = b;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        b = a;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        a = c;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

    }
}
