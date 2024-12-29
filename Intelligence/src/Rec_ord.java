public class Rec_ord {
    static final class Teacher{
        private final int id;
        Teacher(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
        @Override
        public String toString() {
            return String.format("Teacher[id=%s]", id);
        }
    }
    record Student(int id, String name, int age) {}
}

class cally1{
    public static void main(String[] args) {
        Rec_ord.Teacher t1 = new Rec_ord.Teacher(1);
        System.out.println(t1);
        Rec_ord.Teacher t3 = new Rec_ord.Teacher(3);
        System.out.println(t3);
        Rec_ord.Student t2 = new Rec_ord.Student(2, "Toto", 19);
        System.out.println(t2);
        System.out.println(t2.id());
    }
}
