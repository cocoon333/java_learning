import java.util.Scanner;
public class WordCount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(words.split(" ", -1).length);
    }
}
