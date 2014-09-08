import easyIO.*;
/**
 * Created by Martin on 07.09.2014.
 */
public class oppgave1 {

    public static void main(String[] args) {
        Out skjerm = new Out();

        int i;
        int  [] heltall = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        for (i = 0; i < heltall.length; i++){
            skjerm.outln("Indeks " + i + " inneholder verdien " + heltall[i]);
            skjerm.outln();
        }


    }
}
