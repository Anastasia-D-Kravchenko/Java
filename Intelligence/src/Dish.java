class Dish {
    String name;
    int numberOfPortions;
    boolean isWarm;
    public Dish(String name, int numberOfPortions, boolean isWarm) {
        this.name = name;
        this.numberOfPortions = numberOfPortions;
        this.isWarm = isWarm;
    }
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", numberOfPortions=" + numberOfPortions +
                ", isWarm=" + isWarm +
                '}';
    }
    public void takeAPortion() {
        if (numberOfPortions > 0) {
            numberOfPortions--;
            System.out.println("One portion of " + name + " taken.");
        } else {
            System.out.println("No more portions of " + name + " left.");
        }
    }
}
class Pierogi extends Dish {
    String typeOfFilling;
    public Pierogi(String name, int numberOfPortions, boolean isWarm, String typeOfFilling) {
        super(name, numberOfPortions, isWarm);
        this.typeOfFilling = typeOfFilling;
    }
    @Override
    public String toString() {
        return "Pierogi{" +
                "typeOfFilling='" + typeOfFilling + '\'' +
                "} " + super.toString();
    }
}
class Barszcz extends Dish {
    String barszczType;
    public Barszcz(String name, int numberOfPortions, boolean isWarm, String barszczType) {
        super(name, numberOfPortions, isWarm);
        this.barszczType = barszczType;
    }
    @Override
    public String toString() {
        return "Barszcz{" +
                "barszczType='" + barszczType + '\'' +
                "} " + super.toString();
    }
}