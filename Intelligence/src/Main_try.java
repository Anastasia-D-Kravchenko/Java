import javax.swing.*;
import java.awt.Color;
public class Main_try {

//    public static void main(String[] args) {
//        try_code code = new try_code(); // Initialize x and y during object creation
//        code.x = 5;
//        code.y = 10;
//        System.out.println(code.x);
//        System.out.println(code.y);
//        code.add(code); // Pass the 'code' object itself to modify its properties
//    }
//        public static void main(String[] args) {
//            VerySimple alice = new VerySimple(23, "Alice");
//            VerySimple bob = new VerySimple(21, "Bob");
//
//            alice.setAge(18);
//
//            System.out.println(alice.getName() + " " + alice.getAge());
//            System.out.println(bob.getName() + " " + bob.getAge());
//        }
//public static void main(String[] args) {
//    Person john = new Person("John", 1980);
//    Person mary = new Person("Mary", 1985);
//
//    System.out.println("Two Persons created: " + john + " and " + mary);
//
//    Person older = mary.isOlderThan(john) ? mary : john;
//    System.out.println("Older: " + older.getName() + " born in " + older.getYear());
//
//    String s = older + " is older";
//
//    // Uncomment the following line to display the message in a dialog box:
//    JOptionPane.showMessageDialog(null, s);
//
//    System.out.println(john);
//    System.exit(0);
//}
//public static void main(String[] args) {
//    try_code p = new try_code(); // Create a try_code object
//
//    p.x = 1; // Set initial x coordinate
//    p.y = 2; // Set initial y coordinate
//
//    p.info(); // Print current coordinates (Output: [1, 2])
//
//    p.setX(3); // Set x coordinate using setter
//    p.info(); // Print updated coordinates (Output: [3, 2])
//
//    System.out.println("x=" + p.getX() + "; " +  // Get and print coordinates
//            "y=" + p.getY()); // (Output: x=3; y=2)
//
//    try_code.infoStatic(p); // Print coordinates using static method (Output: [3, 2])
//
//    // Not recommended! Avoid using instance method (info) with static call.
//    // p.infoStatic(p);
//
//    p.scale(2, 3); // Scale by 2 in x and 3 in y
//    p.info(); // Print scaled coordinates (Output: [6, 6])
//
//    p.translate(1, -3); // Translate 1 unit right and 3 units down
//    p.info(); // Print translated coordinates (Output: [7, 3])
//}
//public static void main(String[] args) {
//    StatExample st = new StatExample(4.1);
//    st.setRate(4.1);
//    StatExample sa = new StatExample(10);
//    StatExample sb = new StatExample(16);
//    StatExample sc = new StatExample(20);
//
//    System.out.println(sc + "\n" + sb + "\n" + sa);
//}
//public static void main(String[] args) {
//    Stats e = new Stats();
//}
//public static void main(String[] args) {
//    Records records = new Records();
//    records.main(args);
//}

//    public static void main(String[] args) {
//        MyList list = new MyList();
//        list.addBack(4);
//        list.addBack(5);
//        list.addFront(3);
//        list.addFront(2);
//        list.addFront(1);
//
//        list.showList(); // Output: [1 2 3 4 5 ]
//        list.showListReversed(); // Output: [5 4 3 2 1 ]
//        System.out.println("\nsize = " + list.size()); // Output: 5
//    }
//    public static void main(String[] args) {
//        MyStack st = new MyStack();
//        st.push(4);
//        st.push(5);
//        st.push(6);
//
//        while (!st.empty()) {
//            System.out.println("popping " + st.pop());
//        }
//    }

//    public static void main(String[] args) {
//        ArrStack stack = new ArrStack(5); // Create a stack with maximum size 5.
//
//        for (int i = 1; i <= 5; ++i) {
//            stack.push(i * i); // Push squares of numbers from 1 to 5 (1, 4, 9, 16, 25).
//        }
//
//        while (!stack.empty()) {
//            System.out.print(stack.pop() + " "); // Pop and print elements in reverse order (25 16 9 4 1).
//        }
//        System.out.println();
//    }

//    public static void main(String[] args) {
//        MyQueue qS = new MyQueue(); // Create a new queue object.
//
//        for (double d = 0.5; d < 5; d += 1) {
//            qS.enqueue("" + d); // Enqueue strings representing double values (0.5, 1.5, 2.5, 3.5, 4.5).
//        }
//
//        while (!qS.empty()) {
//            System.out.print(qS.dequeue() + " "); // Dequeue and print elements in FIFO order (0.5 1.5 2.5 3.5 4.5).
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        Point pp = new Point(2, 1);
        Point pt = new Pixel();
        pt.x = 1;
        pt.y = 2;
        Pixel px = new Pixel(new Color(255, 51, 102));

        System.out.println("is 'pp' a Point? " + (pp instanceof Point)); // true
        System.out.println("is 'pp' a Pixel? " + (pp instanceof Pixel)); // false
        System.out.println("is 'pt' a Point? " + (pt instanceof Point)); // true
        System.out.println("is 'pt' a Pixel? " + (pt instanceof Pixel)); // true
        System.out.println("is 'px' a Point? " + (px instanceof Point)); // true
        System.out.println("is 'px' a Pixel? " + (px instanceof Pixel)); // true
        System.out.println("class of pp: " + pp.getClass().getName()); // Point
        System.out.println("class of pt: " + pt.getClass().getName()); // Pixel
        System.out.println("class of px: " + px.getClass().getName()); // Pixel

        // Pixel is a Point; we can translate or scale it
        px.translate(5, 4).scale(2, 3).translate(-1, -3);
        System.out.println("pp: " + pp); // [2, 1]
        System.out.println("pt: " + pt); // [1, 2](r=0,g=0,b=0)
        System.out.println("px: " + px); // [9, 9](r=255,g=51,b=102)
        System.out.println("Color px : " + px.getColor()); // java.awt.Color[r=255,g=51,b=102]
        // Casting required!
        System.out.println("Color pt : " + ((Pixel) pt).getColor()); // java.awt.Color[r=0,g=0,b=0]
    }
}