import java.util.Scanner;
public class Main2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = scanner.nextInt();
        if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            int remainder = number % divisor;
            System.out.println(number + " is not divisible by " + divisor + ", the remainder is " + remainder);
        }
    }
}
