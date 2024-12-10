public class Main11_1 {
    public static void main ( String [] args ) {
// ...
        Point2D point1 = new Point2D (3 , 10) ;
        Point2D point2 = new Point2D (4 , 2) ;
        Point2D point3 = new Point2D ( -3 , 4) ;
        System . out . println ( Point2D . distance ( point1 , point2 ) ) ;
        System . out . println ( Point2D . distance ( point1 , point3 ) ) ;
        System . out . println ( Point2D . distance ( point2 , point3 ) ) ;
        Point2D point4 = Point2D . randomPoint () ;
        Path2D path = new Path2D (10) ;
        path . addPoint ( point1 ) ;
        path . addPoint ( point2 ) ;
        path . addPoint ( point3 ) ;
        path . addPoint ( point4 ) ;
        path . print () ;
        Path2D . print ( path ) ;
// ...
        // Sort points by distance from (0,0)
        Path2D.sortByDistance(path);
        System.out.println("Points sorted by distance:");
        path.print();
        // Scale points
        path.scale(2.0);
        System.out.println("Scaled points:");
        path.print();
        // Split the path
        Path2D[] splitPaths = Path2D.split(path);
        System.out.println("First split path:");
        splitPaths[0].print();
        System.out.println("Second split path:");
        splitPaths[1].print();
    }
}
