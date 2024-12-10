import java.awt.*;

public class Pixel extends Point {
    private Color color;

    public Pixel(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Pixel(Color color) {
        this(0, 0, color);
    }

    public Pixel() {
        this(0, 0, Color.BLACK);
    }

    @Override
    public Pixel copy() { // Override copy() to create a copy of Pixel
        return new Pixel(x, y, new Color(color.getRed(), color.getGreen(), color.getBlue())); // Create a new Color object to avoid reference issues
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + "(r=" + color.getRed() +
                ",g=" + color.getGreen() + ",b=" +
                color.getBlue() + ")";
    }
}
