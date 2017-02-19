public class NPerLine{
    public static void main(String[] args){
        int j = 0;
        int n = Integer.parseInt(args[0]);
        String window = "";
        for (int i = 1; i <= 1000; i++ )
        {
            if (j % n == 0){
                j = 0;
                System.out.println(window);
                window = "";
            }
            window = window + i + "  ";
                                                                                        

            j = j + 1;
        }
        System.out.println(window);
    }
}
