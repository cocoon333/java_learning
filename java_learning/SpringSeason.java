import java.util.Scanner;
public class SpringSeason{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int m = reader.nextInt();

        System.out.println("Enter a day: ");
        int n = reader.nextInt();

        if ((m <= 6) && (m >= 3)){
            if (m == 6){
                if (n > 20){
                    System.out.println("False");
                    return ;
                }
            }

            if (m == 3){
                if (n < 20){
                    System.out.println("False");
                    return ;
                }

            System.out.println("True");
            return ;
            }
        }
        System.out.println("False");

    }
}
