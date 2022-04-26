public class NumerPalindrome {

    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(-10) = " + isPalindrome(-10));
        System.out.println("isPalindrome(707) = " + isPalindrome(707));
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));
        System.out.println("isPalindrome(0) = " + isPalindrome(0));
        System.out.println("isPalindrome(1) = " + isPalindrome(1));
        System.out.println("isPalindrome(-1) = " + isPalindrome(-1));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
        }

        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
}
