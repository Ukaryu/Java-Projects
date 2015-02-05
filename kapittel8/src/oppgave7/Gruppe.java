package oppgave7;

import easyIO.Out;

/**
 * Created by Martin on 18.12.2014.
 */
public class Gruppe {
    String elever [];
    String klasserom;
    String gruppeNavn;
    int antElever;

    Gruppe(int antElever, String gruppeNavn){
       elever = new String[antElever];
       this.gruppeNavn = gruppeNavn;
       this.antElever = antElever;
    }

    void skrivUt(){
        Out skjerm = new Out();
        skjerm.outln("Det er " + antElever + " elever i gruppe " + gruppeNavn );

    }

}
