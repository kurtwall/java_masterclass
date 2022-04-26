public class Main {
    public static void main(String[] args) {
        Wall firstWall = new Wall(5, 4);
        System.out.println("width= " + firstWall.getWidth());
        System.out.println("height= " + firstWall.getHeight());
        System.out.println("area= " + firstWall.getArea());

        firstWall.setHeight(-15);
        System.out.println("width= " + firstWall.getWidth());
        System.out.println("height= " + firstWall.getHeight());
        System.out.println("area= " + firstWall.getArea());
    }
}