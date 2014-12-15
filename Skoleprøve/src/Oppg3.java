/**
 * Created by Martin on 27.10.2014.
 */
public class Oppg3 {
    public static void main(String[] args) {
        int c = 5;

        do {
            System.out.print(c);
            c--;
        } while (c > 5);

        while (c > 0) {
            c--;
            System.out.println(" " + c);
        }

        System.out.println(c);
    }
}
