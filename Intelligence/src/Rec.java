public class Rec {
    public static void main(String[] args) {
        R r1 = new R(1, 4);
        R r2 = new R(2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.getProduct());
    }
}

record R(int a, int b) {
    final static int DEF_B = 7;

    R {
        a = 2 * a;
        if (b < 0) {
            throw new IllegalArgumentException();
        }
    }

    R(int a) {
        this(a, DEF_B);
    }

    public int getProduct() {
        return a * b;
    }
}