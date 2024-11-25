public class Main7_1 {
    public static void main ( String [] args ) {
        System . out . println ( areBothOdd (3 , 4) ) ;
        System . out . println ( areBothOdd (3 , 5) ) ;
    }
    public static boolean areBothOdd ( int a , int b ) {
        if ( a % 2 != 0 && b % 2 != 0)
            return true ;
        else
            return false ;
    }
}
