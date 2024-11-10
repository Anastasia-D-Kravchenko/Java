import java.util.Scanner;
import static java.lang.Character.*;
public class Main3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);
        if (isAlphabetic(ch)) {
            System.out.println("It's an alphabetic character.");
            if (isUpperCase(ch)) {
                System.out.println("It's uppercase.");
            } else {
                System.out.println("It's lowercase.");
            }
        } else {
            System.out.println("It's not an alphabetic character.");
        }
        scanner.close();
    }
}
