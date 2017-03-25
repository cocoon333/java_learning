public class IntegerSort {

    public static void main(String[] args) {

        int[] freq = new int[100];

        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            freq[i]++;
        }

    
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < freq[i]; j++) {
                StdOut.print(i + " ");
            }
        }
    }

}
