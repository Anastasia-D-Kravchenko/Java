public class Main2_6 {
    public static void main(String[] args) {
        int val = 5;
        if (val > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println((val > 0) ? "Yes" : "No");
        boolean val2 = false;
        int i = (val2) ? 5 : 8;
        System.out.println(i);
    }
}
