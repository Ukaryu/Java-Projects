/**
 * Created by Martin on 17.09.2014.
 */
import easyIO.*;

import java.util.*;

public class oppgave6 {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        double resListe [];
        resListe [i] = tast.inDouble();
        for (double elem:resListe){
            skjerm.outln(elem);
        }

        for (int i = 0; i < resListe.length; i++){
            resListe [i] = tast.inDouble();
            Arrays.sort(resListe);
            for (double elem:resListe){
                skjerm.outln(elem);
            }
        }


    }
}
