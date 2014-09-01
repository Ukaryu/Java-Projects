import easyIO.Out;

import java.util.Scanner;

/**
 * Created by Martin on 31.08.2014.
 */
public class produkt {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        Out skjerm = new Out();
        double x;
        double y;

        skjerm.out("Oppgi verdien til x: ");
        x = tastatur.nextDouble();

        skjerm.out("Oppgi verdien til y: ");
        y = tastatur.nextDouble();

        skjerm.outln("Produktet av x og y er: " + (x * y));
    }
}
