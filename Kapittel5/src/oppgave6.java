/**
 * Created by Martin on 17.09.2014.
 */
import easyIO.*;

import java.util.*;

public class oppgave6 {

    public static void main(String[] args) {
        In tastatur = new In();
        Out skjerm  = new Out();

        int antallDeltakere = 5;
        double[] sluttider = new double[antallDeltakere];

        for (int i = 0; i < antallDeltakere; i ++) {

            skjerm.out("Sluttid for " + (i+1) + ". deltaker: ");
            double sluttid = tastatur.inDouble();

            if (i == 0) {
                sluttider[i] = sluttid;

            } else {
                // må finne riktig plassering
                boolean plassert = false;
                for (int j = 0; j < i; j++) {
                    if (sluttid < sluttider[j]) {

                        // skyver tidene herfra og ut nedover ett hakk
                        // starter bakerst
                        for (int k = i; k > j; k--) {
                            sluttider[k] = sluttider[k-1];
                        }

                        // setter inn ny sluttid på riktig plass
                        sluttider[j] = sluttid;
                        plassert = true;
                        break;
                    }
                }

                // ny sluttid skal inn til slutt
                if(!plassert) sluttider[i] = sluttid;
            }

            // skriver ut foreløpige sluttider i stigende rekkefølge:
            for (int j = 0; j < i+1; j++) {
                skjerm.outln(sluttider[j],2);
            }
        }
    }
}