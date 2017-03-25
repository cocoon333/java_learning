public class Craps{
    public static void main(String[] args){
        runCraps(Double.parseDouble(args[0]));
    }

    public static void runCraps(double n){
        int lost = 0;
        int win = 0;
        for (int i=0; i<n; ++i){
            int dice_sum = 0;
            while (!(crapsWinOrLost(dice_sum))) dice_sum = diceRoll();
            craps
