import java.util.Scanner;
import java.util.Locale; // see below

public class ReadKbd {
  public static void main(String[] args) {

    // If locale is Polish, floating point numbers
    // have to be entered with comma as the
    // decimal separator. Locale can be changed to,
    // e.g., American, by uncommenting the line below:
    // Locale.setDefault(Locale.US);
    // (then the dot is used as decimal separator).
    // When reading data, any nonempty sequence of
    // white characters is treated as a separator.

    //Locale.setDefault(Locale.US); // Uncomment to use American locale

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an int, a string " +
                       "and two double's");
    int k = scan.nextInt();
    String s = scan.next();
    double x = scan.nextDouble();
    double y = scan.nextDouble();

    // scan.close(); // Don't close if reading from System.in

    System.out.println("\nEntered data:\n\nint = " +
                       k + "\nString = " + s + "\ndouble1 = " +
                       x + "\ndouble2 = " + y + "\n");
  }
}