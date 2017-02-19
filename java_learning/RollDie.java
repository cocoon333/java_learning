import java.util.concurrent.ThreadLocalRandom;

public class RollDie{
    public static void main(String[] args){
        int n = ThreadLocalRandom.current().nextInt(1, 7);

        System.out.println(n);

    }
}
