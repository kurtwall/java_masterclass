public class Main {
    public static void main(String[] args) {
        Kia kia = new Kia(36);
        kia.accelerate(30);
        kia.steer(45);
        kia.accelerate(20);
        kia.accelerate(-42);
        kia.stop();
    }
}