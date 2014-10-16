import easyIO.*;

/**
 * Created by Martin on 14.10.2014.
 */

public class oppgave1 {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();

        int vareNr;
        String navn;
        double pris;

        skjerm.outln("Hvor mange varer skal ligge på lageret maksimalt?");
        int maksAntallVarer = tast.inInt();
        skjerm.outln("Hvor mange varer skal legges til nå?");
        int antall = tast.inInt();

        VareLager vl = new VareLager(maksAntallVarer);

        for (int i = 0; i < antall; i++){
            skjerm.out("Skriv inn varenummeret til varen: ");
            vareNr = tast.inInt();
            skjerm.out("Skriv inn navnet til varen: ");
            navn = tast.inLine();
            skjerm.out("Skriv inn prisen til varen: ");
            pris = tast.inDouble();
            skjerm.outln();

            vare v = new vare(vareNr, navn, pris);
            vl.leggTil(v);
        }

        vl.visAlle();
        skjerm.out("Total pris av varene er: ");
        skjerm.outln();
        skjerm.outln(vl.totalPris());
        skjerm.outln();

        skjerm.out("Skriv inn hvilken vare som skal slettes ved bruk av varenummer :");
        vareNr = tast.inInt();
        vl.slett(vareNr);
        vl.visAlle();
        skjerm.outln();
        skjerm.outln(vl.totalPris());
        skjerm.outln();


    }
}

