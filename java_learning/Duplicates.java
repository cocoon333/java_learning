public class Duplicates{
    public static void main(String[] args){
        int integers[] = new int[args.length];
        boolean status = false;
        for (int i = 0; i<args.length; ++i){
            for (int j = 0; j<integers.length; ++j){
                if (Integer.parseInt(args[i]) == integers[j]){
                    status = true;
                    break;
                }
            }
            if (status){
                status = false;
            }
            else{
                integers[i] = Integer.parseInt(args[i]);
            }
        }
        int count = 0;
        int j = 0;
        for (int i = 0; i < integers.length; ++i){
            if (integers[i] == 0){
                count +=1;
                if (count == 2){
                    break;
                }
            }
            ++j;
        }

        for (int i = 0; i < integers.length-(integers.length-j)-1; ++i){
            System.out.print(integers[i]);
        }
        System.out.println();
    }
} 
