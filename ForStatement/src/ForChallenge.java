public class ForChallenge {
    public static void main(String[] args) {

        int numPrimes = 0;
        for (int i = 50; i <= 100; i++) {
            if (numPrimes == 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
                numPrimes++;
            }
        }
        System.out.println(numPrimes + " prime numbers < 1000");
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
