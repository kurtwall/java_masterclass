public class Main {
    public static void main(String[] args) {

        /**
         *         Inspection methods
         *         length, charAt, indexOf, lastIndexOf, isEmpty, isBlank
         */
        String s = "This is a string";
        System.out.printf("Length of '%s' = %d%n", s, s.length());
        System.out.printf("Char at index 5 = %c%n", s.charAt(5));
        System.out.printf("First index of i = %d%n", s.indexOf('i'));
        System.out.printf("Last index of i = %d%n", s.lastIndexOf('i'));
        System.out.printf("String is empty: %b%n", s.isEmpty());
        s = "";
        System.out.printf("String is empty: %b%n", s.isEmpty());
        String t = "This is not an string";
        System.out.printf("String is blank: %b%n", t.isEmpty());
        t = "%t     %n";
        System.out.printf("String is empty: %b%n", t.isEmpty());

        /**
         *        Comparison methods
         *        contentEquals, equals, equalsIgnoreCase, contains, endsWith, startsWith, regionMatches
         */


        /**
         * Manipulation methods
         *
         */
    }
}