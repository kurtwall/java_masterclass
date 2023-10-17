public class Main {

    public static void main(String[] args) {

        Employee kurt = new Employee("Kurt", "02-23-1962", "02/19/2019");
        System.out.println(kurt);
        System.out.println("Age = " + kurt.getAge());
        System.out.println("Pay = " + kurt.collectPay());

        SalariedEmployee laura = new SalariedEmployee("Laura", "02-23-1964", "02-19-2020",
                50000.0);
        System.out.println(laura);
        System.out.println("Age = " + laura.getAge());
        System.out.println("Pay = " + laura.collectPay());
        laura.retire();
        System.out.println("Pension = " + laura.collectPay());

        HourlyEmployee jesyca = new HourlyEmployee("Jesyca", "08-23-1992", "03-14-2022",
                15.0);
        System.out.println(jesyca);
        System.out.println("Pay = " + jesyca.collectPay());
        System.out.println("Ovetime pay = " + jesyca.getDoublePay());

    }
}
