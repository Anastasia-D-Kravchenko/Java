import java.util.HashMap;
import java.util.Map;

public class AHash {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Sue", "123456"), "Sue");
        Person sueCopy = new Person("Sue", "123456");
        if (map.containsKey(sueCopy)) {
            System.out.println(sueCopy + " has been found");
        } else {
            System.out.println(sueCopy + " has NOT been found"); // This won't be printed
        }
    }
}
