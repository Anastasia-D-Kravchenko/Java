public class Point2D {
    double x;
    double y;
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public static Point2D randomPoint() {
        double randomX = -50 + Math.random() * 100;
        double randomY = -50 + Math.random() * 100;
        return new Point2D(randomX, randomY);
    }
}
