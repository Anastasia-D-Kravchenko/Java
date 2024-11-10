public class ASCII_not_ACSII{
   public static void main(String[] args) {
       System.out.println('!' + '!'); // ASCII value of '!' (33) + ASCII value of '!' (33) = 66
       System.out.println((char)('!' + '!')); // Character with ASCII value 66 (B)
   }
}