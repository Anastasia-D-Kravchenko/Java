import java.util.*;
public class Main6_6 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (size == arr.length) {
                int[] newArr = new int[arr.length * 2];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            arr[size++] = num;
        }
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
