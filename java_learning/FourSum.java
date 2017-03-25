public class FourSum {
    public static void printAll(long[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == 0) {
                            StdOut.println(a[i] + " " + a[j] + " " + a[k] + " " + a[l]);
                        }
                    }
                }
            }
        }
    } 

    public static int count(long[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    } 

    public static void main(String[] args)  { 
        long[] a = StdIn.readAllLongs();
        int n = a.length;
        int count = count(a);
        StdOut.println(count);
        if (count < 10) {
            printAll(a);
        }
    } 
}
