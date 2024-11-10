import java.util.Scanner;
public class Hello {
	public static void main(String[] args){ 

		System.out.println("Enter name: ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("Hello, " + inp + "!");
	}
}