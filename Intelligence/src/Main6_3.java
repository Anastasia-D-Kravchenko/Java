import java.util.Scanner;
public class Main6_3 {
    public static void main(String[] args) {
        char[] chars = new char[100];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + Math.random() * 26);
        }
        while (true) {
            System.out.print("Enter a character: ");
            char target = scanner.next().charAt(0);
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == target) {
                    count++;
                    chars[i] = '0';
                }
            }
            System.out.println("The character '" + target + "' appears " + count + " times.");
            boolean allZeros = true;
            for (char c = 0; c < chars.length; c++) {
                if (c != '0') {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) {
                System.out.println("Array is filled with zeros. Exiting...");
                break;
            }
        }
    }
}
