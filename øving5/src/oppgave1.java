import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 30.09.2014.
 */
public class oppgave1 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        skjerm.outln("Skriv inn bredde: ");
        int bredde = tast.inInt();
        skjerm.outln();
        skjerm.outln("Skriv inn høyde: ");
        int høyde = tast.inInt();
        skjerm.outln();
        skjerm.outln("Skriv inn tegn for rektangel: ");
        String tegn = tast.inLine();
        skjerm.outln();

        rektangel r = new rektangel(bredde, høyde, tegn);
        r.rekt();
        skjerm.outln(r.getRam());

    }
}

class rektangel{
    Out skjerm = new Out();
    In tast = new In();

    private int omkrets;
    static int areal;
    private String firkant;
    int bredde;
    int høyde;
    String tegn;

    rektangel(int bredde, int høyde, String tegn){
        this.bredde = bredde;
        this.høyde = høyde;
        this.tegn = tegn;

        areal = bredde * høyde;                 //Regner ut arealet av rektangelet

        omkrets = bredde * 2 + høyde * 2;       //Regner ut omkretsen av rektangelet

        String ramme = "";
        for (int i = 0; i < bredde; i++){
            ramme += " " + tegn + " ";
        }

        firkant = "";
        for (int j = 0; j < høyde; j++){        //Bygger rektangelet
            firkant += (ramme + "\n");
        }

    }


    private int getAreal(){
        return areal;
    }

    private int getOmkrets() {
        return omkrets;
    }

    public String getRam() {
        return firkant;
    }

    public void rekt(){
        skjerm.outln("Arealet av rektangelet blir " + getAreal());
        skjerm.outln();
        skjerm.outln("Omkretsen av rektangelet blir " + getOmkrets());
        skjerm.outln();
        skjerm.outln(getRam());
    }                                           //Skriver ut informasjon om rektangelet
}
