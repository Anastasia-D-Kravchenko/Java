import java.util.Scanner;
public class Main3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        System.out.println("For while");
        int i = num;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("For do while");
        i = num;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
        System.out.println("For for");
        for (i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
