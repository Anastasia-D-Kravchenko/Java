public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, world!");

        // 1. Length
        System.out.println("Length: " + sb.length());

        // 2. Equals
        String str1 = "Hello, world!";
        String str2 = "Hello, World!";
        System.out.println("Equals: " + str1.equals(str2)); // true

        // 3. EqualsIgnoreCase
        String str3 = "hello, WORLD!";
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str3)); // true

        // 4. Trim
        String str4 = "   Hello, world!   ";
        System.out.println("Trim: " + str4.trim());

        // 5. toLowerCase, toUpperCase
        System.out.println("toLowerCase: " + sb.toString().toLowerCase());
        System.out.println("toUpperCase: " + sb.toString().toUpperCase());

        // 6. substring
        String substring1 = sb.substring(7);
        System.out.println("substring1: " + substring1);
        String substring2 = sb.substring(7, 12);
        System.out.println("substring2: " + substring2);

        // 7. charAt
        char charAt0 = sb.charAt(0);
        System.out.println("charAt0: " + charAt0);

        // 8. contains
        System.out.println("contains 'world': " + sb.toString().contains("world"));

        // 9. startsWith, endsWith
        System.out.println("startsWith 'Hello': " + sb.toString().startsWith("Hello"));
        System.out.println("endsWith '!' : " + sb.toString().endsWith("!"));

        // 10. indexOf
        System.out.println("indexOf 'o': " + sb.indexOf("o"));
        System.out.println("indexOf 'world': " + sb.indexOf("world"));

        // 11. lastIndexOf
        System.out.println("lastIndexOf 'o': " + sb.lastIndexOf("o"));
        System.out.println("lastIndexOf 'world': " + sb.lastIndexOf("world"));

        // 12. toCharArray
        char[] charArray = sb.toString().toCharArray();
        System.out.print("toCharArray: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 13. split
        String str5 = "apple,banana,orange";
        String[] fruits = str5.split(",");
        System.out.print("split: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}