package oppgave8;

import easyIO.In;
import easyIO.Out;

/**
 * Created by Martin on 18.12.2014.
 */
public class Hopper {
    private double poeng [] = new double[2];
    private double lengde [] = new double[2];
    private double totalpoeng = 0;
    int deltaker;

    Hopper(int deltaker){
        this.deltaker = deltaker;
    }

    public double[] getPoeng() {
        return poeng;
    }

    public void setPoeng(double[] poeng) {
        this.poeng = poeng;
    }

    public double[] getLengde() {
        return lengde;
    }

    public void setLengde(double[] lengde) {
        this.lengde = lengde;
    }

    public double getTotalpoeng() {
        return totalpoeng;
    }

    public void setTotalpoeng(double totalpoeng) {
        this.totalpoeng = totalpoeng;
    }

    public double poengberegning(In tast, int omgang){
        double stilKrkt [] = new double[5];
        double sum = 0;

        Out skjerm = new Out();

        skjerm.outln();
        skjerm.outln("Vennligst skriv inn lengden på hoppet for " + deltaker + " deltaker i " + (omgang + 1) + " omgang: ");
        lengde[omgang] = tast.inDouble();
        poeng[omgang] = 60 + ((lengde[omgang] - 120) * 1.8);

        skjerm.outln();
        skjerm.outln("Vennligst skriv inn stilkarakter for " + deltaker + " deltaker i " + (omgang + 1) + " omgang: (5 tall): ");

        for(int i = 0; i < stilKrkt.length; i++){
            stilKrkt [i] = tast.inDouble();
        }

        double maks = stilKrkt [0];
        double min = stilKrkt [0];
        for(int l = 0; l < stilKrkt.length; l++){

            if (maks < stilKrkt[l]){
                maks = stilKrkt [l];
            }

            if ( min > stilKrkt[l]){
                min = stilKrkt[l];
            }

            sum += stilKrkt [l];
        }

        sum -= (maks+min);

        totalpoeng += sum + poeng[omgang];

        return totalpoeng;
    }
}
