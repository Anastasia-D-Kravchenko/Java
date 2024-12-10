public class StringMethodsExample {
    public static void main(String[] args) {
        String s = "Hello, World!";

        // Length
        int length = s.length();
        System.out.println("Length: " + length);

        // Equality
        String anotherString = "Hello, World!";
        boolean isEqual = s.equals(anotherString);
        System.out.println("Equal: " + isEqual);

        // Case-insensitive comparison
        String lowerCaseString = "hello, world!";
        boolean isIgnoreCaseEqual = s.equalsIgnoreCase(lowerCaseString);
        System.out.println("Ignore Case Equal: " + isIgnoreCaseEqual);

        // Trimming
        String trimmedString = "  Hello, World!  ".trim();
        System.out.println("Trimmed: " + trimmedString);

        // Case conversion
        String upperCaseString = s.toUpperCase();
        String lowerCaseString2 = s.toLowerCase();
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString2);

        // Substring
        String substring = s.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Character at index
        char characterAtIndex = s.charAt(0);
        System.out.println("Character at index 0: " + characterAtIndex);

        // Contains
        boolean containsWorld = s.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Starts with and ends with
        boolean startsWithHello = s.startsWith("Hello");
        boolean endsWithExclamationMark = s.endsWith("!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with '!': " + endsWithExclamationMark);

        // Index of
        int indexOfWorld = s.indexOf("World");
        int indexOfComma = s.indexOf(",");
        System.out.println("Index of 'World': " + indexOfWorld);
        System.out.println("Index of ',': " + indexOfComma);

        // Last Index Of
        int lastIndexOfL = s.lastIndexOf('l');
        System.out.println("Last index of 'l': " + lastIndexOfL);

        // Splitting
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // To char array
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}