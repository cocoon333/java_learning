public class PowersOfK{
    public static void main(String[] args){
        long k = Long.parseLong(args[0]);
        long n = k;
        int i = 1;
        long MAX_VALUE = 9223372036854775807L;
        assert(k > 1);
        System.out.println("0  1");
        while (k <= MAX_VALUE/n){
            System.out.println(i + "  " + k);
            assert(k != 0);
            k = k * n;
            ++i;
        }
        System.out.println(i + "  " + k);
    }
}
