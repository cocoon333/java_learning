import java.util.concurrent.ThreadLocalRandom;
public class Sicherman{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int dice1[] = {1, 3, 4, 5, 6, 8};
        int dice2[] = {1, 2, 2, 3, 3, 4};
        int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<n; ++i){
            int j = ThreadLocalRandom.current().nextInt(0, 6);
            int k = ThreadLocalRandom.current().nextInt(0, 6);

            count[dice1[j]+dice2[k]-2] += 1;
        
        }

        for (int i=2; i<count.length; ++i){
            System.out.print(i+" ");
            System.out.println(count[i-2]/1.0/n);
        }
    }
}
