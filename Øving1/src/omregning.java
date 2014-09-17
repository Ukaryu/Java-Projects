/**
 * Created by Martin on 31.08.2014.
 */

/**
 * Algoritme:
 * Les inn sekunder
 * Omregn til timer, minutter og sekunder
 * Skriv ut resultat
 */
import java.util.Scanner;
public class omregning {
    public static void main(String[] args) {
        int sekunder;
        int timer;
        int minutter;
        int uker;
        int måneder;
        int år;
        int dager;
        Scanner tastatur = new Scanner(System.in);



       do {
           System.out.print("Skriv inn sekunder som skal omregnes: ");
           sekunder = tastatur.nextInt();

           år = (sekunder / 31536000);
           måneder =((sekunder % 31536000) / 2628000);  // For å sjekke om koden fungerer bruk 34772460 som referanseverdi, skal oppgi 1 av alt
           uker = (((sekunder % 31536000 ) % 2628000 ) / 604800);
           dager = ((((sekunder % 31536000 ) % 2628000 ) % 604800) / 84600);
           timer = (((((sekunder % 31536000 ) % 2628000 ) % 604800) % 84600) / 3600);
           minutter = (((((sekunder % 31536000 ) % 2628000) % 604800 ) % 3600) / 60);
           sekunder = (((((sekunder % 31536000 ) % 2628000) % 604800 ) % 3600) % 60);

           if (sekunder != 0) {
               System.out.println("Omregningen gir at det er " + år + " år, " + måneder + " måneder, " + uker + " uker, "
                       + dager + " dager, " + timer + " timer, " + minutter + " minutter" + " og " + sekunder + " sekunder.");

               System.out.println();
           } else {
               System.out.println("Sekundene du har oppgitt har nullverdi.");
               System.out.println();
               System.out.println("Avslutter...");
           }


       } while (sekunder != 0);
    }

}
