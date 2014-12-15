package oppgave2;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String[] args) {
        Out skjerm = new Out();
        for (double i = 1; i < 7; i++){
            for (double j = 1; j < 7; j++){
                hypotenus.kvadrat(i,j);
                skjerm.outln(hypotenus.c, 2);
            }
        }
    }
}
