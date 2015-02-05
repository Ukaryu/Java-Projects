package oppgave3;

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

        for (double i = 0; i < 10000; i++){
            Prog1.settX(i);
        }


    }

    static double x = 0;

    static double settX(double y){
        Out skjerm = new Out();
        skjerm.outln(x);
        x = y;
        return x;
    }
}

