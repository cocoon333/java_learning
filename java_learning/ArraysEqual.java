public class ArraysEqual{
    public static void main(String[] args){
        int input1[] = {1, 2, 3};
        int input2[] = {1, 2, 3};
        assert(eq(input1, input2));
    }
    public static boolean eq(int[] array1, int[] array2){
        if (!(array1.length == array2.length)) return false;
    
        int j = 0;
        for (int i =0; i<array1.length; ++i) if (array1[i] == array2[i]) ++j;
    
        if (j == array1.length) return true;
        else return false;
    }
}
