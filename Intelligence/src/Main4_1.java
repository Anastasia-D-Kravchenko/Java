import java.util.*;
public class Main4_1 {
    public static void main(String[] args) {
        int [] adHoc = {1 ,2 ,4 ,5 ,3};
        int [] arr = new int [5];
        for (int i=0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*21);
        }
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
