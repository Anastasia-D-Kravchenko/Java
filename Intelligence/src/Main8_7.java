import java.util.Calendar;
import java.util.Random;
public class Main8_7 {
    public static void main(String[] args) {
        int[] randomDate = generateRandomDate();
        System.out.println("Random Date: " + randomDate[0] + "/" + randomDate[1] + "/" + Calendar.getInstance().get(Calendar.YEAR));
    }
    public static int[] generateRandomDate() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        Random random = new Random();
        int day = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        if (month == 2) {
            if (isLeapYear(currentYear)) {
                day = Math.min(day, 29);
            } else {
                day = Math.min(day, 28);
            }
        }
        return new int[]{day, month};
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
