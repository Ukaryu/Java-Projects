/**
 * Created by Martin on 19.09.2014.
 */
public class oppgave2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println();

        String s = new String("Test");
        String t = new String("Test");
        System.out.println(s == t);
        System.out.println(s != t);
        System.out.println(s.equals(t));
    }
}

