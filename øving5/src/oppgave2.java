import easyIO.*;

/**
 * Created by ukaryu on 01.10.14.
 */

public class oppgave2 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        skjerm.outln("Skriv inn maks antall rektangler: ");
        int maksAntall = tast.inInt();
        skjerm.outln();
        skjerm.outln("Skriv inn tegn for rektangel: ");
        String tegn = tast.inLine();
        skjerm.outln();
        skjerm.outln("Hvor mange rektangler ønsker du å plotte inn i samlingen? ");
        int rektangler = tast.inInt();

        Rektangelsamling rs = new Rektangelsamling(maksAntall);

        for(int i = 0; i < maksAntall; i++) {

            if(rektangler > i) {

                skjerm.outln("Skriv inn bredde: ");
                int bredde = tast.inInt();
                skjerm.outln();
                skjerm.outln("Skriv inn høyde: ");
                int høyde = tast.inInt();
                skjerm.outln();


                rektangel r = new rektangel(bredde, høyde, tegn);
                String firkant = r.getRam();
                rs.leggTil(firkant);
                rs.totAreal(maksAntall, bredde, høyde);

            }


        }

        rs.visAlle(maksAntall, rektangler);
    }
}

class Rektangelsamling {
    Out skjerm = new Out();

    static String Rektangel[];
    static int antall;
    private int totalAreal = 0;

    public Rektangelsamling(int maksAntall) {
        antall = 0;
        Rektangel = new String[maksAntall];
    }

    public void leggTil(String firkant) {
        Rektangel [antall] = firkant;
        antall += 1;
    }

    public void visAlle(int maksAntall, int rektangler) {
        for(int i = 0; i < maksAntall; i++){
            if (rektangler > i){
                System.out.println(Rektangel[i]);
            }
        }

        skjerm.outln("Totale areal av rektangelsamlingen blir på: " + totalAreal);
        skjerm.outln();

    }

    public int totAreal(int maksAntall, int bredde, int høyde) {
        totalAreal += bredde * høyde;

        return totalAreal;
    }
}