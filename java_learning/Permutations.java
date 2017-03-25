public class Permutations{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String sub_alphabet = alphabet.substring(0, n);
        perm("", sub_alphabet);
    }

    public static void perm(String progress, String letters){
        int n = letters.length();
        if (letters.length() == 0) System.out.print(progress+" ");

        else{
            for (int i=0; i<n; ++i){
                perm(progress+letters.charAt(i), letters.substring(0, i) + letters.substring(i+1, n));
            }
        }
    }
}
