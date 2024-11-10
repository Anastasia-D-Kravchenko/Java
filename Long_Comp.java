public class Long_Comp{
   public static void main(String[] args) {
       boolean c = false;
       boolean d = true;
       System.out.println(c && d); // AND
       System.out.println(c || d); // OR
       System.out.println(c ^ d); // XOR
       c = true;
       d = false;
       System.out.println(c && d);
       System.out.println(c || d);
       System.out.println(c ^ d);
       c = true;
       d = true;
       System.out.println(c && d);
       System.out.println(c || d);
       System.out.println(c ^ d);
       c = false;
       d = false;
       System.out.println(c && d);
       System.out.println(c || d);
       System.out.println(c ^ d);
   }
}