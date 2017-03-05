import java.util.Scanner;
public class LongestRun{
    public static void main(String[] args){
        int input[] = {1, 2, 3, 5, 5};
        int output[] = {2, 5};
        assert(LongestRun.run(input) == output);

        int output1[] = {5, 1};
        int input1[] = {1, 1, 1, 1, 1};
        assert(LongestRun.run(input) == output1);

        int n = Integer.parseInt(args[0]);
        int input3[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; ++i)  input3[i] = scanner.nextInt();
        run(input3);
    }

    public static int[] run(int[] args){
        int num = 0;
        int old_num = 0;
        int times = 1;
        int old_times = 0;
        for (int i = 0; i < args.length; ++i){
            if (args[i] != num){
                if (times > old_times){
                    old_times = times;
                    old_num = num;
                }
                num = args[i];
                times = 1;
            }
            else ++times;
        }
        if (times > old_times){
            System.out.println("The Longest Run is " + times + " consecutive " + num+ "s");
            int res[] = new int[2];
            res[0] = times;
            res[1] = num;
            return res;
        }
        else{
            System.out.println("The Longest Run is " + old_times + " consecutive " + old_num + "s");
            int res[] = new int[2];
            res[0] = old_times;
            res[1] = old_num;
            return res;
        }
    }
}
