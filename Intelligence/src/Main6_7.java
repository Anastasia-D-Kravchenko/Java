import java.util.*;
public class Main6_7 {
    public static void main(String[] args) {
        int[][] rolls = new int[100][2];
        int rollCount = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a command (s/r/e): ");
            char command = scanner.next().charAt(0);
            switch (command) {
                case 's':
                    for (int i = 0; i < rollCount; i++) {
                        System.out.println("Roll " + (i + 1) + ": " + rolls[i][0] + " " + rolls[i][1]);
                    }
                    break;
                case 'r':
                    int die1 = random.nextInt(6) + 1;
                    int die2 = random.nextInt(6) + 1;
                    rolls[rollCount][0] = die1;
                    rolls[rollCount][1] = die2;
                    System.out.println("Roll " + (rollCount + 1) + ": " + die1 + " " + die2);
                    rollCount++;
                    break;
                case 'e':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
