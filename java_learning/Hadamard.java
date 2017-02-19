public class Hadamard { 
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        boolean[][] hadamard = new boolean[n][n];

        hadamard[0][0] = true;
        for (int i = 1; i < n; i += i) {
            for (int j = 0; j < i; ++j) {
                for (int k = 0; k < i; ++k) {
                    hadamard[j+i][k]   =  hadamard[j][k];
                    hadamard[j][i+k]   =  hadamard[j][k];
                    hadamard[j+i][k+i] = !hadamard[j][k];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hadamard[i][j]) System.out.print("T ");
                else                System.out.print("F ");
            }
            System.out.println();
        }
    }

}
