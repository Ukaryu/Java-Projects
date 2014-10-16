import easyIO.*;

/**
 * Created by Martin on 14.10.2014.
 */
public class Oppgave3 {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();

        String navn;
        double timelon;
        double antallTimer;
        int skatteprosent;


        skjerm.out("Skriv inn navn på firma: ");
        String firmaNavn = tast.inLine();
        skjerm.out("Skriv inn antall ansatte: ");
        int antall = tast.inInt();
        skjerm.out("Skriv inn antall ansatte som skal legges til nå: ");
        int antallAnsatte = tast.inInt();

        LonnsKjoring lk = new LonnsKjoring(firmaNavn,antall);

        for (int i = 0; i < antallAnsatte; i++){
            skjerm.out("Skriv inn navn på arbeidstaker: ");
            navn = tast.inLine();
            skjerm.out("Skriv inn timeslønn på arbeidstaker: ");
            timelon = tast.inDouble();
            skjerm.out("Skriv inn anntall arbeidstimer på arbeidstaker: ");
            antallTimer = tast.inDouble();
            skjerm.out("Skriv inn skatteprosent på arbeidstaker: ");
            skatteprosent = tast.inInt();
            skjerm.outln();

            Arbeidstaker a = new Arbeidstaker(navn, timelon, antallTimer, skatteprosent);
            lk.lesArbeidsTakere(a);

        }
        skjerm.outln("Oversikt for " + firmaNavn);
        skjerm.outln();
        lk.skrivLonnsOversikt();
        skjerm.outln();
        skjerm.outln("Antall ansatte i firmaet er " + antallAnsatte);
        skjerm.outln();
        skjerm.outln("Totale antall overtidstimer er " + lk.finnTotalOvertid());
        skjerm.outln();
        skjerm.outln("Totalt antall brutto lønn utbetalt er " + lk.finnTotalBruttoLonn());
        skjerm.outln();
        lk.skrivHogasteBruttoLonn();
        skjerm.outln();
        lk.finnOgSkrivPerson();

    }
}
