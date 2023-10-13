public class OverloadedMethodChallenge {

    public static void main(String[] args) {

        System.out.println("Kurt is " + convertToCentimeters(69) + " cm tall");
        System.out.println("Kurt is " + convertToCentimeters(5, 9) + " cm tall");
    }

    public static double convertToCentimeters(int heightInches) {

        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {

        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}
