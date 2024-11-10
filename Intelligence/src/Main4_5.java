public class Main4_5 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10) + 1;
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
