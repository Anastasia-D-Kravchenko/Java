import java.util.HashMap;
import java.util.Map;

public class AHash {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        map.put(new Person("Sue", "123456"), "Sue");

        // Create a copy of the Person object used in the put method
        Person sueCopy = new Person("Sue", "123456").copy();

        if (map.containsKey(sueCopy)) {
            System.out.println(sueCopy + " has been found");
        } else {
            System.out.println(sueCopy + " has NOT been found"); // This won't be printed
        }
    }
}
