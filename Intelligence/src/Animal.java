//class Animal {
//    public String name ;
//    public String species ;
//    public int numberOfLegs ;
//    public Animal ( String name , String species , int numberOfLegs ) {
//        this . name = name ;
//        this . species = species ;
//        this . numberOfLegs = numberOfLegs ;
//    }
//
//
//    public String toString () {
//        return " Name : " + name + "\t" + " Species : " + species + "\t" + " Number of legs : "
//                + numberOfLegs ;
//    }
//
//    public void bite() {}
//}
//class Snake extends Animal {
//    public boolean isVenomous ;
//    public Snake ( String name, String species, int numberOfLegs, String s, boolean b ) {
//        super ( name , " Snake ", 0) ;
//        this . isVenomous = isVenomous ;
//    }
//    public void bite () {
//        System . out . println ( isVenomous ? "You should get to the hospital!" :  " You ’re gonnabe ok!") ;
//    }
//    public String toString () {
//        return super . toString () + "\tVenomous : " + isVenomous ;
//    }
//}
public class Animal {
    protected String name;
    protected double weight;

    // no default constructor!
    public Animal(String n, double w) {
        name = n;
        weight = w;
    }

    public String getVoice() {
        return "?";
    }

    public static void voices(Animal[] animals) {
        for (Animal a : animals) {
            System.out.println(a + " " + a.getVoice());
        }
    }

    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}
class Dog extends Animal {
    public Dog(String n, double w) {
        super(n, w);
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }
}

class Caty extends Animal {
    public Caty(String n, double w) {
        super(n, w);
    }

    @Override
    public String getVoice() {
        return "Meow!";
    }
}

class Bird extends Animal {
    public Bird(String n, double w) {
        super(n, w);
    }

    @Override
    public String getVoice() {
        return "Tweet!";
    }
}
class AnimalTest {
    public static void main(String[] args) {
        // Create an array of Animal objects
//        Animal[] animals = new Animal[4];
//        animals[0] = new Dog("Sparky", 15.0);
//        animals[1] = new Caty("Whiskers", 5.0);
//        animals[2] = new Bird("Tweety", 0.2);
//        animals[3] = new Animal("Human", 1.0);
        Animal[] animals = {
                new Dog("Sparky", 15.0),
                new Caty("Whiskers", 5.0),
                new Bird("Tweety", 0.2),
                new Animal("Human", 1.0)
        };

        // Call the static voices method
        Animal.voices(animals);
    }
}