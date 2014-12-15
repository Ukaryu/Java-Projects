package Oppgave1;
import easyIO.Out;
/**
 * Created by Martin on 12.11.2014.
 */
public class PilOpp implements Tegnbar {

    public void tegnOpp(Out skjerm){
        String pil = "*";
        for (int i = 0; i < 3; i++){
            skjerm.outln(pil, 6, Out.CENTER);
            pil += "**";
        }
        skjerm.outln("*", 6, Out.CENTER);
        skjerm.outln("*", 6, Out.CENTER);
        skjerm.outln();
    }
}

