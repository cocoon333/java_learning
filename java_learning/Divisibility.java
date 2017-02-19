public class Divisibility{
    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        String status = "False";
        if ((n1 % 7 == 0) && (n2 % 7 == 0)){
            status = "True";
        }

        System.out.println(status);

    }
}
