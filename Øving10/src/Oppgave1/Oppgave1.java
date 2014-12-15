package Oppgave1;

import easyIO.Out;

/**
 * Created by Martin on 12.11.2014.
 */
public class Oppgave1 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        Firkant f = new Firkant();
        PilOpp p = new PilOpp();
        Sirkel s = new Sirkel();

        Tegnbar tabell [] = {f, p, s};

        for (Tegnbar elem : tabell){
            elem.tegnOpp(skjerm);
        }



    }
}
