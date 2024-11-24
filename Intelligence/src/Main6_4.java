import java.util.*;
public class Main6_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            int size = 10 + random.nextInt(11);
            arr[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arr[i][j] = 10 + random.nextInt(11);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
