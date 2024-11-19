public class Main5_1 {
    public static void main(String[] args) {
        int[][] adHoc2D = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};
        int[][] arr2D = new int[3][3];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = (int) (Math.random() * 11);
            }
        }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
