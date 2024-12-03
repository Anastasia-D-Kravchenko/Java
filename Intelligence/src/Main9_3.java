public class Main9_3 {
    public static int arraySum(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        } else {
            return arr[i] + arraySum(arr, i - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = arraySum(arr, arr.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }
}
