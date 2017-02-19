public class AllEqual{
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean status = false;
        if ((i == j) && (j == k)) status = true;

        System.out.println(status);

    }
}
