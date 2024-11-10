public class Main {
    public static void main(String[] args){
                boolean isWindy = true;
                boolean isRainy = true;
                if (isWindy && isRainy) {
                    System.out.println("The weather is awful today!");
                } else if (isWindy || isRainy) {
                    System.out.println("It could have been worse...");
                } else {
                    System.out.println("The weather is ok today.");
                }
    }
}
