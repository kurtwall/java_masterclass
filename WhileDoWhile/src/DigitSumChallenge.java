public class DigitSumChallenge {

    public static void main(String[] args) {
        sumDigits(125)
    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }

        int digit = number % 10;
        int newNumber = number / 10;
    }
}
