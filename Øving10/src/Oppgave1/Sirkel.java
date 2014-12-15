package Oppgave1;
import easyIO.Out;
/**
 * Created by Martin on 12.11.2014.
 */
public class Sirkel implements Tegnbar {
    public void tegnOpp(Out skjerm){
        skjerm.outln("***", 6, Out.CENTER);
        for (int i = 0; i < 3; i++){
            skjerm.outln("*   *", 6, Out.CENTER);
        }
        skjerm.outln("***", 6, Out.CENTER);
        skjerm.outln();
    }
}
