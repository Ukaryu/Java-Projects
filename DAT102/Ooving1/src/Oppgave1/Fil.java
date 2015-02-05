package Oppgave1;

import easyIO.*;

/**
 * Created by Martin on 05.02.2015.
 */
public class Fil {
    Out utfil;
    CD samling [];

    Fil(String navnArkiv, CD samling []){
        utfil = new Out(navnArkiv);
        this.samling = samling;
    }

    public void skrivUt(){
        try{
            for (CD elem : samling){
                utfil.outln("Serienummer: " + elem.nummer);
                utfil.outln("Artist: " + elem.artist);
                utfil.outln("Tittel: " + elem.tittel);
                utfil.outln("Lanseringsår: " + elem.lanseringsaar);
                utfil.outln("Sjanger: " + elem.besSjanger);
                utfil.outln("Plateselskap: " + elem.plateselskap);
                utfil.outln("");

            }

        } catch (NullPointerException e) {

        } finally {
            utfil.close();
        }

    }
}
