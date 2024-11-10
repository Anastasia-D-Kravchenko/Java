public class Main1 {
    public static void main(String[] args) {
        int val1 = 3;
        if (val1 < 5)
            System.out.println("it works just fine");
        else
            System.out.println("I would like to ...");
            System.out.println("... print this message only if the condition is not met");
        int val2 = 3;
        if (val2 < 5) {
            System.out.println("it works just fine");
        }else {
            System.out.println("I would like to ...");
            System.out.println("... print this message only if the condition is not met");
        }
    }
}
