import java.util.Scanner;
public class Stats{
    public static void main(String[] args){
        double n = Double.parseDouble(args[0]);
	int a = Integer.parseInt(args[0]);
        double j = 0.0;
        int k = 0;
        double[] num_list = new double[a];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; ++i){
            num_list[i] = scanner.nextDouble();
        }

        for (int i = 0; i<n; ++i) j += num_list[i];

        j = j / n;
        System.out.println(j);

        for (int i = 0; i<n; ++i) k += (num_list[i] - j) * (num_list[i] - j);

	System.out.println(Math.sqrt(k)/(n-1));


    }
}
