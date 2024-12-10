public class try_code {
//    public int x, y;
//
//    public void add(try_code a) {
//        a.x = x;
//        a.y = y;
//        System.out.println(a.x);
//        System.out.println(a.y);
//    }
public int x, y;

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void scale(int sx, int sy) {
        x *= sx;
        y *= sy;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int yy) {
        y = yy;
    }

    // getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }

    // static
    public static void infoStatic(try_code p) {
        System.out.println("[" + p.x + "," + p.y + "]");
    }

    // non-static
    public void info() {
        System.out.println("[" + this.x + "," + y + "]");
    }
}

