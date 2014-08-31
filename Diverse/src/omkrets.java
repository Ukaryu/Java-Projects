import easyIO.Out;

/**
 * Created by Martin on 01.09.2014.
 */
public class omkrets {
    public static void main(String[] args) {
        Out skjerm = new Out();

        double pi = 3.14;

        for (int r = 1; r <= 10; r++) {
            double om = (2 * pi * r);
            skjerm.out("Omkretsen av sirkel med radius " + r + " er ");
            skjerm.outln(om, 2);
        }


    }
}
