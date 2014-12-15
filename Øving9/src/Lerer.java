import easyIO.Out;

/**
 * Created by Martin on 04.11.2014.
 */
public class Lerer extends Person {

    private int manedslonn, kontorNummer;

    Lerer(String fornavn, String etternavn, int fodselsaar, int manedslonn, int kontorNummer){
        super(fornavn,etternavn,fodselsaar);
        this.manedslonn = manedslonn;
        this.kontorNummer = kontorNummer;

    }

    public int getManedslonn() {
        return manedslonn;
    }

    public int getKontorNummer() {
        return kontorNummer;
    }

    public void skrivData(){
        skjerm.outln("Navn: " + getFornavn() + " " + getEtternavn());
        skjerm.outln("Fødelsår: " + getFodselsaar());
        skjerm.outln("Månedslønn: " + manedslonn);
        skjerm.outln("Kontornummer: " + kontorNummer);
        skjerm.outln();
    }
}
