class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine() | ";
    }

    public String stopEngine() {
        return " Car -> stopEngine()";
    }

    public String accelerate() {
        return " Car -> accelerate() | ";
    }

    public String brake() {
        return " Car -> brake() | ";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine() | ";
    }

    @Override
    public String stopEngine() {
        return " Mitsubishi -> stopEngine()";
    }

    @Override
    public String accelerate() {
        return " Mitsubishi -> accelerate() | ";
    }

    @Override
    public String brake() {
        return " Mitsubishi -> brake() | ";
    }
}

class Volkswagen extends Car {
    public Volkswagen(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Volkswagen -> startEngine() | ";
    }

    @Override
    public String stopEngine() {
        return " Volkswagen -> stopEngine()";
    }

    @Override
    public String accelerate() {
        return " Volkswagen -> accelerate() | ";
    }

    @Override
    public String brake() {
        return " Volkswagen -> brake() | ";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine() | ";
    }

    @Override
    public String stopEngine() {
        return " Honda -> stopEngine()";
    }

    @Override
    public String accelerate() {
        return " Honda -> accelerate() | ";
    }

    @Override
    public String brake() {
        return " Honda -> brake() | ";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", 4);
        System.out.print(car.startEngine());
        System.out.print(car.accelerate());
        System.out.print(car.brake());
        System.out.println(car.stopEngine());

        Mitsubishi mitsubishi = new Mitsubishi("Eclipse", 4);
        System.out.print(mitsubishi.startEngine());
        System.out.print(mitsubishi.accelerate());
        System.out.print(mitsubishi.brake());
        System.out.println(mitsubishi.stopEngine());

        Volkswagen volkswagen = new Volkswagen("Jetta", 6);
        System.out.print(volkswagen.startEngine());
        System.out.print(volkswagen.accelerate());
        System.out.print(volkswagen.brake());
        System.out.println(volkswagen.stopEngine());

        Honda honda = new Honda("Element", 8);
        System.out.print(honda.startEngine());
        System.out.print(honda.accelerate());
        System.out.print(honda.brake());
        System.out.println(honda.stopEngine());
    }
}