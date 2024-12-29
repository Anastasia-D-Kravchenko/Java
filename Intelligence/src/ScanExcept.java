import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScanExcept {
    public static void main(String[] args) {
        // Suppress resource warning for console scanner (it's closed implicitly)
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);

        Scanner scfile = null;
        try {
            // Open the file scanner
            scfile = new Scanner(Paths.get("file.txt"), "UTF-8");

            // Read and print lines from the file
            int count = 0;
            while (scfile.hasNextLine()) {
                System.out.printf("%2d: %s%n", ++count, scfile.nextLine());
            }
        } catch (IOException e) {
            // Handle file reading exception
            System.out.println("Exception: " + e);
            System.out.println("**** Now the stack:");
            e.printStackTrace();
            System.out.println("**** CONTINUING...");
        } finally {
            // Close the file scanner if it was opened
            if (scfile != null) {
                scfile.close();
            }
            System.out.println("FINALLY executed");
        }

        // Get user input from console
        System.out.println("Enter anything...");
        String s = console.next();
        System.out.println("Read from console: " + s);

        // Assertions are disabled by default, comment out if needed
        // assert scfile != null : "apparently no file"; // for debugging only
    }
}