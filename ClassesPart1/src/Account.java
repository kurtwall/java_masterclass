public class Account {
    private String number;
    private double balance;
    private String name;
    private String custEmail;
    private String custPhone;

    public void showAcctInfo() {
        System.out.println("Name   : " + this.name);
        System.out.println("Acct # : " + this.number);
        System.out.println("Balance: " + this.balance);
        System.out.println("Phone  : " + this.custPhone);
        System.out.println("Email  : " + this.custEmail);
    }

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String name, String number, double balance, String custPhone, String custEmail) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance after depositing $" + amount + " is $" + this.balance);

    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("This withdrawal would overdraw your account. Balance is: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Balance after withdrawing $" + amount + " is $" + this.balance);

        }
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

    public String getCustEmail() {
        return this.custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhone() {
        return this.custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}