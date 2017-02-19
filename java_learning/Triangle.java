public class Triangle{
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        
        for (int i = 0; i < N; ++i){
            for (int j = 0; j < i; ++j) System.out.print(".");
            for (int k = 0; k < N - i; ++k) System.out.print("*");
            System.out.println();

        }
    }
}
