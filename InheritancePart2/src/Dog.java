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
        System.out.println("Bark bark bark");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs run, walk, and wag their tails");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
