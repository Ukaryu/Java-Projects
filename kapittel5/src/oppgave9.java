/**
 * Created by Martin on 18.09.2014.
 */
import easyIO.*;

public class oppgave9 {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

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

        double poengsum = sum + lngdPoeng;

        skjerm.outln("Totale stilpoeng blir på: " + sum);
        skjerm.outln();
        skjerm.out("Totale lengdepoeng blir på ");
        skjerm.outln(lngdPoeng,2);
        skjerm.outln("Samlet poengsum blir da: " + poengsum);

    }
}
