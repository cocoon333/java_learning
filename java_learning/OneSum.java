public class OneSum{
    public static void main(String[] args){
        int input[] = StdIn.readAllInts();
        System.out.println(sum(input));
    }

    public static String sum(int[] input){
        String res;

        res = "";

        for (int i=0; i<input.length; ++i){
            if (input[i] == 0){
                res += input[i];
            }
        }
        return res;
    }
}
