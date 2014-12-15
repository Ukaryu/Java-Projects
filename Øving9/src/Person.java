import easyIO.Out;

/**
 * Created by Martin on 04.11.2014.
 */
public class Person {
    Out skjerm = new Out();
    private String fornavn, etternavn;
    private int fodselsaar;
    private enum Kjonn {MANN, KVINNE}

    Person(String fornavn, String etternavn, int fodselsaar){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFodselsaar() {
        return fodselsaar;
    }

    public void skrivData(){
        skjerm.out(fornavn, 6, Out.LEFT);
        skjerm.out(etternavn, 20, Out.CENTER);
        skjerm.outln(fodselsaar, 4, Out.RIGHT);
    }
}
