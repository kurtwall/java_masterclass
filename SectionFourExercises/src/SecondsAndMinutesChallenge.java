public class SecondsAndMinutesChallenge {
    private static final String INVALID_MESSAGE_STRING = "Invalid Value";

    public static String getDurationString(int mins, int secs) {
        if ((mins < 0) || (secs < 0) || (secs > 59)) {
            return INVALID_MESSAGE_STRING;
        }
        int hours = mins / 60;
        int minutes = mins % 60;
        return hours + "h " + minutes + "m " + secs + "s";
    }

    public static String getDurationString(int secs) {
        if (secs < 0) {
            return INVALID_MESSAGE_STRING;
        }
        int minutes = secs / 60;
        int seconds = secs % 60;
        return getDurationString(minutes, seconds);
    }
}
