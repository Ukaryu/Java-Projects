import easyIO.*;

/**
 * Created by Martin on 06.09.2014.
 */
public class oppgave4 {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        int nedre;
        int øvre;


        skjerm.outln("Skriv inn en nedre og øvre grense respektivt: ");
        nedre = tast.inInt();
        øvre = tast.inInt();


        if ((nedre % 2) == 0){ //Tester om nedre grense er et oddetall eller ikke
            nedre += 1;
        }

        skjerm.out(nedre + ", " );

        while (nedre < øvre){
            nedre += 2;

            if (nedre > øvre){ //Sørger for at utskriften ikke overgår øvre grense
                skjerm.outln();
            } else {
                skjerm.out(nedre);
                skjerm.out(", ");
            }
        }//while
    }
}
