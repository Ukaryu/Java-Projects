package oppgave3;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String[] args) {
        Out skjerm = new Out();
        //Arbitrary array
        int a [] = {1,2,3,4,5,6,7,8,9,0};

        snitt s = new snitt();
        double snittet = s.gjennomsnitt(a);

        skjerm.outln(snittet);

    }
}
