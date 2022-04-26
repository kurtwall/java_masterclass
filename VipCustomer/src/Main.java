public class Main {
    public static void main(String[] args) {
        String sp = ", ";
        VipCustomer bob = new VipCustomer();
        System.out.println("bob: " + sp + bob.getName() + sp + bob.getCreditLimit() + sp + bob.getEmailAddress());

        VipCustomer joe = new VipCustomer("Joe Connolly", 2000.00);
        System.out.println("joe: " + sp + joe.getName() + sp + joe.getCreditLimit() + sp + joe.getEmailAddress());

        VipCustomer sam = new VipCustomer("Sam Iam", 500.00, "samiam@example.com");
        System.out.println("sam: " + sp + sam.getName() + sp + sam.getCreditLimit() + sp + sam.getEmailAddress());
    }
}