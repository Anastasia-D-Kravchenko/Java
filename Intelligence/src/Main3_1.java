import java . util . Scanner ;
public class Main3_1 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        int option = scanner . nextInt () ;
        switch ( option ) {
            case 1:
                System . out . println (" Option 1 selected ") ;
                break ;
            case 2:
                System . out . println (" Option 2 selected ") ;
                break ;
            case 3 , 4 , 5 , 6: // Available in Java 14 and later versions
                System . out . println (" Option 3 selected ") ;
                break ;
            default :
                System . out . println (" Invalid option selected ") ;
        }
    }
}
