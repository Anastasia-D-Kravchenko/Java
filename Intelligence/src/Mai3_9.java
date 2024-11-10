public class Mai3_9 {
    public static void main ( String [] args ) {
        long result = 1;
        int u = 0;
        while ( u ++ <= 100) {
            System . out . println ( result ) ;
            result *= 2;
        }
         result = 1;
         u = 0;
        do {
            System . out . println ( result ) ;
            result *= 2;
        }while ( u ++ <= 100);
         result = 1;
         u = 0;
        for (u=0;u<=100;u ++) {
            System . out . println ( result ) ;
            result *= 2;
        }
    }
}
