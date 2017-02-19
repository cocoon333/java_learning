import java.util.Scanner;
public class Stats{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int j = 0;
        int k = 0;
        double[] num_list = new double[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; ++i){
            num_list[i] = scanner.nextDouble();
        }

        for (int i = 0; i<n; ++i) j += num_list[i];

        j = j / Double.parseDouble(n)
        System.out.println(j);

        for (int i = 0; i<n; ++i) j += 


    }
}
