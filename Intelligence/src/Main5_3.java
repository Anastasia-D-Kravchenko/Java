public class Main5_3 {
    public static void main(String[] args) {
        int[][] arrayForMinMax = {{10, 20, 30}, {40, 50, 60}};
        int max = arrayForMinMax[0][0], min = arrayForMinMax[0][0];
        for (int i = 0; i < arrayForMinMax.length; i++) {
            for (int j = 0; j < arrayForMinMax[i].length; j++) {
                max = Math.max(max, arrayForMinMax[i][j]);
                min = Math.min(min, arrayForMinMax[i][j]);
            }
        }
        for (int i = 0; i < arrayForMinMax.length; i++) {
            for (int j = 0; j < arrayForMinMax[i].length; j++) {
                System.out.print(arrayForMinMax[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("Difference between max(" + max + ") and min(" + min + "): " + (max - min));
    }
}
