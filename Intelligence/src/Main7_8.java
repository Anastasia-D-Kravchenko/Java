public class Main7_8 {
    public static void main(String[] args) {
        int[] studentIndexNumbers = createUniqueRandomArray(10, 100, 40000);
        sortArray(studentIndexNumbers);
        printArray(studentIndexNumbers);
    }
    public static void printArray(int[] arr) {
        System.out.println("Greeting all students:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hello, Student s" + arr[i] + "!");
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
