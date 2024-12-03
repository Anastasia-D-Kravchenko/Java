public class Main9_8 {
    public static int[][] createSquareMatrix(int n) {
        int[][] matrix = new int[n * 2][n * 2];
        for (int layer = 0; layer < n; layer++) {
            for (int i = layer; i < n * 2 - layer; i++) {
                for (int j = layer; j < n * 2 - layer; j++) {
                    matrix[i][j] = layer+1;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = createSquareMatrix(n);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}