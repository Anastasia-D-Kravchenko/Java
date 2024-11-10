public class Main6 {
    public static void main(String[] args) {
        int pinkColor = 255<<16 |  192<<8 | 203;
        System.out.println(pinkColor);
        int aquamarineColor = 8388564;
        int red = aquamarineColor>>16&0xFF;
        int green = aquamarineColor>>8&0xFF;
        int blue = aquamarineColor&0xFF;
        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
    }
}
