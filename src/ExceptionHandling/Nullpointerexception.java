package ExceptionHandling;

public class Nullpointerexception {
    public static void main(String[] args) {
        String s1 = "sandy";
        String s2 = null;
        try {
            System.out.println("s1 length is :"+s1.length());

            System.out.println("s2 length is :"+s2.length());
        } catch (Exception e) {
            System.out.println("length of s2 is :"+e.getMessage());
        }
    }
}
