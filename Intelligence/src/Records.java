import java.util.Objects;

public class Records {
    public void main(String[] args) {
        Car c = new Car("Toyota", "Camry");
        System.out.println(c);

        Motorcycle m1 = new Motorcycle("Kawasaki", "Vulcan");
        Motorcycle m2 = new Motorcycle("Kawasaki", "Vulcan");

        System.out.println(m1);
        System.out.println(m1.hashCode() + " " + m2.hashCode());
        System.out.println(m1.equals(m2));
        System.out.println(m1.make() + " " + m1.model());
    }
    final class Car {
        private final String make;
        private final String model;

        Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        @Override
        public int hashCode() {
            return Objects.hash(make, model);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || !(other instanceof Car)) return false;
            Car c = (Car) other;
            return Objects.equals(make, c.make) && Objects.equals(model, c.model);
        }

        @Override
        public String toString() {
            return String.format("Car[make=%s, model=%s]", make, model);
        }

        public String make() { return make; }
        public String model() { return model; }
    }

    record Motorcycle (String make, String model) {}
}