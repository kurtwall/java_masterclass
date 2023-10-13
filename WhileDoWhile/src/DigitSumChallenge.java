public class DigitSumChallenge {

    public static void main(String[] args) {
        int number = 9  ;
        System.out.println("Sum of the digits in " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        while (number >= 1) {
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
}
