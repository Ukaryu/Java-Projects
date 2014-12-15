package oppgave4;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class skrivTekstIBoks {
    Out skjerm = new Out();
    public void skrivBlankeOgStjerner(int b, int s,boolean ls){
        for (int i = 0; i < (b); i++){
            skjerm.out(" ");
        }

        for (int i = 0; i < (s); i++){
            skjerm.out("*");
        }

        if(ls){
            skjerm.outln();
        }




    }

    public void skrivTekstIBokss(String t){
        int lengde = t.length();

        skrivBlankeOgStjerner(2, lengde + 4, true);

        skrivBlankeOgStjerner(2,1,false);
        skrivBlankeOgStjerner(lengde + 2, 1, true);

        skrivBlankeOgStjerner(2,1,false);
        skrivBlankeOgStjerner(1,0,false);
        skjerm.out(t);
        skrivBlankeOgStjerner(1,1,true);

        skrivBlankeOgStjerner(2,1,false);
        skrivBlankeOgStjerner(lengde + 2, 1, true);

        skrivBlankeOgStjerner(2, lengde + 4, true);

    }
}
