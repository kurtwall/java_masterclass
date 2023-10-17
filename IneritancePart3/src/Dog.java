public class Dog extends Animal {

    private String earShape;
    private String tailShape;


    public Dog() {
        super("Generic Dog",  "large", 50.0);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curly");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 50 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void makeNoise() {
        if (type == "wolf") {
            System.out.println("Ow wooo!");
        }
        this.bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            this.walk();
        }
        if (speed == "fast") {
            this.run();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void walk() {
        System.out.println("Dog walking");
        this.wagTail();
    }

    private void run() {
        System.out.println("Dog running");
    }

    private void bark() {
        System.out.println("Woof!");

    }

    private void wagTail() {
        System.out.println("Tail wagging");
    }
}
