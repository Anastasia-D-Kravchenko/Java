public class Main5 {
    public static void main(String[] args) {
        int age = 35;
        if (age < 18) {
            System.out.println("Underaged");
        } else if (age < 40) {
            System.out.println("Young adult");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Elderly");
        }
    }
}
