import java.util.*;
public class Main6_2 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 50 + Math.random() * 50;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] % 2 != 0) {
                System.out.print((int) arr[i] + " ");
            }
        }
        System.out.println();
    }
}
