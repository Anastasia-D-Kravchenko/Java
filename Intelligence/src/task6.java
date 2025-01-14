import java.io.*;
public class task6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
        for(int i=0; i<10;i++){
            bw.write(i+"\n");
        }
        bw.close();
        int sum = 0;
        BufferedReader read = new BufferedReader(new FileReader("number.txt"));
        while(read.readLine()!=null){
            sum += Integer.parseInt(read.readLine());
        }
        System.out.println(sum);
        read.close();
    }
}
