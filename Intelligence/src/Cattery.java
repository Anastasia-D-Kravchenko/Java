public class Cattery {
    private static int nextId = 1;
    private int id;
    private String name;
    private Cat[][] litters;
    public Cattery(String name) {
        this.id = nextId++;
        this.name = name;
        litters = new Cat[0][];
    }
    public void addLitter(Cat[] litter) {
        Cat parents = litter[0].mother;
        for (Cat cat : litter) {
            if (cat.mother != parents || cat.father != litter[0].father) {
                System.out.println("Error: Cats in the litter must have the same parents.");
                return;
            }
        }
        Cat[][] newLitters = new Cat[litters.length + 1][];
        System.arraycopy(litters, 0, newLitters, 0, litters.length);
        newLitters[litters.length] = litter;
        litters = newLitters;
    }
    public void show() {
        System.out.println("Cattery name: " + name);
        System.out.println("Number of litters: " + litters.length);
        for (int i = 0; i < litters.length; i++) {
            System.out.println("Litter " + (i + 1) + ":");
            for (Cat cat : litters[i]) {
                cat.show();
            }
            System.out.println();
        }
    }
}