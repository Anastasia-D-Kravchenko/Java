import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class writeFile {
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
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter("task2.txt"));
            br.write(text);
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
