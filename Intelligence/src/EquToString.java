public class EquToString {

    public static void main(String[] args) {
        PersonGood johny = new PersonGood("John", 1980);
        PersonGood john = new PersonGood("John", 1980);
        PersonBad billy = new PersonBad("Bill", 1980);
        PersonBad bill = new PersonBad("Bill", 1980);
        System.out.println(johny);
        System.out.println(john);
        if (johny.equals(john))
            System.out.println("johny == john");
        else
            System.out.println("johny != john");
        System.out.println(billy);
        System.out.println(bill);
        if (billy.equals(bill))
            System.out.println("billy == bill");
        else
            System.out.println("billy != bill");
        System.out.println("johny: " + johny);
        System.out.println("billy: " + billy);
    }
}

class PersonBad {
    private String name;
    private int byear;

    PersonBad(String n, int y) {
        name = n;
        byear = y;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return byear;
    }
//    @Override
//    public String toString() {
//        return name + "(" + byear + ")";
//    }
}

class PersonGood {
    private String name;
    private int byear;

    PersonGood(String n, int y) {
        name = n;
        byear = y;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return byear;
    }

//    @Override
//    public String toString() {
//        return name + "(" + byear + ")";
//    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null || getClass() != ob.getClass()) return false;
//        System.out.println(getClass());
        PersonGood p = (PersonGood) ob;
        return name.equals(p.name) && byear == p.byear;
    }
//    public boolean equals(PersonGood ob) {
//        if (ob == null || getClass() != ob.getClass()) return false;
//        return name.equals(ob.name) && byear == ob.byear;
//    }
}