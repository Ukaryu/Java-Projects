import easyIO.*;

/**
 * Created by Martin on 31.08.2014.
 */
public class bydel {
    public static void main(String[] args) {
        In innfil = new In();
        Out skjerm = new Out();
        int bydel;

        skjerm.out("Skriv inn bydel nr: ");
        bydel = innfil.inInt();
        switch (bydel) {
            case 1:
                skjerm.out("Bydel 1 heter Gamle Oslo");
                break;
            case 2:
                skjerm.out("Bydel 2 heter Grünerløkka");
                break;
            case 3:
                skjerm.out("Bydel 3 heter Sagane");
                break;
            case 4:
                skjerm.out("Bydel 4 heter Hanshaugen");
                break;
            case 5:
                skjerm.out("Bydel 5 heter Frogner");
                break;
            case 6:
                skjerm.out("Bydel 6 heter Ullern");
                break;
            case 7:
                skjerm.out("Bydel 7 heter Vestre Aker");
                break;
            case 8:
                skjerm.out("Bydel 8 heter Nordre Aker");
                break;
            case 9:
                skjerm.out("Bydel 9 heter Bjerke");
                break;
            case 10:
                skjerm.out("Bydel 10 heter Grorud");
                break;
            case 11:
                skjerm.out("Bydel 11 heter Stovner");
                break;
            case 12:
                skjerm.out("Bydel 12 heter Alna");
                break;
            case 13:
                skjerm.out("Bydel 13 heter Østensjø");
                break;
            case 14:
                skjerm.out("Bydel 14 heter Nordstrand");
                break;
            case 15:
                skjerm.out("Bydel 15 heter Søndre Nordstrand");
                break;
            default:skjerm.out("Nummeret du har skrevet inn har ikke en bydel.");

        }
    }
}
