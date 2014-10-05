import easyIO.*;

import java.util.Random;

/**
 * Created by Martin on 05.10.2014.
 */

public class oppgave3 {
    public static void main(String[] args) {
        terningKastSimulator tks = new terningKastSimulator();

        tks.terning();
    }
}

class terningKastSimulator{

    int [] terningKast(){
        Random terning = new Random();
        int kast [] = new int[100];
        for (int i = 0; i < kast.length; i++){
            kast [i] = terning.nextInt(6) + 1;
        }

        return kast;
    }

    int [] antallAvKast(){
        int antall [] = new int[6];
        for (int i = 0; i < terningKast().length; i++) {
            antall[0] += terningKast()[i] == 1 ? 1 : 0;
            antall[1] += terningKast()[i] == 2 ? 1 : 0;
            antall[2] += terningKast()[i] == 3 ? 1 : 0;
            antall[3] += terningKast()[i] == 4 ? 1 : 0;
            antall[4] += terningKast()[i] == 5 ? 1 : 0;
            antall[5] += terningKast()[i] == 6 ? 1 : 0;
        }
        return antall;
    }

    double gjennomsnittAvKast(){
        double sum = 0;
        for (double elem : terningKast()){
            sum += elem;
        }

        double gjennomsnittAvKast = sum / 100;

        return gjennomsnittAvKast;
    }

    int antallKastSeks(){
        int antallKast = 0;
        for (int i = 0; i < terningKast().length && terningKast()[i]!=6; i++){
            antallKast = i + 2;
        }

        antallKast = antallKast == 0 ? 1 : antallKast;

        return antallKast;
    }

    int storstAntallVerdier(){
        int maks = antallAvKast()[0];
        int terningVerdi = 0;
        for (int i = 0; i < antallAvKast().length; i++){
            while (maks < antallAvKast()[i]){
                maks = antallAvKast()[i];
                terningVerdi = i + 1;
            }
        }

        return terningVerdi;
    }

    public void terning(){
        Out skjerm = new Out();
        In tast = new In();

        skjerm.outln("TERNINGKAST SIMULATOR", 80, Out.CENTER);
        skjerm.outln();

        int teller = 19;
        for (int i = 0; i < terningKast().length; i++){
            skjerm.out(terningKast() [i], 4);

            while (i == teller){
                skjerm.outln();
                teller += 20;
            }
        }

        skjerm.outln();
        skjerm.outln("Antall kast: 100");

        for (int i = 0; i < 6; i++){
            skjerm.out("Antall " + (i + 1) + "-ere: " );
            skjerm.outln(antallAvKast()[i], 4);
        }

        skjerm.out("Gjennomsnitt av kast: ");
        skjerm.outln(gjennomsnittAvKast() , 3);

        skjerm.outln("Antall kast før første 6-er: " + antallKastSeks());

        skjerm.outln("Terningverdien det var mest av: " + storstAntallVerdier());
    }
}
