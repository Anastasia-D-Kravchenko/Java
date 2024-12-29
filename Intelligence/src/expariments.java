public class expariments {
    public static void main(String[] args) {
        expariments2 exp = new expariments2("hi2");
        exp.str = "hi1";
        exp.numb = 5;
        exp.expy(exp);
        expariments2.expy(exp);
        exp.expy1();
        System.out.println(exp);
        int count = 0;
        count = expariments2.count(count);
        expariments2.count(count);
        expariments2.info();
    }
}
class expariments2 {
    static String str;
    int numb;
    static int count;
    public expariments2(String o) {
        str = o;
        System.out.println(str);
        System.out.println(this.str);
    }
    public static void expy(expariments2 x) {
        System.out.println(x.str + " no");
    }
    public void expy1() {
        System.out.println(this.str + " yes");
    }
    static int count(int countP){
        count = countP + 1;
        return count;
    }
    static void info(){
        System.out.println("Your count: " + count);
    }
    @Override
    public String toString() {
        return "[" + str + ", " + numb + "]";
    }
}
