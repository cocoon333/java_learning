public class EuclideanDistance{
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        double y1 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        System.out.println(Math.sqrt((x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2)));

    }
}
