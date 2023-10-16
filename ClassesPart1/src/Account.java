public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String name, String number, double balance, String phone, String email) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.phone = phone;
        this.email = email;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance after depositing $" + amount + " is $" + this.balance);

    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Withdrawing $" + amount + " would overdraw your account. Balance is: $" + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Balance after withdrawing $" + amount + " is $" + this.balance);
        }
    }

    public void showAcctInfo() {
        System.out.println("Name   : " + this.name);
        System.out.println("Acct # : " + this.number);
        System.out.println("Balance: " + this.balance);
        System.out.println("Phone  : " + this.phone);
        System.out.println("Email  : " + this.email);
    }

    public String getAcctNumber() {
        return this.number;
    }

    public void setAcctNumber(String acctNumber) {
        this.number = acctNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}