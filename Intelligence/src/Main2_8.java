import java.util.Scanner;
public class Main2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isSumGreater = (a + b + c) > (a * b * c);
        System.out.println("Is the sum greater than the multiplication? " + (isSumGreater?"Yes":"No"));
    }
}
