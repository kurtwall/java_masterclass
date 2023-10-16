public class Main {

    public static void main(String[] args) {

//        // Deal with the POJO in the StudentPOJO class
//        for (int i = 1; i <= 5; i++) {
//            StudentPOJO s = new StudentPOJO("S1966" + i,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Bob";
//                        case 3 -> "Tim";
//                        case 4 -> "Kurt";
//                        case 5 -> "Laura";
//                        default -> "Anonymous";
//                    },
//                    "15 Dec 1988",
//                    "Java Programming");
//            System.out.println(s);
//        }

        // Use the record in StudentRecord
        for (int i = 1; i <= 5; i++) {
            StudentRecord s = new StudentRecord("S1966" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Bob";
                        case 3 -> "Tim";
                        case 4 -> "Kurt";
                        case 5 -> "Laura";
                        default -> "Anonymous";
                    },
                    "15 Dec 1988",
                    "Java Programming",
                    true);
            System.out.println(s);
        }

    }
}