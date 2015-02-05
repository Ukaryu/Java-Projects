package oppgave2;

import easyIO.Out;

/**
 * Created by Martin on 16.12.2014.
 */
public class Prog1 {
    public static void main(String [] args){
        Out skjerm = new Out();
        ABC pek = new ABC();

        skjerm.outln(pek.objekt(14));
        pek.dobbelt();
        skjerm.outln(pek.dobbelt());


    }
}

