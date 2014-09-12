import easyIO.*;
/**
 * Created by Martin on 11.09.2014.
 */

public class oppgave5 {

    public static void main(String[] args) {

        Out skjerm = new Out();
        In tast = new In();

        double [] temp = new double[8];
        int i;

        skjerm.outln("Analyse av temperatur", 30, Out.CENTER);
        for(i = 0; i < 29; i++){
            skjerm.out("*");
        }
        skjerm.outln("*");

        skjerm.outln("Skriv in temperaturene: ");//Tar imot værdata fra bruker.
        for(i = 1; i < 8; i++){
            skjerm.out(i + ". dag: ");
            temp [i] = tast.inDouble();
        }

        double maks = temp [1]; //Finner maksimumverdien av tempen.
        for(i = 1; i < 8; i++){
            if (temp [i] > maks){
                maks = temp [i];
            }
        }
        skjerm.outln();
        skjerm.outln("Høyeste temperatur i denne perioden var på " + maks + " grader.");
        skjerm.outln();

        double sum = 0; // Regner ut gjennomsnittet av tempen.
        for (i = 1; i < 8; i++){
            sum += temp[i];
        }

        double snitt = sum / 7;
        skjerm.out("Gjennomsnittlig temperatur i denne perioden var på ");
        skjerm.out(snitt, 1);
        skjerm.outln(" grader");

    }
}
