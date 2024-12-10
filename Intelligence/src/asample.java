public class asample {
    private int a;
    private asample[] as;
    private static int size;

    public asample(int a) {
        this.a = a;
        this.as = new asample[10]; // Initial capacity of 10, can be adjusted
        this.size = 0;
    }

    public static void add(asample as) {
        if (size < as.as.length) {
            as.as[size++] = as;
        } else {
            // Handle array overflow, e.g., resize the array
            System.out.println("Array is full");
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(as[i].a);
        }
    }
}