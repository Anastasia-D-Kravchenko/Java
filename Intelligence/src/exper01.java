public class exper01 {
    public static void main(String[] args) {
//        trying e = new trying();
//        e.show("\n");
//        trying e2 = new trying();
//        e.show("\n");
//        new trying();
//        e.show("\n");
//        trying.show("try");
        trying.show("try");
        new second("x");
    }
}
class trying{
    {
        show("hi");
    }
    static {
        show("hello");
    }
    trying(String s) {
        show("Good day");
    }

    public static void show(String arg) {
        System.out.println(arg);
    }
}

record second(String s) {
}