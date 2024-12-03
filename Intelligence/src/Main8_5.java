import java.util.*;
public class Main8_5 {
    public static int generateRandomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be less than or equal to max");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int randomNum = generateRandomInt(min, max);
        System.out.println("Random number: " + randomNum);
    }
}
