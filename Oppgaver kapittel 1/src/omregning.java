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
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn sekunder som skal omregnes: ");
        sekunder = tastatur.nextInt();

        timer = (sekunder / 3600);
        minutter = ((sekunder / 60) % 60);
        sekunder = ((sekunder % 3600) % 60);

        System.out.println("Omregningen gir at det er " + timer + " timer" + ", " + minutter + " minutter" + " og " + sekunder + " sekunder.");
    }

}
