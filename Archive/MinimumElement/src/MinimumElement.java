import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.nextLine();
        return capacity;
    }

    private static int[] readElements(int values) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for (int i = 0; i < elements.length; i++) {
            int valueEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = valueEntered;
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println("minVal = " + findMin(array));
    }
}