public class SingletonExample {
    public static void main(String[] args) {
        // Lazy Initialization Singleton
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        // Eager Initialization Singleton
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        // Check if they are the same objects
        System.out.println("Lazy Singleton instances are the same: " + (lazySingleton1 == lazySingleton2));
        System.out.println("Eager Singleton instances are the same: " + (eagerSingleton1 == eagerSingleton2));
    }
}

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor to prevent direct instantiation
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent direct instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}