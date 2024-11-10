import java.util.Scanner;
public class Simple{
	public static void main(String[] args){
	
		System.out.println("Hello world, java");
		var numb = 5+5;
		numb += 5;
		System.out.println(numb);
		System.out.println("Enter name: ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("Hello, " + inp);
		
	}
}