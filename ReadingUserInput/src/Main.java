import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch(NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Name: ");
        String birthYear = System.console().readLine("Year of birth: ");

        return (name + " is " + (currentYear - Integer.parseInt(birthYear)));
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        boolean dobValid = false;
        String birthYear;
        do {
            System.out.print("Year of birth: ");
            birthYear = sc.nextLine();
            try {
                dobValid = dateValid(currentYear, Integer.parseInt(birthYear));
            } catch(NumberFormatException e) {
                System.out.println("Not a valid birth year");
            }
        } while (!dobValid);

        return (name + " is " + (currentYear - Integer.parseInt(birthYear)));
    }

    public static boolean dateValid(int currentYear, int birthYear) {
        if (birthYear > currentYear || (currentYear - birthYear > 125)) {
            return false;
        }
        return true;
    }
}
