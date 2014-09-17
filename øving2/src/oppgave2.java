/**
 * Created by Martin on 06.09.2014.
 */
import easyIO.*;
public class oppgave2 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        int[] hel = new int[4];
        int maks = 0;
        int i;



        skjerm.outln("Skriv inn 3 heltall: ");
        for (i = 1; i < hel.length; i++) {
            hel[i] = tast.inInt();
        }


        for (i = 1; i < hel.length; i++) {
            if (hel[i] > maks) {
                maks = hel[i];
            }
        }

        skjerm.out("Største heltall er " + maks);



    }
}
