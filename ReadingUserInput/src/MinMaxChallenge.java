import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {

        double min = 0;
        double max = 0;
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a number a character to quit): ");
                String input = sc.nextLine();
                double value = Double.parseDouble(input);
                if (value < min || counter == 0) {
                    min = value;
                }
                if (value > max || counter == 0) {
                    max = value;
                }
                counter++;
                System.out.println("Min/Max = " + min + "/" + max);
            } catch (NumberFormatException e) {
                System.out.println("Exiting after " + counter + " rounds");
                break;
            }
        }
    }
}

