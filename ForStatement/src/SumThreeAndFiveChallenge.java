public class SumThreeAndFiveChallenge {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; count < 5 && i < 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println(count + " numbers are divisible by 3 and 5");
        System.out.println("Numbers divisible by 3 and 5 sum to " + sum);
    }
}
