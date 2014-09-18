import easyIO.*;

/**
 * Created by Martin on 18.09.2014.
 */

public class oppgave4 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        rektangel r = new rektangel(); //Kaller på rektangel-klassen

        skjerm.outln("Skriv inn bredde og høyde respektivt: ");

        r.rekt();

    }

}

class rektangel{
    Out skjerm = new Out();
    In tast = new In();

    int bredde = tast.inInt();
    int høyde = tast.inInt();

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
            ramme += " * ";
        }

        String firkant = "";
        for (int j = 0; j < høyde; j++){
            firkant += (ramme + "\n");
        }
        return firkant;
    }       //Bygger rektangelet

    void rekt(){            //Skriver ut informasjon om rektangelet

        skjerm.outln("Arealet av rektangelet blir " + areal());
        skjerm.outln();
        skjerm.outln("Omkretsen av rektangelet blir " + omkrets());
        skjerm.outln();
        skjerm.outln(ram());
    }
}
