import java.util.*;
public class Main6_5 {
    public static void main(String[] args) {
        float[][] arr = new float[8][8];
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = random.nextFloat() * 100;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        float diagonal1Sum = 0, diagonal2Sum = 0;
        for (int i = 0; i < 8; i++) {
            diagonal1Sum += arr[i][i];
            diagonal2Sum += arr[i][7 - i];
        }
        System.out.println("Sum of diagonal 1: " + diagonal1Sum);
        System.out.println("Sum of diagonal 2: " + diagonal2Sum);
    }
}
