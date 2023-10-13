public class Car {

    private String make = "Kia";
    private String model = "Seltos";
    private String color = "Yellow";
    private int doors = 4;
    private boolean convertible = false;

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getDoors() {
        return this.doors;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-door " +
                color + " " +
                make + " " +
                model + " " + "Convertible " +
                convertible);
    }
}
