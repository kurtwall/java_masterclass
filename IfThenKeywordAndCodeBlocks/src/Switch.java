import jdk.jshell.EvalException;

public class Switch {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was neither 1 nor 2");
//        }

//        int switchVal = 1;
//        switch (switchVal) {
//            case 1 -> System.out.println("value was 1");
//            case 2 -> System.out.println("value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("value was 3, 4, or 5");
//                System.out.println("in fact, it was " + switchVal);
//            }
//            default -> System.out.println("value was not 1, 2, 3, 4, or 5");
//        }

        System.out.println(getQuarter("March"));
        System.out.println(getQuarter("November"));
        System.out.println(getQuarter("August"));
        System.out.println(getQuarter("May"));
        System.out.println(getQuarter("Mai"));
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "First quarter";
            case "April", "May", "June" -> "Second quarter";
            case "July", "August", "September" -> "Third quarter";
            case "October", "November", "December" -> "Fourth quarter";
            default -> {
                String response = month + ": Invalid month";
                yield response;
            }
        };
    }
}
