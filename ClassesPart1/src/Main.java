public class Main {

    public static void main(String[] args) {

//        Account account = new Account();
//        account.setName("Kurt Wall");
//        account.setAcctNumber("736046");
//        account.setBalance(1000.01);
//        account.setPhone("360-555-1212");
//        account.setEmail("meh@example.com");
//        account.showAcctInfo();


        Customer customerOne = new Customer();
        Customer customerTwo = new Customer("Kurt", "kurt@example.com");
        Customer customerThree = new Customer("Laura", 2.50, "laura@example.com");

        System.out.println(customerOne.getName());
        System.out.println(customerOne.getEmailAddress());
        System.out.println(customerOne.getCreditLimit() +"\n");
        \
        System.out.println(customerTwo.getName());
        System.out.println(customerTwo.getEmailAddress());
        System.out.println(customerTwo.getCreditLimit() +"\n");

        System.out.println(customerThree.getName());
        System.out.println(customerThree.getEmailAddress());
        System.out.println(customerThree.getCreditLimit() +"\n");

    }
}
