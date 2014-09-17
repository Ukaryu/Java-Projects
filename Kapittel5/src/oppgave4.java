import easyIO.*;
/**
 * Created by Martin on 08.09.2014.
 */
public class oppgave4 {

    public static void main(String[] args) {
        Out skjerm = new Out();

        int i = 0;
        int [][] soltimer = {
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3}, //soltimer for januar
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3},
                {3, 4, 5, 0, 2, 4, 2, 3, 0, 4, 0, 3, 0, 2, 0, 4, 2, 3, 5, 2, 3, 4, 2, 3, 2, 4, 2, 3, 0, 2, 3}
        };

        int antallMåneder = soltimer.length;
        int antallDager = soltimer[i].length;
        int årsSum = 0;

        for(i = 0; i < antallMåneder; i++) {

            for (int j = 0; j < antallDager; j++){
                årsSum += soltimer [i][j];
            }

        }

        int årsSnitt = årsSum / 372;
        int mndSntt = årsSum / 12;

        skjerm.outln("Summen av alle soltimer i året er: " + årsSum);
        skjerm.outln();
        skjerm.outln("Gjennomsnittet av soltimer per dag er: " + årsSnitt);
        skjerm.outln();
        skjerm.outln("Gjennomsnittet av soltimer per måned er: " + mndSntt);


    }
}
