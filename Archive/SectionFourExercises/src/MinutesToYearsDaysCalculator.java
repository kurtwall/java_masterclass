public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        Long MIN_PER_YEAR = 60L * 24 * 365;
        Long MIN_PER_DAY = 60L * 24;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / MIN_PER_YEAR;
            long remainingMinutes = minutes - (years * MIN_PER_YEAR);
            long days = remainingMinutes / MIN_PER_DAY;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}