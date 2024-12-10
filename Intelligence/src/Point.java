import java.awt.Color;
public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this(x, 0);
    }

    public Point() {
        this(0, 0);
    }

    public Point copy() { // Create a copy of the Point object
        return new Point(x, y);
    }

    public Point translate(int dx, int dy) {
        x += dx;
        y += dy;
        return this;
    }

    public Point scale(int sx, int sy) {
        x *= sx;
        y *= sy;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
