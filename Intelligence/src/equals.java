public class equals {
    private final static equals eq = new equals();
    private equals() {
        System.out.println("Done");
    }
    public static equals equal() {
        return eq;
    }
}

final class newy{
    public static void main(String[] args) {
        equals eq1 = equals.equal();
        equals eq2 = equals.equal();
        System.out.println(eq1.equals(eq2));
    }
}
