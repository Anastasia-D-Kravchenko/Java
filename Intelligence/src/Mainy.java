public class Mainy {
    static int aFun(int[][] a) {
        int s = 0;
        for (int i = 1; i < a.length; ++i) {
            for (int j = 0; j < a[i].length - 1; ++j) {
                s += a[i][j + 1];
            }
        }
        if (s < 10) {
            System.out.print(s + " ");
        }
        return s / 4;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        System.out.println(aFun(arr));
    }
}