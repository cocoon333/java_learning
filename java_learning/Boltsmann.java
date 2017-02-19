import java.util.concurrent.ThreadLocalRandom;
public class Boltsmann{
    public static void main(String[] args){
        int n = 0;
        while (n < 1000){
            int sum = 0;
            for (int i = 0; i < 100; ++i){
                int k = ThreadLocalRandom.current().nextInt(1, 11);
                sum += k;
            }
            if (sum == 200){
                ++n;
            }
        }
    }
}
