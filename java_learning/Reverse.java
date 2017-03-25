public class Reverse{
    public static void main(String[] args){
        String res;
        int j;
        String input;

        input = args[0];
        res = new String();
        j = 0;

        for (int i=input.length()-1; i>-1; i -= 1){
            res += input.charAt(i);
            j += 1;

        }
    System.out.println(res);
    }
}
