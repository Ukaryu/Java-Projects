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

        rektangel r = new rektangel();
        r.setAreal(bredde, høyde);
        r.setOmkrets(bredde, høyde);
        r.setRam(tegn, bredde, høyde);
        r.rekt();

    }
}

class rektangel{
    Out skjerm = new Out();
    In tast = new In();

    private int omkrets;
    private int areal;
    private String firkant;

    public void setAreal(int b, int h){
        areal = b * h;
    }                //Regner ut arealet av rektangelet

    private int getAreal(){
        return areal;
    }

    public void setOmkrets(int b, int h){
        omkrets = b * 2 + h * 2;
    }       //Regner ut omkretsen av rektangelet

    private int getOmkrets() {
        return omkrets;
    }

    public void setRam(String t, int b, int h){

        String ramme = "";
        for (int i = 0; i < b; i++){
            ramme += " " + t + " ";
        }

        firkant = "";
        for (int j = 0; j < h; j++){
            firkant += (ramme + "\n");
        }
    }                                         //Bygger rektangelet

    private String getRam() {
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
