public class extention {
    protected int x, y;
    public extention(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString() {
        return "[" +x+"," + y+ "]";
    }
}

class extention2 extends extention {
    private extention extention;
    public extention2(int x1, int y1, extention extention) {
        super(x1, y1);
        this.extention = extention;
    }
    public int getZ() {
        return x+y;
    }
    @Override
    public int getY() {
        return x;
    }
//    @Override
//    public String toString() {
//        return "{" +x+"," + y+ "} for " + extention;
//    }
}

class cally3{
    public static void main(String[] args) {
        extention x = new extention(1,2);
        System.out.println(x);
        System.out.println(x.getX());
        System.out.println(x.getY());
//        System.out.println(x.getZ());
        extention2 y = new extention2(2,1,x);
        System.out.println(y);
        System.out.println(y.getX());
        System.out.println(y.getY());
        System.out.println(y.getZ());
    }
}