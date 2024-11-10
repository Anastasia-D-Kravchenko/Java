import java.util.*;
public class Main4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, count = 0;
        while (n > 0) {
            sum += n%10;
            count += 1;
            System.out.println("Digit No ." + count + " : " + n%10);
            n/=10;
        }
        System.out.println("Sum of digits:" + sum);
    }
}
