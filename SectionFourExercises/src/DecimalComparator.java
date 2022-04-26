public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double m, double n) {
        int mInt = (int) (m * 1000);
        int nInt = (int) (n * 1000);
        if (mInt - nInt == 0) {
            return true;
        } else {
            return false;
        }
    }
}