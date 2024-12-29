public class ArrStack {
    private int[] elems;
    private int top = 0;
    public ArrStack(int maxSize) {
        elems = new int[maxSize];
    }
    public void push(int e) {
        elems[top++] = e;
    }
    public int pop() {
        return elems[--top];
    }
    public boolean empty() {
        return top == 0;
    }
}

class ArrStackTest {
    public static void main(String[] args) {
        ArrStack stack = new ArrStack(10);
        for (int i = 0; i < 10; i++) {
            stack.push((i*i-27)/(i+1));
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}