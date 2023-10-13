public class AreaCalculator {
    public static Double area(Double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static Double area(Double x, Double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}