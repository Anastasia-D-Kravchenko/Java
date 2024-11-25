public class Main7_5 {
    public static void main(String[] args) {
        int[] arr = createUniqueRandomArray(10, 100, 40000);
        System.out.println("The array with length " + arr.length + " is ");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]);
    }
    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    public static int[] createUniqueRandomArray(int minSize, int maxSize, int maxValue) {
        int size = (int) (Math.random() * (maxSize - minSize + 1)) + minSize;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int randomValue;
            do {
                randomValue = (int) (Math.random() * maxValue) + 1;
            } while (containsValue(arr, randomValue));
            arr[i] = randomValue;
        }
        return arr;
    }
}
