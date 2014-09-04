/**
 * Created by Martin on 02.09.2014.
 */
import easyIO.*;
public class kaskade {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();
        int antall;



        do {
            skjerm.out("Vennligst skriv inn et heltall: ");
            antall = tast.inInt();

            if (antall < 50) {
                skjerm.outln("Mindre enn 50");
            } else if (antall < 75) {
                skjerm.outln("Minst 50 og mindre enn 75");
            } else if (antall < 100) {
                skjerm.outln("Minst 75 og mindre enn 100");
            } else if (antall < 125) {
                skjerm.outln("Minst 100 og mindre enn 125");
            } else if (antall < 150) {
                skjerm.outln("Minst 125 og mindre enn 150");
            } else {
                skjerm.outln("Minst 150");
            }

            skjerm.outln();

        } while (antall != 0);
    }
}
