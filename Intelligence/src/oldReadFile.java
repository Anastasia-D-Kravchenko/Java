import java.io.FileInputStream;

public class oldReadFile {
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
    }
}
