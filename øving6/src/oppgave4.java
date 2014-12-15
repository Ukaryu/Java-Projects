import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 05.10.2014.
 */
public class oppgave4 {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();

        skjerm.out("Skriv inn varenummeret til varen: ");
        int vareNr = tast.inInt();
        skjerm.out("Skriv inn navn til varen ");
        String navn = tast.inLine();
        skjerm.out("Skriv inn prisen på varen ");
        double pris = tast.inDouble();

        vare v2 = new vare(vareNr, navn, pris);
        v2.skriv();
    }
}

class vare{
    private static int nummer = 0;
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

    public double setMoms(){
        double moms = (pris / 100) * 20;

        return pris + moms;
    }

    public boolean billigereEnn(){
        boolean billigere = false;

        if(pris < 100){
            billigere = true;
        }

        return billigere;
    }

    public void skriv(){
        Out skjerm = new Out();

        skjerm.outln();
        skjerm.outln("Navnet på varen er " + navn);
        skjerm.outln("Varenummeret til varen er " + vareNr);
        skjerm.out("Pris til varen uten moms er ");
        skjerm.outln(pris, 2);
        skjerm.out("Pris til varen med moms er ");
        skjerm.outln(setMoms(), 2);

        if (billigereEnn()){
            skjerm.outln("Varen er billigere enn 100.00 kr");
        } else {
            skjerm.outln("Varen er ikke billigere enn 100.00 kr");
        }
    }




}
