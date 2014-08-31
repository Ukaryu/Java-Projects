/**
 * Created by Martin on 31.08.2014.
 */
import easyIO.*;
public class kvadrattall {
    public static void main(String[] args) {
        Out skjerm = new Out();
        int i = 1;
        int kvadrat = 1 * 1;

        while (kvadrat <= 100){
            skjerm.outln("Kvadratet av " + i + " er " + kvadrat);
            i = ++i;
            kvadrat = i * i;

        }
    }
}
