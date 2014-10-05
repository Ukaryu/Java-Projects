import easyIO.*;

import java.util.Random;

/**
 * Created by Martin on 05.10.2014.
 */

public class oppgave3 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        Random terning = new Random();
        int kast [] = new int[100];
        int antall [] = new int[6];

        int teller = 19;

        skjerm.outln("TERNINGKAST SIMULATOR", 80, Out.CENTER);
        skjerm.outln();

        for (int i = 0; i < kast.length; i++){
            kast [i] = terning.nextInt(6) + 1;
            skjerm.out(kast [i], 4);

            while (i == teller){
                skjerm.outln();
                teller += 20;
            }

            antall[0] += kast[i] == 1 ? 1 : 0;
            antall[1] += kast[i] == 2 ? 1 : 0;
            antall[2] += kast[i] == 3 ? 1 : 0;
            antall[3] += kast[i] == 4 ? 1 : 0;
            antall[4] += kast[i] == 5 ? 1 : 0;
            antall[5] += kast[i] == 6 ? 1 : 0;
        }

        skjerm.outln();
        skjerm.outln("Antall kast: 100");

        for (int i = 0; i < 6; i++){
            skjerm.out("Antall " + (i + 1) + "-ere: " );
            skjerm.outln(antall[i], 4);
        }

        double sum = 0;
        for (double elem : kast){
            sum += elem;
        }

        double gjennomsnittAvKast = sum / 100;

        skjerm.out("Gjennomsnitt av kast: ");
        skjerm.outln(gjennomsnittAvKast , 3);

        int antallKast = 0;
        for (int i = 0; i < kast.length && kast[i]!=6; i++){
            antallKast = i + 2;
        }

        antallKast = antallKast == 0 ? 1 : antallKast;

        skjerm.outln("Antall kast før første 6-er: " + antallKast);

        int maks = antall[0];
        int terningVerdi = 0;
        for (int i = 0; i < antall.length; i++){
            while (maks < antall[i]){
                maks = antall[i];
                terningVerdi = i + 1;
            }
        }

        skjerm.outln("Terningverdien det var mest av: " + terningVerdi);
    }
}

