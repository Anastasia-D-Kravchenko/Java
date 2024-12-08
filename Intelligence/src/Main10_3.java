import java.util.Random;
public class Main10_3 {
    public String name;
    public double weight;
    public Main10_3(String name) {
        this.name = name;
        Random random = new Random();
        this.weight = random.nextDouble() * 0.3 + 0.5;
    }
    public void show() {
        System.out.println("Fruit: " + name + ", Weight: " + weight + " kg");
    }
    public static void main(String[] args) {
        Main10_3 fruit = new Main10_3("Fruit");
        fruit.show();
    }
}
