class Rocket {
    private String name;
    private int fuelWeight;
    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }
    public void refuel() {
        fuelWeight += (int) (Math.random() * 101) + 100;
        System.out.println(name + " refuels " + fuelWeight);
    }
    public void start() throws Exception {
        System.out.println(name + " starts with the refuels: " + fuelWeight);
        if (fuelWeight < 1000) {
            throw new Exception("Launch cancelled - insufficient fuel level");
        }
        System.out.println("Rocket " + name + " launched!");
    }
}