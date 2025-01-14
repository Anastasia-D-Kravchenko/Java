import java.io.IOException;
import java.io.InputStream;

public class readValue {
    public static void main(String[] args) throws IOException {
        InputStream streamIn = System.in;
        int value = streamIn.read();

        System.out.println("Read value: " + value);
    }
}