package oppgave5;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class metodeTest {
    Out skjerm = new Out();

    public void m1(int k){
        skjerm.outln("metode m1 før kallet , k: " + k);
        k = k -1;
        m2(k);
    }

    public void m2(int k){
        skjerm.outln("metode m2 før kallet , k: " + k);
        k = k -1;
        m3(k);
    }

    public void m3(int k){
        skjerm.outln("metode m3 før kallet , k: " + k);
        k = k -1;
        m4(k);
    }

    public void m4(int k){
        skjerm.outln("metode m4 før kallet , k: " + k);
        k = k -1;
        if (k > 0){
            m1(k);
        }
    }
}
