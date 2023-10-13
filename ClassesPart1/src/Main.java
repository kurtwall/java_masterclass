public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        account.setName("Kurt Wall");
        account.setAcctNumber("3517183470");
        account.setBalance(1000.01);
        account.setCustPhone("360-555-1212");
        account.setCustEmail("meh@example.com");
        account.showAcctInfo();

        Account jenny = new Account("Jenny", "3517183469", 0.0, "360-867-5309",
                "jenny@example.com");
        jenny.showAcctInfo();

        jenny.deposit(100.00);
        jenny.withdraw(54.32);
        jenny.withdraw(45.68);
        jenny.deposit(100.00);
        jenny.withdraw(101.00);

    }
}
