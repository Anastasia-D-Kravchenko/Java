import java.util.Scanner;
public class Main4_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write height: ");
        int sideLength = scanner.nextInt();
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++)
            {
                if (i == 0 || i == sideLength - 1 || i == j || i + j == sideLength - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
