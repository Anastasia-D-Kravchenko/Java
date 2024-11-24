public class Main6_8 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2}, {3, 4, 8}, {2, 6, 8}, {1, 8, 5}};
        int maxRowSum = Integer.MIN_VALUE, maxRowIdx = 0;
        int maxColSum = Integer.MIN_VALUE, maxColIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIdx = i;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIdx = j;
            }
        }
        System.out.println("Row with the largest sum: " + maxRowIdx);
        System.out.println("Column with the largest sum: " + maxColIdx);
    }
}
