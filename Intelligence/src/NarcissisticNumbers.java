import java.io.*;
import java.util.Scanner;

public class NarcissisticNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("number.txt"));

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (isNarcissistic(num)) {
                System.out.println(num + " is a narcissistic number.");
            }
        }

        scanner.close();
    }

    public static boolean isNarcissistic(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = (int) Math.log10(num) + 1; // Calculate number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}