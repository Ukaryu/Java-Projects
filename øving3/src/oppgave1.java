/**
 * Created by Martin on 11.09.2014.
 */

import easyIO.*;

public class oppgave1 {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        int sum;
        int i;


        skjerm.out("Vennligst skriv inn din poengsum: ");


        for (i = 0; i < 10; i++){


            sum = tast.inInt();
            skjerm.outln();

            if ((sum <= 100) && (sum >= 0)){

                if (sum > 89){
                    skjerm.outln("Din poengsum tilsvarer A");

                } else if (90 > sum && sum > 79){
                    skjerm.outln("Din poengsum tilsvarer B");

                } else if ((80 > sum) && (sum > 59)){
                    skjerm.outln("Din poengsum tilsvarer C");

                } else if (60 > sum && sum > 49){
                    skjerm.outln("Din poengsum tilsvarer D");

                } else if (50 > sum && sum > 39){
                    skjerm.outln("Din poengsum tilsvarer E");

                } else {
                    skjerm.outln("Din poengsum tilsvarer F, aka. stryk");
                }

                skjerm.outln();
                skjerm.out("Vennligst skriv inn din poengsum: ");
            } else {
                i--;
                skjerm.out("Poengsummen du har skrevet inn har ikke en gyldig verdi, prøv igjen: ");
            }
        }




    }
}
