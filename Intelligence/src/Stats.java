public class Stats {
    private static int sino;  // Initialized in non-static block
    private static int siyes = 2;
    private static int fin = 3;  // Initialized in static block

    { // nonstatic initialization block
        show(" nonstatic init");
        sino = 1;
    }

    static { // static initialization block
        show(" static init");
        fin = 4;  // Final variable must be initialized in static block
    }

    public Stats() { // Constructor
        show(" constructor");
    }

    private static void show(String mes) {
        System.out.println(mes + ":" +
                " sino=" + sino +
                " siyes=" + siyes +
                " fin=" + fin);
    }
}