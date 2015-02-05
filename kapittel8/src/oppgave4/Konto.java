package oppgave4;

/**
 * Created by Martin on 16.12.2014.
 */
public class Konto {
    private static int nummer = 0;
    private int kontonummer, saldo;
    private String eier,adresse;

    Konto(){
        saldo = 0;
        bestemKontonummer();
    }

    Konto(String e, String adr, int s){
        eier = e;
        adresse = adr;
        saldo = s;
        bestemKontonummer();
    }

    public String getEier() {
        return eier;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    void bestemKontonummer(){
        nummer++;
        kontonummer = nummer;
    }

    void settInn(int innskudd){
        saldo = saldo + innskudd;
    }

    boolean taUt(int uttak){
        if(uttak > saldo){
            return false;
        } else {
            saldo = saldo - uttak;
            return true;
        }
    }

    boolean overfortTilAnnenKonto(Konto tilkonto, int beløp){
        if (taUt(beløp)){
            tilkonto.settInn(beløp);
            return true;
        } else {
            return false;
        }
    }

}

