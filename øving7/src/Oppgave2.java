import easyIO.*;

/**
 * Created by Martin on 14.10.2014.
 */
public class Oppgave2 {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();

        String navn;
        double timelon;
        double antallTimer;
        int skatteprosent;

        skjerm.out("Skriv inn navn på arbeidstaker: ");
        navn = tast.inLine();
        skjerm.out("Skriv inn timeslønn på arbeidstaker: ");
        timelon = tast.inDouble();
        skjerm.out("Skriv inn anntall arbeidstimer på arbeidstaker: ");
        antallTimer = tast.inDouble();
        skjerm.out("Skriv inn skatteprosent på arbeidstaker: ");
        skatteprosent = tast.inInt();

        Arbeidstaker a = new Arbeidstaker(navn, timelon, antallTimer, skatteprosent);

        a.skrivUt();

    }
}
