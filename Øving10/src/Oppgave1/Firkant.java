package Oppgave1;
import easyIO.Out;
/**
 * Created by Martin on 12.11.2014.
 */
public class Firkant implements Tegnbar {
    public void tegnOpp(Out skjerm){
        for (int i = 0; i < 4; i++){
            skjerm.outln("*****", 6, Out.CENTER);
        }
        skjerm.outln();
    }
}
