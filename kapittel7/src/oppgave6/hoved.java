package oppgave6;

import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String[] args){
        Out skjerm = new Out();
        In tast = new In();
        skihopp sh = new skihopp();

        skjerm.outln("Totale stilpoeng blir på: " +  sh.poengberegning(tast));

    }
}
