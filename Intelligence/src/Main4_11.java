import java.util.Scanner;
public class Main4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write height: ");
        int n = sc.nextInt();
        System.out.print("Write width: ");
        int p = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                if (i % 2 == 0) {
                    if(j%2==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j!=0&&j!=p){
                        if(j%2==0){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }System.out.println();
        }
    }
}
