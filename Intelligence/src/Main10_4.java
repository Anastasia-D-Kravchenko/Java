import java.util.Random;

public class Main10_4 {
    private double helium;
    public Main10_4() {
        Random random = new Random();
        helium = random.nextDouble() * 0.004 + 0.005;
    }
    public double getLoad() {
        return helium * 6 / 0.007;
    }
}
class Donkey {
    private double mass;
    private Main10_4[] balloons;
    public Donkey(double mass) {
        this.mass = mass;
        balloons = new Main10_4[0];
    }
    public void addBalloon(Main10_4 Main10_4) {
        Main10_4[] newBalloons = new Main10_4[balloons.length + 1];
        System.arraycopy(balloons, 0, newBalloons, 0, balloons.length);
        newBalloons[balloons.length] = Main10_4;
        balloons = newBalloons;
    }
    public boolean isFlying() {
        double totalLoad = 0;
        for (Main10_4 Main10_4 : balloons) {
            totalLoad += Main10_4.getLoad();
        }
        return totalLoad >= mass * 1000;
    }
}
