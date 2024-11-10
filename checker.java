import java.util.Scanner;
public class checker{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
   		System.out.println("Enter a binary number");
   		Long num = in.nextLong();
   		Long count = 0L, sum = 0L, rem = 0L;
   		while(num > 0) {
     			rem = num % 10;
    			if(rem == 0 || rem == 1) {
       				sum = (long) (sum + rem * Math.pow(2, count));
       				num = num / 10;
     			} else {
       				System.out.println("Invalid binary number");
       				break;
     			}
     			count++;
  			}
  		System.out.println(" Decimal number is " + sum);
			
		
	}
}