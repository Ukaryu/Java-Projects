package oppgave8;

import easyIO.*;

/**
 * Created by Martin on 18.12.2014.
 */
public class Hopprenn {
    Hopper deltakere [];
    In tast = new In();
    Out skjerm = new Out();

    Hopprenn(int antDeltakere){
        deltakere = new Hopper[antDeltakere];
        for (int z = 0; z < antDeltakere; z++){
            deltakere[z] = new Hopper(z + 1);
        }

        for (int x = 0; x < 2; x++){
            for (int y = 0; y < antDeltakere; y++ ){
                deltakere[y].poengberegning(tast,x);
            }
        }
    }

    Hopper [] sorter(){
        for (int i = 0; i < deltakere.length - 1; i++){
            double t = deltakere[i + 1].getTotalpoeng();
            Hopper ho = deltakere[i + 1];
            int k = i;
            while (k >= 0 && deltakere[k].getTotalpoeng() > t){
                deltakere[k + 1] = deltakere[k];
                k--;
            }

            deltakere[k + 1] = ho;
        }

        return deltakere;
    }

    void skrivUt(){
        skjerm.outln();
        skjerm.outln("Resultatliste: ");
        for (int i = 0; i < deltakere.length; i++){
            skjerm.out("Hopper nr." + deltakere[i].deltaker + " : Lengder " + deltakere[i].getLengde()[0]);
            skjerm.outln(" " + deltakere[i].getLengde()[1] + ", Poeng " + deltakere[i].getTotalpoeng());
        }
    }
}
