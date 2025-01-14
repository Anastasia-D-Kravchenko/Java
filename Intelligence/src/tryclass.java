import java.util.Arrays;
import java.io.*;
import java.util.*;

class B {
    public static void m(int s) {
        System.out.println("B" + s);
    }
}
class D extends B {
    public static void m(String s) {
        System.out.println("D"+s) ;
    }
}
public class tryclass {
    public static void main(String[] args) {
        B d = new D();
//        d.m("d");
        for (int i = 2; i * i % 2 == 0; i += 3) {
            System.out.println(i);
        }
//        int[][] a = {{1,5},{3,4},{5,6},{7,8},{9,10}};
//        int i = a[0][a[0].length - 1] + a[a.length - 1][0];
//        System.out.println(i);
        System.out.println("abcdefgh".substring(1, 5));
//        A a = new A();
//        a.i = 7;
//        a.s = 8;
//        A.i = 7;
//        A.s = 7;
        int an = 5;
        int bn = an << 1;
        int cn = bn >> 3;
        byte c1 = 110;
        System.out.println(bn + " " + cn + " " + (int) c1);
        int[] a = {3, 3}, b = a;
        a[0] = 1;
        b[1] = 2;
        System.out.println(a[0] + " " + a[1] + " " + b[0] + " " + b[1]);
        System.out.println(0xA & 2);
        System.out.println(0xD | 4);
        System.out.println(0xB ^ 5);
//        int [] arr = {3,3};
//        int d1 = arr[0];
//        arr[0] = arr[arr. length];
//        arr[arr. length] = d1;
        for (int i = 1; i < 6; ++i) {
            if (i == 2) continue;
            System.out.print(i + " ");
            if (i == 4) break;
        }
        boolean j, c = true;
        int i = 2;
        j = i != 2 && (c = false);
        System.out.println(++i + " " + j + " " + c);
        int k = 1;
        boolean ex = i > k && k < 0;
        System.out.println(ex ? k : -k);
        String a1 = "Zorro";
        a1 = a1.substring(2);
        System.out.println(a1);
//        for (int q=0,double n=5; q < 5; ++q) {
//            System.out.println(q + " " + n+q);
//        }
        String[][] ah = {null, {"A", null, "U"}, {"w"}};
        System.out.println(ah[2][0].length());
        System.out.println(ah[1][2].length());
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] result = oddRows(arr);
        System.out.println(Max(arr));

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(digits());
        System.out.println(num(123456));
    }

    /**/
    @Override
    public String toString() {
        System.out.println("toString");
        return " (b. " + ")";
    }

    /**/
    public static int[][] oddRows(int[][] arrin) {
        int[][] odd = new int[arrin.length / 2][arrin[0].length];
        for (int i = 0; i < arrin.length; i++) {
            for (int j = 0; j < arrin[i].length; j++) {
                if (i % 2 != 0) {
                    odd[i - 1][j] = arrin[i][j];
                }
            }
        }
        return odd;
    }

    public static int digits() {
        int sum = 0;
        try (FileInputStream fis = new FileInputStream("data.bin")) {
            int data;
            while ((data = fis.read()) != -1) {
                if (data >= '0' && data <= '9') {
                    int digit = data - '0';
                    sum += digit;
                }
                System.out.println((char) data + " " + sum);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sum;
    }
    public static int Max(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][arr.length-1-i] > max) max = arr[i][arr.length-1-i];
        }
        return max;
    }
    static int num(int n) {
        int most = 0;
        for (int i = 2; i*i < n; i*=2) {
            most = i*i;
            System.out.println(i);
        }
        return most;
    }
}

class A {
    public static int i = 3;
    public static int s;

    static {
        System.out.println(i + s);
    }

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.bin")) {
            fos.write("Hi, world!".getBytes());
            System.out.println("Hi, world!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}