import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class oldWriteFile {
    public static void main(String[] args){
        String text = "";
        try{
            FileInputStream fis = new FileInputStream("task1.txt");
            int c;
            while ((c = fis.read()) != -1){
                text += (char) c;
            }
            fis.close();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(text);
        try{
            FileOutputStream fis = new FileOutputStream("task2.2.txt");
            for (int i = 0; i < text.length(); i++){
                fis.write(text.charAt(i));
            }
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
