import easyIO.*;
import java.util.regex.*;

/**
 * Created by Martin on 11.09.2014.
 */

public class oppgave2 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();
        In innfil = new In("test.txt");

        int ant = innfil.inInt();
        String [] ord = new String[ant];
        int i;



        skjerm.outln("Vennligst skriv inn sekvensen som skal vurderes: ");
        String sekvens = tast.inLine();

        Pattern p = Pattern.compile(sekvens);// Lager stringen som skal vurderes av matcher funksjonen.
        int sum = 0;

        for (i = 0; i < ant; i++){
            ord [i] = innfil.inLine(); //Henter inn arrayverdiene fra txt-filen

            String candidateString = ord [i]; //Setter et array-element som skal matches mot Pattern-variabelen
            Matcher matcher = p.matcher(candidateString); //Går igjennom alle elementene og lagrer treffene
            if (matcher.find()) {//Hvis samme sekvens har blitt funnet så blir matcher.find() satt til true
                sum++;
            }

            if (ord[i].length() == 1){
                skjerm.outln(ord[i]);
            } else if (((ord[i].length() % 2) == 0) && ord[i].length() < 3){
                skjerm.outln(ord[i]);

            } else if ((ord[i].length() % 2) == 0){
                String del = ord[i].substring((ord[i].length()/2-1), (ord[i].length()/2+1));
                skjerm.outln(del);
            } else {
                String del = ord[i].substring(ord[i].length()/2-1, (ord[i].length()/2+2));
                skjerm.outln(del);

            }
        }

        skjerm.outln();
        skjerm.out("Antall ord av samme sekvens: " + sum);


    }
}
