import easyIO.Out;

/**
 * Created by Martin on 14.10.2014.
 */

class vare{
    private int vareNr;
    private String navn;
    private double pris;

    vare(){
        pris = 100;
        vareNr = 0;
    }

    vare(int vareNr, String navn, double pris){
        this.vareNr = vareNr;
        this.navn = navn;
        this.pris = pris;
    }

    public int getVareNr(){
        return vareNr;
    }

    public String getNavn(){
        return navn;
    }

    public double getPris(){
        return pris;
    }

    public void skriv(){
        Out skjerm = new Out();

        skjerm.outln();
        skjerm.outln("Navnet på varen er " + navn);
        skjerm.outln("Varenummeret til varen er " + vareNr);
        skjerm.out("Pris til varen uten moms er ");
        skjerm.outln(pris, 2);
    }






}
