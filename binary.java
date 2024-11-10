import java.io.*;
public class binary{
	static void valueFind(int n)
	   {
		int i = 0;
		int a = 0;
		while( i != n ){
			i = 4|a;
			a += 1;
		}
		System.out.println("Third  task 1(4&" + Integer.toString(a-1) + "): " + Integer.toString(i));
	   }
	static void valueFindASecond(int n)
	   {
		int i = 0;
		int a = 0;
		while( i != n ){
			i = 5&a;
			a += 1;
		}
		System.out.println("Fourth  task 1(5&" + Integer.toString(a-1) + "): " + Integer.toString(i));
	   }
	public static void main(String[] args){
	
		System.out.println("First task 1(23&15): " + Integer.toString(23&15));
		System.out.println("First task 2(0b10111&0b01111): " + Integer.toString(0b10111&0b01111));
		System.out.println("First task 2(23|15): " + Integer.toString(23|15));
		System.out.println("First task 3(23^15): " + Integer.toString(23^15));
		System.out.println("Second  task 1(7&2): " + Integer.toString(7&2));
		System.out.println("Second  task 2(30|10): " + Integer.toString(30|10));
		System.out.println("Second  task 3(7^2): " + Integer.toString(7^2));
		System.out.println("Second  task 4(11&8): " + Integer.toString(11&8));
		System.out.println("Second  task 5(26>>2): " + Integer.toString(26>>2));
		System.out.println("Second  task 6(36<<3): " + Integer.toString(36<<3));
		System.out.println("Second  task 7(39&13): " + Integer.toString(39&13));
		System.out.println("Second  task 8(12|18): " + Integer.toString(12|18));
		System.out.println("Second  task 9(40>>4): " + Integer.toString(40>>4));
		System.out.println("Second  task 10(27^16): " + Integer.toString(27^16));
		valueFind(5);
		valueFind(6);
		valueFind(7);
		valueFind(12);
		valueFind(4);
		valueFind(13);
		valueFindASecond(1);
		valueFindASecond(4);
		valueFindASecond(5);
		valueFindASecond(0);
			
		
	}
}