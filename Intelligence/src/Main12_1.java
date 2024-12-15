public class Main12_1 {
    private final int indexNumber ;
    private static int counter = 10000;
    public Main12_1 () {
        indexNumber = counter ++;
    }
    public int getIndexNumber () {
        return indexNumber ;
    }

}
