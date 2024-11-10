import java.util.Scanner;
public class Main2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int higher = (a > b) ? a : b;
        System.out.println("The higher number is: " + higher);
    }
}
