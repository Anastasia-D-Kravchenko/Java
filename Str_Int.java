public class Str_Int{
   public static void main(String[] args) {
       int e = 1_500_000_000;
       int f = 1_500_000_000;
       System.out.println(e + f); // Integer overflow
       System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
       System.out.println("Integer.MIN_VALUE = " + Integer.MAX_VALUE);
   }
}