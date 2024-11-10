import java.util.Scanner;
public class Main3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        if (isLeapYear(java.time.LocalDate.now().getYear()) && month > 2) {
            totalDays++;
        }
        System.out.println("Number of days elapsed since the beginning of the year: " + totalDays);
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0);
    }
}
