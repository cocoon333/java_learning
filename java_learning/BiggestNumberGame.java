import java.util.concurrent.ThreadLocalRandom;

public class BiggestNumberGame{
    public static void main(String[] args){
        int card1 = ThreadLocalRandom.current().nextInt(1, 101);
        int card2 = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("The value of card 1 is " + card1);
        System.out.println("The value of card 2 is " + card2);

        String win = "The computer lost!";
        System.out.println("The computer saw card 1");
        if (card1 >= 50){
            System.out.println("The computer chooses card 1");
            if (card1 > card2){
                win = "The computer won!";
            }
        }else{
            System.out.println("The computer chooses card 2");
            if (card2 > card1){
                win = "The computer won!";
            }
        }
        System.out.println(win);

    }
}
