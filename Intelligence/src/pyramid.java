import java.io.*;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        FileOutputStream output = new FileOutputStream("pyramid.txt");
        for (int i = 0; i < rows; i++) {
            for (int j = rows-i; j > 1; j--) {
                output.write(' ');
            }
            for (int j = 1; j <= i*2+1; j++) {
               output.write('*');
            }
            output.write('\n');
        }
        output.close();
    }
}
