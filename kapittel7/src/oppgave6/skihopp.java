package oppgave6;

import easyIO.*;

/**
 * Created by Martin on 15.12.2014.
 */
public class skihopp {
    Out skjerm = new Out();
    double poengsum;


    public double poengberegning(In tast){
        double stilKrkt [] = new double[5];
        double sum = 0;

        skjerm.outln("Vennligst skriv inn lengden på hoppet: ");
        double hopp = tast.inDouble();
        double lngdPoeng = 60 + ((hopp - 120) * 1.8);

        skjerm.outln();
        skjerm.outln("Vennligst skriv inn stillkarakter (5 siffer): ");
        for(int i = 0; i < stilKrkt.length; i++){

            stilKrkt [i] = tast.inDouble();
        }

        double maks = stilKrkt [0];
        double min = stilKrkt [0];
        for(int l = 0; l < stilKrkt.length; l++){

            if (maks < stilKrkt[l]){
                maks = stilKrkt [l];
            }

            if ( min > stilKrkt[l]){
                min = stilKrkt[l];
            }

            sum += stilKrkt [l];
        }

        sum -= (maks+min);

        poengsum = sum + lngdPoeng;

        return poengsum;
    }

}
