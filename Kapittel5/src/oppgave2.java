import easyIO.Out;

/**
 * Created by Martin on 07.09.2014.
 */
public class oppgave2 {

    public static void main(String[] args) {
        Out skjerm = new Out();

        int i;
        int sum = 0;
        int  [] heltall = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        for (i = 0; i < heltall.length; i++){
            sum = sum + heltall[i];
        }
        skjerm.outln("Summen av listen blir " + sum);
        skjerm.outln();
    }
}
