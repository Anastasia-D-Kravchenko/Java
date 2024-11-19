import java.util.Arrays;
public class Maun5_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 3, 2}};
        System.out.println("Original array:");
        printArray(array);
        mirrorImageXAxis(array);
        System.out.println("Mirrored array:");
        printArray(array);
    }
    public static void mirrorImageXAxis(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = array[i][j];
                array[i][j] = array[rows - i - 1][j];
                array[rows - i - 1][j] = temp;
            }
        }
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
