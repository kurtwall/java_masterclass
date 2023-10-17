public class Main {
    public static void main(String[] args) {
        System.out.println("Bulleted List\n" +
                "\u2022 Point One\n" +
                "\u2022 Point Two\n" +
                "\t\u2022 Subpoint One\n" +
                "\t\u2022 Subpoint Two");

        System.out.println("""
                Bulleted List with Text Block
                \u2022 Point One
                \u2022 Point Two
                \t\u2022 Subpoint One
                \t\u2022 Subpoint Two""");

        int age = 61;
        System.out.printf("You are %d years old%n", age);
        System.out.printf("You were born in %d%n", 2023 - age);

        
    }
}