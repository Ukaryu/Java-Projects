package oppgave9;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String [] args){
        median2 m2 = new median2();
        Out skjerm = new Out();

        int a [] = {10,14,13,11,15,19,12,17,16,18,1,12,2,4,6,7};

        skjerm.outln("Medianen er: " + m2.median(a));

        //Det som blir skrevet ut blir median siden den er større enn, eller lik halvparten av tallene i listen.
        //Man trenger ikke å tenkte på ulike tall siden disse blir sortert i stigende rekkefølge, og medianen blir jo
        //korrekt selv når alle tall er lik, siden denne vil være lik halvparten av alle tall. Men i realiteten er den
        //lik alle tall.
    }
}
