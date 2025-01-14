public class superThis {
    public superThis() {
        System.out.println("superThis");
    }
    public superThis(int x) {
        System.out.println("superThis"+x);
    }
    public static void main(String[] args) {
        superThis2 superThis2 = new superThis2();
        superThis2 superThis3 = new superThis2(4);
    }
}

class superThis2 extends superThis {
    public superThis2() {
        super();
        System.out.println("superThis2");
    }
    public superThis2(int x){
        this();
        System.out.println(23%12%6/2);
    }
    public void hi(){
        System.out.println("super");
    }
//    public static int hi(){
//        this();
//    }
}