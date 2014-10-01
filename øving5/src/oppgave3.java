import easyIO.*;

import java.util.Arrays;

/**
 * Created by Martin on 01.10.2014.
 */

public class oppgave3 {
    public static void main(String[] args) {
        Out skjerm = new Out();

        double extremity [] = new double [100000000];

        for (int i = 0; i < extremity.length; i++){
            extremity [i] = Math.random();
        }

        long startTid = System.currentTimeMillis();
        Arrays.sort(extremity);
        long sluttTid = System.currentTimeMillis();

        long duration = (sluttTid - startTid);

        skjerm.outln(duration);



    }


}
