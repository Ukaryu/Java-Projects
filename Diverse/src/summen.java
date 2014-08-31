import easyIO.*;


/**
 * Created by Martin on 01.09.2014.
 */
public class summen {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tastatur = new In();

        skjerm.out("Skriv inn et heltall: ");
        int heltall = tastatur.inInt();

        int sum = 0;
        for (int i = 1; i <= heltall; i++) {
            sum = sum + i;
            skjerm.out(i,5);
            skjerm.out(sum,5);
            skjerm.outln();
        }




    }
}
