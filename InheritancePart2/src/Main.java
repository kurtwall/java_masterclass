public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Yuge!", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Goldendoodle", 65, "floppy", "swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        System.out.println(animal);
        animal.makeNoise();
        animal.move(speed);
        System.out.println("__________");
    }
}
