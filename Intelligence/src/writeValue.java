import java.io.*;
public class writeValue {
    public static void main(String[] args) throws IOException {
        InputStream streamIn = System.in;
        int charCode = streamIn.read();

        if (charCode != -1) { // Check for end-of-stream
            char character = (char) charCode;
            System.out.println("char value - " + character
                    + ", char number code - " + charCode);
        }
    }
}
