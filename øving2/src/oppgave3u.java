import easyIO.*;

/**
 * Created by Martin on 06.09.2014.
 */

public class oppgave3u {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();

        int del = 1;
        String [] bydel = {"", "Gamle Oslo", "Grünerløkka", "Sagane", "Hanshaugen", "Frogner", "Ullern", " Vestre Aker",
        "Nordre Aker", "Bjerke", "Grorud", "Stovner", "Alna", "Østensjø", "Nordstrand", "Søndre Nordstrand"};


        while (del > 0 && del <16){
            skjerm.out("Vennligst skriv inn bydel nr: ");
            del = tast.inInt();

            if (del > 0 && del <16) {
                skjerm.outln();
                skjerm.outln("Bydel nr. " + del + " heter " + bydel[del]);
                skjerm.outln();
            } else {
                skjerm.outln();
                skjerm.out("Nummeret du har skrevet inn er ikke gyldig");
                skjerm.outln();
            }

        }






    }
}
