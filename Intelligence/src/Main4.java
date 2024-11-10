public class Main4 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;
        int num3 = 20;
        int highest = num1;
        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }
        System.out.println("The highest value is: " + highest);

    }
}
