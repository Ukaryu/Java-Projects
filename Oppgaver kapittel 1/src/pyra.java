import easyIO.Out;

/**
 * Created by Martin on 31.08.2014.
 */
public class pyra {
    public static void main(String[] args) {
        final int BREDDE = 10;
        Out skjerm = new Out();

        skjerm.outln("a", BREDDE, Out.CENTER);
        skjerm.outln("a a", BREDDE, Out.CENTER);
        skjerm.outln("a b a", BREDDE, Out.CENTER);
        skjerm.outln("a c c a", BREDDE, Out.CENTER);
        skjerm.outln("a d f d a", BREDDE, Out.CENTER);


    }
}
