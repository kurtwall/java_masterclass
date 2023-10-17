public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay() {
        double paycheck =  (int) this.annualSalary / 26;
        double pension = (int) paycheck * 0.9;
        return isRetired ? pension : paycheck;
    }

    public void retire() {
        this.terminate("12/31/2024");
        this.isRetired = true;
    }

}
