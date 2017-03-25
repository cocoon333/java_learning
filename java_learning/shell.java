import java.awt.Color;

public class shell{

    public static void main(String[] args) {
        String s;

        s = args[0];

        s = s.replaceAll("A", "t");
        s = s.replaceAll("T", "a");
        s = s.replaceAll("C", "g");
        s = s.replaceAll("G", "c");
        System.out.println(s.toUpperCase());

    }
}
