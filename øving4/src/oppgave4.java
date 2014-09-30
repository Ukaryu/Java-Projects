import easyIO.*;

/**
 * Created by Martin on 18.09.2014.
 */

public class oppgave4 {
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

        rektangel r2 = new rektangel(bredde, høyde, tegn);
        r2.rekt();

    }
}
class rektangel{
    Out skjerm = new Out();
    In tast = new In();

    int bredde;
    int høyde;
    String tegn;

    public rektangel(int bredde, int høyde, String tegn){
        this.bredde = bredde;
        this.høyde = høyde;
        this.tegn = tegn;
    }

    int areal(){
        int a = bredde * høyde;
        return a;
    }        //Regner ut arealet av rektangelet

    int omkrets(){
        int o = bredde*2 + høyde*2;
        return o;
    }      //Regner ut omkretsen av rektangelet

    String ram(){

        String ramme = "";
        for (int i = 0; i < bredde; i++){
            ramme += " " + tegn + " ";
        }

        String firkant = "";
        for (int j = 0; j < høyde; j++){
            firkant += (ramme + "\n");
        }

        return firkant;
    }       //Bygger rektangelet

    public void rekt(){            //Skriver ut informasjon om rektangelet

        skjerm.outln("Arealet av rektangelet blir " + areal());
        skjerm.outln();
        skjerm.outln("Omkretsen av rektangelet blir " + omkrets());
        skjerm.outln();
        skjerm.outln(ram());
    }
}
