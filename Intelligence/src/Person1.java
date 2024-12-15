public class Person1 {
    private final String name;
    private final int birthYear;
    public Person1(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person1(String name) {
        this(name, 1990);
    }
    public String getName() {
        return name;
    }
    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }
    public static Person1 getOlder(Person1 p1, Person1 p2) {
        return p1.birthYear < p2.birthYear ? p1 : p2;
    }
    public static Person1 getOldest(Person1[] people) {
        Person1 oldest = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].birthYear < oldest.birthYear) {
                oldest = people[i];
            }
        }
        return oldest;
    }
}