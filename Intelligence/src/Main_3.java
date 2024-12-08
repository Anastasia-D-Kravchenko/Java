public class Main_3 {
    public static void main(String[] args) {
        Donkey donkey = new Donkey(50);
        while (!donkey.isFlying()) {
            donkey.addBalloon(new Main10_4());
        }
        System.out.println("I'm flying!!!");
    }
}
