/**
 * Created by Martin on 17.09.2014.
 */
import easyIO.*;
public class oppgave5 {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        int primtall [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        boolean primt [] = new boolean[10];

        int x = tast.inInt();

        for (int i = 0; (i < primtall.length) && !primt[i]; i++){

            if (primtall[i] == x){
                primt[i] = true;
            }
        }
        skjerm.out(primt[0]);

    }
}
