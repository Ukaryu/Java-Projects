package oppgave7;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;
import easyIO.Out;

/**
 * Created by Martin on 18.12.2014.
 */
public class Skole {
    String klasserom [];
    Klassetrinn klassetrinn [];
    int antTrinn;

    Skole(int antTrinn, int grupper,int antElever){
       klassetrinn = new Klassetrinn[antTrinn];
       this.antTrinn = antTrinn;

       for (int i = 0; i < antTrinn; i++){
           klassetrinn[i] = new Klassetrinn(grupper,(i + 1),antElever);
       }
    }

    void skrivUt(){
        Out skjerm = new Out();
        skjerm.outln("Det er " + antTrinn + " trinn på denne skolen.");
        for (Klassetrinn elem : klassetrinn){
            elem.skrivUt();
        }
    }
}
