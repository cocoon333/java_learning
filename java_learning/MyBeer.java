import java.util.concurrent.ThreadLocalRandom;

public class MyBeer{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int[] beer = new int[n];
        double j = 0.0;

        for (int l = 0; l < 1000; ++l){
            for (int i = 0; i < beer.length; ++i) beer[i] = i;

            for (int i = 0; i < beer.length; ++i){
                int k = ThreadLocalRandom.current().nextInt(0, beer.length);
                int element = beer[k];
                beer[k] = beer[i];
                beer[i] = element;
            }

            for (int i = 0; i < beer.length; ++i){
                if (beer[i] == i) {
                    ++j;
                    break;
                }
            }
        }
        
        System.out.println(j/1000);
    }
}
