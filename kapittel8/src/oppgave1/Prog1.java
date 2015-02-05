package oppgave1;

import easyIO.Out;

/**
 * Created by Martin on 16.12.2014.
 */
class Prog1 {
    public static void main(String [] args){
        Out skjerm = new Out();
        ABC pek = new ABC();

        skjerm.outln(pek.objekt(14));
        pek.dobbelt();
        skjerm.outln(pek.dobbelt());


    }
}

class ABC {
    int i;

    public int objekt(int i){
        this.i = i;
        return i;
    }

    public int dobbelt(){
        i = i * 2;
        return i;
    }
}
