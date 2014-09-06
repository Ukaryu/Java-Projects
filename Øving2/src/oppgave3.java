import easyIO.*;
/**
 * Created by Martin on 06.09.2014.
 */

public class oppgave3 {
    public static void main(String[] args) {
        In innfil = new In();
        Out skjerm = new Out();
        int bydel;


        do {
            skjerm.out("Skriv inn bydel nr: ");
            bydel = innfil.inInt();

            switch (bydel) {
                case 1:
                    skjerm.outln("Bydel 1 heter Gamle Oslo");
                    break;
                case 2:
                    skjerm.outln("Bydel 2 heter Grünerløkka");
                    break;
                case 3:
                    skjerm.outln("Bydel 3 heter Sagane");
                    break;
                case 4:
                    skjerm.outln("Bydel 4 heter Hanshaugen");
                    break;
                case 5:
                    skjerm.outln("Bydel 5 heter Frogner");
                    break;
                case 6:
                    skjerm.outln("Bydel 6 heter Ullern");
                    break;
                case 7:
                    skjerm.outln("Bydel 7 heter Vestre Aker");
                    break;
                case 8:
                    skjerm.outln("Bydel 8 heter Nordre Aker");
                    break;
                case 9:
                    skjerm.outln("Bydel 9 heter Bjerke");
                    break;
                case 10:
                    skjerm.outln("Bydel 10 heter Grorud");
                    break;
                case 11:
                    skjerm.outln("Bydel 11 heter Stovner");
                    break;
                case 12:
                    skjerm.outln("Bydel 12 heter Alna");
                    break;
                case 13:
                    skjerm.outln("Bydel 13 heter Østensjø");
                    break;
                case 14:
                    skjerm.outln("Bydel 14 heter Nordstrand");
                    break;
                case 15:
                    skjerm.outln("Bydel 15 heter Søndre Nordstrand");
                    break;
                default:skjerm.out("Nummeret du har skrevet inn har ikke en bydel.");

            }
        } while (bydel > 0);
    }

}
