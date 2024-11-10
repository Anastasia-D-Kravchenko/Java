import java.util.Scanner;
public class Main2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println("The number " + number + " is divisible by 3.");
        }
    }
}
