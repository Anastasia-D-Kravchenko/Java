public class Main9_6 {
    public static int[] splitToDigits(int number) {
        if (number < 10) {
            return new int[]{number};
        } else {
            int[] digits = splitToDigits(number / 10);
            int lastDigit = number % 10;
            int[] result = new int[digits.length + 1];
            for(int i = 0; i < digits.length; i++){
                result[i] = digits[i];
            }
            result[result.length - 1] = lastDigit;
            return result;
        }
    }
    public static void main(String[] args) {
        int number = 12345;
        int[] digits = splitToDigits(number);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
