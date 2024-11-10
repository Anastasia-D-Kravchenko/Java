import java.util.Scanner;
public class Main4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] descendingArray = new int[size];
        for (int i = 0; i < size; i++) {
            descendingArray[i] = size - i;
        }
        for(int i: descendingArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
