public class WindSpeed{
    public static void main(String[] args){
        int windspeed = Integer.parseInt(args[0]);
        if (windspeed <= 1) System.out.println(0);

        else if (windspeed <= 3) System.out.println(1);

        else if (windspeed <= 6) System.out.println(2);

        else if (windspeed <= 10) System.out.println(3);

        else if (windspeed <= 16) System.out.println(4);

        else if (windspeed <= 21) System.out.println(5);

        else if (windspeed <= 27) System.out.println(6);

        else if (windspeed <= 33) System.out.println(7);

        else if (windspeed <= 40) System.out.println(8);

        else if (windspeed <= 47) System.out.println(9);

        else if (windspeed <= 55) System.out.println(10);

        else if (windspeed <= 63) System.out.println(11);

        else System.out.println(12);
    }
}
