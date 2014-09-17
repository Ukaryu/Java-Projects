/**
 * Created by Martin on 31.08.2014.
 */
import easyIO.*;
public class tabell {
    public static void main(String[] args) {
        Out skjerm = new Out();
        final int BREDDE = 16;



        skjerm.out("Bilmerke",BREDDE, Out.LEFT );
        skjerm.out("Årsmodell", BREDDE, Out.CENTER);
        skjerm.outln("Reg.nr.", BREDDE, Out.RIGHT);
        skjerm.outln("------------------------------------------------");

        skjerm.out("Mercedes", BREDDE, Out.LEFT);
        skjerm.out(1999,BREDDE, Out.CENTER);
        skjerm.outln("UE65660",BREDDE, Out.RIGHT);

        skjerm.out("Ford",BREDDE, Out.LEFT);
        skjerm.out(2003,BREDDE, Out.CENTER);
        skjerm.outln("ZE95523",BREDDE, Out.RIGHT);

        skjerm.out("Toyota", BREDDE, Out.LEFT);
        skjerm.out(2006,BREDDE, Out.CENTER);
        skjerm.outln("DK53401",BREDDE, Out.RIGHT);

        skjerm.outln("------------------------------------------------");
    }
}
