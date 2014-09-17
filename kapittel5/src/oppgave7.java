import easyIO.Out;

/**
 * Created by Martin on 17.09.2014.
 */
public class oppgave7 {

    public static void main(String[] args) {
        Out skjerm = new Out();

        int trekningA [] = {19,20,32,45,11,5,6};
        int trekningB [] = new int[7];
        int j = 0;
        int indks = 0;
        int maks = 0;

        for (int i = 6; i >= 0; i--){

            maks = 0;

            for(j = 0; j < trekningA.length; j++) {

                if (maks < trekningA[j]) {
                    maks = trekningA[j];
                    indks = j;                  //setter indeksen som skal brukes utenfor for-løkken
                }
            } //for

            trekningB[i] = maks;
            trekningA[indks] = -1;              //setter den evaluerte array-verdien til -1 for å fjerne den fra videre evalueringer

        }//for

        for(int elem:trekningB){                //printer ut elementen i den nye array B
            skjerm.outln(elem);
        }
    }// main
}//class
