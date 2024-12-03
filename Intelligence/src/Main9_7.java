public class Main9_7 {
    public static boolean isPalindrome(char[] word, int left, int right) {
        if (left >= right) {
            return true;
        } else if (word[left] != word[right]) {
            return false;
        } else {
            return isPalindrome(word, left + 1, right - 1);
        }
    }
    public static void main(String[] args) {
        char[] word = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        boolean isPalindrome = isPalindrome(word, 0, word.length - 1);
        System.out.println(isPalindrome);
    }
}
