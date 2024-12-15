public class Ball {
    private double radius;
    private static int ballCounter = 0;
    public static Ball makeBall() {
        double radius = 10 + Math.random() * 10;
        ballCounter++;
        return new Ball(radius);
    }
    public Ball(double radius) {
        this.radius = radius;
    }
    public static void showCounter() {
        System.out.println("Number of balls created: " + ballCounter);
    }
}