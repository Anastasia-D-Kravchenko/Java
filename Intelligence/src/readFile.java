import java.io.BufferedReader;
import java.io.FileReader;

public class readFile {
    public static void main(String[] args){
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
            String s;
            while((s = br.readLine())!=null){
                text += s + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
