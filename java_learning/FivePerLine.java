public class FivePerLine{
    public static void main(String[] args){
        int j = 0;
        String window = "";
        for (int i = 1000; i <= 2000; i++ )
        {
            if (j % 5 == 0){
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
