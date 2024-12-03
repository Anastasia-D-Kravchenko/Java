public class Main8_6 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5};
        char[] chars = digitsToChars(digits);
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
    public static char[] digitsToChars(int[] digits) {
        char[] chars = new char[digits.length];
        for (int i = 0; i < digits.length; i++) {
            chars[i] = Character.forDigit(digits[i], 10);
        }
        return chars;
    }
}

