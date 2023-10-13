public class WhileLoopChallenge {

    public static void main(String[] args) {

        int i = 5;
        int evenCount = 0;
        int oddCount = 0;

        while(i <= 20 && evenCount < 5) {
            if (isEvenNumber(i)) {
                evenCount++;
                System.out.println(i + " is even");
            } else {
                oddCount++;
            }
            i++;
        }
        System.out.println(evenCount + " even numbers");
        System.out.println(oddCount + " odd numbers");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }
}