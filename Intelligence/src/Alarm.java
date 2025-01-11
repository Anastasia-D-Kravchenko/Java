class Alarm extends Exception {
    public Alarm(String message) {
        super(message);
    }
}
// Create SmokeDetector class
class SmokeDetector {
    public static void check() throws Alarm {
        Double rand = Math.random();
        System.out.println(rand);
        if (rand < 0.3) {
            throw new Alarm("Smoke detected!");
        }
    }
}