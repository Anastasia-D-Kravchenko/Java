public class Cat {
    private static int nextId = 1;
    private int id;
    String name;
    private int birthDay, birthMonth, birthYear;
    Cat mother;
    Cat father;
    public Cat(String name, int birthDay, int birthMonth, int birthYear, Cat mother, Cat father) {
        this.id = nextId++;
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
    }
    public boolean isAdult(int currentDay, int currentMonth, int currentYear) {
        if (currentYear - birthYear > 1) {
            return true;
        } else if (currentYear == birthYear) {
            if (currentMonth > birthMonth) {
                return true;
            } else if (currentMonth == birthMonth && currentDay >= birthDay) {
                return true;
            }
        }
        return false;
    }
    public void show() {
        System.out.println("Cat ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Mother: " + (mother != null ? mother.name : "Unknown"));
        System.out.println("Father: " + (father != null ? father.name : "Unknown"));
    }
    public void showParents() {
        if (mother != null) {
            System.out.println("Mother:");
            mother.show();
        }
        if (father != null) {
            System.out.println("Father:");
            father.show();
        }
    }
}