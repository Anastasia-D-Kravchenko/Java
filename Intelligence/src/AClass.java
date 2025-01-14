class Mainy1 extends AClass {
    public static void main(String[] args) {
        AClass a = new AClass("B");
        AClass b = new Mainy1(1);
        Mainy1 c = new Mainy1(22);
        System.out.println(a.met() + " " + b.met() + " " + c.met());
    }
    int num;
    Mainy1(int i) {
        this("A" + i); // Call the constructor that takes a String
        num = i;
    }
    Mainy1(String s) {
        super(s);
    }

    int met() {
        return super.met() + 2;
    }
}

class AClass {
    String str;

    AClass(String s) {
        str = s;
    }

    int met() {
        return str.length();
    }
}