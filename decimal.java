import java.io.*;
import java.util.Scanner;
class decimal{
   static void decToBinary(int n)
   {
       int[] binaryNum = new int[1000];
       int i = 0;
       while (n > 0)
       {
           binaryNum[i] = n % 2;
           n = n / 2;
           i++;
       }
       for (int j = i - 1; j >= 0; j--)
           System.out.print(binaryNum[j]);
   }
   public static void main (String[] args)
   {
	Scanner in = new Scanner(System.in);
   	System.out.println("Enter a decimal number");
   	Long num = in.nextLong();
	int n = num.intValue();
         System.out.println("Decimal - " + n);
       System.out.print("Binary - ");
         decToBinary(n);
   }
}