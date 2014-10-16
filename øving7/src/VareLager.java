import easyIO.Out;

import java.util.Arrays;
import java.util.Arrays.*;
/**
 * Created by Martin on 14.10.2014.
 */
class VareLager extends vare {
    int maksAntallVarer;
    int antall;
    vare [] varer;

    VareLager (int maksAntallVarer) {
        this.maksAntallVarer = maksAntallVarer;
        antall = 0;
        varer = new vare[maksAntallVarer];
    }

    public int getMaksAntallVarer() {
        return maksAntallVarer;
    }

    public int getAntall() {
        return antall;
    }

    void leggTil (vare v){
        varer [antall] = v;
        antall++;
    }

    public vare[] getVarer() {
        return varer;
    }

    void visAlle(){
        Out skjerm = new Out();

        for(int i = 0; i < antall; i++){
            varer[i].skriv();
        }

    }

    double totalPris(){
        double total = 0;
        for (int i = 0; i < antall; i++){
             total += varer[i].getPris();
        }

        return total;
    }

    public void slett(int vareNr){
        int funnet;
        for (int i = 0; i < antall; i++){
            if (varer[i].getVareNr() == vareNr){
                varer[i] = null;
            }

        }
    }
}