import easyIO.*;

/**
 * Created by Martin on 11.09.2014.
 */

public class oppgave3 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        double x;
        int n;
        double i;


        skjerm.outln("Vennligst skriv inn tallet som skal regnes ut og potensen som skal brukes respektivt: ");
        x = tast.inDouble();
        n = tast.inInt();

        double svar = Math.pow(x, n);

        double produkt = 1;

        while (n > 0 || n < 0){

            if(n > 0){
                produkt *= x;
                n--;
            } else{
                produkt /= x;
                n++;
            }

        }

        skjerm.outln();
        skjerm.out("Resultatet av potensregningen ved bruk av Math.Pow funksjonen blir: ");
        skjerm.outln(svar, 2);
        skjerm.outln();
        skjerm.out("Resultatet av potensregningen ved bruk av en while-løkke blir: ");
        skjerm.outln(produkt, 2);
        skjerm.outln();
        skjerm.out("Det kan være forskjellige svar pga. simplisiteten til while-løkken.");


    }
}
