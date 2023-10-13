import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        do {
            System.out.print("Enter number #" + count + ": ");
            String inputValue = sc.nextLine();
            if (isNumber(inputValue) && count <= 5) {
                sum += Integer.parseInt(inputValue);
                count++;
            } else {
                System.out.println("Not a number");
                count = count > 1 ? count-- : 1;
            }
        } while (count <= 5);
        System.out.println("Sum of these numbers is: " + sum);
    }

    public static boolean isNumber(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
