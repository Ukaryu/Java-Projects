package oppgave7;

import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 18.12.2014.
 */
public class Klassetrinn {
    Gruppe gruppe [];
    int trinn;
    int grupper;


    Klassetrinn(int grupper,int trinn, int antElever){
        gruppe = new Gruppe[grupper];
        In tast = new In();
        Out skjerm = new Out();

        this.grupper = grupper;

        this.trinn = trinn;

        for (int i = 0; i < grupper; i++){

            skjerm.out("Skriv inn gruppenavn for " + trinn + " klasse: ");
            gruppe[i] = new Gruppe(antElever,tast.inLine());
            skjerm.outln();
        }
    }

    void skrivUt(){
        Out skjerm = new Out();
        skjerm.outln("Gruppene på " + trinn + " trinn med antall elever: ");

        for (Gruppe elem : gruppe){
            elem.skrivUt();
        }
        skjerm.outln();
    }

}
