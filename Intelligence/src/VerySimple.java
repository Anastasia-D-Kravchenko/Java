public class VerySimple {
    private int age;
    private String name;

    // Constructor
    public VerySimple(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Getter (with no corresponding setter)
    public String getName() {
        return name;
    }
}