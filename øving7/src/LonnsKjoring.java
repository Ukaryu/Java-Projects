import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 16.10.2014.
 */
public class LonnsKjoring {
    String firmaNavn;
    Arbeidstaker [] ansatte;
    int antallAnsatte;
    int antall;

    LonnsKjoring(String firmaNavn, int antall){
        this.firmaNavn = firmaNavn;
        ansatte = new Arbeidstaker[antall];
        antallAnsatte = 0;
    }

    public String getFirmaNavn() {
        return firmaNavn;
    }

    public int getAntall() {
        return antall;
    }

    public int getAntallAnsatte() {
        return antallAnsatte;
    }

    void lesArbeidsTakere (Arbeidstaker a){
        ansatte [antallAnsatte] = a;
        antallAnsatte++;
    }

    public Arbeidstaker[] getAnsatte() {
        return ansatte;
    }

    public double finnTotalOvertid(){
        double total = 0;

        for (int i = 0; i < antallAnsatte; i++){
            total += ansatte[i].finnOvertidsTimer();
         }

        return total;
    }

    public double finnTotalBruttoLonn(){
        double total = 0;

        for (int i = 0; i < antallAnsatte; i++){
            total += ansatte[i].finnBruttolon();
        }

        return total;
    }

    public void skrivLonnsOversikt(){
        Out skjerm = new Out();

        Arbeidstaker.overskrift();
        for (int i = 0; i < antallAnsatte; i++){
            ansatte[i].skrivUt();
        }
    }

    public void skrivHogasteBruttoLonn(){
        Out skjerm = new Out();
        String maxAnsatt = ansatte[0].getNavn();
        double max = ansatte[0].finnBruttolon();

        for (int i = 0; i < antallAnsatte; i++){

            if (max < ansatte[i].finnBruttolon()){
                max = ansatte[i].finnBruttolon();
                maxAnsatt = ansatte[i].getNavn();
            }
        }

        skjerm.outln("Ansatte med høyest brutto lønn er " + maxAnsatt + " med en inntekt på " + max + " kr");
    }

    public void finnOgSkrivPerson(){
        In tast = new In();
        Out skjerm = new Out();

        skjerm.out("Skriv inn navnet på personen som du ønsker å søke opp: ");
        String navn = tast.inLine().toLowerCase();

        boolean funnet = false;

        for (int i = 0; i < antallAnsatte; i++){


            if (ansatte [i].getNavn().toLowerCase().equals(navn)){
                skjerm.outln();
                skjerm.outln("Person funnet");
                skjerm.outln();
                Arbeidstaker.overskrift();
                ansatte[i].skrivUt();
                funnet = true;

            }
        }

        if (!funnet) {
            skjerm.outln();
            skjerm.outln("Person ikke funnet");
        }
    }

}
