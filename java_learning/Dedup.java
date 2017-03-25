public class Dedup{
    public static void main(String[] args){
        String input = StdIn.readString();
        System.out.println(sort(input));
    }

    public static String sort(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));

        for (int i = 1; i<input.length(); ++i){
            char letter = input.charAt(i);
            for (int j=0; j<sb.length(); ++j){
                char sbletter = sb.charAt(j);
                if (sbletter >= letter && sbletter != letter){
                    sb.insert(j, letter);
                }
                break;
            }
        }
        String res = sb.toString();
        return res;
    }
}
