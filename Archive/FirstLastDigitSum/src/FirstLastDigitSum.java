public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        if (number < 10) {
            return number + number;
        } else {
            sum = number % 10;
        }
        while (number > 0) {
            number /= 10;
            if (number < 10) {
                sum += number;
                break;
            }
        }
        return sum;
    }
}
