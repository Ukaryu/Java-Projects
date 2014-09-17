import easyIO.Out;

/**
 * Created by Martin on 18.09.2014.
 */
public class oppgave8 {

    public static void main(String[] args) {
        Out skjerm = new Out();

        int nedbør [] = {2,4,5,6,7,8,8,2,6,4,2,1,4,2,5,6,7,1,2,3,6,3,5,3,8,5,2,4,6,3,1};
        int kumulert [] = new int[31];

        for (int i = 0; i < nedbør.length; i++){

            for(int j = 0; j <= i; j++){
                kumulert [i] += nedbør[j];
            }
        }

        skjerm.outln("Kumulert nebør for hvert døgn i en måned er på: ");
        for(int elem : kumulert){
            skjerm.outln(elem);
        }
    }
}
