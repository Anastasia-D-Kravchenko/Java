public class Main9_2 {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sumRecursive(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
