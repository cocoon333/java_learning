public class BadShuffling{
    public static void main(String[] args){
        int n = deck.length; 
        for (int i = 0; i < n; i++) { 
            int r = i + (int) (Math.random() * (n-i)); 
            String temp = deck[r];
            deck[r] = deck[0];
            deck[0] = temp;
} 
