public class Main8_3 {
    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        int len = arr1.length + arr2.length;
        char[] mergedArray = new char[len];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            mergedArray[k++] = arr1[i++];
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'x', 'y', 'z'};
        char[] mergedArray = mergeArrays(arr1, arr2);
        for (char c : mergedArray) {
            System.out.print(c + " ");
        }
    }
}
