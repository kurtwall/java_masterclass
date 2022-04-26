public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveFrontBody() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveFrontBody();
        moveBackFin();
        super.move(speed);
    }
}
