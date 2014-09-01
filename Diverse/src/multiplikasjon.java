import easyIO.*;

/**
 * Created by Martin on 01.09.2014.
 */
public class multiplikasjon {
    public static void main(String[] args) {
        Out skjerm = new Out();
        int sum = 0;

        skjerm.outln("1 2 3 4 5", 20, Out.CENTER);
        skjerm.outln("--------------------");

        for (int i = 1; i <= 5; i++){
            skjerm.out(i, 10, Out.CENTER);
        }
    }
}
