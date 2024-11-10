import java.util.*;
public class Main4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i  + "\t");
            for (int j=2;j<=n;j++){
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }
    }
}
