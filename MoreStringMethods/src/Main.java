public class Main {
    public static void main(String[] args) {

        String birthDate = "23-02-1962";
        int start = birthDate.indexOf("1962");
        System.out.println("Birth year = " + birthDate.substring(start, start + 4));

        String newDate = String.join("/", "02", "23", "1962");
        System.out.println("newDate = " + newDate);
        System.out.println("newDate = " + newDate.replace("/", "-"));
        System.out.println("newDate = " + newDate.replace("2", "00"));
        System.out.println("newDate = " + newDate.replaceFirst("/", "-"));
        System.out.println("newDate = " + newDate.replaceAll("/", "|"));


    }
}