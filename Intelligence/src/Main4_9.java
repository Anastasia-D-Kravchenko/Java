import java.util.*;
public class Main4_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Write height: ");
        int h = scan.nextInt();
//        int h = Integer.parseInt(scan.nextLine());
        System.out.print("Write width: ");
        int w = scan.nextInt();
        for (int i=0;i<h;i++){
            System.out.print("*");
            for (int j=0;j<(w-2);j++){
                if(i==0 || i==(h-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("*" + "\n");
        }
    }
}
