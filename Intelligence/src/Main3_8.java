public class Main3_8 {
    public static void main ( String [] args ) {
        System . out . println (" While loop :") ;
        int i = 0;
        while ( i < 0) {
            System . out . println (" Loop : " + ( i +1) ) ;
            System . out . println ("i = " + i ) ;
            i ++;
        }
        System . out . println ("\nDo - while loop :") ;
        int j = 0;
        do {
            System . out . println (" Loop : " + ( j +1) ) ;
            System . out . println ("j = " + j ) ;
            j ++;
        } while ( j < 0) ;
        System . out . println ("\nFor loop :") ;
        for (int k = 0; k < 0; k ++) {
            System . out . println (" Loop : " + ( k +1) ) ;
            System . out . println ("k = " + k ) ;
        }
    }
}
