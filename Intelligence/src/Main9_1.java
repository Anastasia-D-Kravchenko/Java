public class Main9_1 {
    public static void times(int i) {
        if (i > 0) {
            System.out.println("i: " + i);
            times(--i);
        }
    }
    public static void main ( String [] args ) {
        times (5) ;
    }
}
