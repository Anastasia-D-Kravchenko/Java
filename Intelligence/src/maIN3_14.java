public class maIN3_14 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        boolean c = !(a < b) && !(a > b);
        boolean d = !(!( a >= b ) || !!( a != b ) );
        if (c){
            System.out.println("!(a < b) && !(a > b) the same as a==b");
        }
        if (d){
            System.out.println("!(!( a >= b ) || !!( a != b ) ) the same as a==b");
        }
    }
}