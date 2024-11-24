public class Main5_7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        for (int i = max; i >= 1; i--) {
            for (int num : arr) {
                if (num >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int num = 0; num <= arr.length-1; num++) {
            System.out.print(num + " ");
        }
    }
}
