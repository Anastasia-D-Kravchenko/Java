public class Main7_6 {
    public static void main(String[] args) {
        int[] arr = createUniqueRandomArray(10, 100, 40000);
        System.out.println("The array with length " + arr.length + " is ");
        printArray(arr);
        sortArray(arr);
        System.out.println("The sorted array would look like: ");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
