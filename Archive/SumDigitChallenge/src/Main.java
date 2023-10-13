public class Main {
    public static void main(String[] args) {
        System.out.println("sumDigits(-125) = " + sumDigits(-125));
        System.out.println("sumDigits(-1) = " + sumDigits(-1));
        System.out.println("sumDigits(9) = " + sumDigits(9));
        System.out.println("sumDigits(10) = " + sumDigits(10));
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(381497) = " + sumDigits(381497));
    }

    private static int sumDigits(int digits) {
        if (digits < 10) {
            return -1;
        }

        int sum = 0;
        while (digits > 0) {
            int digit = digits % 10;
            sum += digit;
            digits /= 10;
        }
        return sum;
    }
}