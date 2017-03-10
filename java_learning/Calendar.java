public class Calendar{
public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        String[] months = {
            "",
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) days[month] = 29;


        StdOut.println("   " + months[month] + " " + year);
        StdOut.println(" S  M Tu  W Th  F  S");

        int d = day(month, 1, year);

        for (int i = 0; i < d; i++)
            StdOut.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            StdOut.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) StdOut.println();
        }

    }
}
