import java.util.Arrays;
import java.util.Comparator;

public class Path2D {
    Point2D[] points;
    int size;
    public Path2D(int length) {
        points = new Point2D[length];
        size = 0;
    }
    public void addPoint(Point2D point) {
        if (size < points.length) {
            points[size++] = point;
        }
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(points[i].x + " " + points[i].y + " ");
            if ( i == size - 1 ) {
                System.out.println();
            }
        }
    }
    public static void print(Path2D path) {
        path.print();
    }
    public void scale(double factor) {
        for (int i = 0; i < size; i++) {
            points[i].x *= factor;
            points[i].y *= factor;
        }
    }
    public static Path2D[] split(Path2D path) {
        int mid = path.size / 2;
        Path2D[] paths = new Path2D[2];
        paths[0] = new Path2D(mid);
        paths[1] = new Path2D(path.size - mid);
        System.arraycopy(path.points, 0, paths[0].points, 0, mid);
        System.arraycopy(path.points, mid, paths[1].points, 0, path.size - mid);
        paths[0].size = mid;
        paths[1].size = path.size - mid;
        return paths;
    }
    public static void sortByDistance(Path2D path) {
        Point2D[] temp = new Point2D[path.size];
        System.arraycopy(path.points, 0, temp, 0, path.size);
        for (int i = 0; i < path.size - 1; i++) {
            for (int j = i + 1; j < path.size; j++) {
                if (Point2D.distance(temp[i], new Point2D(0, 0)) > Point2D.distance(temp[j], new Point2D(0, 0))) {
                    Point2D tempPoint = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempPoint;
                }
            }
        }
        System.arraycopy(temp, 0, path.points, 0, path.size);
    }
}
