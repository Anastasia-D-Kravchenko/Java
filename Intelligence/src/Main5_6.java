import java.util.Arrays;
public class Main5_6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original array:");
        printArray(array);
        mirrorImageYAxis(array);
        System.out.println("Mirrored array:");
        printArray(array);
    }
    public static void mirrorImageYAxis(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][cols - j - 1];
                array[i][cols - j - 1] = temp;
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
