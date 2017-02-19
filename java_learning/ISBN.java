public class ISBN{
    public static void main(String[] args){
        int d2 = Integer.parseInt(args[0]);
        int d3 = Integer.parseInt(args[1]);
        int d4 = Integer.parseInt(args[2]);
        int d5 = Integer.parseInt(args[3]);
        int d6 = Integer.parseInt(args[4]);
        int d7 = Integer.parseInt(args[5]);
        int d8 = Integer.parseInt(args[6]);
        int d9 = Integer.parseInt(args[7]);
        int d10 = Integer.parseInt(args[8]);
        int i = 0;

        for (i = 0; i <= 10; i ++)
            {
                if ((i + 2 * d10 + 3 * d9 + 4 * d8 + 5 * d7 + 6 * d6 + 7 * d5 + 8 * d4 + 9 * d3 + 10 * d2) % 11 == 0){
                    break;
                }
            }
        System.out.println(i);

    }
}
