public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point other) {
        double xDist = (other.x - this.x) * (other.x - this.x);
        double yDist = (other.y - this.y) * (other.y - this.y);
        return Math.sqrt(xDist + yDist);
    }

    public double distance(int x, int y) {
        Point other = new Point(x, y);
        return this.distance(other);
    }
}
