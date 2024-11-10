import java . util . Scanner;
public class Main3_1_1 {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner ( System . in ) ;
        int option = scanner . nextInt () ;
        String result = switch ( option ) {
            case 1 -> " Option 1 selected ";
            case 2 ,5 -> " Option 2 selected ";
            case 3 -> " Option 3 selected ";
            default -> " Invalid option selected ";
        };
        System . out . println ( result ) ;
    }

}
