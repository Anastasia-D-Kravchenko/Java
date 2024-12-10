//public class Person {
//
//    private String name;
//    private int birthYear; // Using camelCase for better readability
//
//    public Person(String name, int birthYear) {
//        this.name = name;
//        this.birthYear = birthYear;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getYear() { // Using getYear() instead of getBirthYear() for consistency
//        return birthYear;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (b. " + birthYear + ")";
//    }
//
//    public boolean isOlderThan(Person other) {
//        return birthYear < other.birthYear;
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class Person {

    private String name;
    private String idNumber;

    public Person(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Added a copy() method to create a copy of the Person object
    public Person copy() {
        return new Person(name, idNumber);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        Person p = (Person) other;
        return idNumber.equals(p.idNumber) &&
                name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return 17 * name.hashCode() + idNumber.hashCode();
    }

    @Override
    public String toString() {
        return name + "(" + idNumber + ")";
    }
}

