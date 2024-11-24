public class Main6_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] count = new int[101];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int num = 0; num < arr.length; num++) {
            for (int i = 0; i < count.length; i++) {
                if (arr[num] == i) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
